// Copyright © 2009, Esko Luontola. All Rights Reserved.
// This software is released under the MIT License. See LICENSE.txt

package longcat;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;

public class CliArgumentParserTest extends TestCase {

    private LongcatFactory factory;
    private CliArgumentParser cli;
    private Longcat dummyLongcat = new Longcat(1);

    protected void setUp() throws Exception {
        factory = mock(LongcatFactory.class);
        cli = new CliArgumentParser(factory);
    }

    public void test__When_no_arguments_then_usage_instructions_are_printed() {
        String out = cli.parseArguments();
        assertEquals(CliArgumentParser.USAGE_INSTRUCTIONS, out);
    }

    public void test__Length_specified_in_meters() {
        when(factory.createLongcat(3048, LengthUnit.METERS)).thenReturn(dummyLongcat);
        String out = cli.parseArguments("3048", "m");
        assertEquals(dummyLongcat.toString(), out);
    }

    public void test__Length_specified_in_feet() {
        when(factory.createLongcat(10000, LengthUnit.FEET)).thenReturn(dummyLongcat);
        String out = cli.parseArguments("10000", "ft");
        assertEquals(dummyLongcat.toString(), out);
    }
}
