package defpackage;

final class ai implements Comparable<ai> {
    final int a;
    final int b;
    final String c;
    final String d;

    ai(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ai aiVar = (ai) obj;
        int i = this.a - aiVar.a;
        return i == 0 ? this.b - aiVar.b : i;
    }
}
