package org.mowitnow.mower;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class OrientationTest {



    @Test
    public void getNextOrientation() {
        assertEquals(Orientation.EAST, Orientation.NORTH.getNextOrientation());
        assertEquals(Orientation.SOUTH, Orientation.EAST.getNextOrientation());
        assertEquals(Orientation.WEST, Orientation.SOUTH.getNextOrientation());
        assertEquals(Orientation.NORTH, Orientation.WEST.getNextOrientation());
    }

    @Test
    public void getPreviousOrientation() {
        assertEquals(Orientation.WEST, Orientation.NORTH.getPreviousOrientation());
        assertEquals(Orientation.NORTH, Orientation.EAST.getPreviousOrientation());
        assertEquals(Orientation.EAST, Orientation.SOUTH.getPreviousOrientation());
        assertEquals(Orientation.SOUTH, Orientation.WEST.getPreviousOrientation());
    }

    @Test
    public void getOrientationFromChar() {
        assertSame(Orientation.NORTH, Orientation.valueOf("NORTH"));
        assertSame(Orientation.EAST, Orientation.valueOfOrientation("E"));
        assertSame(Orientation.SOUTH, Orientation.valueOfOrientation("S"));
        assertSame(Orientation.WEST, Orientation.valueOfOrientation("W"));

    }
}