// Copyright © 2009, Esko Luontola. All Rights Reserved.
// This software is released under the MIT License. See LICENSE.txt

package longcat;

public class LongcatFactoryImpl implements LongcatFactory {

    public Longcat createLongcat(int bodySize) {
        return new Longcat(bodySize);
    }

    public Longcat createLongcat(int length, LengthUnit unit) {
        return null;
    }
}
