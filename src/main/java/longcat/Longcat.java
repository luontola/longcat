// Copyright © 2009, Esko Luontola. All Rights Reserved.
// This software is released under the MIT License. See LICENSE.txt

package longcat;

public class Longcat {

    // Source: http://encyclopediadramatica.com/Longcat

    public static final String HEAD_LINES = "" +
            "    /\\___/\\         \n" +
            "   /       \\         \n" +
            "  |  #    # |         \n" +
            "  \\     @   |        \n" +
            "   \\   _|_ /         \n" +
            "   /       \\______   \n" +
            "  / _______ ___   \\  \n" +
            "  |_____   \\   \\__/ \n" +
            "   |    \\__/         \n";
    public static final String BODY_LINE = "" +
            "   |       |          \n";
    public static final String FEET_LINES = "" +
            "   /        \\        \n" +
            "  /   ____   \\       \n" +
            "  |  /    \\  |       \n" +
            "  | |      | |        \n" +
            " /  |      |  \\      \n" +
            " \\__/      \\__/     \n";

    private final int bodySize;

    public Longcat(int bodySize) {
        if (bodySize < 0) {
            throw new IllegalArgumentException("Longcat can not be that short!");
        }
        this.bodySize = bodySize;
    }

    public String getBody() {
        StringBuilder body = new StringBuilder(bodySize * BODY_LINE.length());
        for (int i = 0; i < bodySize; i++) {
            body.append(BODY_LINE);
        }
        return body.toString();
    }

    public String toString() {
        return HEAD_LINES + getBody() + FEET_LINES;
    }
}
