package defpackage;

import android.webkit.WebView;
import com.mikepenz.materialdrawer.a;
import com.mikepenz.materialdrawer.f;
import com.mikepenz.materialdrawer.o;
import com.mikepenz.materialdrawer.t;
import com.zunjae.anyme.activities.AbstractActivity;

public final class auq {
    private static final String a = "auq";
    private final WebView b;
    private final AbstractActivity c;
    private a d;
    private o e;

    public auq(WebView webView, AbstractActivity abstractActivity) {
        this.b = webView;
        this.c = abstractActivity;
        aex aex = (aex) ((aex) ((aex) ((aex) new aex().c("Refresh")).j()).a(1)).a(com.mikepenz.fontawesome_typeface_library.a.faw_refresh);
        aex aex2 = (aex) ((aex) ((aex) ((aex) new aex().c("Scroll To Top")).j()).a(2)).a(com.mikepenz.fontawesome_typeface_library.a.faw_angle_double_up);
        aex aex3 = (aex) ((aex) ((aex) ((aex) new aex().c("Navigate Back")).j()).a(3)).a(com.mikepenz.fontawesome_typeface_library.a.faw_arrow_left);
        aex aex4 = (aex) ((aex) ((aex) ((aex) new aex().c("Navigate Forward")).j()).a(4)).a(com.mikepenz.fontawesome_typeface_library.a.faw_arrow_right);
        aex aex5 = (aex) ((aex) ((aex) ((aex) new aex().c("Share Url")).j()).a(5)).a(com.mikepenz.fontawesome_typeface_library.a.faw_share_alt);
        aex aex6 = (aex) ((aex) ((aex) ((aex) new aex().c("Close Browser")).j()).a(6)).a(com.mikepenz.fontawesome_typeface_library.a.faw_times);
        aex aex7 = (aex) ((aex) ((aex) ((aex) new aex().c("Open in Browser")).j()).a(7)).a(com.mikepenz.fontawesome_typeface_library.a.faw_globe);
        aex aex8 = (aex) ((aex) ((aex) ((aex) new aex().c("Copy to Clipboard")).j()).a(8)).a(com.mikepenz.fontawesome_typeface_library.a.faw_clipboard);
        aex aex9 = (aex) ((aex) ((aex) ((aex) new aex().c("Clear Default Video Quality")).j()).a(9)).a(com.mikepenz.fontawesome_typeface_library.a.faw_eraser);
        String b = aux.b("KEY_QUALITY_SELECTOR_PREFERRED", null);
        if (b != null) {
            aex9.b("Current: ".concat(String.valueOf(b)));
        }
        aff aff = (aff) ((aff) ((aff) ((aff) ((aff) new aff().c("Ask For Playback")).b("Don't start videos automatically")).j()).d(aux.b("KEY_ASK_FOR_PLAYBACK", false))).a(new aur(this));
        this.d = new f().a(this.c).a().c().b().d().e();
        this.e = new t().a(this.c).a(this.d).a(aex, aex2, aex3, aex4, aex9, aex8, aex5, aex7).b(aff, aex6).b().a(new aus(this)).g();
        this.e.a(-1);
    }

    public final void a() {
        o oVar = this.e;
        if (oVar != null) {
            oVar.b();
        }
    }
}
