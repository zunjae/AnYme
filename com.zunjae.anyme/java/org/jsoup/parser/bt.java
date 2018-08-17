package org.jsoup.parser;

import mehdi.sakout.fancybuttons.R;

enum bt extends ak {
    bt(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        String a = characterReader.a(ak.attributeValueUnquoted);
        if (a.length() > 0) {
            ajVar.b.d(a);
        }
        char a2 = characterReader.a();
        switch (a2) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                ajVar.c((ak) this);
                ajVar.b.c('\ufffd');
                break;
            case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
            case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
            case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
            case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
            case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
                ajVar.a(BeforeAttributeName);
                return;
            case R.styleable.FancyButtonsAttrs_fb_useSystemFont /*34*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_buttonBarButtonStyle /*39*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dialogTheme /*60*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerHorizontal /*61*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceListItem /*96*/:
                ajVar.c((ak) this);
                ajVar.b.c(a2);
                break;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_borderlessButtonStyle /*38*/:
                int[] a3 = ajVar.a(Character.valueOf('>'), true);
                if (a3 != null) {
                    ajVar.b.a(a3);
                    return;
                } else {
                    ajVar.b.c('&');
                    return;
                }
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
