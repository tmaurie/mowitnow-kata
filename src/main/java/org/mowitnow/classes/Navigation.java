package org.mowitnow.classes;

public class Navigation {

    /**
     * Navigate the mower according to the instructions.
     *
     * @param position    the current position
     * @param orientation the orientation to move the position
     */
    public static void navigate(Position position, Orientation orientation) {
        switch (orientation) {
            case NORTH -> position.setyAxis(position.getyAxis() + 1);
            case EAST -> position.setxAxis(position.getxAxis() + 1);
            case SOUTH -> position.setyAxis(position.getyAxis() - 1);
            case WEST -> position.setxAxis(position.getxAxis() - 1);
        }
    }

    /**
     * Rotate the mower according to the instruction.
     *
     * @param direction   the direction to rotate the orientation
     * @param orientation the current orientation
     * @return the new orientation
     */
    public static Orientation rotate(char direction, Orientation orientation) {
        return switch (direction) {
            case 'D' -> orientation.getNextOrientation();
            case 'G' -> orientation.getPreviousOrientation();
            default -> throw new IllegalStateException("Unexpected value: " + direction);
        };
    }


}
