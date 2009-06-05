// Copyright © 2009, Esko Luontola. All Rights Reserved.
// This software is released under the MIT License. See LICENSE.txt

package longcat;

public interface LongcatFactory {

    Longcat createLongcat(int bodySize);

    Longcat createLongcat(int length, LengthUnit unit);
}
