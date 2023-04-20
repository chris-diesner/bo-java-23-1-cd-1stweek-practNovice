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
}