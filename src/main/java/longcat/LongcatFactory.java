package longcat;

public class LongcatFactory {

    public Longcat createLongcat(int bodySize) {
        return new Longcat(bodySize);
    }
}
