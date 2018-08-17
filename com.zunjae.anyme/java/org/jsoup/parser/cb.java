package org.jsoup.parser;

enum cb extends ak {
    cb(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak akVar;
        char a = characterReader.a();
        if (a != '\u0000') {
            if (a == '-') {
                akVar = CommentEnd;
            } else if (a != '\uffff') {
                StringBuilder stringBuilder = ajVar.g.b;
                stringBuilder.append('-');
                stringBuilder.append(a);
            } else {
                ajVar.d(this);
                ajVar.d();
                akVar = Data;
            }
            ajVar.a(akVar);
        }
        ajVar.c((ak) this);
        StringBuilder stringBuilder2 = ajVar.g.b;
        stringBuilder2.append('-');
        stringBuilder2.append('\ufffd');
        akVar = Comment;
        ajVar.a(akVar);
    }
}
