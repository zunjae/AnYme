package org.jsoup.parser;

enum cz extends ak {
    cz(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.isEmpty()) {
            ajVar.d(this);
            ajVar.a("</");
            ajVar.a(Data);
        } else if (characterReader.k()) {
            ajVar.a(false);
            ajVar.a(TagName);
        } else if (characterReader.a('>')) {
            ajVar.c((ak) this);
            ajVar.b(Data);
        } else {
            ajVar.c((ak) this);
            ajVar.b(BogusComment);
        }
    }
}
