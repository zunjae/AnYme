package org.jsoup.parser;

enum cw extends ak {
    cw(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ajVar.a(characterReader.a("]]>"));
        characterReader.b("]]>");
        ajVar.a(Data);
    }
}
