package fr.project.ljhelper;

public class Tree {

    private String essence;

    private double hight;

    private double diameter;

    private double radius;

    private double radiusMeter;

    private double volume;

    public String getEssence() {
        return essence;
    }

    public double getHight() {
        return hight;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getVolume() {
        return volume;
    }

    public void setEssence(String essence) {
        this.essence = essence;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void diameterToRadius() {
        radius = diameter / 2;
    }

    public void radiusToMeter() {

        radiusMeter = radius / 100;

    }

    public void calculeVolume() {

        volume = Math.PI * (radiusMeter * radiusMeter) * hight;
        System.out.println(volume);

    }

}
