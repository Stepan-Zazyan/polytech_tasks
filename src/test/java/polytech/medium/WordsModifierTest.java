package polytech.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsModifierTest {

    @Test
    void checkCatDog() {
        String str = "cat";
        String anotherStr = "dog";
        assertFalse(new WordsModifier().modifyWord(str, anotherStr));
    }

    @Test
    void checkCatActs() {
        String str = "cat";
        String anotherStr = "acts";
        assertFalse(new WordsModifier().modifyWord(str, anotherStr));
    }

    @Test
    void checkCatCats() {
        String str = "cat";
        String anotherStr = "cats";
        assertTrue(new WordsModifier().modifyWord(str, anotherStr));
    }

    @Test
    void checkCatCast() {
        String str = "cat";
        String anotherStr = "cast";
        assertTrue(new WordsModifier().modifyWord(str, anotherStr));
    }


    @Test
    void checkCatAt() {
        String str = "cat";
        String anotherStr = "at";
        assertTrue(new WordsModifier().modifyWord(str, anotherStr));
    }

    @Test
    void checkCatOcat() {
        String str = "cat";
        String anotherStr = "Ocat";
        assertTrue(new WordsModifier().modifyWord(str, anotherStr));
    }

    @Test
    void checkCatCut() {
        String str = "cat";
        String anotherStr = "cut";
        assertTrue(new WordsModifier().modifyWord(str, anotherStr));
    }
}