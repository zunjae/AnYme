package org.jsoup.parser;

enum cv extends ak {
    cv(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        char a = characterReader.a();
        if (a != '>') {
            if (a == '\uffff') {
                ajVar.f();
                ajVar.a(Data);
            }
            return;
        }
        ajVar.f();
        ajVar.a(Data);
    }
}
