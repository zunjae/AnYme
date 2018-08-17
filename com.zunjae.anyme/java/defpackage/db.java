package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class db<ModelType, DataType, ResourceType, TranscodeType> implements Cloneable {
    private boolean A;
    private Drawable B;
    private int C;
    protected final Class<ModelType> a;
    protected final Context b;
    protected final de c;
    protected final Class<TranscodeType> d;
    protected final lv e;
    protected final lo f;
    private ma<ModelType, DataType, ResourceType, TranscodeType> g;
    private ModelType h;
    private eg i = nn.a();
    private boolean j;
    private int k;
    private int l;
    private mk<? super ModelType, TranscodeType> m;
    private Float n;
    private db<?, ?, ?, TranscodeType> o;
    private Float p = Float.valueOf(1.0f);
    private Drawable q;
    private Drawable r;
    private int s = 0;
    private boolean t = true;
    private ms<TranscodeType> u = mt.a();
    private int v = -1;
    private int w = -1;
    private fa x = fa.RESULT;
    private ek<ResourceType> y = jq.b();
    private boolean z;

    db(Context context, Class<ModelType> cls, mf<ModelType, DataType, ResourceType, TranscodeType> mfVar, Class<TranscodeType> cls2, de deVar, lv lvVar, lo loVar) {
        this.b = context;
        this.a = cls;
        this.d = cls2;
        this.c = deVar;
        this.e = lvVar;
        this.f = loVar;
        this.g = mfVar != null ? new ma(mfVar) : null;
        if (context == null) {
            throw new NullPointerException("Context can't be null");
        } else if (cls == null) {
        } else {
            if (mfVar == null) {
                throw new NullPointerException("LoadProvider must not be null");
            }
        }
    }

    private int a() {
        int i = this.s;
        return i == dh.d ? dh.c : i == dh.c ? dh.b : dh.a;
    }

    private mi a(ni<TranscodeType> niVar, float f, int i, mj mjVar) {
        ni<TranscodeType> niVar2 = niVar;
        float f2 = f;
        int i2 = i;
        mj mjVar2 = mjVar;
        ma maVar = this.g;
        return mg.a(maVar, this.h, this.i, this.b, i2, niVar2, f2, this.q, this.k, this.r, this.l, this.B, this.C, this.m, mjVar2, this.c.b(), this.y, this.d, this.t, this.u, this.w, this.v, this.x);
    }

    private mi a(ni<TranscodeType> niVar, mm mmVar) {
        mi mmVar2;
        mi a;
        mi a2;
        db dbVar = this.o;
        if (dbVar != null) {
            if (this.A) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            if (dbVar.u.equals(mt.a())) {
                this.o.u = this.u;
            }
            dbVar = this.o;
            if (dbVar.s == 0) {
                dbVar.s = a();
            }
            if (nw.a(this.w, this.v)) {
                dbVar = this.o;
                if (!nw.a(dbVar.w, dbVar.v)) {
                    this.o.b(this.w, this.v);
                }
            }
            mmVar2 = new mm(mmVar);
            a = a(niVar, this.p.floatValue(), this.s, mmVar2);
            this.A = true;
            a2 = this.o.a(niVar, mmVar2);
            this.A = false;
        } else if (this.n == null) {
            return a(niVar, this.p.floatValue(), this.s, mmVar);
        } else {
            mmVar2 = new mm(mmVar);
            a = a(niVar, this.p.floatValue(), this.s, mmVar2);
            a2 = a(niVar, this.n.floatValue(), a(), mmVar2);
        }
        mmVar2.a(a, a2);
        return mmVar2;
    }

    public db<ModelType, DataType, ResourceType, TranscodeType> a(ef<DataType> efVar) {
        ma maVar = this.g;
        if (maVar != null) {
            maVar.a((ef) efVar);
        }
        return this;
    }

    public db<ModelType, DataType, ResourceType, TranscodeType> a(ei<DataType, ResourceType> eiVar) {
        ma maVar = this.g;
        if (maVar != null) {
            maVar.a((ei) eiVar);
        }
        return this;
    }

    final db<ModelType, DataType, ResourceType, TranscodeType> a(ms<TranscodeType> msVar) {
        this.u = msVar;
        return this;
    }

    public db<ModelType, DataType, ResourceType, TranscodeType> a(boolean z) {
        this.t = z ^ 1;
        return this;
    }

    public db<ModelType, DataType, ResourceType, TranscodeType> a(ek<ResourceType>... ekVarArr) {
        this.z = true;
        if (ekVarArr.length == 1) {
            this.y = ekVarArr[0];
        } else {
            this.y = new eh(ekVarArr);
        }
        return this;
    }

    public ni<TranscodeType> a(ImageView imageView) {
        nw.a();
        if (imageView != null) {
            ni nbVar;
            if (!(this.z || imageView.getScaleType() == null)) {
                switch (dc.a[imageView.getScaleType().ordinal()]) {
                    case tw.a /*1*/:
                        d();
                        break;
                    case tw.b /*2*/:
                    case f.c /*3*/:
                    case mh.d /*4*/:
                        c();
                        break;
                    default:
                        break;
                }
            }
            Class cls = this.d;
            if (js.class.isAssignableFrom(cls)) {
                nbVar = new nb(imageView);
            } else if (Bitmap.class.equals(cls)) {
                nbVar = new mz(imageView);
            } else if (Drawable.class.isAssignableFrom(cls)) {
                nbVar = new na(imageView);
            } else {
                StringBuilder stringBuilder = new StringBuilder("Unhandled class: ");
                stringBuilder.append(cls);
                stringBuilder.append(", try .as*(Class).transcode(ResourceTranscoder)");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            return a(nbVar);
        }
        throw new IllegalArgumentException("You must pass in a non null View");
    }

    public final <Y extends ni<TranscodeType>> Y a(Y y) {
        nw.a();
        if (this.j) {
            mi e = y.e();
            if (e != null) {
                e.c();
                this.e.b(e);
                e.a();
            }
            if (this.s == 0) {
                this.s = dh.c;
            }
            e = a(y, null);
            y.a(e);
            this.f.a(y);
            this.e.a(e);
            return y;
        }
        throw new IllegalArgumentException("You must first set a model (try #load())");
    }

    public db<ModelType, DataType, ResourceType, TranscodeType> b(int i, int i2) {
        if (nw.a(i, i2)) {
            this.w = i;
            this.v = i2;
            return this;
        }
        throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
    }

    public db<ModelType, DataType, ResourceType, TranscodeType> b(eg egVar) {
        if (egVar != null) {
            this.i = egVar;
            return this;
        }
        throw new NullPointerException("Signature must not be null");
    }

    public db<ModelType, DataType, ResourceType, TranscodeType> b(fa faVar) {
        this.x = faVar;
        return this;
    }

    public db<ModelType, DataType, ResourceType, TranscodeType> b(ModelType modelType) {
        this.h = modelType;
        this.j = true;
        return this;
    }

    public db<ModelType, DataType, ResourceType, TranscodeType> b(mk<? super ModelType, TranscodeType> mkVar) {
        this.m = mkVar;
        return this;
    }

    public db<ModelType, DataType, ResourceType, TranscodeType> c(int i) {
        this.l = i;
        return this;
    }

    void c() {
    }

    public /* synthetic */ Object clone() {
        return e();
    }

    public db<ModelType, DataType, ResourceType, TranscodeType> d(int i) {
        this.k = i;
        return this;
    }

    void d() {
    }

    public db<ModelType, DataType, ResourceType, TranscodeType> e() {
        try {
            db<ModelType, DataType, ResourceType, TranscodeType> dbVar = (db) super.clone();
            dbVar.g = this.g != null ? this.g.g() : null;
            return dbVar;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
