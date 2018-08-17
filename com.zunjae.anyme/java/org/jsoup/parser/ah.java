package org.jsoup.parser;

import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.BooleanAttribute;

abstract class ah extends aa {
    protected String b;
    protected String c;
    boolean d = false;
    Attributes e;
    private String f;
    private StringBuilder g = new StringBuilder();
    private String h;
    private boolean i = false;
    private boolean j = false;

    ah() {
        super();
    }

    private void n() {
        this.j = true;
        String str = this.h;
        if (str != null) {
            this.g.append(str);
            this.h = null;
        }
    }

    /* synthetic */ aa a() {
        return h();
    }

    final ah a(String str) {
        this.b = str;
        this.c = str.toLowerCase();
        return this;
    }

    final void a(char c) {
        b(String.valueOf(c));
    }

    final void a(int[] iArr) {
        n();
        for (int appendCodePoint : iArr) {
            this.g.appendCodePoint(appendCodePoint);
        }
    }

    final void b(char c) {
        c(String.valueOf(c));
    }

    final void b(String str) {
        String str2 = this.b;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.b = str;
        this.c = this.b.toLowerCase();
    }

    final void c(char c) {
        n();
        this.g.append(c);
    }

    final void c(String str) {
        String str2 = this.f;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f = str;
    }

    final void d(String str) {
        n();
        if (this.g.length() == 0) {
            this.h = str;
        } else {
            this.g.append(str);
        }
    }

    ah h() {
        this.b = null;
        this.c = null;
        this.f = null;
        aa.a(this.g);
        this.h = null;
        this.i = false;
        this.j = false;
        this.d = false;
        this.e = null;
        return this;
    }

    final void i() {
        if (this.e == null) {
            this.e = new Attributes();
        }
        String str = this.f;
        if (str != null) {
            Attribute attribute;
            if (this.j) {
                attribute = new Attribute(str, this.g.length() > 0 ? this.g.toString() : this.h);
            } else {
                attribute = this.i ? new Attribute(str, BuildConfig.FLAVOR) : new BooleanAttribute(str);
            }
            this.e.put(attribute);
        }
        this.f = null;
        this.i = false;
        this.j = false;
        aa.a(this.g);
        this.h = null;
    }

    final void j() {
        if (this.f != null) {
            i();
        }
    }

    final String k() {
        boolean z;
        String str = this.b;
        if (str != null) {
            if (str.length() != 0) {
                z = false;
                Validate.isFalse(z);
                return this.b;
            }
        }
        z = true;
        Validate.isFalse(z);
        return this.b;
    }

    final String l() {
        return this.c;
    }

    final void m() {
        this.i = true;
    }
}
