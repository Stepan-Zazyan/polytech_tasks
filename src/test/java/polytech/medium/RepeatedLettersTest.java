package polytech.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RepeatedLettersTest {

    @Test
    void whenSimpleString() {
        String str = "abccbaf";
        String expected = "f";
        RepeatedLetters rl = new RepeatedLetters();
        String actual = rl.deleteRepeatedLetters(str);
        assertEquals(expected, actual);
    }

    @Test
    void whenStringToEmpty() {
        String str = "aabb";
        String expected = "";
        RepeatedLetters rl = new RepeatedLetters();
        String actual = rl.deleteRepeatedLetters(str);
        assertEquals(expected, actual);
    }

    @Test
    void whenStringNoChange() {
        String str = "abfbaf";
        String expected = "abfbaf";
        RepeatedLetters rl = new RepeatedLetters();
        String actual = rl.deleteRepeatedLetters(str);
        assertEquals(expected, actual);
    }

    @Test
    void whenEmptyString() {
        String str = "";
        String expected = "";
        RepeatedLetters rl = new RepeatedLetters();
        String actual = rl.deleteRepeatedLetters(str);
        assertEquals(expected, actual);
    }
}