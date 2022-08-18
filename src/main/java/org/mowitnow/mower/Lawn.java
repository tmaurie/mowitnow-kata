package org.mowitnow.mower;

public class Lawn {

    private final int width;
    private final int height;

    public Lawn(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static Lawn initArea(String[] area) {
        int width = Integer.parseInt(area[0]);
        int height = Integer.parseInt(area[1]);
        return new Lawn(width, height);
    }

    public boolean isValid(Position position) {
        return position.getxAxis() >= 0
                && position.getyAxis() >= 0
                && position.getxAxis() <= width
                && position.getyAxis() <= height;
    }

}
