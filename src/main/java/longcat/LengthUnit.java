package longcat;

public enum LengthUnit {

    METERS("m"), FEET("ft"), PETRONAS("petronas");

    private final String name;

    private LengthUnit(String name) {
        this.name = name;
    }

    public static LengthUnit parse(String name) {
        for (LengthUnit unit : values()) {
            if (unit.name.equals(name)) {
                return unit;
            }
        }
        throw new IllegalArgumentException("No such unit of length: " + name);
    }
}
