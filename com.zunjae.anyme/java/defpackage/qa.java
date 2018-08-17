package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import me.zhanghai.android.materialprogressbar.BuildConfig;

final class qa extends FileOutputStream {
    public static final FilenameFilter a = new qb();
    private final String b;
    private File c;
    private File d;
    private boolean e = false;

    public qa(File file, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".cls_temp");
        super(new File(file, stringBuilder.toString()));
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(file);
        stringBuilder2.append(File.separator);
        stringBuilder2.append(str);
        this.b = stringBuilder2.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(this.b);
        stringBuilder3.append(".cls_temp");
        this.c = new File(stringBuilder3.toString());
    }

    public final void a() {
        if (!this.e) {
            this.e = true;
            super.flush();
            super.close();
        }
    }

    public final synchronized void close() {
        if (!this.e) {
            this.e = true;
            super.flush();
            super.close();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.b);
            stringBuilder.append(".cls");
            File file = new File(stringBuilder.toString());
            if (this.c.renameTo(file)) {
                this.c = null;
                this.d = file;
                return;
            }
            String str = BuildConfig.FLAVOR;
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.c.exists()) {
                str = " (source does not exist)";
            }
            StringBuilder stringBuilder2 = new StringBuilder("Could not rename temp file: ");
            stringBuilder2.append(this.c);
            stringBuilder2.append(" -> ");
            stringBuilder2.append(file);
            stringBuilder2.append(str);
            throw new IOException(stringBuilder2.toString());
        }
    }
}
