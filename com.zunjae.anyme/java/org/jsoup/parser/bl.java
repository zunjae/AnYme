package org.jsoup.parser;

enum bl extends ak {
    bl(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak.handleDataDoubleEscapeTag(ajVar, characterReader, ScriptDataEscaped, ScriptDataDoubleEscaped);
    }
}
