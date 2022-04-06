public class FunctionCall {

    public static void funct1 () {
	System.out.println ("Inside funct1");
    }

    public static void main (String[] args) {
	int val;

	System.out.println ("Inside main");

	funct1();

	System.out.println ("About to call funct2");

	val = funct2(8);

	System.out.println ("funct2 returned a value of " + val);

	System.out.println ("About to call funct2 again");

	val = funct2(-3);

	System.out.println ("funct2 returned a value of " + val);
    }

    public static int funct2 (int param) {
	System.out.println ("Inside funct2 with param " + param);
	return param * 2;
    }

	#feature302 changes by vivek
	JNIEXPORT void JNICALL
Java_Callbacks_nativeMethod(JNIEnv *env, jobject obj, jint depth)
{
    jclass cls = (*env)->GetObjectClass(env, obj);
    jmethodID mid = (*env)->GetMethodID(env, cls, "callback", "(I)V");
    if (mid == 0) {
        return;
    }
    printf("In C, depth = %d, about to enter Java\n", depth);
    (*env)->CallVoidMethod(env, obj, mid, depth);
    printf("In C, depth = %d, back from Java\n", depth);
}

	#feature301 changes by mahender
	public static void main (String[] args) {
	DemoClass.sampleMethod(4,2);

}