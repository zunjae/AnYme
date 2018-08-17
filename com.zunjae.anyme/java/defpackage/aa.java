package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class aa extends SQLiteOpenHelper {
    final x[] a;
    final q b;
    private boolean c;

    aa(Context context, String str, x[] xVarArr, q qVar) {
        super(context, str, null, qVar.a, new ab(xVarArr, qVar));
        this.b = qVar;
        this.a = xVarArr;
    }

    private x a(SQLiteDatabase sQLiteDatabase) {
        if (this.a[0] == null) {
            this.a[0] = new x(sQLiteDatabase);
        }
        return this.a[0];
    }

    final synchronized o a() {
        this.c = false;
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        if (this.c) {
            close();
            return a();
        }
        return a(writableDatabase);
    }

    public final synchronized void close() {
        super.close();
        this.a[0] = null;
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.b.a(a(sQLiteDatabase));
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        this.b.b(a(sQLiteDatabase), i, i2);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.c) {
            this.b.b(a(sQLiteDatabase));
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        this.b.a(a(sQLiteDatabase), i, i2);
    }
}
