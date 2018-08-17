package org.jsoup.parser;

enum ce extends ak {
    ce(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak akVar;
        char a = characterReader.a();
        if (a != '\u0000') {
            if (a != '-') {
                if (a != '>') {
                    if (a != '\uffff') {
                        StringBuilder stringBuilder = ajVar.g.b;
                        stringBuilder.append("--!");
                        stringBuilder.append(a);
                    } else {
                        ajVar.d(this);
                    }
                }
                ajVar.d();
                akVar = Data;
            } else {
                ajVar.g.b.append("--!");
                akVar = CommentEndDash;
            }
            ajVar.a(akVar);
        }
        ajVar.c((ak) this);
        ajVar.g.b.append("--!\ufffd");
        akVar = Comment;
        ajVar.a(akVar);
    }
}
