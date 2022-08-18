package org.mowitnow.classes;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrientationTest {

    @Test
    public void getOrientation() {
        assertEquals(Orientation.NORTH, Orientation.getOrientation('N'));
        assertEquals(Orientation.EAST, Orientation.getOrientation('E'));
        assertEquals(Orientation.SOUTH, Orientation.getOrientation('S'));
        assertEquals(Orientation.WEST, Orientation.getOrientation('W'));
    }

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
}