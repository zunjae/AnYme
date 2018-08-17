package defpackage;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class pa {
    private static final Set<String> a = new HashSet(Arrays.asList(new String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"}));

    private static Double a(Object obj) {
        String valueOf = String.valueOf(obj);
        return valueOf == null ? null : Double.valueOf(valueOf);
    }

    private static String a(String str) {
        if (str != null) {
            if (str.length() != 0) {
                if (a.contains(str)) {
                    return "fabric_".concat(String.valueOf(str));
                }
                str = str.replaceAll("[^\\p{Alnum}_]+", "_");
                if (str.startsWith("ga_") || str.startsWith("google_") || str.startsWith("firebase_") || !Character.isLetter(str.charAt(0))) {
                    str = "fabric_".concat(String.valueOf(str));
                }
                if (str.length() > 40) {
                    str = str.substring(0, 40);
                }
                return str;
            }
        }
        return "fabric_unnamed_event";
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.oz a(defpackage.pm r8) {
        /*
        r0 = defpackage.po.CUSTOM;
        r1 = r8.c;
        r0 = r0.equals(r1);
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0012;
    L_0x000c:
        r0 = r8.e;
        if (r0 == 0) goto L_0x0012;
    L_0x0010:
        r0 = 1;
        goto L_0x0013;
    L_0x0012:
        r0 = 0;
    L_0x0013:
        r3 = defpackage.po.PREDEFINED;
        r4 = r8.c;
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0023;
    L_0x001d:
        r3 = r8.g;
        if (r3 == 0) goto L_0x0023;
    L_0x0021:
        r3 = 1;
        goto L_0x0024;
    L_0x0023:
        r3 = 0;
    L_0x0024:
        r4 = 0;
        if (r0 != 0) goto L_0x002a;
    L_0x0027:
        if (r3 != 0) goto L_0x002a;
    L_0x0029:
        return r4;
    L_0x002a:
        if (r3 == 0) goto L_0x022c;
    L_0x002c:
        r0 = new android.os.Bundle;
        r0.<init>();
        r5 = "purchase";
        r6 = r8.g;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x008a;
    L_0x003b:
        r4 = "item_id";
        r5 = r8.h;
        r6 = "itemId";
        r5 = r5.get(r6);
        r5 = (java.lang.String) r5;
        defpackage.pa.a(r0, r4, r5);
        r4 = "item_name";
        r5 = r8.h;
        r6 = "itemName";
        r5 = r5.get(r6);
        r5 = (java.lang.String) r5;
        defpackage.pa.a(r0, r4, r5);
        r4 = "item_category";
        r5 = r8.h;
        r6 = "itemType";
        r5 = r5.get(r6);
        r5 = (java.lang.String) r5;
        defpackage.pa.a(r0, r4, r5);
        r4 = "value";
        r5 = r8.h;
        r6 = "itemPrice";
    L_0x006e:
        r5 = r5.get(r6);
        r5 = defpackage.pa.b(r5);
        defpackage.pa.a(r0, r4, r5);
        r4 = "currency";
        r5 = r8.h;
        r6 = "currency";
    L_0x007f:
        r5 = r5.get(r6);
        r5 = (java.lang.String) r5;
        defpackage.pa.a(r0, r4, r5);
        goto L_0x0226;
    L_0x008a:
        r5 = "addToCart";
        r6 = r8.g;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00fb;
    L_0x0094:
        r4 = "item_id";
        r5 = r8.h;
        r6 = "itemId";
        r5 = r5.get(r6);
        r5 = (java.lang.String) r5;
        defpackage.pa.a(r0, r4, r5);
        r4 = "item_name";
        r5 = r8.h;
        r6 = "itemName";
        r5 = r5.get(r6);
        r5 = (java.lang.String) r5;
        defpackage.pa.a(r0, r4, r5);
        r4 = "item_category";
        r5 = r8.h;
        r6 = "itemType";
        r5 = r5.get(r6);
        r5 = (java.lang.String) r5;
        defpackage.pa.a(r0, r4, r5);
        r4 = "price";
        r5 = r8.h;
        r6 = "itemPrice";
        r5 = r5.get(r6);
        r5 = defpackage.pa.b(r5);
        defpackage.pa.a(r0, r4, r5);
        r4 = "value";
        r5 = r8.h;
        r6 = "itemPrice";
        r5 = r5.get(r6);
        r5 = defpackage.pa.b(r5);
        defpackage.pa.a(r0, r4, r5);
        r4 = "currency";
        r5 = r8.h;
        r6 = "currency";
        r5 = r5.get(r6);
        r5 = (java.lang.String) r5;
        defpackage.pa.a(r0, r4, r5);
        r4 = "quantity";
        r5 = 1;
        r0.putLong(r4, r5);
        goto L_0x0226;
    L_0x00fb:
        r5 = "startCheckout";
        r6 = r8.g;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x012b;
    L_0x0105:
        r4 = "quantity";
        r5 = r8.h;
        r6 = "itemCount";
        r5 = r5.get(r6);
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        r5 = (long) r5;
        r5 = java.lang.Long.valueOf(r5);
        if (r5 == 0) goto L_0x0123;
    L_0x011c:
        r5 = r5.longValue();
        r0.putLong(r4, r5);
    L_0x0123:
        r4 = "value";
        r5 = r8.h;
        r6 = "totalPrice";
        goto L_0x006e;
    L_0x012b:
        r5 = "contentView";
        r6 = r8.g;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x015b;
    L_0x0135:
        r4 = "content_type";
        r5 = r8.h;
        r6 = "contentType";
        r5 = r5.get(r6);
        r5 = (java.lang.String) r5;
        defpackage.pa.a(r0, r4, r5);
        r4 = "item_id";
        r5 = r8.h;
        r6 = "contentId";
        r5 = r5.get(r6);
        r5 = (java.lang.String) r5;
        defpackage.pa.a(r0, r4, r5);
        r4 = "item_name";
        r5 = r8.h;
        r6 = "contentName";
        goto L_0x007f;
    L_0x015b:
        r5 = "search";
        r6 = r8.g;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x016d;
    L_0x0165:
        r4 = "search_term";
        r5 = r8.h;
        r6 = "query";
        goto L_0x007f;
    L_0x016d:
        r5 = "share";
        r6 = r8.g;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0187;
    L_0x0177:
        r4 = "method";
        r5 = r8.h;
        r6 = "method";
        r5 = r5.get(r6);
        r5 = (java.lang.String) r5;
    L_0x0183:
        defpackage.pa.a(r0, r4, r5);
        goto L_0x0135;
    L_0x0187:
        r5 = "rating";
        r6 = r8.g;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x01a0;
    L_0x0191:
        r4 = "rating";
        r5 = r8.h;
        r6 = "rating";
        r5 = r5.get(r6);
        r5 = java.lang.String.valueOf(r5);
        goto L_0x0183;
    L_0x01a0:
        r5 = "signUp";
        r6 = r8.g;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x01b2;
    L_0x01aa:
        r4 = "method";
        r5 = r8.h;
        r6 = "method";
        goto L_0x007f;
    L_0x01b2:
        r5 = "login";
        r6 = r8.g;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x01bd;
    L_0x01bc:
        goto L_0x01aa;
    L_0x01bd:
        r5 = "invite";
        r6 = r8.g;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x01c8;
    L_0x01c7:
        goto L_0x01aa;
    L_0x01c8:
        r5 = "levelStart";
        r6 = r8.g;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x01da;
    L_0x01d2:
        r4 = "level_name";
        r5 = r8.h;
        r6 = "levelName";
        goto L_0x007f;
    L_0x01da:
        r5 = "levelEnd";
        r6 = r8.g;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0226;
    L_0x01e4:
        r5 = "score";
        r6 = r8.h;
        r7 = "score";
        r6 = r6.get(r7);
        r6 = defpackage.pa.a(r6);
        defpackage.pa.a(r0, r5, r6);
        r5 = "level_name";
        r6 = r8.h;
        r7 = "levelName";
        r6 = r6.get(r7);
        r6 = (java.lang.String) r6;
        defpackage.pa.a(r0, r5, r6);
        r5 = "success";
        r6 = r8.h;
        r7 = "success";
        r6 = r6.get(r7);
        r6 = (java.lang.String) r6;
        if (r6 != 0) goto L_0x0213;
    L_0x0212:
        goto L_0x021d;
    L_0x0213:
        r4 = "true";
        r4 = r6.equals(r4);
        r4 = java.lang.Integer.valueOf(r4);
    L_0x021d:
        if (r4 == 0) goto L_0x0226;
    L_0x021f:
        r4 = r4.intValue();
        r0.putInt(r5, r4);
    L_0x0226:
        r4 = r8.f;
    L_0x0228:
        defpackage.pa.a(r0, r4);
        goto L_0x0236;
    L_0x022c:
        r0 = new android.os.Bundle;
        r0.<init>();
        r4 = r8.f;
        if (r4 == 0) goto L_0x0236;
    L_0x0235:
        goto L_0x0228;
    L_0x0236:
        if (r3 == 0) goto L_0x0345;
    L_0x0238:
        r3 = r8.h;
        r4 = "success";
        r3 = r3.get(r4);
        r3 = (java.lang.String) r3;
        if (r3 == 0) goto L_0x024c;
    L_0x0244:
        r3 = java.lang.Boolean.parseBoolean(r3);
        if (r3 != 0) goto L_0x024c;
    L_0x024a:
        r3 = 1;
        goto L_0x024d;
    L_0x024c:
        r3 = 0;
    L_0x024d:
        r8 = r8.g;
        r4 = 2;
        r5 = -1;
        if (r3 == 0) goto L_0x0296;
    L_0x0253:
        r3 = r8.hashCode();
        r6 = -902468296; // 0xffffffffca356d38 float:-2972494.0 double:NaN;
        if (r3 == r6) goto L_0x027b;
    L_0x025c:
        r6 = 103149417; // 0x625ef69 float:3.1208942E-35 double:5.09625833E-316;
        if (r3 == r6) goto L_0x0271;
    L_0x0261:
        r6 = 1743324417; // 0x67e90501 float:2.2008074E24 double:8.61316704E-315;
        if (r3 == r6) goto L_0x0267;
    L_0x0266:
        goto L_0x0285;
    L_0x0267:
        r3 = "purchase";
        r3 = r8.equals(r3);
        if (r3 == 0) goto L_0x0285;
    L_0x026f:
        r3 = 0;
        goto L_0x0286;
    L_0x0271:
        r3 = "login";
        r3 = r8.equals(r3);
        if (r3 == 0) goto L_0x0285;
    L_0x0279:
        r3 = 2;
        goto L_0x0286;
    L_0x027b:
        r3 = "signUp";
        r3 = r8.equals(r3);
        if (r3 == 0) goto L_0x0285;
    L_0x0283:
        r3 = 1;
        goto L_0x0286;
    L_0x0285:
        r3 = -1;
    L_0x0286:
        switch(r3) {
            case 0: goto L_0x0292;
            case 1: goto L_0x028e;
            case 2: goto L_0x028a;
            default: goto L_0x0289;
        };
    L_0x0289:
        goto L_0x0296;
    L_0x028a:
        r8 = "failed_login";
        goto L_0x034b;
    L_0x028e:
        r8 = "failed_sign_up";
        goto L_0x034b;
    L_0x0292:
        r8 = "failed_ecommerce_purchase";
        goto L_0x034b;
    L_0x0296:
        r3 = r8.hashCode();
        switch(r3) {
            case -2131650889: goto L_0x0311;
            case -1183699191: goto L_0x0306;
            case -938102371: goto L_0x02fc;
            case -906336856: goto L_0x02f2;
            case -902468296: goto L_0x02e8;
            case -389087554: goto L_0x02de;
            case 23457852: goto L_0x02d5;
            case 103149417: goto L_0x02ca;
            case 109400031: goto L_0x02c0;
            case 196004670: goto L_0x02b5;
            case 1664021448: goto L_0x02aa;
            case 1743324417: goto L_0x029f;
            default: goto L_0x029d;
        };
    L_0x029d:
        goto L_0x031c;
    L_0x029f:
        r1 = "purchase";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x031c;
    L_0x02a7:
        r1 = 0;
        goto L_0x031d;
    L_0x02aa:
        r1 = "startCheckout";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x031c;
    L_0x02b2:
        r1 = 2;
        goto L_0x031d;
    L_0x02b5:
        r1 = "levelStart";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x031c;
    L_0x02bd:
        r1 = 10;
        goto L_0x031d;
    L_0x02c0:
        r1 = "share";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x031c;
    L_0x02c8:
        r1 = 5;
        goto L_0x031d;
    L_0x02ca:
        r1 = "login";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x031c;
    L_0x02d2:
        r1 = 8;
        goto L_0x031d;
    L_0x02d5:
        r2 = "addToCart";
        r2 = r8.equals(r2);
        if (r2 == 0) goto L_0x031c;
    L_0x02dd:
        goto L_0x031d;
    L_0x02de:
        r1 = "contentView";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x031c;
    L_0x02e6:
        r1 = 3;
        goto L_0x031d;
    L_0x02e8:
        r1 = "signUp";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x031c;
    L_0x02f0:
        r1 = 7;
        goto L_0x031d;
    L_0x02f2:
        r1 = "search";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x031c;
    L_0x02fa:
        r1 = 4;
        goto L_0x031d;
    L_0x02fc:
        r1 = "rating";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x031c;
    L_0x0304:
        r1 = 6;
        goto L_0x031d;
    L_0x0306:
        r1 = "invite";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x031c;
    L_0x030e:
        r1 = 9;
        goto L_0x031d;
    L_0x0311:
        r1 = "levelEnd";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x031c;
    L_0x0319:
        r1 = 11;
        goto L_0x031d;
    L_0x031c:
        r1 = -1;
    L_0x031d:
        switch(r1) {
            case 0: goto L_0x0342;
            case 1: goto L_0x033f;
            case 2: goto L_0x033c;
            case 3: goto L_0x0339;
            case 4: goto L_0x0336;
            case 5: goto L_0x0333;
            case 6: goto L_0x0330;
            case 7: goto L_0x032d;
            case 8: goto L_0x032a;
            case 9: goto L_0x0327;
            case 10: goto L_0x0324;
            case 11: goto L_0x0321;
            default: goto L_0x0320;
        };
    L_0x0320:
        goto L_0x0347;
    L_0x0321:
        r8 = "level_end";
        goto L_0x034b;
    L_0x0324:
        r8 = "level_start";
        goto L_0x034b;
    L_0x0327:
        r8 = "invite";
        goto L_0x034b;
    L_0x032a:
        r8 = "login";
        goto L_0x034b;
    L_0x032d:
        r8 = "sign_up";
        goto L_0x034b;
    L_0x0330:
        r8 = "rate_content";
        goto L_0x034b;
    L_0x0333:
        r8 = "share";
        goto L_0x034b;
    L_0x0336:
        r8 = "search";
        goto L_0x034b;
    L_0x0339:
        r8 = "select_content";
        goto L_0x034b;
    L_0x033c:
        r8 = "begin_checkout";
        goto L_0x034b;
    L_0x033f:
        r8 = "add_to_cart";
        goto L_0x034b;
    L_0x0342:
        r8 = "ecommerce_purchase";
        goto L_0x034b;
    L_0x0345:
        r8 = r8.e;
    L_0x0347:
        r8 = defpackage.pa.a(r8);
    L_0x034b:
        defpackage.avf.c();
        r1 = new oz;
        r1.<init>(r8, r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.a(pm):oz");
    }

    private static void a(Bundle bundle, String str, Double d) {
        d = pa.a((Object) d);
        if (d != null) {
            bundle.putDouble(str, d.doubleValue());
        }
    }

    private static void a(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    private static void a(Bundle bundle, Map<String, Object> map) {
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            if (str != null) {
                if (str.length() != 0) {
                    str = str.replaceAll("[^\\p{Alnum}_]+", "_");
                    if (str.startsWith("ga_") || str.startsWith("google_") || str.startsWith("firebase_") || !Character.isLetter(str.charAt(0))) {
                        str = "fabric_".concat(String.valueOf(str));
                    }
                    if (str.length() > 40) {
                        str = str.substring(0, 40);
                    }
                    if (value instanceof String) {
                        bundle.putString(str, entry.getValue().toString());
                    } else if (value instanceof Double) {
                        bundle.putDouble(str, ((Double) entry.getValue()).doubleValue());
                    } else if (value instanceof Long) {
                        bundle.putLong(str, ((Long) entry.getValue()).longValue());
                    } else if (value instanceof Integer) {
                        bundle.putInt(str, ((Integer) entry.getValue()).intValue());
                    }
                }
            }
            str = "fabric_unnamed_parameter";
            if (value instanceof String) {
                bundle.putString(str, entry.getValue().toString());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Double) entry.getValue()).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Long) entry.getValue()).longValue());
            } else if (value instanceof Integer) {
                bundle.putInt(str, ((Integer) entry.getValue()).intValue());
            }
        }
    }

    private static Double b(Object obj) {
        Long l = (Long) obj;
        return l == null ? null : Double.valueOf(new BigDecimal(l.longValue()).divide(ny.a).doubleValue());
    }
}
