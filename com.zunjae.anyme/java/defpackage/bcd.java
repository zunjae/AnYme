package defpackage;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class bcd {
    private static final Pattern a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private final String c;
    private final String d;
    private final String e;
    @Nullable
    private final String f;

    private bcd(String str, String str2, String str3, @Nullable String str4) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public static bcd a(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.lookingAt()) {
            String toLowerCase = matcher.group(1).toLowerCase(Locale.US);
            String toLowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = b.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                StringBuilder stringBuilder;
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase("charset")) {
                        group = matcher2.group(2);
                        if (group == null) {
                            group = matcher2.group(3);
                        } else if (group.startsWith("'") && group.endsWith("'") && group.length() > 2) {
                            group = group.substring(1, group.length() - 1);
                        }
                        if (str2 != null) {
                            if (!group.equalsIgnoreCase(str2)) {
                                stringBuilder = new StringBuilder("Multiple charsets defined: \"");
                                stringBuilder.append(str2);
                                stringBuilder.append("\" and: \"");
                                stringBuilder.append(group);
                                stringBuilder.append("\" for: \"");
                                stringBuilder.append(str);
                                stringBuilder.append('\"');
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        str2 = group;
                    }
                    end = matcher2.end();
                } else {
                    stringBuilder = new StringBuilder("Parameter is not formatted correctly: \"");
                    stringBuilder.append(str.substring(end));
                    stringBuilder.append("\" for: \"");
                    stringBuilder.append(str);
                    stringBuilder.append('\"');
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            return new bcd(str, toLowerCase, toLowerCase2, str2);
        }
        StringBuilder stringBuilder2 = new StringBuilder("No subtype found for: \"");
        stringBuilder2.append(str);
        stringBuilder2.append('\"');
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    @javax.annotation.Nullable
    public static defpackage.bcd b(java.lang.String r0) {
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
        r0 = defpackage.bcd.a(r0);	 Catch:{ IllegalArgumentException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bcd.b(java.lang.String):bcd");
    }

    public final String a() {
        return this.d;
    }

    @javax.annotation.Nullable
    public final java.nio.charset.Charset a(@javax.annotation.Nullable java.nio.charset.Charset r2) {
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
        r1 = this;
        r0 = r1.f;	 Catch:{ IllegalArgumentException -> 0x000b }
        if (r0 == 0) goto L_0x000b;	 Catch:{ IllegalArgumentException -> 0x000b }
    L_0x0004:
        r0 = r1.f;	 Catch:{ IllegalArgumentException -> 0x000b }
        r0 = java.nio.charset.Charset.forName(r0);	 Catch:{ IllegalArgumentException -> 0x000b }
        return r0;
    L_0x000b:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: bcd.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof bcd) && ((bcd) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
