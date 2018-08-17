package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import java.util.List;

public final class ade {
    private Context a;
    private Spanned b;
    private List<CharacterStyle> c;
    private HashMap<String, List<CharacterStyle>> d;
    private List<adm> e;

    public ade(Context context, List<adm> list, Spanned spanned, List<CharacterStyle> list2, HashMap<String, List<CharacterStyle>> hashMap) {
        this.a = context;
        this.e = list;
        this.b = spanned;
        this.c = list2;
        this.d = hashMap;
    }

    public final Spanned a() {
        HashMap hashMap = new HashMap();
        for (adm adm : this.e) {
            hashMap.put(adm.getMappingPrefix(), adm);
        }
        return adc.a(this.a, hashMap, this.b, this.c, this.d);
    }
}
