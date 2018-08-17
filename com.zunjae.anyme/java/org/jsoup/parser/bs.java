package org.jsoup.parser;

enum bs extends ak {
    bs(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak.readCharRef(ajVar, Rcdata);
    }
}
