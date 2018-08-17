package org.jsoup.parser;

enum cx extends ak {
    cx(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        char current = characterReader.current();
        if (current == '\u0000') {
            ajVar.c((ak) this);
            characterReader.advance();
            ajVar.a('\ufffd');
        } else if (current != '\uffff') {
            ajVar.a(characterReader.consumeTo('\u0000'));
        } else {
            ajVar.a(new ae());
        }
    }
}
