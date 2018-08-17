package org.jsoup.parser;

enum aq extends ak {
    aq(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.a('/')) {
            aa.a(ajVar.a);
            ajVar.b(RawtextEndTagOpen);
            return;
        }
        ajVar.a('<');
        ajVar.a(Rawtext);
    }
}
