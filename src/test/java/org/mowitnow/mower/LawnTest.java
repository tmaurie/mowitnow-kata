package org.mowitnow.mower;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LawnTest {

    @Test
    public void isValid() {
        Lawn lawn = new Lawn(5, 5);

        Position position = new Position(0, 0);
        assertTrue(lawn.isValid(position));
        position = new Position(5, 5);
        assertTrue(lawn.isValid(position));
        position = new Position(6, 6);
        assertFalse(lawn.isValid(position));
        position = new Position(-1, -1);
        assertFalse(lawn.isValid(position));
    }
}