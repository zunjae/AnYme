package org.jsoup.parser;

import java.util.Arrays;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.Validate;

public final class CharacterReader {
    private final char[] a;
    private final int b;
    private int c = 0;
    private int d = 0;
    private final String[] e = new String[512];

    public CharacterReader(String str) {
        Validate.notNull(str);
        this.a = str.toCharArray();
        this.b = this.a.length;
    }

    private int a(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        int i = this.c;
        while (i < this.b) {
            if (charAt != this.a[i]) {
                do {
                    i++;
                    if (i >= this.b) {
                        break;
                    }
                } while (charAt != this.a[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.b;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                i3 = 1;
                while (i4 < length && charSequence.charAt(i3) == this.a[i4]) {
                    i4++;
                    i3++;
                }
                if (i4 == length) {
                    return i - this.c;
                }
            }
            i = i2;
        }
        return -1;
    }

    private String a(int i, int i2) {
        char[] cArr = this.a;
        String[] strArr = this.e;
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (i3 < i2) {
            i5 = (i5 * 31) + cArr[i4];
            i3++;
            i4++;
        }
        i3 = (strArr.length - 1) & i5;
        String str = strArr[i3];
        if (str == null) {
            str = new String(cArr, i, i2);
            strArr[i3] = str;
        } else if (a(i, i2, str)) {
            return str;
        } else {
            str = new String(cArr, i, i2);
            strArr[i3] = str;
        }
        return str;
    }

    private boolean a(int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        char[] cArr = this.a;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return true;
            }
            i2 = i + 1;
            int i5 = i3 + 1;
            if (cArr[i] != str.charAt(i3)) {
                return false;
            }
            i = i2;
            i2 = i4;
            i3 = i5;
        }
    }

    private String m() {
        int i = this.c;
        String a = a(i, this.b - i);
        this.c = this.b;
        return a;
    }

    final char a() {
        int i = this.c;
        char c = i >= this.b ? '\uffff' : this.a[i];
        this.c++;
        return c;
    }

    final String a(String str) {
        int a = a((CharSequence) str);
        if (a == -1) {
            return m();
        }
        String a2 = a(this.c, a);
        this.c += a;
        return a2;
    }

    final String a(char... cArr) {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        char[] cArr2 = this.a;
        while (true) {
            int i4 = this.c;
            if (i4 >= i3 || Arrays.binarySearch(cArr, cArr2[i4]) >= 0) {
                i = this.c;
            } else {
                this.c++;
            }
        }
        i = this.c;
        return i > i2 ? a(i2, i - i2) : BuildConfig.FLAVOR;
    }

    final boolean a(char c) {
        return !isEmpty() && this.a[this.c] == c;
    }

    public final void advance() {
        this.c++;
    }

    final void b() {
        this.c--;
    }

    final boolean b(String str) {
        Object obj;
        int length = str.length();
        if (length <= this.b - this.c) {
            int i = 0;
            while (i < length) {
                if (str.charAt(i) == this.a[this.c + i]) {
                    i++;
                }
            }
            obj = 1;
            if (obj != null) {
                return false;
            }
            this.c += str.length();
            return true;
        }
        obj = null;
        if (obj != null) {
            return false;
        }
        this.c += str.length();
        return true;
    }

