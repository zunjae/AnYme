package defpackage;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.zunjae.anyme.fragments.FragmentNoKanon;
import com.zunjae.anyme.fragments.FragmentWaifus;
import com.zunjae.anyme.rewrite.ui.fragments.FragmentAnimeListR2;
import mehdi.sakout.fancybuttons.R;

public final class ajj extends FragmentStatePagerAdapter {
    private static final String a = "ajj";
    private final int b = 2;

    public ajj(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public final int getCount() {
        return 2;
    }

    public final Fragment getItem(int i) {
        switch (i) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                return FragmentAnimeListR2.a(7);
            case tw.a /*1*/:
                return anq.a() ? FragmentWaifus.a() : FragmentNoKanon.a("To keep track of your favorite characters you need to be logged in through Kanon!");
            case tw.b /*2*/:
                return FragmentAnimeListR2.a(6);
            default:
                throw new IndexOutOfBoundsException("No Fragment found for position ".concat(String.valueOf(i)));
        }
    }

    @SuppressLint({"DefaultLocale"})
    public final CharSequence getPageTitle(int i) {
        switch (i) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                return "Highly Rated";
            case tw.a /*1*/:
                return "Waifus";
            case tw.b /*2*/:
                return "Favorites";
            default:
                StringBuilder stringBuilder = new StringBuilder("No title specified for this Fragment (position ");
                stringBuilder.append(i);
                stringBuilder.append(")");
                throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }
}
