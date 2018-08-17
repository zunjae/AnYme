package defpackage;

import android.database.sqlite.SQLiteProgram;

class ad implements u {
    private final SQLiteProgram a;

    ad(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    public final void a(int i) {
        this.a.bindNull(i);
    }

    public final void a(int i, double d) {
        this.a.bindDouble(i, d);
    }

    public final void a(int i, long j) {
        this.a.bindLong(i, j);
    }

    public final void a(int i, String str) {
        this.a.bindString(i, str);
    }

    public final void a(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    public void close() {
        this.a.close();
    }
}
