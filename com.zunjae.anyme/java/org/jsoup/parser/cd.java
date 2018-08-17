package org.jsoup.parser;

enum cd extends ak {
    cd(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak.readData(ajVar, characterReader, this, RawtextLessthanSign);
    }
}
