package org.jsoup.parser;

import mehdi.sakout.fancybuttons.R;

enum cq extends ak {
    cq(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        switch (characterReader.a()) {
            case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
            case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
            case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
            case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
            case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
                ajVar.a(BeforeDoctypeSystemIdentifier);
                return;
            case R.styleable.FancyButtonsAttrs_fb_useSystemFont /*34*/:
                ajVar.c((ak) this);
                ajVar.a(DoctypeSystemIdentifier_doubleQuoted);
                return;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_buttonBarButtonStyle /*39*/:
                ajVar.c((ak) this);
                ajVar.a(DoctypeSystemIdentifier_singleQuoted);
                return;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerVertical /*62*/:
                ajVar.c((ak) this);
                ajVar.f.f = true;
                ajVar.f();
                ajVar.a(Data);
                return;
            case '\uffff':
                ajVar.d(this);
                ajVar.f.f = true;
                ajVar.f();
                ajVar.a(Data);
                return;
            default:
                ajVar.c((ak) this);
                ajVar.f.f = true;
                ajVar.f();
                return;
        }
    }
}
