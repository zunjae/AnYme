package com.zunjae.anyme.rewrite.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.widget.Toast;
import com.zunjae.anyme.rewrite.viewmodels.KanonViewModel;
import com.zunjae.zasync.c;
import defpackage.alg;
import defpackage.arh;
import defpackage.asp;
import defpackage.ata;
import defpackage.tw;
import mehdi.sakout.fancybuttons.R;

final class b extends c<alg> {
    final /* synthetic */ AnimeCharactersAdapterR2 a;
    private final asp b;
    private final int c;
    private final arh d;
    private final int e;
    private KanonViewModel f;

    b(AnimeCharactersAdapterR2 animeCharactersAdapterR2, Activity activity, asp asp, int i, arh arh, int i2, KanonViewModel kanonViewModel) {
        this.a = animeCharactersAdapterR2;
        super(activity);
        this.b = asp;
        this.c = i;
        this.d = arh;
        this.e = i2;
        this.f = kanonViewModel;
    }

    @SuppressLint({"DefaultLocale"})
    protected final /* synthetic */ void a(Object obj) {
        obj = (alg) obj;
        super.a(obj);
        if (obj == null) {
            Toast.makeText(this.a.b, "Could not connect to Kanon", 1).show();
        } else if (obj.d()) {
            Toast.makeText(this.a.b, String.format("(%d) Could not add %s, reason: %s", new Object[]{Integer.valueOf(obj.a()), this.b.d(), obj.b()}), 1).show();
        } else {
            String str;
            if (this.c == 0) {
                str = "Added %s to your list";
                this.f.b(this.b);
            } else {
                str = "Removed %s from your list";
                this.f.a(this.b);
            }
            Toast.makeText(this.a.b, String.format(str, new Object[]{this.b.d()}), 0).show();
            this.a.d.set(this.e, this.d);
            this.a.notifyItemChanged(this.e);
        }
    }

    public final /* synthetic */ Object b() {
        switch (this.c) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                return ata.c(this.b);
            case tw.a /*1*/:
                return ata.b(this.b.b());
            default:
                StringBuilder stringBuilder = new StringBuilder("No action found for id = ");
                stringBuilder.append(this.c);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
