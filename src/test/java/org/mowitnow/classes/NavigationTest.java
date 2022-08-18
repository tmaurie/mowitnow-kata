package org.mowitnow.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NavigationTest {

    @Test
    public void navigate() {
        Position position = new Position(0, 0);
        Navigation.navigate(position, Orientation.NORTH);
        assertEquals(0, position.getxAxis().intValue());
        assertEquals(1, position.getyAxis().intValue());
    }

    @Test
    public void rotate() {
        Orientation orientation = Orientation.NORTH;
        assertEquals(Orientation.EAST, Navigation.rotate('D', orientation));
        assertEquals(Orientation.WEST, Navigation.rotate('G', orientation));
    }
}