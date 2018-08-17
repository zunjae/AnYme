package org.jsoup.parser;

enum bc extends ak {
    bc(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.k()) {
            aa.a(ajVar.a);
            ajVar.a.append(characterReader.current());
            StringBuilder stringBuilder = new StringBuilder("<");
            stringBuilder.append(characterReader.current());
            ajVar.a(stringBuilder.toString());
            ajVar.b(ScriptDataDoubleEscapeStart);
        } else if (characterReader.a('/')) {
            aa.a(ajVar.a);
            ajVar.b(ScriptDataEscapedEndTagOpen);
        } else {
            ajVar.a('<');
            ajVar.a(ScriptDataEscaped);
        }
    }
}
