package org.jsoup.parser;

enum au extends ak {
    au(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak.readEndTag(ajVar, characterReader, ScriptDataEndTagName, ScriptData);
    }
}
