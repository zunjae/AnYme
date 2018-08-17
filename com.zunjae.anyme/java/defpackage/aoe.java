package defpackage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.zunjae.anyme.rewrite.ui.fragments.FragmentAnimeInfoR2;
import com.zunjae.anyme.rewrite.ui.fragments.FragmentEpisodeNotesR2;
import java.util.ArrayList;

public final class aoe extends FragmentStatePagerAdapter {
    private final ArrayList<alh> a = new ArrayList();
    private FragmentAnimeInfoR2 b;
    private FragmentEpisodeNotesR2 c;

    public aoe(FragmentManager fragmentManager, arn arn, art art) {
        super(fragmentManager);
        this.b = FragmentAnimeInfoR2.a(arn, art);
        this.c = FragmentEpisodeNotesR2.a(arn.a());
        this.a.add(new alh(this.b, "Main"));
        this.a.add(new alh(this.c, "Notes"));
    }

    public final boolean a() {
        FragmentAnimeInfoR2 fragmentAnimeInfoR2 = this.b;
        return fragmentAnimeInfoR2 != null && fragmentAnimeInfoR2.a();
    }

    public final void b() {
        FragmentAnimeInfoR2 fragmentAnimeInfoR2 = this.b;
        if (fragmentAnimeInfoR2 != null) {
            fragmentAnimeInfoR2.b();
        }
    }

    public final int getCount() {
        return this.a.size();
    }

    public final Fragment getItem(int i) {
        return ((alh) this.a.get(i)).a();
    }

    public final CharSequence getPageTitle(int i) {
        return ((alh) this.a.get(i)).b();
    }
}
