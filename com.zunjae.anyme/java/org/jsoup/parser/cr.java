package org.jsoup.parser;

import mehdi.sakout.fancybuttons.R;

enum cr extends ak {
    cr(String str, int i) {
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
            case R.styleable.FancyButtonsAttrs_fb_useSystemFont /*34*/:
                akVar = DoctypeSystemIdentifier_doubleQuoted;
                break;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_buttonBarButtonStyle /*39*/:
                akVar = DoctypeSystemIdentifier_singleQuoted;
                break;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerVertical /*62*/:
                ajVar.c((ak) this);
                break;
            case '\uffff':
                ajVar.d(this);
                break;
            default:
                ajVar.c((ak) this);
                ajVar.f.f = true;
                akVar = BogusDoctype;
                break;
        }
        ajVar.f.f = true;
        ajVar.f();
        akVar = Data;
        ajVar.a(akVar);
    }
}
