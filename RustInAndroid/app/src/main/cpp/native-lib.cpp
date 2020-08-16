#include <jni.h>
#include <string>

extern "C" JNIEXPORT void JNICALL
Java_com_fullstory_rustinandroid_jni_Rust_init(
        JNIEnv *env,
        jclass _this) {
}

extern "C" JNIEXPORT jint JNICALL
Java_com_fullstory_rustinandroid_jni_Rust_product(
        JNIEnv *env,
        jclass _this,
        jint x,
        jint y) {
    return x * y;
}