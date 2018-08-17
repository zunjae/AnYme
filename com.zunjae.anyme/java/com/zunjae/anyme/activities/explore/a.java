package com.zunjae.anyme.activities.explore;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.greenfrvr.hashtagview.g;
import defpackage.aml;

final class a implements g<aml> {
    final /* synthetic */ AdvancedAnimeSearch a;

    a(AdvancedAnimeSearch advancedAnimeSearch) {
        this.a = advancedAnimeSearch;
    }

    public final /* synthetic */ CharSequence a(Object obj) {
        String a = ((aml) obj).a();
        CharSequence spannableString = new SpannableString(a);
        spannableString.setSpan(new StyleSpan(1), 0, a.length(), 33);
        spannableString.setSpan(new RelativeSizeSpan(1.2f), 0, a.length(), 33);
        return spannableString;
    }

    public final /* synthetic */ CharSequence b(Object obj) {
        String a = ((aml) obj).a();
        CharSequence spannableString = new SpannableString(a);
        spannableString.setSpan(new StyleSpan(2), 0, a.length(), 33);
        spannableString.setSpan(new RelativeSizeSpan(1.2f), 0, a.length(), 33);
        spannableString.setSpan(new UnderlineSpan(), 0, a.length(), 33);
        return spannableString;
    }
}
