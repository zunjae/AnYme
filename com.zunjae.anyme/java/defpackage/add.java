package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public final class add {
    private List<CharacterStyle> a = new LinkedList();
    private HashMap<String, List<CharacterStyle>> b = new HashMap();
    private List<adm> c = new LinkedList();
    private Context d;

    public final add a(Context context) {
        this.d = context;
        return this;
    }

    public final ade a(CharSequence charSequence) {
        return new ade(this.d, this.c, new SpannableString(charSequence.toString()), this.a, this.b);
    }
}
