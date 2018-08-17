package defpackage;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import java.io.IOException;
import org.json.JSONObject;

final class pq implements ayn<pm> {
    pq() {
    }

    @TargetApi(9)
    private static JSONObject a(pm pmVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            pp ppVar = pmVar.a;
            jSONObject.put("appBundleId", ppVar.a);
            jSONObject.put("executionId", ppVar.b);
            jSONObject.put("installationId", ppVar.c);
            jSONObject.put("limitAdTrackingEnabled", ppVar.d);
            jSONObject.put("betaDeviceToken", ppVar.e);
            jSONObject.put("buildId", ppVar.f);
            jSONObject.put("osVersion", ppVar.g);
            jSONObject.put("deviceModel", ppVar.h);
            jSONObject.put("appVersionCode", ppVar.i);
            jSONObject.put("appVersionName", ppVar.j);
            jSONObject.put("timestamp", pmVar.b);
            jSONObject.put("type", pmVar.c.toString());
            if (pmVar.d != null) {
                jSONObject.put("details", new JSONObject(pmVar.d));
            }
            jSONObject.put("customType", pmVar.e);
            if (pmVar.f != null) {
                jSONObject.put("customAttributes", new JSONObject(pmVar.f));
            }
            jSONObject.put("predefinedType", pmVar.g);
            if (pmVar.h != null) {
                jSONObject.put("predefinedAttributes", new JSONObject(pmVar.h));
            }
            return jSONObject;
        } catch (Throwable e) {
            if (VERSION.SDK_INT >= 9) {
                throw new IOException(e.getMessage(), e);
            }
            throw new IOException(e.getMessage());
        }
    }

    public final /* synthetic */ byte[] a(Object obj) {
        return pq.a((pm) obj).toString().getBytes("UTF-8");
    }
}
