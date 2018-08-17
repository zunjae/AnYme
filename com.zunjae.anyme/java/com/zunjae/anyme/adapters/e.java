package com.zunjae.anyme.adapters;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.zunjae.zasync.c;
import defpackage.alg;
import defpackage.aso;
import defpackage.ata;

final class e extends c<alg> {
    final /* synthetic */ EpisodeNoteAdapter a;
    private final aso b;
    private final int c;

    e(EpisodeNoteAdapter episodeNoteAdapter, Activity activity, aso aso, String str, int i) {
        this.a = episodeNoteAdapter;
        super(activity);
        this.b = aso;
        this.c = i;
        aso.a(str);
    }

    protected final /* synthetic */ void a(Object obj) {
        obj = (alg) obj;
        super.a(obj);
        if (obj == null) {
            Toast.makeText(this.a.c, "Could not connect to Kanon... sorry", 1).show();
        } else if (obj.c()) {
            Toast.makeText(this.a.c, obj.b(), 0).show();
            this.b.d();
            this.a.d.set(this.c, this.b);
            this.a.notifyItemChanged(this.c);
        } else {
            Context a = this.a.c;
            StringBuilder stringBuilder = new StringBuilder("Could not save this note, reason: ");
            stringBuilder.append(obj.b());
            Toast.makeText(a, stringBuilder.toString(), 1).show();
        }
    }

    public final /* synthetic */ Object b() {
        this.a.e;
        return ata.a(this.b);
    }
}
