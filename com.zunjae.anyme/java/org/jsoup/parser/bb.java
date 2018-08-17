package org.jsoup.parser;

enum bb extends ak {
    bb(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak akVar;
        if (characterReader.isEmpty()) {
            ajVar.d(this);
            akVar = Data;
        } else {
            char a = characterReader.a();
            if (a == '\u0000') {
                ajVar.c((ak) this);
                a = '\ufffd';
            } else if (a == '-') {
                ajVar.a(a);
                return;
            } else if (a == '<') {
                akVar = ScriptDataEscapedLessthanSign;
            } else if (a == '>') {
                ajVar.a(a);
                akVar = ScriptData;
            }
            ajVar.a(a);
            akVar = ScriptDataEscaped;
        }
        ajVar.a(akVar);
    }
}
