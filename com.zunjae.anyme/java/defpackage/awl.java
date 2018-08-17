package defpackage;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

enum awl {
    X86_32,
    X86_64,
    ARM_UNKNOWN,
    PPC,
    PPC64,
    ARMV6,
    ARMV7,
    UNKNOWN,
    ARMV7S,
    ARM64;
    
    private static final Map<String, awl> matcher = null;

    static {
        Map hashMap = new HashMap(4);
        matcher = hashMap;
        hashMap.put("armeabi-v7a", ARMV7);
        matcher.put("armeabi", ARMV6);
        matcher.put("arm64-v8a", ARM64);
        matcher.put("x86", X86_32);
    }

    static awl getValue() {
        Object obj = Build.CPU_ABI;
        if (TextUtils.isEmpty(obj)) {
            avf.c();
            return UNKNOWN;
        }
        awl awl = (awl) matcher.get(obj.toLowerCase(Locale.US));
        if (awl == null) {
            awl = UNKNOWN;
        }
        return awl;
    }
}
