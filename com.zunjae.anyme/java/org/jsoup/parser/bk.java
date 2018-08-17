package org.jsoup.parser;

enum bk extends ak {
    bk(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.a('/')) {
            ajVar.a('/');
            aa.a(ajVar.a);
            ajVar.b(ScriptDataDoubleEscapeEnd);
            return;
        }
        ajVar.a(ScriptDataDoubleEscaped);
    }
}
