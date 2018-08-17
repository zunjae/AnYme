package org.jsoup.parser;

enum al extends ak {
    al(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        char current = characterReader.current();
        if (current == '\u0000') {
            ajVar.c((ak) this);
            ajVar.a(characterReader.a());
        } else if (current == '&') {
            ajVar.b(CharacterReferenceInData);
        } else if (current == '<') {
            ajVar.b(TagOpen);
        } else if (current != '\uffff') {
            ajVar.a(characterReader.e());
        } else {
            ajVar.a(new ae());
        }
    }
}
