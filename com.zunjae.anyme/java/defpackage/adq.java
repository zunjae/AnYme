package defpackage;

import android.text.ParcelableSpan;
import android.text.style.CharacterStyle;

public final class adq {
    public int a;
    public int b;
    public String c;
    public adm d;
    public ParcelableSpan e;
    public CharacterStyle f;
    public int g = 33;

    public adq(int i, int i2, ParcelableSpan parcelableSpan, int i3) {
        this.a = i;
        this.b = i2;
        this.e = parcelableSpan;
        this.g = i3;
    }

    public adq(int i, int i2, CharacterStyle characterStyle, int i3) {
        this.a = i;
        this.b = i2;
        this.f = characterStyle;
        this.g = i3;
    }

    public adq(int i, int i2, String str, adm adm) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = adm;
    }
}
