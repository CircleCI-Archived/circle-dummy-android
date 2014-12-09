package com.circleci;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.circleci.CircleDummyActivityTest \
 * com.circleci.tests/android.test.InstrumentationTestRunner
 */
public class CircleDummyActivityTest extends ActivityInstrumentationTestCase2<CircleDummyActivity> {

    public CircleDummyActivityTest() {
        super("com.circleci", CircleDummyActivity.class);
    }

}
