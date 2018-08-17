package org.jsoup.parser;

enum at extends ak {
    at(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak akVar;
        char a = characterReader.a();
        if (a == '!') {
            ajVar.a("<!");
            akVar = ScriptDataEscapeStart;
        } else if (a != '/') {
            ajVar.a("<");
            characterReader.b();
            akVar = ScriptData;
        } else {
            aa.a(ajVar.a);
            akVar = ScriptDataEndTagOpen;
        }
        ajVar.a(akVar);
    }
}
