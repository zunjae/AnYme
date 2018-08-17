package org.jsoup.parser;

enum bq extends ak {
    bq(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        String consumeToAny = characterReader.consumeToAny(ak.attributeDoubleValueCharsSorted);
        if (consumeToAny.length() > 0) {
            ajVar.b.d(consumeToAny);
        } else {
            ajVar.b.m();
        }
        char a = characterReader.a();
        if (a == '\u0000') {
            ajVar.c((ak) this);
            ajVar.b.c('\ufffd');
        } else if (a == '\"') {
            ajVar.a(AfterAttributeValue_quoted);
        } else if (a != '&') {
            if (a == '\uffff') {
                ajVar.d(this);
                ajVar.a(Data);
            }
        } else {
            int[] a2 = ajVar.a(Character.valueOf('\"'), true);
            if (a2 != null) {
                ajVar.b.a(a2);
            } else {
                ajVar.b.c('&');
            }
        }
    }
}
