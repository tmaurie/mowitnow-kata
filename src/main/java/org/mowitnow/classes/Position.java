package org.mowitnow.classes;

public class Position {
    private Integer xAxis;
    private Integer yAxis;

    public Position(Integer xAxis, Integer yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Integer getxAxis() {
        return xAxis;
    }

    public void setxAxis(Integer xAxis) {
        this.xAxis = xAxis;
    }

    public Integer getyAxis() {
        return yAxis;
    }

    public void setyAxis(Integer yAxis) {
        this.yAxis = yAxis;
    }

    @Override
    public String toString() {
        return "(" + xAxis + ", " + yAxis + ")";
    }


}
