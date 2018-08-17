package defpackage;

import android.database.sqlite.SQLiteStatement;

final class ae extends ad implements w {
    private final SQLiteStatement a;

    ae(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.a = sQLiteStatement;
    }

    public final int a() {
        return this.a.executeUpdateDelete();
    }

    public final long b() {
        return this.a.executeInsert();
    }
}
