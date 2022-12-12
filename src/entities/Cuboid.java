package entities;

import validators.doubleValidator;

public class Cuboid extends Solid {
    private double a;
    private double b;
    private double c;

    public Cuboid(Unit unit, double a, double b, double c) {
        super(unit);
        setA(a);
        setB(b);
        setC(c);
    }

    public void setA(double a) {
        doubleValidator.getInstance().validate(a);
        this.a = a;
    }

    public void setB(double b) {
        doubleValidator.getInstance().validate(b);
        this.b = b;
    }

    public void setC(double c) {
        doubleValidator.getInstance().validate(c);
        this.c = c;
    }

    @Override
    public double volume() {
        return a*b*c;
    }

    @Override
    public double surfaceArea() {
        return a*b*2 + a*c*2 + b*c*2;
    }

    public boolean equals(Cuboid o, int epsylon) {
        return Math.abs(this.getUnit().getValue() - o.getUnit().getValue()) <= epsylon;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
