package defpackage;

public abstract class ne<Z> extends my<Z> {
    private final int a;
    private final int b;

    public ne() {
        this((byte) 0);
    }

    private ne(byte b) {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }

    public final void a(nf nfVar) {
        if (nw.a(this.a, this.b)) {
            nfVar.a(this.a, this.b);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        stringBuilder.append(this.a);
        stringBuilder.append(" and height: ");
        stringBuilder.append(this.b);
        stringBuilder.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
