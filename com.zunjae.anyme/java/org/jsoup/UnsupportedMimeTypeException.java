package org.jsoup;

import java.io.IOException;

public class UnsupportedMimeTypeException extends IOException {
    private String a;
    private String b;

    public UnsupportedMimeTypeException(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    public String getMimeType() {
        return this.a;
    }

    public String getUrl() {
        return this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(". Mimetype=");
        stringBuilder.append(this.a);
        stringBuilder.append(", URL=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
