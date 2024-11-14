package dev.omuzalevska.amstrong;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArmstrongTest {

    @Test
    void testArmstrongNumber() {
        assertDoesNotThrow(() -> Armstrong.CheckArmstrong(371)); // 371 - Arm 
    }

    @Test
    void testArmstrongNumber2() {
        assertDoesNotThrow(() -> Armstrong.CheckArmstrong(1634)); // 1634 - Arm
    }

    @Test
    void testNotArmstrongNumber() {
        assertDoesNotThrow(() -> Armstrong.CheckArmstrong(351)); // 351 - not Arm
    }

    @Test
    void testNotArmstrongNumber2() {
        assertDoesNotThrow(() -> Armstrong.CheckArmstrong(2015)); // 2015 - not Arm
    }

    @Test
    void testZero() {
        assertDoesNotThrow(() -> Armstrong.CheckArmstrong(0)); // 0 - Arm
    }
}