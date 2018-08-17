package org.jsoup.nodes;

import java.util.Arrays;
import java.util.Map.Entry;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;

public class Attribute implements Cloneable, Entry<String, String> {
    private static final String[] a = new String[]{"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private String b;
    private String c;

    public Attribute(String str, String str2) {
        Validate.notEmpty(str);
        Validate.notNull(str2);
        this.b = str.trim();
        this.c = str2;
    }

    private boolean a(OutputSettings outputSettings) {
        return (BuildConfig.FLAVOR.equals(this.c) || this.c.equalsIgnoreCase(this.b)) && outputSettings.syntax() == Syntax.html && b();
    }

    public static Attribute createFromEncoded(String str, String str2) {
        return new Attribute(str, Entities.b(str2));
    }

    protected final void a(Appendable appendable, OutputSettings outputSettings) {
        appendable.append(this.b);
        if (!a(outputSettings)) {
            appendable.append("=\"");
            Entities.a(appendable, this.c, outputSettings, true, false);
            appendable.append('\"');
        }
    }

    protected final boolean a() {
        return this.b.startsWith("data-") && this.b.length() > 5;
    }

    protected boolean b() {
        return Arrays.binarySearch(a, this.b) >= 0;
    }

    public Attribute clone() {
        try {
            return (Attribute) super.clone();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof org.jsoup.nodes.Attribute;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r5 = (org.jsoup.nodes.Attribute) r5;
        r1 = r4.b;
        if (r1 == 0) goto L_0x0019;
    L_0x0010:
        r3 = r5.b;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x001e;
    L_0x0018:
        goto L_0x001d;
    L_0x0019:
        r1 = r5.b;
        if (r1 == 0) goto L_0x001e;
    L_0x001d:
        return r2;
    L_0x001e:
        r1 = r4.c;
        if (r1 == 0) goto L_0x002b;
    L_0x0022:
        r5 = r5.c;
        r5 = r1.equals(r5);
        if (r5 != 0) goto L_0x002f;
    L_0x002a:
        goto L_0x0030;
    L_0x002b:
        r5 = r5.c;
        if (r5 != 0) goto L_0x0030;
    L_0x002f:
        return r0;
    L_0x0030:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Attribute.equals(java.lang.Object):boolean");
    }

    public String getKey() {
        return this.b;
    }

    public String getValue() {
        return this.c;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String html() {
        Appendable stringBuilder = new StringBuilder();
        try {
            a(stringBuilder, new Document(BuildConfig.FLAVOR).outputSettings());
            return stringBuilder.toString();
        } catch (Throwable e) {
            throw new SerializationException(e);
        }
    }

    public void setKey(String str) {
        Validate.notEmpty(str);
        this.b = str.trim();
    }

    public String setValue(String str) {
        Validate.notNull(str);
        String str2 = this.c;
        this.c = str;
        return str2;
    }

    public String toString() {
        return html();
    }
}
