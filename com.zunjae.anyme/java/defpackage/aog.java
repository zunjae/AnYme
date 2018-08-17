package defpackage;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.zunjae.anyme.R;
import com.zunjae.anyme.rewrite.ui.fragments.g;
import java.util.ArrayList;

public final class aog extends FragmentStatePagerAdapter {
    private final ArrayList<alh> a = new ArrayList();

    public aog(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.a.add(new alh(g.a(context.getString(R.string.welcome_screen_one), "https://i.imgur.com/itFZGxB.png")));
        this.a.add(new alh(g.a(context.getString(R.string.welcome_screen_one), "https://i.imgur.com/itFZGxB.png")));
        this.a.add(new alh(g.a(context.getString(R.string.welcome_screen_one), "https://i.imgur.com/itFZGxB.png")));
        this.a.add(new alh(g.a(context.getString(R.string.welcome_screen_one), "https://i.imgur.com/itFZGxB.png")));
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
