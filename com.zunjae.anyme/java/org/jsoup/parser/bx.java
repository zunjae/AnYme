package org.jsoup.parser;

enum bx extends ak {
    bx(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.b("--")) {
            ajVar.g.a();
            ajVar.a(CommentStart);
        } else if (characterReader.c("DOCTYPE")) {
            ajVar.a(Doctype);
        } else if (characterReader.b("[CDATA[")) {
            ajVar.a(CdataSection);
        } else {
            ajVar.c((ak) this);
            ajVar.b(BogusComment);
        }
    }
}
