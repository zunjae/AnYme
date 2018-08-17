package org.jsoup.parser;

import org.jsoup.nodes.DocumentType;

enum ci extends ak {
    ci(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.isEmpty()) {
            ajVar.d(this);
            ajVar.f.f = true;
            ajVar.f();
            ajVar.a(Data);
        } else if (characterReader.b('\t', '\n', '\r', '\f', ' ')) {
            characterReader.advance();
        } else if (characterReader.a('>')) {
            ajVar.f();
            ajVar.b(Data);
        } else if (characterReader.c(DocumentType.PUBLIC_KEY)) {
            ajVar.f.c = DocumentType.PUBLIC_KEY;
            ajVar.a(AfterDoctypePublicKeyword);
        } else if (characterReader.c(DocumentType.SYSTEM_KEY)) {
            ajVar.f.c = DocumentType.SYSTEM_KEY;
            ajVar.a(AfterDoctypeSystemKeyword);
        } else {
            ajVar.c((ak) this);
            ajVar.f.f = true;
            ajVar.b(BogusDoctype);
        }
    }
}
