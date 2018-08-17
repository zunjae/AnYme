package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

final class x implements o {
    private static final String[] a = new String[]{BuildConfig.FLAVOR, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] b = new String[0];
    private final SQLiteDatabase c;

    x(SQLiteDatabase sQLiteDatabase) {
        this.c = sQLiteDatabase;
    }

    public final Cursor a(v vVar) {
        return this.c.rawQueryWithFactory(new y(this, vVar), vVar.a(), b, null);
    }

    public final w a(String str) {
        return new ae(this.c.compileStatement(str));
    }

    public final void a() {
        this.c.beginTransaction();
    }

    public final Cursor b(String str) {
        return a(new n(str));
    }

    public final void b() {
        this.c.endTransaction();
    }

    public final void c() {
        this.c.setTransactionSuccessful();
    }

    public final void c(String str) {
        this.c.execSQL(str);
    }

    public final void close() {
        this.c.close();
    }

    public final boolean d() {
        return this.c.inTransaction();
    }

    public final boolean e() {
        return this.c.isOpen();
    }

    public final String f() {
        return this.c.getPath();
    }

    public final List<Pair<String, String>> g() {
        return this.c.getAttachedDbs();
    }
}
