package org.jsoup.parser;

enum av extends ak {
    av(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak.handleDataEndTag(ajVar, characterReader, ScriptData);
    }
}
