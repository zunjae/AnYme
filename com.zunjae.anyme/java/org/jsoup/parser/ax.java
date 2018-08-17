package org.jsoup.parser;

enum ax extends ak {
    ax(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.a('-')) {
            ajVar.a('-');
            ajVar.b(ScriptDataEscapeStartDash);
            return;
        }
        ajVar.a(ScriptData);
    }
}
