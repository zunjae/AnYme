package com.zunjae.anyme.activities.browsers;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import defpackage.aug;
import defpackage.aux;
import defpackage.bit;
import me.zhanghai.android.materialprogressbar.R;

final class s implements OnMenuItemClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ ZeroChanBrowser b;

    s(ZeroChanBrowser zeroChanBrowser, String str) {
        this.b = zeroChanBrowser;
        this.a = str;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Context c;
        CharSequence charSequence;
        switch (menuItem.getItemId()) {
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /*100*/:
                if (!this.b.m) {
                    this.b.a("Anime Photos", this.a);
                    break;
                }
                ZeroChanBrowser zeroChanBrowser = this.b;
                zeroChanBrowser.a(zeroChanBrowser.o.J(), this.a);
                break;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /*101*/:
                String str = this.a;
                if (bit.c(str)) {
                    aux.a("KEY_CUSTOM_TOOLBAR_IMAGE", str);
                }
                c = this.b.b;
                charSequence = "New image set. Restart the app to see the changes";
                break;
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /*102*/:
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", this.a);
                this.b.startActivity(Intent.createChooser(intent, "Share This Picture"));
                break;
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /*103*/:
                aug.a(this.b.b, this.a);
                c = this.b.b;
                charSequence = "URL copied to your clipboard";
                break;
            default:
                break;
        }
        Toast.makeText(c, charSequence, 0).show();
        return true;
    }
}
