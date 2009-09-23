package longcat;

public enum LengthUnit {

    METERS("m", 1.0), FEET("ft", 0.3048), PETRONAS("petronas", 451.9), EIFFEL("eiffels", 300.65);

    private final String name;
    private final double lengthInMeters;

    private LengthUnit(String name, double lengthInMeters) {
        this.name = name;
        this.lengthInMeters = lengthInMeters;
    }

    public static LengthUnit parse(String name) {
        for (LengthUnit unit : values()) {
            if (unit.name.equals(name)) {
                return unit;
            }
        }
        throw new IllegalArgumentException("No such unit of length: " + name);
    }

    public int from(int length, LengthUnit unit) {
        return (int) (length * unit.lengthInMeters / this.lengthInMeters);
    }
}
