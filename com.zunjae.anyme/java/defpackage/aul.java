package defpackage;

import android.content.Context;
import android.view.Menu;
import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconDrawable;
import com.joanzapata.iconify.fonts.FontAwesomeIcons;
import com.joanzapata.iconify.fonts.MaterialIcons;
import com.zunjae.anyme.R;

public final class aul {
    private final int a = 17170443;
    private final int b = 17170444;
    private final Context c;

    public aul(Context context) {
        this.c = context;
    }

    private IconDrawable a(int i, Icon icon) {
        return new IconDrawable(this.c, icon).colorRes(i).actionBarSize();
    }

    public final void a(Menu menu) {
        menu.findItem(R.id.actionbar_search).setIcon(a(17170443, FontAwesomeIcons.fa_search));
        menu.findItem(R.id.actionbar_discover).setIcon(a(17170443, FontAwesomeIcons.fa_plus_square));
        menu.findItem(R.id.actionbar_refresh).setIcon(a(17170443, FontAwesomeIcons.fa_refresh));
        menu.findItem(R.id.actionbar_sort).setIcon(a(17170443, FontAwesomeIcons.fa_sort_amount_desc));
    }

    public final void a(Menu menu, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                throw new RuntimeException("CastMode can not be enabled at the same time as DownloaderMode");
            }
        }
        menu.findItem(R.id.browser_open_drawer).setIcon(a(17170443, FontAwesomeIcons.fa_bars));
        int i = 17170455;
        int i2 = z ? 17170455 : 17170443;
        if (!z2) {
            i = 17170443;
        }
        menu.findItem(R.id.browser_downloader).setIcon(a(i2, FontAwesomeIcons.fa_download));
        menu.findItem(R.id.browser_cast).setIcon(a(i, MaterialIcons.md_cast));
    }

    public final void b(Menu menu) {
        menu.findItem(R.id.history_item).setIcon(a(17170443, FontAwesomeIcons.fa_history));
    }

    public final void c(Menu menu) {
        menu.findItem(R.id.action_search).setIcon(a(17170443, FontAwesomeIcons.fa_search));
    }

    public final void d(Menu menu) {
        menu.findItem(R.id.action_search).setIcon(a(17170443, FontAwesomeIcons.fa_search));
    }

    public final void e(Menu menu) {
        menu.findItem(R.id.action_search).setIcon(a(17170443, FontAwesomeIcons.fa_search));
    }

    public final void f(Menu menu) {
        menu.findItem(R.id.item_delete).setIcon(a(17170443, FontAwesomeIcons.fa_trash));
        menu.findItem(R.id.item_select_all).setIcon(a(17170443, FontAwesomeIcons.fa_check_square_o));
    }

    public final void g(Menu menu) {
        menu.findItem(R.id.browser_open_drawer).setIcon(a(17170443, FontAwesomeIcons.fa_refresh));
    }

    public final void h(Menu menu) {
        menu.findItem(R.id.item_go_homepage).setIcon(a(17170443, FontAwesomeIcons.fa_home));
    }
}
