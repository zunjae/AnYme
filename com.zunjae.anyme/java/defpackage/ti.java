package defpackage;

final class ti implements ug {
    private final int a = 1024;
    private final ug[] b;
    private final tj c;

    public ti(ug... ugVarArr) {
        this.b = ugVarArr;
        this.c = new tj();
    }

    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (ug ugVar : this.b) {
            if (stackTraceElementArr2.length <= this.a) {
                break;
            }
            stackTraceElementArr2 = ugVar.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.a) {
            stackTraceElementArr2 = this.c.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
