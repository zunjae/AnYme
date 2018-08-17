package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import java.io.File;

final class avj extends ContextWrapper {
    private final String a;
    private final String b;

    public avj(Context context, String str, String str2) {
        super(context);
        this.b = str;
        this.a = str2;
    }

    public final File getCacheDir() {
        return new File(super.getCacheDir(), this.a);
    }

    public final File getDatabasePath(String str) {
        File file = new File(super.getDatabasePath(str).getParentFile(), this.a);
        file.mkdirs();
        return new File(file, str);
    }

    @TargetApi(8)
    public final File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.a);
    }

    @TargetApi(8)
    public final File getExternalFilesDir(String str) {
        return new File(super.getExternalFilesDir(str), this.a);
    }

    public final File getFilesDir() {
        return new File(super.getFilesDir(), this.a);
    }

    public final SharedPreferences getSharedPreferences(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(":");
        stringBuilder.append(str);
        return super.getSharedPreferences(stringBuilder.toString(), i);
    }

    public final SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
    }

    @TargetApi(11)
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
    }
}
