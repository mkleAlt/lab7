package entities;

import enums.Unit;

public class Cuboid extends Solid {
    private double a;
    private double b;
    private double c;

    public Cuboid(Unit unit) {
        super(unit);
    }

    @Override
    public double volume() {
        return a*b*c;
    }

    @Override
    public double surfaceArea() {
        return a*b*2 + a*c*2 + b*c*2;
    }

    public boolean equals(Solid o, double epsylon) {
        return Math.abs(this.getUnit().getValue() - o.getUnit().getValue()) <= epsylon;
    }
}
