package org.mowitnow.classes;

public class LawnMower {

    private final Position position;
    private Orientation orientation;

    public LawnMower(Position position, Orientation orientation, Lawn lawn) {
        this.position = position;
        this.orientation = orientation;
    }

    /**
     * Initialize the mower
     *
     * @param lawn the area of the lawn
     * @param coordinates position and orientation of the mower
     * @return the mower initialized
     */
    public static LawnMower initMower(Lawn lawn, String coordinates) {

        String[] formattedCoordinates = coordinates.split(" ");

        Position position = new Position(Integer.parseInt(formattedCoordinates[0]), Integer.parseInt(formattedCoordinates[1]));
        Orientation orientation = Orientation.valueOfOrientation(formattedCoordinates[2]);

        return new LawnMower(position, orientation, lawn);

    }

    /**
     * Move the mower according to the instructions
     *
     * @param instruction the instruction to move the mower
     */
    public void move(char instruction) {
        switch (instruction) {
            case 'A' -> Navigation.navigate(position, orientation);
            case 'G' -> orientation = orientation.getPreviousOrientation();
            case 'D' -> orientation = orientation.getNextOrientation();
        }
    }

    @Override
    // returns position and orientation as a string
    public String toString() {
        return position.toString() + " " + orientation.getValue();
    }

    public Position getPosition() {
        return position;
    }
}
