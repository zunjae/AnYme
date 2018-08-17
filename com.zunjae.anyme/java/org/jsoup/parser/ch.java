package org.jsoup.parser;

import mehdi.sakout.fancybuttons.R;

enum ch extends ak {
    ch(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        if (characterReader.k()) {
            ajVar.f.b.append(characterReader.g());
            return;
        }
        char a = characterReader.a();
        switch (a) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                ajVar.c((ak) this);
                ajVar.f.b.append('\ufffd');
                return;
            case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
            case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
            case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
            case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
            case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
                ajVar.a(AfterDoctypeName);
                return;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerVertical /*62*/:
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
                ajVar.f.b.append(a);
                return;
        }
    }
}
