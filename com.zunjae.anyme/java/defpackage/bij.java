package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;

public final class bij {
    public static final BigInteger a;
    public static final BigInteger b;
    public static final BigInteger c = a.multiply(b);
    public static final BigInteger d = a.multiply(c);
    public static final BigInteger e = a.multiply(d);
    public static final BigInteger f = a.multiply(e);
    public static final BigInteger g = BigInteger.valueOf(1024).multiply(BigInteger.valueOf(1152921504606846976L));
    public static final BigInteger h = a.multiply(g);
    public static final File[] i = new File[0];

    static {
        BigInteger valueOf = BigInteger.valueOf(1024);
        a = valueOf;
        b = valueOf.multiply(valueOf);
    }

    public static FileInputStream a(File file) {
        StringBuilder stringBuilder;
        if (!file.exists()) {
            stringBuilder = new StringBuilder("File '");
            stringBuilder.append(file);
            stringBuilder.append("' does not exist");
            throw new FileNotFoundException(stringBuilder.toString());
        } else if (file.isDirectory()) {
            stringBuilder = new StringBuilder("File '");
            stringBuilder.append(file);
            stringBuilder.append("' exists but is a directory");
            throw new IOException(stringBuilder.toString());
        } else if (file.canRead()) {
            return new FileInputStream(file);
        } else {
            stringBuilder = new StringBuilder("File '");
            stringBuilder.append(file);
            stringBuilder.append("' cannot be read");
            throw new IOException(stringBuilder.toString());
        }
    }
}
