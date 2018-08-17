package org.jsoup.parser;

import mehdi.sakout.fancybuttons.R;

enum cu extends ak {
    cu(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak akVar;
        switch (characterReader.a()) {
            case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
            case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
            case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
            case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
            case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
                return;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerVertical /*62*/:
                break;
            case '\uffff':
                ajVar.d(this);
                ajVar.f.f = true;
                break;
            default:
                ajVar.c((ak) this);
                akVar = BogusDoctype;
                break;
        }
        ajVar.f();
        akVar = Data;
        ajVar.a(akVar);
    }
}
