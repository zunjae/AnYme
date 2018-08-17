package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import mehdi.sakout.fancybuttons.R;

public class abn implements Closeable {
    private static final char[] b = ")]}'\n".toCharArray();
    int a = 0;
    private final Reader c;
    private boolean d = false;
    private final char[] e = new char[1024];
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private long j;
    private int k;
    private String l;
    private int[] m = new int[32];
    private int n = 0;
    private String[] o;
    private int[] p;

    static {
        yd.a = new abo();
    }

    public abn(Reader reader) {
        int[] iArr = this.m;
        int i = this.n;
        this.n = i + 1;
        iArr[i] = 6;
        this.o = new String[32];
        this.p = new int[32];
        if (reader != null) {
            this.c = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private void a(int i) {
        int i2 = this.n;
        Object obj = this.m;
        if (i2 == obj.length) {
            Object obj2 = new int[(i2 * 2)];
            Object obj3 = new int[(i2 * 2)];
            Object obj4 = new String[(i2 * 2)];
            System.arraycopy(obj, 0, obj2, 0, i2);
            System.arraycopy(this.p, 0, obj3, 0, this.n);
            System.arraycopy(this.o, 0, obj4, 0, this.n);
            this.m = obj2;
            this.p = obj3;
            this.o = obj4;
        }
        int[] iArr = this.m;
        int i3 = this.n;
        this.n = i3 + 1;
        iArr[i3] = i;
    }

    private boolean a(char c) {
        switch (c) {
            case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
            case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
            case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
            case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
            case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_buttonStyle /*44*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_controlBackground /*58*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /*91*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_spinnerStyle /*93*/:
            case '{':
            case '}':
                break;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_alertDialogStyle /*35*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_checkedTextViewStyle /*47*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dialogPreferredPadding /*59*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerHorizontal /*61*/:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_spinnerDropDownItemStyle /*92*/:
                v();
                break;
            default:
                return true;
        }
        return false;
    }

    private boolean a(String str) {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f + length > this.g) {
                if (!b(length)) {
                    return false;
                }
            }
            char[] cArr = this.e;
            int i2 = this.f;
            if (cArr[i2] == '\n') {
                this.h++;
                this.i = i2 + 1;
            } else {
                while (i < length) {
                    if (this.e[this.f + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f++;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b(boolean r8) {
        /*
        r7 = this;
        r0 = r7.e;
    L_0x0002:
        r1 = r7.f;
    L_0x0004:
        r2 = r7.g;
    L_0x0006:
        r3 = 1;
        if (r1 != r2) goto L_0x0032;
    L_0x0009:
        r7.f = r1;
        r1 = r7.b(r3);
        if (r1 == 0) goto L_0x0016;
    L_0x0011:
        r1 = r7.f;
        r2 = r7.g;
        goto L_0x0032;
    L_0x0016:
        if (r8 != 0) goto L_0x001a;
    L_0x0018:
        r8 = -1;
        return r8;
    L_0x001a:
        r8 = new java.io.EOFException;
        r0 = new java.lang.StringBuilder;
        r1 = "End of input";
        r0.<init>(r1);
        r1 = r7.s();
        r0.append(r1);
        r0 = r0.toString();
        r8.<init>(r0);
        throw r8;
    L_0x0032:
        r4 = r1 + 1;
        r1 = r0[r1];
        r5 = 10;
        if (r1 != r5) goto L_0x0042;
    L_0x003a:
        r1 = r7.h;
        r1 = r1 + r3;
        r7.h = r1;
        r7.i = r4;
        goto L_0x00a4;
    L_0x0042:
        r5 = 32;
        if (r1 == r5) goto L_0x00a4;
    L_0x0046:
        r5 = 13;
        if (r1 == r5) goto L_0x00a4;
    L_0x004a:
        r5 = 9;
        if (r1 == r5) goto L_0x00a4;
    L_0x004e:
        r5 = 47;
        if (r1 != r5) goto L_0x0093;
    L_0x0052:
        r7.f = r4;
        r6 = 2;
        if (r4 != r2) goto L_0x0068;
    L_0x0057:
        r2 = r7.f;
        r2 = r2 - r3;
        r7.f = r2;
        r2 = r7.b(r6);
        r4 = r7.f;
        r4 = r4 + r3;
        r7.f = r4;
        if (r2 != 0) goto L_0x0068;
    L_0x0067:
        return r1;
    L_0x0068:
        r7.v();
        r2 = r7.f;
        r3 = r0[r2];
        r4 = 42;
        if (r3 == r4) goto L_0x007b;
    L_0x0073:
        if (r3 == r5) goto L_0x0076;
    L_0x0075:
        return r1;
    L_0x0076:
        r2 = r2 + 1;
        r7.f = r2;
        goto L_0x009c;
    L_0x007b:
        r2 = r2 + 1;
        r7.f = r2;
        r1 = "*/";
        r1 = r7.a(r1);
        if (r1 == 0) goto L_0x008c;
    L_0x0087:
        r1 = r7.f;
        r1 = r1 + r6;
        goto L_0x0004;
    L_0x008c:
        r8 = "Unterminated comment";
        r8 = r7.b(r8);
        throw r8;
    L_0x0093:
        r2 = 35;
        if (r1 != r2) goto L_0x00a1;
    L_0x0097:
        r7.f = r4;
        r7.v();
    L_0x009c:
        r7.w();
        goto L_0x0002;
    L_0x00a1:
        r7.f = r4;
        return r1;
    L_0x00a4:
        r1 = r4;
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: abn.b(boolean):int");
    }

    private IOException b(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(s());
        throw new abr(stringBuilder.toString());
    }

    private String b(char c) {
        int i;
        int i2;
        char[] cArr = this.e;
        StringBuilder stringBuilder = null;
        loop0:
        while (true) {
            i = this.f;
            int i3 = this.g;
            int i4 = i;
            while (i4 < i3) {
                i2 = i4 + 1;
                char c2 = cArr[i4];
                if (c2 == c) {
                    break loop0;
                } else if (c2 == '\\') {
                    this.f = i2;
                    i2 = (i2 - i) - 1;
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder(Math.max((i2 + 1) * 2, 16));
                    }
                    stringBuilder.append(cArr, i, i2);
                    stringBuilder.append(x());
                } else {
                    if (c2 == '\n') {
                        this.h++;
                        this.i = i2;
                    }
                    i4 = i2;
                }
            }
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder(Math.max((i4 - i) * 2, 16));
            }
            stringBuilder.append(cArr, i, i4 - i);
            this.f = i4;
            if (!b(1)) {
                throw b("Unterminated string");
            }
        }
        this.f = i2;
        i2 = (i2 - i) - 1;
        if (stringBuilder == null) {
            return new String(cArr, i, i2);
        }
        stringBuilder.append(cArr, i, i2);
        return stringBuilder.toString();
    }

    private boolean b(int i) {
        Object obj = this.e;
        int i2 = this.i;
        int i3 = this.f;
        this.i = i2 - i3;
        i2 = this.g;
        if (i2 != i3) {
            this.g = i2 - i3;
            System.arraycopy(obj, i3, obj, 0, this.g);
        } else {
            this.g = 0;
        }
        this.f = 0;
        do {
            Reader reader = this.c;
            i3 = this.g;
            i2 = reader.read(obj, i3, obj.length - i3);
            if (i2 == -1) {
                return false;
            }
            this.g += i2;
            if (this.h == 0) {
                i2 = this.i;
                if (i2 == 0 && this.g > 0 && obj[0] == '\ufeff') {
                    this.f++;
                    this.i = i2 + 1;
                    i++;
                }
            }
        } while (this.g < i);
        return true;
    }

    private void c(char c) {
        char[] cArr = this.e;
        while (true) {
            int i = this.f;
            int i2 = this.g;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f = i3;
                    x();
                    break;
                } else {
                    if (c2 == '\n') {
                        this.h++;
                        this.i = i3;
                    }
                    i = i3;
                }
            }
            this.f = i;
            if (!b(1)) {
                throw b("Unterminated string");
            }
        }
    }

    private int o() {
        String str;
        String str2;
        int i;
        int length;
        int i2;
        char c;
        char c2 = this.e[this.f];
        if (c2 != 't') {
            if (c2 != 'T') {
                if (c2 != 'f') {
                    if (c2 != 'F') {
                        if (c2 != 'n') {
                            if (c2 != 'N') {
                                return 0;
                            }
                        }
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                        length = str.length();
                        i2 = 1;
                        while (i2 < length) {
                            if (this.f + i2 < this.g && !b(i2 + 1)) {
                                return 0;
                            }
                            c = this.e[this.f + i2];
                            if (c != str.charAt(i2) && c != r2.charAt(i2)) {
                                return 0;
                            }
                            i2++;
                        }
                        if ((this.f + length >= this.g || b(length + 1)) && a(this.e[this.f + length])) {
                            return 0;
                        }
                        this.f += length;
                        this.a = i;
                        return i;
                    }
                }
                str = "false";
                str2 = "FALSE";
                i = 6;
                length = str.length();
                i2 = 1;
                while (i2 < length) {
                    if (this.f + i2 < this.g) {
                    }
                    c = this.e[this.f + i2];
                    if (c != str.charAt(i2)) {
                    }
                    i2++;
                }
                if (this.f + length >= this.g) {
                }
                return 0;
            }
        }
        str = "true";
        str2 = "TRUE";
        i = 5;
        length = str.length();
        i2 = 1;
        while (i2 < length) {
            if (this.f + i2 < this.g) {
            }
            c = this.e[this.f + i2];
            if (c != str.charAt(i2)) {
            }
            i2++;
        }
        if (this.f + length >= this.g) {
        }
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int t() {
        /*
        r18 = this;
        r0 = r18;
        r1 = r0.e;
        r2 = r0.f;
        r3 = r0.g;
        r6 = 1;
        r7 = 0;
        r8 = r3;
        r3 = 0;
        r9 = 0;
        r10 = 1;
        r11 = 0;
        r13 = 0;
    L_0x0011:
        r14 = r2 + r3;
        r15 = 2;
        if (r14 != r8) goto L_0x0026;
    L_0x0016:
        r2 = r1.length;
        if (r3 != r2) goto L_0x001a;
    L_0x0019:
        return r7;
    L_0x001a:
        r2 = r3 + 1;
        r2 = r0.b(r2);
        if (r2 == 0) goto L_0x0097;
    L_0x0022:
        r2 = r0.f;
        r8 = r0.g;
    L_0x0026:
        r14 = r2 + r3;
        r14 = r1[r14];
        r7 = 43;
        r4 = 3;
        r5 = 5;
        if (r14 == r7) goto L_0x00ec;
    L_0x0030:
        r7 = 69;
        if (r14 == r7) goto L_0x00e0;
    L_0x0034:
        r7 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r14 == r7) goto L_0x00e0;
    L_0x0038:
        switch(r14) {
            case 45: goto L_0x00d3;
            case 46: goto L_0x00cb;
            default: goto L_0x003b;
        };
    L_0x003b:
        r7 = 48;
        if (r14 < r7) goto L_0x008f;
    L_0x003f:
        r7 = 57;
        if (r14 <= r7) goto L_0x0044;
    L_0x0043:
        goto L_0x008f;
    L_0x0044:
        if (r9 == r6) goto L_0x0084;
    L_0x0046:
        if (r9 != 0) goto L_0x0049;
    L_0x0048:
        goto L_0x0084;
    L_0x0049:
        if (r9 != r15) goto L_0x0074;
    L_0x004b:
        r16 = 0;
        r4 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1));
        if (r4 != 0) goto L_0x0053;
    L_0x0051:
        r4 = 0;
        return r4;
    L_0x0053:
        r4 = 10;
        r4 = r4 * r11;
        r14 = r14 + -48;
        r14 = (long) r14;
        r4 = r4 - r14;
        r14 = -922337203685477580; // 0xf333333333333334 float:4.1723254E-8 double:-8.390303882365713E246;
        r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1));
        if (r7 > 0) goto L_0x006f;
    L_0x0064:
        r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1));
        if (r7 != 0) goto L_0x006d;
    L_0x0068:
        r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1));
        if (r7 >= 0) goto L_0x006d;
    L_0x006c:
        goto L_0x006f;
    L_0x006d:
        r7 = 0;
        goto L_0x0070;
    L_0x006f:
        r7 = 1;
    L_0x0070:
        r7 = r7 & r10;
        r11 = r4;
        r10 = r7;
        goto L_0x007f;
    L_0x0074:
        if (r9 != r4) goto L_0x0079;
    L_0x0076:
        r7 = 0;
        r9 = 4;
        goto L_0x008b;
    L_0x0079:
        if (r9 == r5) goto L_0x0081;
    L_0x007b:
        r4 = 6;
        if (r9 != r4) goto L_0x007f;
    L_0x007e:
        goto L_0x0081;
    L_0x007f:
        r7 = 0;
        goto L_0x008b;
    L_0x0081:
        r7 = 0;
        r9 = 7;
        goto L_0x008b;
    L_0x0084:
        r14 = r14 + -48;
        r4 = -r14;
        r4 = (long) r4;
        r11 = r4;
        r7 = 0;
        r9 = 2;
    L_0x008b:
        r16 = 0;
        goto L_0x00f3;
    L_0x008f:
        r1 = r0.a(r14);
        if (r1 == 0) goto L_0x0097;
    L_0x0095:
        r1 = 0;
        return r1;
    L_0x0097:
        if (r9 != r15) goto L_0x00bb;
    L_0x0099:
        if (r10 == 0) goto L_0x00bb;
    L_0x009b:
        r1 = -9223372036854775808;
        r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1));
        if (r4 != 0) goto L_0x00a3;
    L_0x00a1:
        if (r13 == 0) goto L_0x00bb;
    L_0x00a3:
        r16 = 0;
        r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1));
        if (r1 != 0) goto L_0x00ab;
    L_0x00a9:
        if (r13 != 0) goto L_0x00bb;
    L_0x00ab:
        if (r13 == 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00af;
    L_0x00ae:
        r11 = -r11;
    L_0x00af:
        r0.j = r11;
        r1 = r0.f;
        r1 = r1 + r3;
        r0.f = r1;
        r1 = 15;
    L_0x00b8:
        r0.a = r1;
        return r1;
    L_0x00bb:
        if (r9 == r15) goto L_0x00c6;
    L_0x00bd:
        r1 = 4;
        if (r9 == r1) goto L_0x00c6;
    L_0x00c0:
        r1 = 7;
        if (r9 != r1) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00c6;
    L_0x00c4:
        r7 = 0;
        return r7;
    L_0x00c6:
        r0.k = r3;
        r1 = 16;
        goto L_0x00b8;
    L_0x00cb:
        r7 = 0;
        r16 = 0;
        if (r9 != r15) goto L_0x00d2;
    L_0x00d0:
        r9 = 3;
        goto L_0x00f3;
    L_0x00d2:
        return r7;
    L_0x00d3:
        r4 = 6;
        r7 = 0;
        r16 = 0;
        if (r9 != 0) goto L_0x00dc;
    L_0x00d9:
        r9 = 1;
        r13 = 1;
        goto L_0x00f3;
    L_0x00dc:
        if (r9 != r5) goto L_0x00df;
    L_0x00de:
        goto L_0x00f2;
    L_0x00df:
        return r7;
    L_0x00e0:
        r7 = 0;
        r16 = 0;
        if (r9 == r15) goto L_0x00ea;
    L_0x00e5:
        r4 = 4;
        if (r9 != r4) goto L_0x00e9;
    L_0x00e8:
        goto L_0x00ea;
    L_0x00e9:
        return r7;
    L_0x00ea:
        r9 = 5;
        goto L_0x00f3;
    L_0x00ec:
        r4 = 6;
        r7 = 0;
        r16 = 0;
        if (r9 != r5) goto L_0x00f7;
    L_0x00f2:
        r9 = 6;
    L_0x00f3:
        r3 = r3 + 1;
        goto L_0x0011;
    L_0x00f7:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: abn.t():int");
    }

    private String u() {
        String str;
        int i = 0;
        StringBuilder stringBuilder = null;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.f;
                if (i3 + i2 < this.g) {
                    switch (this.e[i3 + i2]) {
                        case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                        case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
                        case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
                        case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
                        case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_buttonStyle /*44*/:
                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_controlBackground /*58*/:
                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /*91*/:
                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_spinnerStyle /*93*/:
                        case '{':
                        case '}':
                            break;
                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_alertDialogStyle /*35*/:
                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_checkedTextViewStyle /*47*/:
                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dialogPreferredPadding /*59*/:
                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerHorizontal /*61*/:
                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_spinnerDropDownItemStyle /*92*/:
                            v();
                            break;
                        default:
                            i2++;
                            break;
                    }
                } else if (i2 >= this.e.length) {
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder(Math.max(i2, 16));
                    }
                    stringBuilder.append(this.e, this.f, i2);
                    this.f += i2;
                } else if (b(i2 + 1)) {
                }
                i = i2;
                if (stringBuilder != null) {
                    str = new String(this.e, this.f, i);
                } else {
                    stringBuilder.append(this.e, this.f, i);
                    str = stringBuilder.toString();
                }
                this.f += i;
                return str;
            }
        } while (b(1));
        if (stringBuilder != null) {
            stringBuilder.append(this.e, this.f, i);
            str = stringBuilder.toString();
        } else {
            str = new String(this.e, this.f, i);
        }
        this.f += i;
        return str;
    }

    private void v() {
        if (!this.d) {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void w() {
        char c;
        do {
            if (this.f >= this.g && !b(1)) {
                break;
            }
            char[] cArr = this.e;
            int i = this.f;
            this.f = i + 1;
            c = cArr[i];
            if (c == '\n') {
                this.h++;
                this.i = this.f;
                return;
            }
        } while (c != '\r');
    }

    private char x() {
        if (this.f == this.g) {
            if (!b(1)) {
                throw b("Unterminated escape sequence");
            }
        }
        char[] cArr = this.e;
        int i = this.f;
        this.f = i + 1;
        char c = cArr[i];
        if (c == '\n') {
            this.h++;
            this.i = this.f;
        } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            switch (c) {
                case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMinor /*116*/:
                    return '\t';
                case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowMinWidthMajor /*117*/:
                    if (this.f + 4 > this.g) {
                        if (!b(4)) {
                            throw b("Unterminated escape sequence");
                        }
                    }
                    c = '\u0000';
                    int i2 = this.f;
                    int i3 = i2 + 4;
                    while (i2 < i3) {
                        int i4;
                        char c2 = this.e[i2];
                        c = (char) (c << 4);
                        if (c2 < '0' || c2 > '9') {
                            if (c2 >= 'a' && c2 <= 'f') {
                                i4 = c2 - 97;
                            } else if (c2 < 'A' || c2 > 'F') {
                                StringBuilder stringBuilder = new StringBuilder("\\u");
                                stringBuilder.append(new String(this.e, this.f, 4));
                                throw new NumberFormatException(stringBuilder.toString());
                            } else {
                                i4 = c2 - 65;
                            }
                            i4 += 10;
                        } else {
                            i4 = c2 - 48;
                        }
                        c = (char) (c + i4);
                        i2++;
                    }
                    this.f += 4;
                    return c;
                default:
                    throw b("Invalid escape sequence");
            }
        }
        return c;
    }

    private void y() {
        b(true);
        this.f--;
        int i = this.f;
        char[] cArr = b;
        if (i + cArr.length <= this.g || b(cArr.length)) {
            i = 0;
            while (true) {
                cArr = b;
                if (i >= cArr.length) {
                    this.f += cArr.length;
                    return;
                } else if (this.e[this.f + i] == cArr[i]) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void a() {
        int i = this.a;
        if (i == 0) {
            i = r();
        }
        if (i == 3) {
            a(1);
            this.p[this.n - 1] = 0;
            this.a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected BEGIN_ARRAY but was ");
        stringBuilder.append(f());
        stringBuilder.append(s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public void b() {
        int i = this.a;
        if (i == 0) {
            i = r();
        }
        if (i == 4) {
            this.n--;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected END_ARRAY but was ");
        stringBuilder.append(f());
        stringBuilder.append(s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void c() {
        int i = this.a;
        if (i == 0) {
            i = r();
        }
        if (i == 1) {
            a(3);
            this.a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected BEGIN_OBJECT but was ");
        stringBuilder.append(f());
        stringBuilder.append(s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void close() {
        this.a = 0;
        this.m[0] = 8;
        this.n = 1;
        this.c.close();
    }

    public void d() {
        int i = this.a;
        if (i == 0) {
            i = r();
        }
        if (i == 2) {
            this.n--;
            String[] strArr = this.o;
            int i2 = this.n;
            strArr[i2] = null;
            int[] iArr = this.p;
            i2--;
            iArr[i2] = iArr[i2] + 1;
            this.a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected END_OBJECT but was ");
        stringBuilder.append(f());
        stringBuilder.append(s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean e() {
        int i = this.a;
        if (i == 0) {
            i = r();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public abp f() {
        int i = this.a;
        if (i == 0) {
            i = r();
        }
        switch (i) {
            case tw.a /*1*/:
                return abp.BEGIN_OBJECT;
            case tw.b /*2*/:
                return abp.END_OBJECT;
            case f.c /*3*/:
                return abp.BEGIN_ARRAY;
            case mh.d /*4*/:
                return abp.END_ARRAY;
            case mh.e /*5*/:
            case mh.f /*6*/:
                return abp.BOOLEAN;
            case mh.g /*7*/:
                return abp.NULL;
            case mh.h /*8*/:
            case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
            case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
            case R.styleable.FancyButtonsAttrs_fb_fontIconResource /*11*/:
                return abp.STRING;
            case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
            case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
            case R.styleable.FancyButtonsAttrs_fb_iconColor /*14*/:
                return abp.NAME;
            case R.styleable.FancyButtonsAttrs_fb_iconFont /*15*/:
            case R.styleable.FancyButtonsAttrs_fb_iconPaddingBottom /*16*/:
                return abp.NUMBER;
            case R.styleable.FancyButtonsAttrs_fb_iconPaddingLeft /*17*/:
                return abp.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String g() {
        String u;
        int i = this.a;
        if (i == 0) {
            i = r();
        }
        if (i == 14) {
            u = u();
        } else {
            char c;
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = '\"';
            } else {
                StringBuilder stringBuilder = new StringBuilder("Expected a name but was ");
                stringBuilder.append(f());
                stringBuilder.append(s());
                throw new IllegalStateException(stringBuilder.toString());
            }
            u = b(c);
        }
        this.a = 0;
        this.o[this.n - 1] = u;
        return u;
    }

    public String h() {
        String u;
        int i = this.a;
        if (i == 0) {
            i = r();
        }
        if (i == 10) {
            u = u();
        } else {
            char c;
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                u = this.l;
                this.l = null;
            } else if (i == 15) {
                u = Long.toString(this.j);
            } else if (i == 16) {
                u = new String(this.e, this.f, this.k);
                this.f += this.k;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Expected a string but was ");
                stringBuilder.append(f());
                stringBuilder.append(s());
                throw new IllegalStateException(stringBuilder.toString());
            }
            u = b(c);
        }
        this.a = 0;
        int[] iArr = this.p;
        int i2 = this.n - 1;
        iArr[i2] = iArr[i2] + 1;
        return u;
    }

    public boolean i() {
        int i = this.a;
        if (i == 0) {
            i = r();
        }
        int[] iArr;
        int i2;
        if (i == 5) {
            this.a = 0;
            iArr = this.p;
            i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.a = 0;
            iArr = this.p;
            i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return false;
        } else {
            StringBuilder stringBuilder = new StringBuilder("Expected a boolean but was ");
            stringBuilder.append(f());
            stringBuilder.append(s());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void j() {
        int i = this.a;
        if (i == 0) {
            i = r();
        }
        if (i == 7) {
            this.a = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected null but was ");
        stringBuilder.append(f());
        stringBuilder.append(s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public double k() {
        int i = this.a;
        if (i == 0) {
            i = r();
        }
        if (i == 15) {
            this.a = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.j;
        }
        if (i == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else {
            String u;
            if (i != 8) {
                if (i != 9) {
                    if (i == 10) {
                        u = u();
                        this.l = u;
                    } else if (i != 11) {
                        StringBuilder stringBuilder = new StringBuilder("Expected a double but was ");
                        stringBuilder.append(f());
                        stringBuilder.append(s());
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            }
            u = b(i == 8 ? '\'' : '\"');
            this.l = u;
        }
        this.a = 11;
        double parseDouble = Double.parseDouble(this.l);
        if (!this.d) {
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                StringBuilder stringBuilder2 = new StringBuilder("JSON forbids NaN and infinities: ");
                stringBuilder2.append(parseDouble);
                stringBuilder2.append(s());
                throw new abr(stringBuilder2.toString());
            }
        }
        this.l = null;
        this.a = 0;
        int[] iArr2 = this.p;
        int i3 = this.n - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public long l() {
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
        r8 = this;
        r0 = r8.a;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r8.r();
    L_0x0008:
        r1 = 15;
        r2 = 0;
        if (r0 != r1) goto L_0x001e;
    L_0x000d:
        r8.a = r2;
        r0 = r8.p;
        r1 = r8.n;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        r0 = r8.j;
        return r0;
    L_0x001e:
        r1 = 16;
        if (r0 != r1) goto L_0x0037;
    L_0x0022:
        r0 = new java.lang.String;
        r1 = r8.e;
        r3 = r8.f;
        r4 = r8.k;
        r0.<init>(r1, r3, r4);
        r8.l = r0;
        r0 = r8.f;
        r1 = r8.k;
        r0 = r0 + r1;
        r8.f = r0;
        goto L_0x008d;
    L_0x0037:
        r1 = 10;
        r3 = 8;
        if (r0 == r3) goto L_0x0063;
    L_0x003d:
        r4 = 9;
        if (r0 == r4) goto L_0x0063;
    L_0x0041:
        if (r0 != r1) goto L_0x0044;
    L_0x0043:
        goto L_0x0063;
    L_0x0044:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected a long but was ";
        r1.<init>(r2);
        r2 = r8.f();
        r1.append(r2);
        r2 = r8.s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0063:
        if (r0 != r1) goto L_0x006c;
    L_0x0065:
        r0 = r8.u();
    L_0x0069:
        r8.l = r0;
        goto L_0x0078;
    L_0x006c:
        if (r0 != r3) goto L_0x0071;
    L_0x006e:
        r0 = 39;
        goto L_0x0073;
    L_0x0071:
        r0 = 34;
    L_0x0073:
        r0 = r8.b(r0);
        goto L_0x0069;
    L_0x0078:
        r0 = r8.l;	 Catch:{ NumberFormatException -> 0x008d }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x008d }
        r8.a = r2;	 Catch:{ NumberFormatException -> 0x008d }
        r3 = r8.p;	 Catch:{ NumberFormatException -> 0x008d }
        r4 = r8.n;	 Catch:{ NumberFormatException -> 0x008d }
        r4 = r4 + -1;	 Catch:{ NumberFormatException -> 0x008d }
        r5 = r3[r4];	 Catch:{ NumberFormatException -> 0x008d }
        r5 = r5 + 1;	 Catch:{ NumberFormatException -> 0x008d }
        r3[r4] = r5;	 Catch:{ NumberFormatException -> 0x008d }
        return r0;
    L_0x008d:
        r0 = 11;
        r8.a = r0;
        r0 = r8.l;
        r0 = java.lang.Double.parseDouble(r0);
        r3 = (long) r0;
        r5 = (double) r3;
        r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r7 != 0) goto L_0x00af;
    L_0x009d:
        r0 = 0;
        r8.l = r0;
        r8.a = r2;
        r0 = r8.p;
        r1 = r8.n;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        return r3;
    L_0x00af:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected a long but was ";
        r1.<init>(r2);
        r2 = r8.l;
        r1.append(r2);
        r2 = r8.s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: abn.l():long");
    }

    public int m() {
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
        r7 = this;
        r0 = r7.a;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r7.r();
    L_0x0008:
        r1 = 15;
        r2 = 0;
        if (r0 != r1) goto L_0x0041;
    L_0x000d:
        r0 = r7.j;
        r3 = (int) r0;
        r4 = (long) r3;
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x0024;
    L_0x0015:
        r7.a = r2;
        r0 = r7.p;
        r1 = r7.n;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        return r3;
    L_0x0024:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected an int but was ";
        r1.<init>(r2);
        r2 = r7.j;
        r1.append(r2);
        r2 = r7.s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0041:
        r1 = 16;
        if (r0 != r1) goto L_0x005a;
    L_0x0045:
        r0 = new java.lang.String;
        r1 = r7.e;
        r3 = r7.f;
        r4 = r7.k;
        r0.<init>(r1, r3, r4);
        r7.l = r0;
        r0 = r7.f;
        r1 = r7.k;
        r0 = r0 + r1;
        r7.f = r0;
        goto L_0x00b0;
    L_0x005a:
        r1 = 10;
        r3 = 8;
        if (r0 == r3) goto L_0x0086;
    L_0x0060:
        r4 = 9;
        if (r0 == r4) goto L_0x0086;
    L_0x0064:
        if (r0 != r1) goto L_0x0067;
    L_0x0066:
        goto L_0x0086;
    L_0x0067:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected an int but was ";
        r1.<init>(r2);
        r2 = r7.f();
        r1.append(r2);
        r2 = r7.s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0086:
        if (r0 != r1) goto L_0x008f;
    L_0x0088:
        r0 = r7.u();
    L_0x008c:
        r7.l = r0;
        goto L_0x009b;
    L_0x008f:
        if (r0 != r3) goto L_0x0094;
    L_0x0091:
        r0 = 39;
        goto L_0x0096;
    L_0x0094:
        r0 = 34;
    L_0x0096:
        r0 = r7.b(r0);
        goto L_0x008c;
    L_0x009b:
        r0 = r7.l;	 Catch:{ NumberFormatException -> 0x00b0 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00b0 }
        r7.a = r2;	 Catch:{ NumberFormatException -> 0x00b0 }
        r1 = r7.p;	 Catch:{ NumberFormatException -> 0x00b0 }
        r3 = r7.n;	 Catch:{ NumberFormatException -> 0x00b0 }
        r3 = r3 + -1;	 Catch:{ NumberFormatException -> 0x00b0 }
        r4 = r1[r3];	 Catch:{ NumberFormatException -> 0x00b0 }
        r4 = r4 + 1;	 Catch:{ NumberFormatException -> 0x00b0 }
        r1[r3] = r4;	 Catch:{ NumberFormatException -> 0x00b0 }
        return r0;
    L_0x00b0:
        r0 = 11;
        r7.a = r0;
        r0 = r7.l;
        r0 = java.lang.Double.parseDouble(r0);
        r3 = (int) r0;
        r4 = (double) r3;
        r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r6 != 0) goto L_0x00d2;
    L_0x00c0:
        r0 = 0;
        r7.l = r0;
        r7.a = r2;
        r0 = r7.p;
        r1 = r7.n;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        return r3;
    L_0x00d2:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected an int but was ";
        r1.<init>(r2);
        r2 = r7.l;
        r1.append(r2);
        r2 = r7.s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: abn.m():int");
    }

    public void n() {
        int i;
        int i2 = 0;
        do {
            i = this.a;
            if (i == 0) {
                i = r();
            }
            if (i == 3) {
                a(1);
            } else if (i == 1) {
                a(3);
            } else {
                if (i != 4) {
                    if (i != 2) {
                        if (i != 14) {
                            if (i != 10) {
                                char c;
                                if (i != 8) {
                                    if (i != 12) {
                                        if (i != 9) {
                                            if (i != 13) {
                                                if (i == 16) {
                                                    this.f += this.k;
                                                }
                                                this.a = 0;
                                            }
                                        }
                                        c = '\"';
                                        c(c);
                                        this.a = 0;
                                    }
                                }
                                c = '\'';
                                c(c);
                                this.a = 0;
                            }
                        }
                        do {
                            i = 0;
                            while (true) {
                                int i3 = this.f;
                                if (i3 + i < this.g) {
                                    switch (this.e[i3 + i]) {
                                        case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                                        case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
                                        case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
                                        case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
                                        case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
                                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_buttonStyle /*44*/:
                                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_controlBackground /*58*/:
                                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /*91*/:
                                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_spinnerStyle /*93*/:
                                        case '{':
                                        case '}':
                                            break;
                                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_alertDialogStyle /*35*/:
                                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_checkedTextViewStyle /*47*/:
                                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dialogPreferredPadding /*59*/:
                                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerHorizontal /*61*/:
                                        case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_spinnerDropDownItemStyle /*92*/:
                                            v();
                                            break;
                                        default:
                                            i++;
                                    }
                                    this.f += i;
                                } else {
                                    this.f = i3 + i;
                                }
                                this.a = 0;
                            }
                        } while (b(1));
                        this.a = 0;
                    }
                }
                this.n--;
                i2--;
                this.a = 0;
            }
            i2++;
            this.a = 0;
        } while (i2 != 0);
        int[] iArr = this.p;
        i2 = this.n;
        i = i2 - 1;
        iArr[i] = iArr[i] + 1;
        this.o[i2 - 1] = "null";
    }

    public String p() {
        StringBuilder stringBuilder = new StringBuilder("$");
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            switch (this.m[i2]) {
                case tw.a /*1*/:
                case tw.b /*2*/:
                    stringBuilder.append('[');
                    stringBuilder.append(this.p[i2]);
                    stringBuilder.append(']');
                    break;
                case f.c /*3*/:
                case mh.d /*4*/:
                case mh.e /*5*/:
                    stringBuilder.append('.');
                    String[] strArr = this.o;
                    if (strArr[i2] == null) {
                        break;
                    }
                    stringBuilder.append(strArr[i2]);
                    break;
                default:
                    break;
            }
        }
        return stringBuilder.toString();
    }

    public final boolean q() {
        return this.d;
    }

    final int r() {
        int b;
        int[] iArr = this.m;
        int i = this.n;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
            b = b(true);
            if (b != 34) {
                b = 9;
            } else if (b == 39) {
                if (!(b == 44 || b == 59)) {
                    if (b != 91) {
                        this.a = 3;
                        return 3;
                    } else if (b == 93) {
                        if (b == 123) {
                            this.f--;
                            b = o();
                            if (b != 0) {
                                return b;
                            }
                            b = t();
                            if (b != 0) {
                                return b;
                            }
                            if (a(this.e[this.f])) {
                                throw b("Expected value");
                            }
                            v();
                            b = 10;
                        } else {
                            this.a = 1;
                            return 1;
                        }
                    } else if (i2 == 1) {
                        this.a = 4;
                        return 4;
                    }
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        throw b("Unexpected value");
                    }
                }
                v();
                this.f--;
                this.a = 7;
                return 7;
            } else {
                v();
                this.a = 8;
                return 8;
            }
        }
        if (i2 == 2) {
            b = b(true);
            if (b != 44) {
                if (b == 59) {
                    v();
                } else if (b == 93) {
                    this.a = 4;
                    return 4;
                } else {
                    throw b("Unterminated array");
                }
            }
        }
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 == 4) {
                    iArr[i - 1] = 5;
                    b = b(true);
                    if (b != 58) {
                        if (b == 61) {
                            v();
                            if (this.f < this.g || b(1)) {
                                char[] cArr = this.e;
                                i = this.f;
                                if (cArr[i] == '>') {
                                    this.f = i + 1;
                                }
                            }
                        } else {
                            throw b("Expected ':'");
                        }
                    }
                } else if (i2 == 6) {
                    if (this.d) {
                        y();
                    }
                    this.m[this.n - 1] = 7;
                } else if (i2 == 7) {
                    if (b(false) == -1) {
                        b = 17;
                    } else {
                        v();
                        this.f--;
                    }
                } else if (i2 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        this.m[this.n - 1] = 4;
        if (i2 == 5) {
            i = b(true);
            if (i != 44) {
                if (i == 59) {
                    v();
                } else if (i == 125) {
                    this.a = 2;
                    return 2;
                } else {
                    throw b("Unterminated object");
                }
            }
        }
        i = b(true);
        if (i == 34) {
            b = 13;
        } else if (i == 39) {
            v();
            b = 12;
        } else if (i != 125) {
            v();
            this.f--;
            if (a((char) i)) {
                b = 14;
            } else {
                throw b("Expected name");
            }
        } else if (i2 != 5) {
            this.a = 2;
            return 2;
        } else {
            throw b("Expected name");
        }
        b = b(true);
        if (b != 34) {
            b = 9;
        } else if (b == 39) {
            v();
            this.a = 8;
            return 8;
        } else if (b != 91) {
            this.a = 3;
            return 3;
        } else if (b == 93) {
            if (i2 == 1) {
                this.a = 4;
                return 4;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    throw b("Unexpected value");
                }
            }
            v();
            this.f--;
            this.a = 7;
            return 7;
        } else if (b == 123) {
            this.a = 1;
            return 1;
        } else {
            this.f--;
            b = o();
            if (b != 0) {
                return b;
            }
            b = t();
            if (b != 0) {
                return b;
            }
            if (a(this.e[this.f])) {
                throw b("Expected value");
            }
            v();
            b = 10;
        }
        this.a = b;
        return b;
    }

    final String s() {
        int i = this.h + 1;
        int i2 = (this.f - this.i) + 1;
        StringBuilder stringBuilder = new StringBuilder(" at line ");
        stringBuilder.append(i);
        stringBuilder.append(" column ");
        stringBuilder.append(i2);
        stringBuilder.append(" path ");
        stringBuilder.append(p());
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(s());
        return stringBuilder.toString();
    }
}
