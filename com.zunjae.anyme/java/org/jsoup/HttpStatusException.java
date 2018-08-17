package org.jsoup;

import java.io.IOException;

public class HttpStatusException extends IOException {
    private int a;
    private String b;

    public HttpStatusException(String str, int i, String str2) {
        super(str);
        this.a = i;
        this.b = str2;
    }

    public int getStatusCode() {
        return this.a;
    }

    public String getUrl() {
        return this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(". Status=");
        stringBuilder.append(this.a);
        stringBuilder.append(", URL=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
