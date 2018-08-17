package org.jsoup.parser;

enum bj extends ak {
    bj(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak akVar;
        char a = characterReader.a();
        if (a == '\u0000') {
            ajVar.c((ak) this);
            a = '\ufffd';
        } else if (a != '-') {
            if (a == '<') {
                ajVar.a(a);
                akVar = ScriptDataDoubleEscapedLessthanSign;
            } else if (a == '>') {
                ajVar.a(a);
                akVar = ScriptData;
            } else if (a == '\uffff') {
                ajVar.d(this);
                akVar = Data;
            }
            ajVar.a(akVar);
        } else {
            ajVar.a(a);
            return;
        }
        ajVar.a(a);
        akVar = ScriptDataDoubleEscaped;
        ajVar.a(akVar);
    }
}
