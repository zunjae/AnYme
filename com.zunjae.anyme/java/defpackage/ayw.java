package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ayw implements ayr {
    private final Context a;
    private final File b;
    private final String c;
    private final File d;
    private axa e = new axa(this.d);
    private File f = new File(this.b, this.c);

    public ayw(Context context, File file, String str, String str2) {
        this.a = context;
        this.b = file;
        this.c = str2;
        this.d = new File(this.b, str);
        if (!this.f.exists()) {
            this.f.mkdirs();
        }
    }

    public final int a() {
        return this.e.a();
    }

    public OutputStream a(File file) {
        return new FileOutputStream(file);
    }

    public final void a(String str) {
        Throwable th;
        this.e.close();
        File file = this.d;
        File file2 = new File(this.f, str);
        Closeable closeable = null;
        Closeable fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                Closeable a = a(file2);
                try {
                    awj.a((InputStream) fileInputStream, (OutputStream) a, new byte[1024]);
                    awj.a(fileInputStream);
                    awj.a(a);
                    file.delete();
                    this.e = new axa(this.d);
                } catch (Throwable th2) {
                    Closeable closeable2 = a;
                    th = th2;
                    closeable = closeable2;
                    awj.a(fileInputStream);
                    awj.a(closeable);
                    file.delete();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                awj.a(fileInputStream);
                awj.a(closeable);
                file.delete();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            awj.a(fileInputStream);
            awj.a(closeable);
            file.delete();
            throw th;
        }
    }

    public final void a(List<File> list) {
        for (File file : list) {
            Context context = this.a;
            String.format("deleting sent analytics file %s", new Object[]{file.getName()});
            awj.e(context);
            file.delete();
        }
    }

    public final void a(byte[] bArr) {
        this.e.a(bArr);
    }

    public final boolean a(int i, int i2) {
        return this.e.a(i, i2);
    }

    public final boolean b() {
        return this.e.b();
    }

    public final List<File> c() {
        List<File> arrayList = new ArrayList();
        for (Object add : this.f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() > 0) {
                break;
            }
        }
        return arrayList;
    }

    public final List<File> d() {
        return Arrays.asList(this.f.listFiles());
    }

    public final void e() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r1 = this;
        r0 = r1.e;	 Catch:{ IOException -> 0x0005 }
        r0.close();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        r0 = r1.d;
        r0.delete();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ayw.e():void");
    }
}
