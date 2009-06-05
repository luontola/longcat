package longcat;

import junit.framework.TestCase;

public class LongcatFactoryTest extends TestCase {

    private LongcatFactory factory = new LongcatFactoryImpl();

    public void test__Longcat_with_body_size_0() {
        Longcat longcat = factory.createLongcat(0);
        assertEquals("", longcat.getBody());
    }

    public void test__Longcat_with_body_size_1() {
        Longcat longcat = factory.createLongcat(1);
        assertEquals(Longcat.BODY_ROW, longcat.getBody());
    }

    public void test__Longcat_with_body_size_2() {
        Longcat longcat = factory.createLongcat(2);
        assertEquals(Longcat.BODY_ROW + Longcat.BODY_ROW, longcat.getBody());
    }

    public void test__Fully_assembled_longcat() {
        Longcat longcat = factory.createLongcat(2);
        assertEquals(Longcat.HEAD_ROW + longcat.getBody() + Longcat.FEET_ROW, longcat.toString());
    }
}
