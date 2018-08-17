package com.zunjae.zasync;

public final class a {
    public static long a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        j = j > 106751991167L ? Long.MAX_VALUE : j < -106751991167L ? Long.MIN_VALUE : j * 86400000;
        return currentTimeMillis + j;
    }
}
