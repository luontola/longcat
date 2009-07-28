package longcat;

public class LongcatFactoryImpl implements LongcatFactory {

    public Longcat createLongcat(int bodySize) {
        return new Longcat(bodySize);
    }

    public Longcat createLongcat(int length, LengthUnit unit) {
        int totalLines = LengthUnit.LINES.from(length, unit);
        int nonBodyLines = lineCount(Longcat.HEAD_LINES + Longcat.FEET_LINES);
        return new Longcat(totalLines - nonBodyLines);
    }

    static int lineCount(String s) {
        int lines = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '\n') {
                lines++;
            }
        }
        return lines;
    }
}
