package org.jsoup.parser;

enum bf extends ak {
    bf(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak.handleDataDoubleEscapeTag(ajVar, characterReader, ScriptDataDoubleEscaped, ScriptDataEscaped);
    }
}
