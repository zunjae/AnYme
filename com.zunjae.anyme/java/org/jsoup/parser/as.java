package org.jsoup.parser;

enum as extends ak {
    as(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak.handleDataEndTag(ajVar, characterReader, Rawtext);
    }
}
