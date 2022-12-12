package entities;

import enums.Unit;

public class Cone extends Solid {
    private double h;
    private double r;

    public Cone(Unit unit) {
        super(unit);
    }

    @Override
    public double volume() {
        return Math.PI*r*r*h/3;
    }

    @Override
    public double surfaceArea() {
        double l = Math.sqrt(h*h + r*r);
        return Math.PI*r*(r+l);
    }

    public boolean equals(Cone o, double epsylon) {
        return Math.abs(this.getUnit().getValue() - o.getUnit().getValue()) <= epsylon;
    }
}