    final boolean b(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        char c = this.a[this.c];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    final void c() {
        this.d = this.c;
    }

    final boolean c(String str) {
        Object obj;
        int length = str.length();
        if (length <= this.b - this.c) {
            int i = 0;
            while (i < length) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.a[this.c + i])) {
                    i++;
                }
            }
            obj = 1;
            if (obj != null) {
                return false;
            }
            this.c += str.length();
            return true;
        }
        obj = null;
        if (obj != null) {
            return false;
        }
        this.c += str.length();
        return true;
    }

    final boolean c(char[] cArr) {
        return !isEmpty() && Arrays.binarySearch(cArr, this.a[this.c]) >= 0;
    }

    public final String consumeTo(char c) {
        int i;
        for (int i2 = this.c; i2 < this.b; i2++) {
            if (c == this.a[i2]) {
                i = i2 - this.c;
                break;
            }
        }
        i = -1;
        if (i == -1) {
            return m();
        }
        String a = a(this.c, i);
        this.c += i;
        return a;
    }

    public final String consumeToAny(char... cArr) {
        int i = this.c;
        int i2 = this.b;
        char[] cArr2 = this.a;
        loop0:
        while (this.c < i2) {
            for (char c : cArr) {
                if (cArr2[this.c] == c) {
                    break loop0;
                }
            }
            this.c++;
        }
        int i3 = this.c;
        return i3 > i ? a(i, i3 - i) : BuildConfig.FLAVOR;
    }

    public final char current() {
        int i = this.c;
        return i >= this.b ? '\uffff' : this.a[i];
    }

    final void d() {
        this.c = this.d;
    }

    final boolean d(String str) {
        CharSequence toLowerCase = str.toLowerCase(Locale.ENGLISH);
        CharSequence toUpperCase = str.toUpperCase(Locale.ENGLISH);
        if (a(toLowerCase) < 0) {
            if (a(toUpperCase) < 0) {
                return false;
            }
        }
        return true;
    }

    final String e() {
        int i = this.c;
        int i2 = this.b;
        char[] cArr = this.a;
        while (true) {
            int i3 = this.c;
            if (i3 >= i2) {
                break;
            }
            char c = cArr[i3];
            if (c == '&' || c == '<' || c == '\u0000') {
                break;
            }
            this.c = i3 + 1;
        }
        i2 = this.c;
        return i2 > i ? a(i, i2 - i) : BuildConfig.FLAVOR;
    }

    final String f() {
        int i = this.c;
        int i2 = this.b;
        char[] cArr = this.a;
        while (true) {
            int i3 = this.c;
            if (i3 >= i2) {
                break;
            }
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\r' || c == '\f' || c == ' ' || c == '/' || c == '>' || c == '\u0000') {
                break;
            }
            this.c = i3 + 1;
        }
        i2 = this.c;
        return i2 > i ? a(i, i2 - i) : BuildConfig.FLAVOR;
    }

    final String g() {
        int i = this.c;
        while (true) {
            int i2 = this.c;
            if (i2 >= this.b) {
                break;
            }
            char c = this.a[i2];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c))) {
                break;
            }
            this.c++;
        }
        return a(i, this.c - i);
    }

    final String h() {
        int i = this.c;
        while (true) {
            int i2 = this.c;
            if (i2 >= this.b) {
                break;
            }
            char c = this.a[i2];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c))) {
                break;
            }
            this.c++;
        }
        while (!isEmpty()) {
            char[] cArr = this.a;
            int i3 = this.c;
            c = cArr[i3];
            if (c < '0' || c > '9') {
                break;
            }
            this.c = i3 + 1;
        }
        return a(i, this.c - i);
    }

    final String i() {
        int i = this.c;
        while (true) {
            int i2 = this.c;
            if (i2 >= this.b) {
                break;
            }
            char c = this.a[i2];
            if ((c < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f'))) {
                break;
            }
            this.c++;
        }
        return a(i, this.c - i);
    }

    public final boolean isEmpty() {
        return this.c >= this.b;
    }

    final String j() {
        int i = this.c;
        while (true) {
            int i2 = this.c;
            if (i2 >= this.b) {
                break;
            }
            char c = this.a[i2];
            if (c < '0' || c > '9') {
                break;
            }
            this.c = i2 + 1;
        }
        return a(i, this.c - i);
    }

    final boolean k() {
        if (isEmpty()) {
            return false;
        }
        char c = this.a[this.c];
        return (c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || Character.isLetter(c));
    }

    final boolean l() {
        if (isEmpty()) {
            return false;
        }
        char c = this.a[this.c];
        return c >= '0' && c <= '9';
    }

    public final int pos() {
        return this.c;
    }

    public final String toString() {
        char[] cArr = this.a;
        int i = this.c;
        return new String(cArr, i, this.b - i);
    }
}
