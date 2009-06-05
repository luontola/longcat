package longcat;

public class LongcatFactoryImpl implements LongcatFactory {

    public Longcat createLongcat(int bodySize) {
        return new Longcat(bodySize);
    }

    public Longcat createLongcat(int length, LengthUnit unit) {
        return null;
    }
}
