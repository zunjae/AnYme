package org.jsoup.parser;

enum bh extends ak {
    bh(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        char current = characterReader.current();
        if (current == '\u0000') {
            ajVar.c((ak) this);
            characterReader.advance();
            ajVar.a('\ufffd');
        } else if (current == '&') {
            ajVar.b(CharacterReferenceInRcdata);
        } else if (current == '<') {
            ajVar.b(RcdataLessthanSign);
        } else if (current != '\uffff') {
            ajVar.a(characterReader.consumeToAny('&', '<', '\u0000'));
        } else {
            ajVar.a(new ae());
        }
    }
}
