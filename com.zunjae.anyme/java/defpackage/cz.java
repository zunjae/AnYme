package defpackage;

import android.content.Context;
import android.widget.ImageView;

public class cz<ModelType> extends db<ModelType, hz, ks, js> {
    cz(Context context, Class<ModelType> cls, mf<ModelType, hz, ks, js> mfVar, de deVar, lv lvVar, lo loVar) {
        super(context, cls, mfVar, js.class, deVar, lvVar, loVar);
        b();
    }

    public final cz<ModelType> a() {
        super.a(this.c.c());
        return this;
    }

    public final cz<ModelType> a(int i) {
        super.d(i);
        return this;
    }

    public final cz<ModelType> a(int i, int i2) {
        super.b(i, i2);
        return this;
    }

    public final cz<ModelType> a(eg egVar) {
        super.b(egVar);
        return this;
    }

    public final cz<ModelType> a(fa faVar) {
        super.b(faVar);
        return this;
    }

    public final cz<ModelType> a(ModelType modelType) {
        super.b((Object) modelType);
        return this;
    }

    public final cz<ModelType> a(mk<? super ModelType, js> mkVar) {
        super.b((mk) mkVar);
        return this;
    }

    public final ni<js> a(ImageView imageView) {
        return super.a(imageView);
    }

    public final cz<ModelType> b() {
        super.a(new mn());
        return this;
    }

    public final cz<ModelType> b(int i) {
        super.c(i);
        return this;
    }

    public final /* synthetic */ db b(int i, int i2) {
        return a(i, i2);
    }

    public final /* bridge */ /* synthetic */ db c(int i) {
        super.c(i);
        return this;
    }

    final void c() {
        super.a(this.c.d());
    }

    public /* synthetic */ Object clone() {
        return (cz) super.e();
    }

    public final /* bridge */ /* synthetic */ db d(int i) {
        super.d(i);
        return this;
    }

    final void d() {
        a();
    }

    public final /* bridge */ /* synthetic */ db e() {
        return (cz) super.e();
    }
}
