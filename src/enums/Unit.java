package enums;

public enum Unit {
    mm("milimetr"),
    cm("centymetr"),
    dm("decymetr"),
    m("metr");

    private String name;

    Unit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
