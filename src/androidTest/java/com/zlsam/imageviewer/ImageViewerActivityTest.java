package com.zlsam.imageviewer;

import android.test.ActivityInstrumentationTestCase2;

import com.zlsam.imageviewer.demo.ImageViewerActivityDemo;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.zlsam.imageviewer.ImageViewerActivityTest \
 * com.zlsam.imageviewer.tests/android.test.InstrumentationTestRunner
 */
public class ImageViewerActivityTest extends ActivityInstrumentationTestCase2<ImageViewerActivityDemo> {

    public ImageViewerActivityTest() {
        super("com.zlsam.imageviewer", ImageViewerActivityDemo.class);
    }

}
