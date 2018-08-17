package defpackage;

final class tj implements ug {
    private final int a = 1024;

    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        length = i / 2;
        int i2 = i - length;
        Object obj = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, obj, 0, i2);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - length, obj, i2, length);
        return obj;
    }
}
