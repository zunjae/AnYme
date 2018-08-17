package org.jsoup.parser;

enum bg extends ak {
    bg(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        char current = characterReader.current();
        if (current == '\u0000') {
            ajVar.c((ak) this);
            characterReader.advance();
            ajVar.a('\ufffd');
        } else if (current == '-') {
            ajVar.a(current);
            ajVar.b(ScriptDataDoubleEscapedDash);
        } else if (current == '<') {
            ajVar.a(current);
            ajVar.b(ScriptDataDoubleEscapedLessthanSign);
        } else if (current != '\uffff') {
            ajVar.a(characterReader.consumeToAny('-', '<', '\u0000'));
        } else {
            ajVar.d(this);
            ajVar.a(Data);
        }
    }
}
