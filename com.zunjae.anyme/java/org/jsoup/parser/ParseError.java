package org.jsoup.parser;

public class ParseError {
    private int a;
    private String b;

    ParseError(int i, String str) {
        this.a = i;
        this.b = str;
    }

    ParseError(int i, String str, Object... objArr) {
        this.b = String.format(str, objArr);
        this.a = i;
    }

    public String getErrorMessage() {
        return this.b;
    }

    public int getPosition() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(": ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
