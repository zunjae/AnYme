package defpackage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.zunjae.anyme.fragments.anime.FragmentAnimeGenre;
import java.util.ArrayList;

public final class ajk extends FragmentStatePagerAdapter {
    private final int a = 3;
    private final ArrayList<alh> b = new ArrayList();

    public ajk(FragmentManager fragmentManager, aml aml) {
        super(fragmentManager);
        for (int i = 1; i <= 3; i++) {
            this.b.add(new alh(FragmentAnimeGenre.a(aml, i), String.format("Page %d", new Object[]{Integer.valueOf(i)})));
        }
    }

    public final int getCount() {
        return this.b.size();
    }

    public final Fragment getItem(int i) {
        return ((alh) this.b.get(i)).a();
    }

    public final CharSequence getPageTitle(int i) {
        return ((alh) this.b.get(i)).b();
    }
}
