package org.jsoup.parser;

enum ay extends ak {
    ay(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.a('-')) {
            ajVar.a('-');
            ajVar.b(ScriptDataEscapedDashDash);
            return;
        }
        ajVar.a(ScriptData);
    }
}
