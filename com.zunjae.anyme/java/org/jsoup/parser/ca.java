package org.jsoup.parser;

enum ca extends ak {
    ca(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        char current = characterReader.current();
        if (current == '\u0000') {
            ajVar.c((ak) this);
            characterReader.advance();
            ajVar.g.b.append('\ufffd');
        } else if (current == '-') {
            ajVar.b(CommentEndDash);
        } else if (current != '\uffff') {
            ajVar.g.b.append(characterReader.consumeToAny('-', '\u0000'));
        } else {
            ajVar.d(this);
            ajVar.d();
            ajVar.a(Data);
        }
    }
}
