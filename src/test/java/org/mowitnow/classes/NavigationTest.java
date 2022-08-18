package org.mowitnow.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class NavigationTest {

    @Test
    public void navigate() {
        Position position = new Position(0, 0);
        Navigation.navigate(position, Orientation.NORTH);
        assertEquals(0, position.getxAxis());
        assertEquals(1, position.getyAxis());
    }

    @Test
    public void rotate() {
        Orientation orientation = Orientation.NORTH;
        assertEquals(Orientation.EAST, Navigation.rotate('D', orientation));
        assertEquals(Orientation.WEST, Navigation.rotate('G', orientation));
        assertThrows(IllegalStateException.class, () -> Navigation.rotate('A', orientation));
    }

}