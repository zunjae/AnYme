package org.jsoup.parser;

enum cl extends ak {
    cl(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        char a = characterReader.a();
        if (a == '\u0000') {
            ajVar.c((ak) this);
            ajVar.f.d.append('\ufffd');
        } else if (a == '\"') {
            ajVar.a(AfterDoctypePublicIdentifier);
        } else if (a == '>') {
            ajVar.c((ak) this);
            ajVar.f.f = true;
            ajVar.f();
            ajVar.a(Data);
        } else if (a != '\uffff') {
            ajVar.f.d.append(a);
        } else {
            ajVar.d(this);
            ajVar.f.f = true;
            ajVar.f();
            ajVar.a(Data);
        }
    }
}
