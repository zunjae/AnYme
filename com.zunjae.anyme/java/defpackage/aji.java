package defpackage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.zunjae.anyme.fragments.anime.FragmentAnimeCategory;
import com.zunjae.anyme.fragments.anime.FragmentAnimeDiscover;
import mehdi.sakout.fancybuttons.R;

public final class aji extends FragmentStatePagerAdapter {
    private final int a = 2;

    public aji(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public final int getCount() {
        return 2;
    }

    public final Fragment getItem(int i) {
        switch (i) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                return new FragmentAnimeDiscover();
            case tw.a /*1*/:
                return new FragmentAnimeCategory();
            default:
                throw new IndexOutOfBoundsException("No Fragment found for position ".concat(String.valueOf(i)));
        }
    }

    public final CharSequence getPageTitle(int i) {
        switch (i) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                return "Top";
            case tw.a /*1*/:
                return "Categories";
            default:
                StringBuilder stringBuilder = new StringBuilder("No title specified for this Fragment (position ");
                stringBuilder.append(i);
                stringBuilder.append(")");
                throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }
}
