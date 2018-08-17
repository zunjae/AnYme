package defpackage;

final class pp {
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    private String k;

    public pp(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
    }

    public final String toString() {
        if (this.k == null) {
            StringBuilder stringBuilder = new StringBuilder("appBundleId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", executionId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", installationId=");
            stringBuilder.append(this.c);
            stringBuilder.append(", limitAdTrackingEnabled=");
            stringBuilder.append(this.d);
            stringBuilder.append(", betaDeviceToken=");
            stringBuilder.append(this.e);
            stringBuilder.append(", buildId=");
            stringBuilder.append(this.f);
            stringBuilder.append(", osVersion=");
            stringBuilder.append(this.g);
            stringBuilder.append(", deviceModel=");
            stringBuilder.append(this.h);
            stringBuilder.append(", appVersionCode=");
            stringBuilder.append(this.i);
            stringBuilder.append(", appVersionName=");
            stringBuilder.append(this.j);
            this.k = stringBuilder.toString();
        }
        return this.k;
    }
}
