package org.jsoup.parser;

enum bi extends ak {
    bi(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak akVar;
        char a = characterReader.a();
        if (a != '\u0000') {
            if (a == '-') {
                ajVar.a(a);
                akVar = ScriptDataDoubleEscapedDashDash;
            } else if (a == '<') {
                ajVar.a(a);
                akVar = ScriptDataDoubleEscapedLessthanSign;
            } else if (a == '\uffff') {
                ajVar.d(this);
                akVar = Data;
            }
            ajVar.a(akVar);
        }
        ajVar.c((ak) this);
        a = '\ufffd';
        ajVar.a(a);
        akVar = ScriptDataDoubleEscaped;
        ajVar.a(akVar);
    }
}
