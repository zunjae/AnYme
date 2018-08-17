package org.jsoup.parser;

enum cc extends ak {
    cc(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        char a = characterReader.a();
        if (a == '\u0000') {
            ajVar.c((ak) this);
            ajVar.g.b.append("--\ufffd");
            ajVar.a(Comment);
        } else if (a == '!') {
            ajVar.c((ak) this);
            ajVar.a(CommentEndBang);
        } else if (a == '-') {
            ajVar.c((ak) this);
            ajVar.g.b.append('-');
        } else if (a == '>') {
            ajVar.d();
            ajVar.a(Data);
        } else if (a != '\uffff') {
            ajVar.c((ak) this);
            StringBuilder stringBuilder = ajVar.g.b;
            stringBuilder.append("--");
            stringBuilder.append(a);
            ajVar.a(Comment);
        } else {
            ajVar.d(this);
            ajVar.d();
            ajVar.a(Data);
        }
    }
}
