package org.jsoup.parser;

enum aw extends ak {
    aw(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak.readCharRef(ajVar, Data);
    }
}
