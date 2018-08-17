package defpackage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.zunjae.anyme.rewrite.ui.fragments.FragmentAnimeListR2;
import java.util.ArrayList;

public final class aof extends FragmentStatePagerAdapter {
    private final ArrayList<alh> a = new ArrayList();

    public aof(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.a.add(new alh(FragmentAnimeListR2.a(1), "Watching"));
        this.a.add(new alh(FragmentAnimeListR2.a(2), "Plan To Watch"));
        this.a.add(new alh(FragmentAnimeListR2.a(3), "On Hold"));
        this.a.add(new alh(FragmentAnimeListR2.a(4), "Completed"));
        this.a.add(new alh(FragmentAnimeListR2.a(5), "Dropped"));
        this.a.add(new alh(FragmentAnimeListR2.a(0), "All"));
    }

    public final String a(int i) {
        return ((alh) this.a.get(i)).b();
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
