package entities;

public abstract class Solid {
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

    public enum Unit {
        mm(1, "mm", "milimetr"),
        cm(10, "cm", "centymetr"),
        dm(100, "dm", "decymetr"),
        m(1000, "m", "metr");

        private int value;
        private String shortName;
        private String fullName;

        Unit(int value, String shortName, String fullName) {
            this.value = value;
            this.shortName = shortName;
            this.fullName = fullName;
        }

        public int getValue() {
            return value;
        }

        public String getFullName() {
            return fullName;
        }

        @Override
        public String toString() {
            return this.shortName;
        }
    }
}
