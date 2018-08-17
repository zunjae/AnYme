package org.jsoup.parser;

enum bd extends ak {
    bd(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.k()) {
            ajVar.a(false);
            ajVar.b.a(characterReader.current());
            ajVar.a.append(characterReader.current());
            ajVar.b(ScriptDataEscapedEndTagName);
            return;
        }
        ajVar.a("</");
        ajVar.a(ScriptDataEscaped);
    }
}
