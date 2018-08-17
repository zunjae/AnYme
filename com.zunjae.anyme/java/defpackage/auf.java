package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.zunjae.zapplib.a;

public final class auf {
    private static defpackage.ani a(defpackage.are r7) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = new java.text.SimpleDateFormat;
        r1 = "yyyy-MM-dd";
        r0.<init>(r1);
        r1 = r7.a(r0);
        if (r1 >= 0) goto L_0x000e;
    L_0x000d:
        r1 = 0;
    L_0x000e:
        if (r1 <= 0) goto L_0x0017;
    L_0x0010:
        r2 = (long) r1;
        r4 = 604800000; // 0x240c8400 float:3.046947E-17 double:2.988109026E-315;
        r2 = r2 * r4;
        goto L_0x0019;
    L_0x0017:
        r2 = 0;
    L_0x0019:
        r2 = java.lang.Long.valueOf(r2);
        r7 = r7.l();	 Catch:{ ParseException -> 0x0039 }
        r7 = r0.parse(r7);	 Catch:{ ParseException -> 0x0039 }
        r3 = r7.getTime();	 Catch:{ ParseException -> 0x0039 }
        r5 = r2.longValue();	 Catch:{ ParseException -> 0x0039 }
        r7 = 0;	 Catch:{ ParseException -> 0x0039 }
        r3 = r3 + r5;	 Catch:{ ParseException -> 0x0039 }
        r5 = 54000000; // 0x337f980 float:5.406528E-37 double:2.6679545E-316;	 Catch:{ ParseException -> 0x0039 }
        r3 = r3 + r5;	 Catch:{ ParseException -> 0x0039 }
        r7 = new ani;	 Catch:{ ParseException -> 0x0039 }
        r7.<init>(r3, r1);	 Catch:{ ParseException -> 0x0039 }
        return r7;
    L_0x0039:
        r7 = new ani;
        r2 = -1;
        r7.<init>(r2, r1);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: auf.a(are):ani");
    }

    public static void a(Context context, are are, String str) {
        ani a = auf.a(are);
        long a2 = a.a();
        if (a2 > 0) {
            int j = are.j() - a.b();
            String format = String.format("New episode for %s will air today", new Object[]{are.g()});
            Intent intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.item/event");
            intent.putExtra("title", are.g());
            intent.putExtra("eventLocation", "/r/AnYme app");
            intent.putExtra("description", format);
            intent.putExtra("beginTime", a2);
            intent.putExtra("rrule", String.format("FREQ=WEEKLY;COUNT=%d;WKST=SU;BYDAY=%s", new Object[]{Integer.valueOf(j), str}));
            if (a.a(context, intent)) {
                context.startActivity(intent);
                Toast.makeText(context, "Don't forget to add a reminder in the Calendar app!", 1).show();
                return;
            }
            throw new auu("You have no calendar app installed. Install one from the Play Store");
        }
        throw new aut("Can not figure out the start date of this Anime...");
    }
}
