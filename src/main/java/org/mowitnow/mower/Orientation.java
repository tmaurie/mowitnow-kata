package org.mowitnow.mower;

public enum Orientation {
    NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");

    public final String orientation;

    Orientation(String orientation) {
        this.orientation = orientation;
    }


    public static Orientation valueOfOrientation(String orientation) {
        for (Orientation o : values()) {
            if (o.orientation.equals(orientation)) {
                return o;
            }
        }
        return null;
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

    public String getValue() {
        return orientation;
    }
}
