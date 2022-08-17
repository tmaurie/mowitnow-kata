package org.mowitnow.classes;

public class Lawn {

    private final Integer width;
    private final Integer height;

    public Lawn(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public static Lawn initArea(String[] area) {
        Integer width = Integer.parseInt(area[0]);
        Integer height = Integer.parseInt(area[1]);
        return new Lawn(width, height);
    }

    public boolean isValid(Position position) {
        return position.getxAxis() >= 0 && position.getyAxis() >= 0 && position.getxAxis() <= width && position.getyAxis() <= height;
    }

}
