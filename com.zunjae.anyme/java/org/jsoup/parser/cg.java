package org.jsoup.parser;

import mehdi.sakout.fancybuttons.R;

enum cg extends ak {
    cg(String str, int i) {
        super(str, i);
    }

    final void read(aj ajVar, CharacterReader characterReader) {
        ak akVar;
        if (!characterReader.k()) {
            char a = characterReader.a();
            switch (a) {
                case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                    ajVar.c((ak) this);
                    ajVar.e();
                    ajVar.f.b.append('\ufffd');
                    break;
                case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
                case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
                case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
                case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
                    return;
                case '\uffff':
                    ajVar.d(this);
                    ajVar.e();
                    ajVar.f.f = true;
                    ajVar.f();
                    akVar = Data;
                    break;
                default:
                    ajVar.e();
                    ajVar.f.b.append(a);
                    break;
            }
        }
        ajVar.e();
        akVar = DoctypeName;
        ajVar.a(akVar);
    }
}
