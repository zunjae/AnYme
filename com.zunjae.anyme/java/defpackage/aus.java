package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.mikepenz.materialdrawer.p;
import mehdi.sakout.fancybuttons.R;

final class aus implements p {
    final /* synthetic */ auq a;

    aus(auq auq) {
        this.a = auq;
    }

    public final boolean onItemClick(View view, int i, afi afi) {
        Context b;
        CharSequence charSequence;
        switch ((int) afi.c()) {
            case tw.a /*1*/:
                this.a.b.stopLoading();
                this.a.b.reload();
                break;
            case tw.b /*2*/:
                this.a.b.scrollTo(0, 0);
                break;
            case f.c /*3*/:
                if (this.a.b.canGoBack()) {
                    this.a.b.goBack();
                    break;
                }
                break;
            case mh.d /*4*/:
                if (this.a.b.canGoForward()) {
                    this.a.b.goForward();
                    break;
                }
                break;
            case mh.e /*5*/:
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", this.a.b.getUrl());
                intent.putExtra("android.intent.extra.SUBJECT", this.a.b.getTitle());
                this.a.c.startActivity(intent);
                break;
            case mh.f /*6*/:
                this.a.c.finish();
                break;
            case mh.g /*7*/:
                this.a.c.a(this.a.b.getUrl());
                break;
            case mh.h /*8*/:
                aug.a(this.a.c, this.a.b.getUrl());
                b = this.a.c;
                charSequence = "Copied link to your clipboard";
                break;
            case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                aux.b("KEY_QUALITY_SELECTOR_PREFERRED");
                b = this.a.c;
                charSequence = "Cleared default video quality";
                break;
            default:
                break;
        }
        Toast.makeText(b, charSequence, 0).show();
        return false;
    }
}
