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
        this.bodySize = bodySize;
    }

    public String getBody() {
        StringBuilder body = new StringBuilder();
        for (int i = 0; i < bodySize; i++) {
            body.append(BODY_LINE);
        }
        return body.toString();
    }

    public String toString() {
        return HEAD_LINES + getBody() + FEET_LINES;
    }
}
