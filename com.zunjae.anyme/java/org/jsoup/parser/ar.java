package org.jsoup.parser;

enum ar extends ak {
    ar(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak.readEndTag(ajVar, characterReader, RawtextEndTagName, Rawtext);
    }
}
