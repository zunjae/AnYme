package org.jsoup.helper;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;

public final class DataUtil {
    private static final Pattern a = Pattern.compile("(?i)\\bcharset=\\s*(?:\"|')?([^\\s,;\"']*)");
    private static final char[] b = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private DataUtil() {
    }

    static String a(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = a.matcher(str);
        return matcher.find() ? b(matcher.group(1).trim().replace("charset=", BuildConfig.FLAVOR)) : null;
    }

    private static String a(ByteBuffer byteBuffer, String str) {
        byteBuffer.mark();
        byte[] bArr = new byte[4];
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.get(bArr);
            byteBuffer.rewind();
        }
        if ((bArr[0] == (byte) 0 && bArr[1] == (byte) 0 && bArr[2] == (byte) -2 && bArr[3] == (byte) -1) || (bArr[0] == (byte) -1 && bArr[1] == (byte) -2 && bArr[2] == (byte) 0 && bArr[3] == (byte) 0)) {
            return "UTF-32";
        }
        if ((bArr[0] == (byte) -2 && bArr[1] == (byte) -1) || (bArr[0] == (byte) -1 && bArr[1] == (byte) -2)) {
            return "UTF-16";
        }
        if (bArr[0] != (byte) -17 || bArr[1] != (byte) -69 || bArr[2] != (byte) -65) {
            return str;
        }
        str = "UTF-8";
        byteBuffer.position(3);
        return str;
    }

    static ByteBuffer a() {
        return ByteBuffer.allocate(0);
    }

    private static ByteBuffer a(File file) {
        RandomAccessFile randomAccessFile;
        Throwable th;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[((int) randomAccessFile.length())];
                randomAccessFile.readFully(bArr);
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                randomAccessFile.close();
                return wrap;
            } catch (Throwable th2) {
                th = th2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            throw th;
        }
    }

    static Document a(ByteBuffer byteBuffer, String str, String str2, Parser parser) {
        String charBuffer;
        str = a(byteBuffer, str);
        Document document = null;
        if (str == null) {
            String attr;
            charBuffer = Charset.forName("UTF-8").decode(byteBuffer).toString();
            Document parseInput = parser.parseInput(charBuffer, str2);
            Element first = parseInput.select("meta[http-equiv=content-type], meta[charset]").first();
            if (first != null) {
                String a = first.hasAttr("http-equiv") ? a(first.attr("content")) : null;
                attr = (a == null && first.hasAttr("charset")) ? first.attr("charset") : a;
            } else {
                attr = null;
            }
            if (attr == null && parseInput.childNodeSize() > 0 && (parseInput.childNode(0) instanceof XmlDeclaration)) {
                XmlDeclaration xmlDeclaration = (XmlDeclaration) parseInput.childNode(0);
                if (xmlDeclaration.name().equals("xml")) {
                    attr = xmlDeclaration.attr("encoding");
                }
            }
            attr = b(attr);
            if (attr == null || attr.equals("UTF-8")) {
                document = parseInput;
                if (document == null) {
                    return document;
                }
                document = parser.parseInput(charBuffer, str2);
                document.outputSettings().charset(str);
                return document;
            }
            str = attr.trim().replaceAll("[\"']", BuildConfig.FLAVOR);
            byteBuffer.rewind();
        } else {
            Validate.notEmpty(str, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        charBuffer = Charset.forName(str).decode(byteBuffer).toString();
        if (document == null) {
            return document;
        }
        document = parser.parseInput(charBuffer, str2);
        document.outputSettings().charset(str);
        return document;
    }

    static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[60000];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    static String b() {
        StringBuilder stringBuilder = new StringBuilder(32);
        Random random = new Random();
        for (int i = 0; i < 32; i++) {
            char[] cArr = b;
            stringBuilder.append(cArr[random.nextInt(cArr.length)]);
        }
        return stringBuilder.toString();
    }

    private static java.lang.String b(java.lang.String r3) {
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
        r0 = 0;
        if (r3 == 0) goto L_0x002a;
    L_0x0003:
        r1 = r3.length();
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x002a;
    L_0x000a:
        r3 = r3.trim();
        r1 = "[\"']";
        r2 = "";
        r3 = r3.replaceAll(r1, r2);
        r1 = java.nio.charset.Charset.isSupported(r3);	 Catch:{ IllegalCharsetNameException -> 0x002a }
        if (r1 == 0) goto L_0x001d;	 Catch:{ IllegalCharsetNameException -> 0x002a }
    L_0x001c:
        return r3;	 Catch:{ IllegalCharsetNameException -> 0x002a }
    L_0x001d:
        r1 = java.util.Locale.ENGLISH;	 Catch:{ IllegalCharsetNameException -> 0x002a }
        r3 = r3.toUpperCase(r1);	 Catch:{ IllegalCharsetNameException -> 0x002a }
        r1 = java.nio.charset.Charset.isSupported(r3);	 Catch:{ IllegalCharsetNameException -> 0x002a }
        if (r1 == 0) goto L_0x002a;
    L_0x0029:
        return r3;
    L_0x002a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.DataUtil.b(java.lang.String):java.lang.String");
    }

    public static Document load(File file, String str, String str2) {
        return a(a(file), str, str2, Parser.htmlParser());
    }

    public static Document load(InputStream inputStream, String str, String str2) {
        return a(readToByteBuffer(inputStream, 0), str, str2, Parser.htmlParser());
    }

    public static Document load(InputStream inputStream, String str, String str2, Parser parser) {
        return a(readToByteBuffer(inputStream, 0), str, str2, parser);
    }

    public static ByteBuffer readToByteBuffer(InputStream inputStream, int i) {
        Object obj = 1;
        Validate.isTrue(i >= 0, "maxSize must be 0 (unlimited) or larger");
        if (i <= 0) {
            obj = null;
        }
        int i2 = 60000;
        int i3 = (obj == null || i >= 60000) ? 60000 : i;
        byte[] bArr = new byte[i3];
        if (obj != null) {
            i2 = i;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        while (!Thread.interrupted()) {
            i2 = inputStream.read(bArr);
            if (i2 == -1) {
                break;
            }
            if (obj != null) {
                if (i2 > i) {
                    byteArrayOutputStream.write(bArr, 0, i);
                    break;
                }
                i -= i2;
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }
}
