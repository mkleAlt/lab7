package entities;

import enums.Unit;

abstract class Solid {
    private double x;
    private double y;
    private double z;
    public Unit unit;

    public Solid(Unit unit) {
        this.unit = unit;
    }

    public Unit getUnit() {
        return unit;
    }

    public abstract double volume();

    public abstract double surfaceArea();

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
