package org.mowitnow.classes;

public enum Orientation {
    NORTH, EAST, SOUTH, WEST;

    public static Orientation getOrientation(char orientation) {
        return switch (orientation) {
            case 'N' -> NORTH;
            case 'E' -> EAST;
            case 'S' -> SOUTH;
            case 'W' -> WEST;
            default -> throw new IllegalStateException("Unexpected value: " + orientation);
        };
    }

    public Orientation getNextOrientation() {
        return switch (this) {
            case NORTH -> EAST;
            case EAST -> SOUTH;
            case SOUTH -> WEST;
            case WEST -> NORTH;
        };
    }

    public Orientation getPreviousOrientation() {
        return switch (this) {
            case NORTH -> WEST;
            case EAST -> NORTH;
            case SOUTH -> EAST;
            case WEST -> SOUTH;
        };
    }
}
