package longcat;

public interface LongcatFactory {

    Longcat createLongcat(int bodySize);

    Longcat createLongcat(int length, LengthUnit unit);
}
