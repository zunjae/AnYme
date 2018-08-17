package org.jsoup.parser;

enum az extends ak {
    az(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.isEmpty()) {
            ajVar.d(this);
            ajVar.a(Data);
            return;
        }
        char current = characterReader.current();
        if (current == '\u0000') {
            ajVar.c((ak) this);
            characterReader.advance();
            ajVar.a('\ufffd');
        } else if (current == '-') {
            ajVar.a('-');
            ajVar.b(ScriptDataEscapedDash);
        } else if (current != '<') {
            ajVar.a(characterReader.consumeToAny('-', '<', '\u0000'));
        } else {
            ajVar.b(ScriptDataEscapedLessthanSign);
        }
    }
}
