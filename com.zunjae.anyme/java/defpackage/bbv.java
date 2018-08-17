package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class bbv {
    private final List<String> a;
    private final List<String> b;
    private final Charset c;

    public bbv() {
        this((byte) 0);
    }

    private bbv(byte b) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = null;
    }

    public final bbu a() {
        return new bbu(this.a, this.b);
    }

    public final bbv a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (str2 != null) {
            this.a.add(bbz.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.c));
            this.b.add(bbz.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.c));
            return this;
        } else {
            throw new NullPointerException("value == null");
        }
    }

    public final bbv b(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (str2 != null) {
            this.a.add(bbz.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.c));
            this.b.add(bbz.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.c));
            return this;
        } else {
            throw new NullPointerException("value == null");
        }
    }
}
