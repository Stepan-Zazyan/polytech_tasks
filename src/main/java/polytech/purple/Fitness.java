package polytech.purple;

import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Scanner;

public class Fitness {
    public static void main(String[] args) {
        Scanner inputStart = new Scanner(System.in);
        System.out.println("Добро пожаловать. Выберите вид тренировки:" + System.lineSeparator()
                + "отжимание - 1, скакалка - 2, приседания - 3");
        String name = inputStart.nextLine();
        while (!Objects.equals(name, "1") && !Objects.equals(name, "2")
                && !Objects.equals(name, "3")) {
            System.out.println("Введено некорректное значение тренировки, попробуйте снова");
            name = inputStart.nextLine();
        }
        Instant start = Instant.now();
        double callories = 0;
        try (BufferedReader in = new BufferedReader(new FileReader("data/calories.txt"))) {
            for (String line = in.readLine(); line != null; line = in.readLine()) {
                callories = Double.parseDouble(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner inputStop = new Scanner(System.in);
        System.out.println("Для завершения тренировки введите любой символ");
        inputStop.nextLine();
        Instant finish = Instant.now();
        long timeElapsedDuration = Duration.between(start, finish).toMillis() / 900;
        switch (name) {
            case "1" -> {
                callories += 50 * timeElapsedDuration;
            }
            case "2" -> {
                callories += 60 * timeElapsedDuration;
            }
            default -> {
                callories += 70 * timeElapsedDuration;
            }
        }
        System.out.println("Калорий потрачено = " + callories);
        try (BufferedWriter out = new BufferedWriter(new FileWriter("data/calories.txt"))) {
            out.append(String.valueOf(callories));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
