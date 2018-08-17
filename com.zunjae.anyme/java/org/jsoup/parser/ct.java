package org.jsoup.parser;

enum ct extends ak {
    ct(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        char a = characterReader.a();
        if (a == '\u0000') {
            ajVar.c((ak) this);
            ajVar.f.e.append('\ufffd');
        } else if (a == '\'') {
            ajVar.a(AfterDoctypeSystemIdentifier);
        } else if (a == '>') {
            ajVar.c((ak) this);
            ajVar.f.f = true;
            ajVar.f();
            ajVar.a(Data);
        } else if (a != '\uffff') {
            ajVar.f.e.append(a);
        } else {
            ajVar.d(this);
            ajVar.f.f = true;
            ajVar.f();
            ajVar.a(Data);
        }
    }
}
