package org.jsoup.parser;

enum ao extends ak {
    ao(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.k()) {
            ajVar.a(false);
            ajVar.b.a(characterReader.current());
            ajVar.a.append(characterReader.current());
            ajVar.b(RCDATAEndTagName);
            return;
        }
        ajVar.a("</");
        ajVar.a(Rcdata);
    }
}
