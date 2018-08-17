package com.zunjae.anyme.adapters;

import android.app.Activity;
import android.content.Intent;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.x;
import com.zunjae.anyme.activities.misc.KanonExplanation;
import defpackage.anq;

final class d implements x {
    final /* synthetic */ c a;

    d(c cVar) {
        this.a = cVar;
    }

    public final void onClick(j jVar, e eVar) {
        if (anq.b()) {
            this.a.c.c.startActivity(new Intent(this.a.c.c, KanonExplanation.class));
            return;
        }
        if (jVar.f() != null) {
            String obj = jVar.f().getText().toString();
            EpisodeNoteAdapter episodeNoteAdapter = this.a.c;
            Activity a = episodeNoteAdapter.c;
            c cVar = this.a;
            new e(episodeNoteAdapter, a, cVar.a, obj, cVar.b).f();
        }
    }
}
