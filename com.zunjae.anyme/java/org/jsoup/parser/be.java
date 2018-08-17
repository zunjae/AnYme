package org.jsoup.parser;

enum be extends ak {
    be(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak.handleDataEndTag(ajVar, characterReader, ScriptDataEscaped);
    }
}
