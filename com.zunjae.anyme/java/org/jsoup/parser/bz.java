package org.jsoup.parser;

enum bz extends ak {
    bz(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak akVar;
        char a = characterReader.a();
        if (a != '\u0000') {
            if (a != '-') {
                if (a == '>') {
                    ajVar.c((ak) this);
                } else if (a != '\uffff') {
                    ajVar.g.b.append(a);
                } else {
                    ajVar.d(this);
                }
                ajVar.d();
                akVar = Data;
            } else {
                akVar = CommentStartDash;
            }
            ajVar.a(akVar);
        }
        ajVar.c((ak) this);
        ajVar.g.b.append('\ufffd');
        akVar = Comment;
        ajVar.a(akVar);
    }
}
