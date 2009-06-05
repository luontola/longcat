// Copyright © 2009, Esko Luontola. All Rights Reserved.
// This software is released under the MIT License. See LICENSE.txt

package longcat;

public class CliArgumentParser {

    public static final String USAGE_INSTRUCTIONS = "" +
            "Usage: longcat SIZE UNIT\n" +
            "   SIZE    an integer\n" +
            "   UNIT    one of: m, ft, petronas\n" +
            "or\n" +
            "       longcat is l[o...]ng\n";

    private final LongcatFactory factory;

    public CliArgumentParser(LongcatFactory factory) {
        this.factory = factory;
    }

    public String parseArguments(String... args) {
        if (args.length != 2) {
            return USAGE_INSTRUCTIONS;
        }
        if (args[0].equals("is")) {
            return parseLooong(args[1]).toString();
        } else {
            return parseLengthUnit(args[0], args[1]).toString();
        }
    }

    private Longcat parseLengthUnit(String lengthStr, String unitStr) {
        int length = Integer.parseInt(lengthStr);
        LengthUnit unit = LengthUnit.parse(unitStr);
        return factory.createLongcat(length, unit);
    }

    private Longcat parseLooong(String looong) {
        if (!looong.matches("lo+ng")) {
            throw new IllegalArgumentException("Not long: " + looong);
        }
        return factory.createLongcat(looong.length() - "lng".length());
    }
}
