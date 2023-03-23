package polytech.medium;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {
    private Integer balance;

    public Account() {
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public Integer getBalance() {
        return this.balance;
    }

    public void decrement(int sum) {
        this.balance -= sum;
    }

    public void increment(int sum) {
        this.balance += sum;
    }

    public synchronized void transferMoney(Account acc1, Account acc2, int sum) throws InterruptedException {
        Thread dec = new Thread(
                () -> {
                    if (sum <= acc2.getBalance()) {
                        acc1.decrement(sum);
                        System.out.println("works " + Thread.currentThread().getName());
                    } else {
                        throw new IllegalArgumentException("ДЕНЕГ то нет");
                    }
                }
        );
        Thread inc = new Thread(
                () -> {
                    Lock lock = new ReentrantLock();
                    lock.lock();
                    acc2.increment(sum);
                    System.out.println("works " + Thread.currentThread().getName());
                    lock.unlock();
                }
        );
        dec.start();
        inc.start();
        dec.join();
        inc.join();
    }

    public static void main(String[] args) throws Exception {
        Account first = new Account(100);
        Account second = new Account(90);
        new Account().transferMoney(first, second, 90);
        System.out.println(first.getBalance() + " " + second.getBalance());
    }
}





