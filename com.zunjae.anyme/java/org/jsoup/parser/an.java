package org.jsoup.parser;

enum an extends ak {
    an(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.a('/')) {
            aa.a(ajVar.a);
            ajVar.b(RCDATAEndTagOpen);
            return;
        }
        if (characterReader.k() && ajVar.h() != null) {
            StringBuilder stringBuilder = new StringBuilder("</");
            stringBuilder.append(ajVar.h());
            if (!characterReader.d(stringBuilder.toString())) {
                ajVar.b = ajVar.a(false).a(ajVar.h());
                ajVar.c();
                characterReader.b();
                ajVar.a(Data);
                return;
            }
        }
        ajVar.a("<");
        ajVar.a(Rcdata);
    }
}
