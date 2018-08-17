package org.jsoup.parser;

enum bv extends ak {
    bv(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak akVar;
        char a = characterReader.a();
        if (a == '>') {
            ajVar.b.d = true;
            ajVar.c();
            akVar = Data;
        } else if (a != '\uffff') {
            ajVar.c((ak) this);
            characterReader.b();
            akVar = BeforeAttributeName;
        } else {
            ajVar.d(this);
            akVar = Data;
        }
        ajVar.a(akVar);
    }
}
