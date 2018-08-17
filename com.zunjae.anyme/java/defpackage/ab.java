package defpackage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

final class ab implements DatabaseErrorHandler {
    final /* synthetic */ x[] a;
    final /* synthetic */ q b;

    ab(x[] xVarArr, q qVar) {
        this.a = xVarArr;
        this.b = qVar;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        o oVar = this.a[0];
        if (oVar != null) {
            q.c(oVar);
        }
    }
}
