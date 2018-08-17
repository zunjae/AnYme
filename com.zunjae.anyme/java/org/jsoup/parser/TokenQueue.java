package org.jsoup.parser;

import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;

public class TokenQueue {
    private String a;
    private int b = 0;

    public TokenQueue(String str) {
        Validate.notNull(str);
        this.a = str;
    }

    private int a() {
        return this.a.length() - this.b;
    }

    public static String unescape(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] toCharArray = str.toCharArray();
        int length = toCharArray.length;
        int i = 0;
        char c = '\u0000';
        while (i < length) {
            char c2 = toCharArray[i];
            if (c2 != '\\' || (r3 != '\u0000' && r3 == '\\')) {
                stringBuilder.append(c2);
            }
            i++;
            c = c2;
        }
        return stringBuilder.toString();
    }

    public void addFirst(Character ch) {
        addFirst(ch.toString());
    }

    public void addFirst(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.a.substring(this.b));
        this.a = stringBuilder.toString();
        this.b = 0;
    }

    public void advance() {
        if (!isEmpty()) {
            this.b++;
        }
    }

    public String chompBalanced(char c, char c2) {
        char c3 = '\u0000';
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        while (!isEmpty()) {
            Character valueOf = Character.valueOf(consume());
            if (c3 == '\u0000' || c3 != '\\') {
                if ((valueOf.equals(Character.valueOf('\'')) || valueOf.equals(Character.valueOf('\"'))) && valueOf.charValue() != c) {
                    i ^= 1;
                }
                if (i != 0) {
                    continue;
                    if (i4 <= 0) {
                        break;
                    }
                } else if (valueOf.equals(Character.valueOf(c))) {
                    i4++;
                    if (i2 == -1) {
                        i2 = this.b;
                    }
                } else if (valueOf.equals(Character.valueOf(c2))) {
                    i4--;
                }
            }
            if (i4 > 0 && c3 != '\u0000') {
                i3 = this.b;
            }
            c3 = valueOf.charValue();
            continue;
            if (i4 <= 0) {
                break;
            }
        }
        return i3 >= 0 ? this.a.substring(i2, i3) : BuildConfig.FLAVOR;
    }

    public String chompTo(String str) {
        String consumeTo = consumeTo(str);
        matchChomp(str);
        return consumeTo;
    }

    public String chompToIgnoreCase(String str) {
        String consumeToIgnoreCase = consumeToIgnoreCase(str);
        matchChomp(str);
        return consumeToIgnoreCase;
    }

    public char consume() {
        String str = this.a;
        int i = this.b;
        this.b = i + 1;
        return str.charAt(i);
    }

    public void consume(String str) {
        if (matches(str)) {
            int length = str.length();
            if (length <= a()) {
                this.b += length;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    public String consumeAttributeKey() {
        int i = this.b;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_', ':'))) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public String consumeCssIdentifier() {
        int i = this.b;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_'))) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public String consumeElementSelector() {
        int i = this.b;
        while (!isEmpty() && (matchesWord() || matchesAny("*|", "|", "_", "-"))) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public String consumeTagName() {
        int i = this.b;
        while (!isEmpty() && (matchesWord() || matchesAny(':', '_', '-'))) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public String consumeTo(String str) {
        int indexOf = this.a.indexOf(str, this.b);
        if (indexOf == -1) {
            return remainder();
        }
        str = this.a.substring(this.b, indexOf);
        this.b += str.length();
        return str;
    }

    public String consumeToAny(String... strArr) {
        int i = this.b;
        while (!isEmpty() && !matchesAny(strArr)) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public String consumeToIgnoreCase(String str) {
        int i = this.b;
        String substring = str.substring(0, 1);
        boolean equals = substring.toLowerCase().equals(substring.toUpperCase());
        while (!isEmpty() && !matches(str)) {
            int indexOf;
            if (equals) {
                indexOf = this.a.indexOf(substring, this.b);
                int i2 = this.b;
                indexOf -= i2;
                if (indexOf == 0) {
                    i2++;
                } else if (indexOf < 0) {
                    indexOf = this.a.length();
                } else {
                    i2 += indexOf;
                }
                this.b = i2;
            } else {
                indexOf = this.b + 1;
            }
            this.b = indexOf;
        }
        return this.a.substring(i, this.b);
    }

    public boolean consumeWhitespace() {
        boolean z = false;
        while (matchesWhitespace()) {
            this.b++;
            z = true;
        }
        return z;
    }

    public String consumeWord() {
        int i = this.b;
        while (matchesWord()) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public boolean isEmpty() {
        return a() == 0;
    }

    public boolean matchChomp(String str) {
        if (!matches(str)) {
            return false;
        }
        this.b += str.length();
        return true;
    }

    public boolean matches(String str) {
        return this.a.regionMatches(true, this.b, str, 0, str.length());
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        for (char c : cArr) {
            if (this.a.charAt(this.b) == c) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesAny(String... strArr) {
        for (String matches : strArr) {
            if (matches(matches)) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesCS(String str) {
        return this.a.startsWith(str, this.b);
    }

    public boolean matchesStartTag() {
        return a() >= 2 && this.a.charAt(this.b) == '<' && Character.isLetter(this.a.charAt(this.b + 1));
    }

    public boolean matchesWhitespace() {
        return !isEmpty() && StringUtil.isWhitespace(this.a.charAt(this.b));
    }

    public boolean matchesWord() {
        return !isEmpty() && Character.isLetterOrDigit(this.a.charAt(this.b));
    }

    public char peek() {
        return isEmpty() ? '\u0000' : this.a.charAt(this.b);
    }

    public String remainder() {
        String str = this.a;
        str = str.substring(this.b, str.length());
        this.b = this.a.length();
        return str;
    }

    public String toString() {
        return this.a.substring(this.b);
    }
}
