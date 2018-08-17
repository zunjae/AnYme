package org.jsoup.nodes;

import defpackage.tw;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import me.zhanghai.android.materialprogressbar.R;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.parser.Parser;

public class Entities {
    private static final HashMap<String, String> a = new HashMap();
    private static final char[] b = new char[]{',', ';'};

    public enum EscapeMode {
        xhtml("entities-xhtml.properties", 4),
        base("entities-base.properties", R.styleable.AppCompatTheme_toolbarStyle),
        extended("entities-full.properties", 2125);
        
        private int[] codeKeys;
        private int[] codeVals;
        private String[] nameKeys;
        private String[] nameVals;

        private EscapeMode(String str, int i) {
            Entities.a(this, str, i);
        }

        private int size() {
            return this.nameKeys.length;
        }

        final int codepointForName(String str) {
            int binarySearch = Arrays.binarySearch(this.nameKeys, str);
            return binarySearch >= 0 ? this.codeVals[binarySearch] : -1;
        }

        final String nameForCodepoint(int i) {
            int binarySearch = Arrays.binarySearch(this.codeKeys, i);
            if (binarySearch < 0) {
                return BuildConfig.FLAVOR;
            }
            String[] strArr = this.nameVals;
            if (binarySearch < strArr.length - 1) {
                int i2 = binarySearch + 1;
                if (this.codeKeys[i2] == i) {
                    return strArr[i2];
                }
            }
            return this.nameVals[binarySearch];
        }
    }

    private Entities() {
    }

    static String a(String str) {
        return Parser.unescapeEntities(str, false);
    }

    static void a(Appendable appendable, String str, OutputSettings outputSettings, boolean z, boolean z2) {
        EscapeMode escapeMode = outputSettings.escapeMode();
        CharsetEncoder a = outputSettings.a();
        int a2 = f.a(a.charset().name());
        int length = str.length();
        int i = 0;
        Object obj = null;
        while (i < length) {
            CharSequence charSequence;
            int codePointAt = str.codePointAt(i);
            boolean z3 = true;
            if (z2) {
                if (StringUtil.isWhitespace(codePointAt)) {
                    if (obj == null) {
                        appendable.append(' ');
                        obj = 1;
                    }
                    i += Character.charCount(codePointAt);
                } else {
                    obj = null;
                }
            }
            if (codePointAt < 65536) {
                char c = (char) codePointAt;
                if (c != '\"') {
                    if (c == '&') {
                        charSequence = "&amp;";
                    } else if (c != '<') {
                        if (c != '>') {
                            if (c != '\u00a0') {
                                switch (e.a[a2 - 1]) {
                                    case tw.a /*1*/:
                                        if (c >= '\u0080') {
                                            z3 = false;
                                            break;
                                        }
                                        break;
                                    case tw.b /*2*/:
                                        break;
                                    default:
                                        z3 = a.canEncode(c);
                                        break;
                                }
                                if (z3) {
                                }
                                a(appendable, escapeMode, codePointAt);
                                i += Character.charCount(codePointAt);
                            } else {
                                charSequence = escapeMode != EscapeMode.xhtml ? "&nbsp;" : "&#xa0;";
                            }
                        } else if (!z) {
                            charSequence = "&gt;";
                        }
                    } else if (!z || escapeMode == EscapeMode.xhtml) {
                        charSequence = "&lt;";
                    }
                } else if (z) {
                    charSequence = "&quot;";
                }
                appendable.append(c);
                i += Character.charCount(codePointAt);
            } else {
                charSequence = new String(Character.toChars(codePointAt));
                if (a.canEncode(charSequence)) {
                }
                a(appendable, escapeMode, codePointAt);
                i += Character.charCount(codePointAt);
            }
            appendable.append(charSequence);
            i += Character.charCount(codePointAt);
        }
    }

