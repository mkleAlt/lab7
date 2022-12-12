package enums;

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
