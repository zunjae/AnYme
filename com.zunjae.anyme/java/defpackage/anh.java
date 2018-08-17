package defpackage;

public final class anh {
    private String a = null;
    private final String b;

    public anh(String str) {
        this.b = str;
    }

    public anh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static String a(String str) {
        return String.format("javascript: document.querySelector('%s').style.display = \"none\";", new Object[]{str});
    }

    public static String a(String str, String str2) {
        return String.format("javascript: document.querySelector('%s').value=\"%s\";", new Object[]{str, str2});
    }

    public static String b(String str) {
        return String.format("javascript: document.querySelector('%s').click();", new Object[]{str});
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return bit.c(this.a);
    }
}
