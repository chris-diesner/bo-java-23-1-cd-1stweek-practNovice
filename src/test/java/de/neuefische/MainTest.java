package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void returnIsBiggerZeroTrue() {
        assertTrue(Main.isBiggerZero(5));
    }

    @Test
    void returnIsSmallerZeroTrue() {
        assertFalse(Main.isBiggerZero(-5));
    }

    @Test
    void returnStringFromInput() {
        assertEquals("eins", LevelIntermediate.printStringNumber(1));
    }

    @Test
    void returnStringOutOfArray() {
        assertEquals("Ich", LevelExpert.splitString("Ich,bin,Chris"));
    }

    @Test
    void returnIntegerIntoChecksum() {
        assertEquals(3, LevelExpert.convertInChecksum(12));
    }

    @Test
    void returnStringToBigByIntOverHundred() {
        assertEquals("Ich kann nur bis 100", LevelExpert.convertToRome(101));
    }

    @Test
    void returnStringIIIByIntThree() {
        assertEquals("III", LevelExpert.convertToRome(3));
    }

    @Test
    void returnStringLByIntFifty() {
        assertEquals("L", LevelExpert.convertToRome(50));
    }

    @Test
    void returnStringCByIntHundred() {
        assertEquals("C", LevelExpert.convertToRome(100));
    }

    @Test
    void returnStringVIByIntSix() {
        assertEquals("VI", LevelExpert.convertToRome(6));
    }


}