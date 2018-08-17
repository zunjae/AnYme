package org.jsoup.parser;

final class ac extends aa {
    final StringBuilder b;
    boolean c;

    ac() {
        super();
        this.b = new StringBuilder();
        this.c = false;
        this.a = ai.Comment;
    }

    final aa a() {
        aa.a(this.b);
        this.c = false;
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<!--");
        stringBuilder.append(this.b.toString());
        stringBuilder.append("-->");
        return stringBuilder.toString();
    }
}
