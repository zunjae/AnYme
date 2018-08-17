package org.jsoup.parser;

enum cy extends ak {
    cy(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        char current = characterReader.current();
        if (current == '!') {
            ajVar.b(MarkupDeclarationOpen);
        } else if (current == '/') {
            ajVar.b(EndTagOpen);
        } else if (current == '?') {
            ajVar.b(BogusComment);
        } else if (characterReader.k()) {
            ajVar.a(true);
            ajVar.a(TagName);
        } else {
            ajVar.c((ak) this);
            ajVar.a('<');
            ajVar.a(Data);
        }
    }
}
