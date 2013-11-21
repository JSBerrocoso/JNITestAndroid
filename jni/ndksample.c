#include <string.h>
#include <jni.h>


/**
 * Llamada de ejemplo que se hace desde la clase JAVA
 * com.jsbs.test.jni.utils.UtilsJNI
 */
jstring Java_com_jsbs_test_jni_utils_UtilsJNI_getStringFromJNI(JNIEnv* env, jobject this)
{
	return (*env)->NewStringUTF(env, "Hola desde C!!!!! ");
}
