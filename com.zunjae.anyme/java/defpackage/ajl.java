package defpackage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.zunjae.anyme.fragments.FragmentLiveChart;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.R;

public final class ajl extends FragmentStatePagerAdapter {
    private final ArrayList<alh> a = new ArrayList();

    public ajl(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.a.add(new alh(FragmentLiveChart.a(100), "all"));
        this.a.add(new alh(FragmentLiveChart.a((int) R.styleable.AppCompatTheme_textAppearanceSearchResultTitle), "My Shows"));
        this.a.add(new alh(FragmentLiveChart.a((int) R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu), "Monday"));
        this.a.add(new alh(FragmentLiveChart.a((int) R.styleable.AppCompatTheme_textColorAlertDialogListItem), "Tuesday"));
        this.a.add(new alh(FragmentLiveChart.a((int) R.styleable.AppCompatTheme_textColorSearchUrl), "Wednesday"));
        this.a.add(new alh(FragmentLiveChart.a((int) R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), "Thursday"));
        this.a.add(new alh(FragmentLiveChart.a((int) R.styleable.AppCompatTheme_toolbarStyle), "Friday"));
        this.a.add(new alh(FragmentLiveChart.a((int) R.styleable.AppCompatTheme_tooltipForegroundColor), "Saturday"));
        this.a.add(new alh(FragmentLiveChart.a((int) R.styleable.AppCompatTheme_tooltipFrameBackground), "Sunday"));
    }

    public final int a(String str) {
        for (int i = 0; i < this.a.size(); i++) {
            if (((alh) this.a.get(i)).b().equalsIgnoreCase(str)) {
                return i;
            }
        }
        return 0;
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
