package org.jsoup.parser;

enum bw extends ak {
    bw(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        characterReader.b();
        aa acVar = new ac();
        acVar.c = true;
        acVar.b.append(characterReader.consumeTo('>'));
        ajVar.a(acVar);
        ajVar.b(Data);
    }
}
