package com.zunjae.anyme.adapters;

import android.view.View;
import android.view.View.OnClickListener;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import defpackage.aso;

final class c implements OnClickListener {
    final /* synthetic */ aso a;
    final /* synthetic */ int b;
    final /* synthetic */ EpisodeNoteAdapter c;

    c(EpisodeNoteAdapter episodeNoteAdapter, aso aso, int i) {
        this.c = episodeNoteAdapter;
        this.a = aso;
        this.b = i;
    }

    private static /* synthetic */ void a(j jVar, CharSequence charSequence) {
    }

    public final void onClick(View view) {
        o a = new o(this.c.c).a(this.a.b()).b(32769).j().c((CharSequence) "Save").e("Cancel").a(new d(this));
        StringBuilder stringBuilder = new StringBuilder("Add some notes for ");
        stringBuilder.append(this.a.b());
        a.a(stringBuilder.toString(), this.a.c(), -$$Lambda$c$csvPKB3VG3HCFXAhzqhYERTl690.INSTANCE).l();
    }
}