    private static void a(Appendable appendable, EscapeMode escapeMode, int i) {
        CharSequence nameForCodepoint = escapeMode.nameForCodepoint(i);
        if (nameForCodepoint != BuildConfig.FLAVOR) {
            appendable = appendable.append('&');
        } else {
            appendable = appendable.append("&#x");
            nameForCodepoint = Integer.toHexString(i);
        }
        appendable.append(nameForCodepoint).append(';');
    }

    static /* synthetic */ void a(org.jsoup.nodes.Entities.EscapeMode r11, java.lang.String r12, int r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = new java.lang.String[r13];
        r11.nameKeys = r0;
        r0 = new int[r13];
        r11.codeVals = r0;
        r0 = new int[r13];
        r11.codeKeys = r0;
        r13 = new java.lang.String[r13];
        r11.nameVals = r13;
        r13 = org.jsoup.nodes.Entities.class;
        r13 = r13.getResourceAsStream(r12);
        if (r13 == 0) goto L_0x00cf;
    L_0x001c:
        r0 = 0;
        r13 = org.jsoup.helper.DataUtil.readToByteBuffer(r13, r0);	 Catch:{ IOException -> 0x00bf }
        r1 = "ascii";	 Catch:{ IOException -> 0x00bf }
        r1 = java.nio.charset.Charset.forName(r1);	 Catch:{ IOException -> 0x00bf }
        r13 = r1.decode(r13);	 Catch:{ IOException -> 0x00bf }
        r13 = r13.toString();	 Catch:{ IOException -> 0x00bf }
        r1 = new org.jsoup.parser.CharacterReader;	 Catch:{ IOException -> 0x00bf }
        r1.<init>(r13);	 Catch:{ IOException -> 0x00bf }
        r13 = 0;	 Catch:{ IOException -> 0x00bf }
    L_0x0035:
        r2 = r1.isEmpty();	 Catch:{ IOException -> 0x00bf }
        if (r2 != 0) goto L_0x00be;	 Catch:{ IOException -> 0x00bf }
    L_0x003b:
        r2 = 61;	 Catch:{ IOException -> 0x00bf }
        r2 = r1.consumeTo(r2);	 Catch:{ IOException -> 0x00bf }
        r1.advance();	 Catch:{ IOException -> 0x00bf }
        r3 = b;	 Catch:{ IOException -> 0x00bf }
        r3 = r1.consumeToAny(r3);	 Catch:{ IOException -> 0x00bf }
        r4 = 36;	 Catch:{ IOException -> 0x00bf }
        r3 = java.lang.Integer.parseInt(r3, r4);	 Catch:{ IOException -> 0x00bf }
        r5 = r1.current();	 Catch:{ IOException -> 0x00bf }
        r1.advance();	 Catch:{ IOException -> 0x00bf }
        r6 = 44;	 Catch:{ IOException -> 0x00bf }
        r7 = -1;	 Catch:{ IOException -> 0x00bf }
        if (r5 != r6) goto L_0x006a;	 Catch:{ IOException -> 0x00bf }
    L_0x005c:
        r5 = 59;	 Catch:{ IOException -> 0x00bf }
        r5 = r1.consumeTo(r5);	 Catch:{ IOException -> 0x00bf }
        r5 = java.lang.Integer.parseInt(r5, r4);	 Catch:{ IOException -> 0x00bf }
        r1.advance();	 Catch:{ IOException -> 0x00bf }
        goto L_0x006b;	 Catch:{ IOException -> 0x00bf }
    L_0x006a:
        r5 = -1;	 Catch:{ IOException -> 0x00bf }
    L_0x006b:
        r6 = 10;	 Catch:{ IOException -> 0x00bf }
        r6 = r1.consumeTo(r6);	 Catch:{ IOException -> 0x00bf }
        r8 = r6.length();	 Catch:{ IOException -> 0x00bf }
        r9 = 1;	 Catch:{ IOException -> 0x00bf }
        r8 = r8 - r9;	 Catch:{ IOException -> 0x00bf }
        r8 = r6.charAt(r8);	 Catch:{ IOException -> 0x00bf }
        r10 = 13;	 Catch:{ IOException -> 0x00bf }
        if (r8 != r10) goto L_0x0088;	 Catch:{ IOException -> 0x00bf }
    L_0x007f:
        r8 = r6.length();	 Catch:{ IOException -> 0x00bf }
        r8 = r8 - r9;	 Catch:{ IOException -> 0x00bf }
        r6 = r6.substring(r0, r8);	 Catch:{ IOException -> 0x00bf }
    L_0x0088:
        r4 = java.lang.Integer.parseInt(r6, r4);	 Catch:{ IOException -> 0x00bf }
        r1.advance();	 Catch:{ IOException -> 0x00bf }
        r6 = r11.nameKeys;	 Catch:{ IOException -> 0x00bf }
        r6[r13] = r2;	 Catch:{ IOException -> 0x00bf }
        r6 = r11.codeVals;	 Catch:{ IOException -> 0x00bf }
        r6[r13] = r3;	 Catch:{ IOException -> 0x00bf }
        r6 = r11.codeKeys;	 Catch:{ IOException -> 0x00bf }
        r6[r4] = r3;	 Catch:{ IOException -> 0x00bf }
        r6 = r11.nameVals;	 Catch:{ IOException -> 0x00bf }
        r6[r4] = r2;	 Catch:{ IOException -> 0x00bf }
        if (r5 == r7) goto L_0x00ba;	 Catch:{ IOException -> 0x00bf }
    L_0x00a9:
        r4 = a;	 Catch:{ IOException -> 0x00bf }
        r6 = new java.lang.String;	 Catch:{ IOException -> 0x00bf }
        r7 = 2;	 Catch:{ IOException -> 0x00bf }
        r8 = new int[r7];	 Catch:{ IOException -> 0x00bf }
        r8[r0] = r3;	 Catch:{ IOException -> 0x00bf }
        r8[r9] = r5;	 Catch:{ IOException -> 0x00bf }
        r6.<init>(r8, r0, r7);	 Catch:{ IOException -> 0x00bf }
        r4.put(r2, r6);	 Catch:{ IOException -> 0x00bf }
    L_0x00ba:
        r13 = r13 + 1;
        goto L_0x0035;
    L_0x00be:
        return;
    L_0x00bf:
        r11 = new java.lang.IllegalStateException;
        r12 = java.lang.String.valueOf(r12);
        r13 = "Error reading resource ";
        r12 = r13.concat(r12);
        r11.<init>(r12);
        throw r11;
    L_0x00cf:
        r11 = new java.lang.IllegalStateException;
        r13 = new java.lang.StringBuilder;
        r0 = "Could not read resource ";
        r13.<init>(r0);
        r13.append(r12);
        r12 = ". Make sure you copy resources for ";
        r13.append(r12);
        r12 = org.jsoup.nodes.Entities.class;
        r12 = r12.getCanonicalName();
        r13.append(r12);
        r12 = r13.toString();
        r11.<init>(r12);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Entities.a(org.jsoup.nodes.Entities$EscapeMode, java.lang.String, int):void");
    }

    static String b(String str) {
        return Parser.unescapeEntities(str, true);
    }

    public static int codepointsForName(String str, int[] iArr) {
        String str2 = (String) a.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int codepointForName = EscapeMode.extended.codepointForName(str);
        if (codepointForName == -1) {
            return 0;
        }
        iArr[0] = codepointForName;
        return 1;
    }

    public static String getByName(String str) {
        String str2 = (String) a.get(str);
        if (str2 != null) {
            return str2;
        }
        if (EscapeMode.extended.codepointForName(str) == -1) {
            return BuildConfig.FLAVOR;
        }
        return new String(new int[]{EscapeMode.extended.codepointForName(str)}, 0, 1);
    }

    public static Character getCharacterByName(String str) {
        return Character.valueOf((char) EscapeMode.extended.codepointForName(str));
    }

    public static boolean isBaseNamedEntity(String str) {
        return EscapeMode.base.codepointForName(str) != -1;
    }

    public static boolean isNamedEntity(String str) {
        return EscapeMode.extended.codepointForName(str) != -1;
    }
}
