package entities;

import enums.Unit;

abstract class Solid {
    private double x;
    private double y;
    private double z;
    private Unit unit;

    public Solid(Unit unit) {
        this.unit = unit;
    }

    public Unit getUnit() {
        return unit;
    }

    public double volume() {
        return x*y*z;
    }

    public double surfaceArea() {
        return x*y*2 + x*z*2 + y*z*2;
    }

    public boolean equals(Solid o) {
       return this.getUnit() == o.getUnit();
    }

    @Override
    public String toString() {
        return "Solid{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", unit=" + unit +
                '}';
    }
}
