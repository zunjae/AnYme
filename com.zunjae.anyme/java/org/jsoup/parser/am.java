package org.jsoup.parser;

import mehdi.sakout.fancybuttons.R;

enum am extends ak {
    am(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ajVar.b.b(characterReader.f());
        switch (characterReader.a()) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                ajVar.b.b(ak.replacementStr);
                break;
            case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
            case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
            case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
            case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
            case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
                ajVar.a(BeforeAttributeName);
                return;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_checkedTextViewStyle /*47*/:
                ajVar.a(SelfClosingStartTag);
                return;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerVertical /*62*/:
                ajVar.c();
                ajVar.a(Data);
                return;
            case '\uffff':
                ajVar.d(this);
                ajVar.a(Data);
                break;
            default:
                break;
        }
    }
}
