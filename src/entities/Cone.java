package entities;

import enums.Unit;
import validators.doubleValidator;

public class Cone extends Solid {
    private double h;
    private double r;

    public Cone(Unit unit, double h, double r) {
        super(unit);
        this.unit = unit;
        setH(h);
        setR(r);
    }

    public void setH(double h) {
        doubleValidator.getInstance().validate(h);
        this.h = h;
    }

    public void setR(double r) {
        doubleValidator.getInstance().validate(r);
        this.r = r;
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
