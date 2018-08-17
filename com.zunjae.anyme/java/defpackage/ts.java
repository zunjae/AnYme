package defpackage;

import java.io.InputStream;

final class ts implements axe {
    final /* synthetic */ byte[] a;
    final /* synthetic */ int[] b;
    final /* synthetic */ tr c;

    ts(tr trVar, byte[] bArr, int[] iArr) {
        this.c = trVar;
        this.a = bArr;
        this.b = iArr;
    }

    public final void a(InputStream inputStream, int i) {
        try {
            inputStream.read(this.a, this.b[0], i);
            int[] iArr = this.b;
            iArr[0] = iArr[0] + i;
        } finally {
            inputStream.close();
        }
    }
}
