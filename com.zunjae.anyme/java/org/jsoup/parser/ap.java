package org.jsoup.parser;

import mehdi.sakout.fancybuttons.R;

enum ap extends ak {
    ap(String str, int i) {
        super(str, i);
    }

    private void anythingElse(aj ajVar, CharacterReader characterReader) {
        StringBuilder stringBuilder = new StringBuilder("</");
        stringBuilder.append(ajVar.a.toString());
        ajVar.a(stringBuilder.toString());
        characterReader.b();
        ajVar.a(Rcdata);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.k()) {
            String g = characterReader.g();
            ajVar.b.b(g);
            ajVar.a.append(g);
            return;
        }
        switch (characterReader.a()) {
            case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
            case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
            case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
            case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
            case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
                if (ajVar.g()) {
                    ajVar.a(BeforeAttributeName);
                    return;
                } else {
                    anythingElse(ajVar, characterReader);
                    return;
                }
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_checkedTextViewStyle /*47*/:
                if (ajVar.g()) {
                    ajVar.a(SelfClosingStartTag);
                    return;
                } else {
                    anythingElse(ajVar, characterReader);
                    return;
                }
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerVertical /*62*/:
                if (ajVar.g()) {
                    ajVar.c();
                    ajVar.a(Data);
                    return;
                }
                anythingElse(ajVar, characterReader);
                return;
            default:
                anythingElse(ajVar, characterReader);
                return;
        }
    }
}
