package longcat;

public class CliArgumentParser {

    public static final String USAGE_INSTRUCTIONS = "" +
            "Usage: longcat SIZE UNIT\n" +
            "       SIZE  an integer\n" +
            "       UNIT  one of: m, ft, petronas\n";

    private final LongcatFactory factory;

    public CliArgumentParser(LongcatFactory factory) {
        this.factory = factory;
    }

    public String parseArguments(String... args) {
        if (args.length == 2) {
            int length = Integer.parseInt(args[0]);
            LengthUnit unit = LengthUnit.parse(args[1]);
            Longcat cat = factory.createLongcat(length, unit);
            return cat.toString();
        } else {
            return USAGE_INSTRUCTIONS;

        }

    }
}
