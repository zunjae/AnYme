package org.jsoup.parser;

import java.util.Arrays;
import mehdi.sakout.fancybuttons.R;

enum ak {
    Data,
    CharacterReferenceInData,
    Rcdata,
    CharacterReferenceInRcdata,
    Rawtext,
    ScriptData,
    PLAINTEXT,
    TagOpen,
    EndTagOpen,
    TagName,
    RcdataLessthanSign,
    RCDATAEndTagOpen,
    RCDATAEndTagName,
    RawtextLessthanSign,
    RawtextEndTagOpen,
    RawtextEndTagName,
    ScriptDataLessthanSign,
    ScriptDataEndTagOpen,
    ScriptDataEndTagName,
    ScriptDataEscapeStart,
    ScriptDataEscapeStartDash,
    ScriptDataEscaped,
    ScriptDataEscapedDash,
    ScriptDataEscapedDashDash,
    ScriptDataEscapedLessthanSign,
    ScriptDataEscapedEndTagOpen,
    ScriptDataEscapedEndTagName,
    ScriptDataDoubleEscapeStart,
    ScriptDataDoubleEscaped,
    ScriptDataDoubleEscapedDash,
    ScriptDataDoubleEscapedDashDash,
    ScriptDataDoubleEscapedLessthanSign,
    ScriptDataDoubleEscapeEnd,
    BeforeAttributeName,
    AttributeName,
    AfterAttributeName,
    BeforeAttributeValue,
    AttributeValue_doubleQuoted,
    AttributeValue_singleQuoted,
    AttributeValue_unquoted,
    AfterAttributeValue_quoted,
    SelfClosingStartTag,
    BogusComment,
    MarkupDeclarationOpen,
    CommentStart,
    CommentStartDash,
    Comment,
    CommentEndDash,
    CommentEnd,
    CommentEndBang,
    Doctype,
    BeforeDoctypeName,
    DoctypeName,
    AfterDoctypeName,
    AfterDoctypePublicKeyword,
    BeforeDoctypePublicIdentifier,
    DoctypePublicIdentifier_doubleQuoted,
    DoctypePublicIdentifier_singleQuoted,
    AfterDoctypePublicIdentifier,
    BetweenDoctypePublicAndSystemIdentifiers,
    AfterDoctypeSystemKeyword,
    BeforeDoctypeSystemIdentifier,
    DoctypeSystemIdentifier_doubleQuoted,
    DoctypeSystemIdentifier_singleQuoted,
    AfterDoctypeSystemIdentifier,
    BogusDoctype,
    CdataSection;
    
    private static final char[] attributeDoubleValueCharsSorted = null;
    private static final char[] attributeNameCharsSorted = null;
    private static final char[] attributeSingleValueCharsSorted = null;
    private static final char[] attributeValueUnquoted = null;
    private static final char eof = '\uffff';
    static final char nullChar = '\u0000';
    private static final char replacementChar = '\ufffd';
    private static final String replacementStr = "\ufffd";

    static {
        attributeSingleValueCharsSorted = new char[]{'\'', '&', nullChar};
        attributeDoubleValueCharsSorted = new char[]{'\"', '&', nullChar};
        attributeNameCharsSorted = new char[]{'\t', '\n', '\r', '\f', ' ', '/', '=', '>', nullChar, '\"', '\'', '<'};
        attributeValueUnquoted = new char[]{'\t', '\n', '\r', '\f', ' ', '&', '>', nullChar, '\"', '\'', '<', '=', '`'};
        Arrays.sort(attributeSingleValueCharsSorted);
        Arrays.sort(attributeDoubleValueCharsSorted);
        Arrays.sort(attributeNameCharsSorted);
        Arrays.sort(attributeValueUnquoted);
    }

    private static void handleDataDoubleEscapeTag(aj ajVar, CharacterReader characterReader, ak akVar, ak akVar2) {
        if (characterReader.k()) {
            String g = characterReader.g();
            ajVar.a.append(g);
            ajVar.a(g);
            return;
        }
        char a = characterReader.a();
        switch (a) {
            case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
            case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
            case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
            case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
            case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_checkedTextViewStyle /*47*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerVertical /*62*/:
                if (ajVar.a.toString().equals("script")) {
                    ajVar.a(akVar);
                } else {
                    ajVar.a(akVar2);
                }
                ajVar.a(a);
                return;
            default:
                characterReader.b();
                ajVar.a(akVar2);
                return;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void handleDataEndTag(org.jsoup.parser.aj r2, org.jsoup.parser.CharacterReader r3, org.jsoup.parser.ak r4) {
        /*
        r0 = r3.k();
        if (r0 == 0) goto L_0x0015;
    L_0x0006:
        r3 = r3.g();
        r4 = r2.b;
        r4.b(r3);
        r2 = r2.a;
        r2.append(r3);
        return;
    L_0x0015:
        r0 = 0;
        r1 = r2.g();
        if (r1 == 0) goto L_0x003e;
    L_0x001c:
        r1 = r3.isEmpty();
        if (r1 != 0) goto L_0x003e;
    L_0x0022:
        r3 = r3.a();
        switch(r3) {
            case 9: goto L_0x0038;
            case 10: goto L_0x0038;
            case 12: goto L_0x0038;
            case 13: goto L_0x0038;
            case 32: goto L_0x0038;
            case 47: goto L_0x0035;
            case 62: goto L_0x002f;
            default: goto L_0x0029;
        };
    L_0x0029:
        r0 = r2.a;
        r0.append(r3);
        goto L_0x003e;
    L_0x002f:
        r2.c();
        r3 = Data;
        goto L_0x003a;
    L_0x0035:
        r3 = SelfClosingStartTag;
        goto L_0x003a;
    L_0x0038:
        r3 = BeforeAttributeName;
    L_0x003a:
        r2.a(r3);
        goto L_0x003f;
    L_0x003e:
        r0 = 1;
    L_0x003f:
        if (r0 == 0) goto L_0x005b;
    L_0x0041:
        r3 = new java.lang.StringBuilder;
        r0 = "</";
        r3.<init>(r0);
        r0 = r2.a;
        r0 = r0.toString();
        r3.append(r0);
        r3 = r3.toString();
        r2.a(r3);
        r2.a(r4);
    L_0x005b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.ak.handleDataEndTag(org.jsoup.parser.aj, org.jsoup.parser.CharacterReader, org.jsoup.parser.ak):void");
    }

    private static void readCharRef(aj ajVar, ak akVar) {
        int[] a = ajVar.a(null, false);
        if (a == null) {
            ajVar.a('&');
        } else {
            ajVar.a(a);
        }
        ajVar.a(akVar);
    }

    private static void readData(aj ajVar, CharacterReader characterReader, ak akVar, ak akVar2) {
        char current = characterReader.current();
        if (current == '\u0000') {
            ajVar.c(akVar);
            characterReader.advance();
            ajVar.a((char) replacementChar);
        } else if (current == '<') {
            ajVar.b(akVar2);
        } else if (current != eof) {
            ajVar.a(characterReader.consumeToAny('<', nullChar));
        } else {
            ajVar.a(new ae());
        }
    }

    private static void readEndTag(aj ajVar, CharacterReader characterReader, ak akVar, ak akVar2) {
        if (characterReader.k()) {
            ajVar.a(false);
            ajVar.a(akVar);
            return;
        }
        ajVar.a("</");
        ajVar.a(akVar2);
    }

    abstract void read(aj ajVar, CharacterReader characterReader);
}
