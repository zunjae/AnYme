package org.jsoup.parser;

abstract class aa {
    ai a;

    private aa() {
    }

    static void a(StringBuilder stringBuilder) {
        if (stringBuilder != null) {
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    abstract aa a();

    final boolean b() {
        return this.a == ai.Doctype;
    }

    final boolean c() {
        return this.a == ai.StartTag;
    }

    final boolean d() {
        return this.a == ai.EndTag;
    }

    final boolean e() {
        return this.a == ai.Comment;
    }

    final boolean f() {
        return this.a == ai.Character;
    }

    final boolean g() {
        return this.a == ai.EOF;
    }
}
