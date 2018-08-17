package org.jsoup.parser;

import me.zhanghai.android.materialprogressbar.R;

enum br extends ak {
    br(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        String consumeToAny = characterReader.consumeToAny(ak.attributeSingleValueCharsSorted);
        if (consumeToAny.length() > 0) {
            ajVar.b.d(consumeToAny);
        } else {
            ajVar.b.m();
        }
        char a = characterReader.a();
        if (a != '\u0000') {
            if (a != '\uffff') {
                switch (a) {
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /*38*/:
                        int[] a2 = ajVar.a(Character.valueOf('\''), true);
                        if (a2 != null) {
                            ajVar.b.a(a2);
                            return;
                        } else {
                            ajVar.b.c('&');
                            return;
                        }
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /*39*/:
                        ajVar.a(AfterAttributeValue_quoted);
                        return;
                    default:
                        break;
                }
            }
            ajVar.d(this);
            ajVar.a(Data);
            return;
        }
        ajVar.c((ak) this);
        ajVar.b.c('\ufffd');
    }
}
