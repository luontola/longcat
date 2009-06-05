// Copyright © 2009, Esko Luontola. All Rights Reserved.
// This software is released under the MIT License. See LICENSE.txt

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
        assertEquals(Longcat.BODY_LINE, longcat.getBody());
    }

    public void test__Longcat_with_body_size_2() {
        Longcat longcat = factory.createLongcat(2);
        assertEquals(Longcat.BODY_LINE + Longcat.BODY_LINE, longcat.getBody());
    }

    public void test__Fully_assembled_longcat() {
        Longcat longcat = factory.createLongcat(2);
        assertEquals(Longcat.HEAD_LINES + longcat.getBody() + Longcat.FEET_LINES, longcat.toString());
    }

    public void test__Longcat_length_specified_in_meters() {
        Longcat longcat = factory.createLongcat(1, LengthUnit.METERS);
        int lines = LongcatFactoryImpl.lineCount(longcat.toString());
        assertEquals(LengthUnit.LINES.from(1, LengthUnit.METERS), lines);
    }

    public void test__Too_short_longcat() {
        try {
            factory.createLongcat(0, LengthUnit.METERS);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Longcat can not be that short!", e.getMessage());
        }
    }
}
