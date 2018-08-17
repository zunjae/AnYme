package com.zunjae.anyme.activities.misc;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.zunjae.zapplib.a;
import com.zunjae.zasync.c;
import defpackage.ank;
import defpackage.aux;
import java.util.ArrayList;

final class g extends c<ArrayList<ank>> {
    final /* synthetic */ TroubleshootActivity a;

    g(TroubleshootActivity troubleshootActivity, Activity activity) {
        this.a = troubleshootActivity;
        super(activity);
    }

    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        obj = (ArrayList) obj;
        super.a(obj);
        TroubleshootActivity.a(this.a, obj);
    }

    @SuppressLint({"DefaultLocale"})
    public final /* synthetic */ Object b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ank("ADM Installed", "In order to download Episodes or Pictures, you need to install the free app 'ADM'", a.a(this.a.b, "com.dv.adm", "com.dv.adm.pay")));
        arrayList.add(new ank("Casting App Installed", "In order to cast, you either need to install 'BubbleUPnP', 'AllCast', 'LocalCast', 'AllScreen' or 'WebVideoCast'", a.a(this.a.b, "com.koushikdutta.cast", "com.instantbits.cast.webvideo", "com.toxic.apps.chrome", "de.stefanpledl.localcast")));
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra("title", "test");
        intent.putExtra("eventLocation", "/r/AnYme app");
        intent.putExtra("description", "test");
        intent.putExtra("beginTime", "test");
        r4 = new Object[2];
        boolean z = false;
        r4[0] = Integer.valueOf(333);
        r4[1] = "TU";
        intent.putExtra("rrule", String.format("FREQ=WEEKLY;COUNT=%d;WKST=SU;BYDAY=%s", r4));
        arrayList.add(new ank("Calendar App Installed", "In order to get a notification for a new episode, you need to install a calendar app. Google Calendar can be downloaded for free", a.a(this.a.b, intent)));
        intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse("http://www.sample-videos.com/video/mp4/720/big_buck_bunny_720p_1mb.mp4"), "video/*");
        arrayList.add(new ank("Can Play Videos", "You need a video player such as MX Player or VLC installed to stream videos", a.a(this.a.b, intent)));
        if (aux.b("@@AdBlocker_DAO_list_version", 0) > 0) {
            z = true;
        }
        arrayList.add(new ank("AdBlocker up-to-date", "To update the AdBlocker, simply restart the app", z));
        return arrayList;
    }
}
