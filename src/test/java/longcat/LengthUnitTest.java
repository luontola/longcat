// Copyright © 2009, Esko Luontola. All Rights Reserved.
// This software is released under the MIT License. See LICENSE.txt

package longcat;

import junit.framework.TestCase;
import static longcat.LengthUnit.*;

public class LengthUnitTest extends TestCase {

    public void test__Identity_conversion() {
        int feet1 = 10000;
        int feet2 = FEET.from(feet1, FEET);
        assertEquals(feet1, feet2);
    }

    public void test__Convert_feet_to_meters() {
        int feet = 10000;
        int meters = METERS.from(feet, FEET);
        assertEquals(3048, meters);
    }

    public void test__Convert_meters_to_feet() {
        int meters = 3048;
        int feet = FEET.from(meters, METERS);
        assertEquals(10000, feet);
    }
}
