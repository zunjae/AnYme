package defpackage;

import org.json.JSONObject;

final class bac implements bao {
    bac() {
    }

    public final bam a(awo awo, JSONObject jSONObject) {
        azu azu;
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("app");
        String string = jSONObject3.getString("identifier");
        String string2 = jSONObject3.getString("status");
        String string3 = jSONObject3.getString("url");
        String string4 = jSONObject3.getString("reports_url");
        String string5 = jSONObject3.getString("ndk_reports_url");
        boolean optBoolean = jSONObject3.optBoolean("update_required", false);
        if (jSONObject3.has("icon") && jSONObject3.getJSONObject("icon").has("hash")) {
            jSONObject3 = jSONObject3.getJSONObject("icon");
            azu = new azu(jSONObject3.getString("hash"), jSONObject3.getInt("width"), jSONObject3.getInt("height"));
        } else {
            azu = null;
        }
        azw azw = new azw(string, string2, string3, string4, string5, optBoolean, azu);
        JSONObject jSONObject4 = jSONObject2.getJSONObject("session");
        bah bah = new bah(jSONObject4.optInt("log_buffer_size", 64000), jSONObject4.optInt("max_chained_exception_depth", 8), jSONObject4.optInt("max_custom_exception_events", 64), jSONObject4.optInt("max_custom_key_value_pairs", 64), jSONObject4.optInt("identifier_mask", 255), jSONObject4.optBoolean("send_session_without_crash", false), jSONObject4.optInt("max_complete_sessions_count", 4));
        jSONObject4 = jSONObject2.getJSONObject("prompt");
        bag bag = new bag(jSONObject4.optString("title", "Send Crash Report?"), jSONObject4.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jSONObject4.optString("send_button_title", "Send"), jSONObject4.optBoolean("show_cancel_button", true), jSONObject4.optString("cancel_button_title", "Don't Send"), jSONObject4.optBoolean("show_always_send_button", true), jSONObject4.optString("always_send_button_title", "Always Send"));
        jSONObject4 = jSONObject2.getJSONObject("features");
        bae bae = new bae(jSONObject4.optBoolean("prompt_enabled", false), jSONObject4.optBoolean("collect_logged_exceptions", true), jSONObject4.optBoolean("collect_reports", true), jSONObject4.optBoolean("collect_analytics", false), jSONObject4.optBoolean("firebase_crashlytics_enabled", false));
        jSONObject4 = jSONObject2.getJSONObject("analytics");
        azt azt = new azt(jSONObject4.optString("url", "https://e.crashlytics.com/spi/v2/events"), jSONObject4.optInt("flush_interval_secs", 600), jSONObject4.optInt("max_byte_size_per_file", 8000), jSONObject4.optInt("max_file_count_per_send", 1), jSONObject4.optInt("max_pending_send_file_count", 100), jSONObject4.optBoolean("forward_to_google_analytics", false), jSONObject4.optBoolean("include_purchase_events_in_forwarded_events", false), jSONObject4.optBoolean("track_custom_events", true), jSONObject4.optBoolean("track_predefined_events", true), jSONObject4.optInt("sampling_rate", 1), jSONObject4.optBoolean("flush_on_background", true));
        jSONObject4 = jSONObject2.getJSONObject("beta");
        return new bam(jSONObject2.has("expires_at") ? jSONObject2.getLong("expires_at") : awo.a() + (((long) optInt2) * 1000), azw, bah, bag, bae, azt, new azx(jSONObject4.optString("update_endpoint", ban.a), jSONObject4.optInt("update_suspend_duration", 3600)), optInt, optInt2);
    }
}
