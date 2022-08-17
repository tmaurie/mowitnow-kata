package org.mowitnow.classes;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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