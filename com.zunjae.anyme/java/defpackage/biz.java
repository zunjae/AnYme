package defpackage;

import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

public final class biz extends biv {
    private final HashMap<String, String> b = new HashMap();
    private final HashSet<Character> c = new HashSet();
    private final int d;
    private final int e;

    public biz(CharSequence[]... charSequenceArr) {
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        if (charSequenceArr != null) {
            int i3 = Integer.MAX_VALUE;
            int i4 = 0;
            for (CharSequence[] charSequenceArr2 : charSequenceArr) {
                this.b.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
                this.c.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
                int length = charSequenceArr2[0].length();
                if (length < i3) {
                    i3 = length;
                }
                if (length > i4) {
                    i4 = length;
                }
            }
            i2 = i3;
            i = i4;
        }
        this.d = i2;
        this.e = i;
    }

    public final int a(CharSequence charSequence, int i, Writer writer) {
        if (this.c.contains(Character.valueOf(charSequence.charAt(i)))) {
            int i2 = this.e;
            if (i + i2 > charSequence.length()) {
                i2 = charSequence.length() - i;
            }
            while (i2 >= this.d) {
                String str = (String) this.b.get(charSequence.subSequence(i, i + i2).toString());
                if (str != null) {
                    writer.write(str);
                    return i2;
                }
                i2--;
            }
        }
        return 0;
    }
}
