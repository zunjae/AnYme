package org.jsoup.parser;

import org.jsoup.nodes.Attributes;

final class ag extends ah {
    ag() {
        this.e = new Attributes();
        this.a = ai.StartTag;
    }

    final /* synthetic */ aa a() {
        return h();
    }

    final ag a(String str, Attributes attributes) {
        this.b = str;
        this.e = attributes;
        this.c = this.b.toLowerCase();
        return this;
    }

    final ah h() {
        super.h();
        this.e = new Attributes();
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        String k;
        Attributes attributes = this.e;
        if (attributes == null || attributes.size() <= 0) {
            stringBuilder = new StringBuilder("<");
            k = k();
        } else {
            stringBuilder = new StringBuilder("<");
            stringBuilder.append(k());
            stringBuilder.append(" ");
            k = this.e.toString();
        }
        stringBuilder.append(k);
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}
