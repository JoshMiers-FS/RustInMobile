package com.fullstory.rustinandroid.jni;

public class Rust {
    static {
        System.loadLibrary("native-lib");
        Rust.init();
    }

    private static native void init();

    public static native int product(int x, int y);
}
