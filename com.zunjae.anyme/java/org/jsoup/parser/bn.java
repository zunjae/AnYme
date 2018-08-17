package org.jsoup.parser;

import mehdi.sakout.fancybuttons.R;

enum bn extends ak {
    bn(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ajVar.b.c(characterReader.a(ak.attributeNameCharsSorted));
        char a = characterReader.a();
        switch (a) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                ajVar.c((ak) this);
                ajVar.b.b('\ufffd');
                break;
            case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
            case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
            case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
            case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
            case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
                ajVar.a(AfterAttributeName);
                return;
            case R.styleable.FancyButtonsAttrs_fb_useSystemFont /*34*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_buttonBarButtonStyle /*39*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dialogTheme /*60*/:
                ajVar.c((ak) this);
                ajVar.b.b(a);
                break;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_checkedTextViewStyle /*47*/:
                ajVar.a(SelfClosingStartTag);
                return;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerHorizontal /*61*/:
                ajVar.a(BeforeAttributeValue);
                return;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerVertical /*62*/:
                ajVar.c();
                ajVar.a(Data);
                return;
            case '\uffff':
                ajVar.d(this);
                ajVar.a(Data);
                return;
            default:
                break;
        }
    }
}
