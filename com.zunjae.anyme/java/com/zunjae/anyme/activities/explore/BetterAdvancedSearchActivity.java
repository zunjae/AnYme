package com.zunjae.anyme.activities.explore;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import defpackage.aml;
import defpackage.amn;
import defpackage.amo;
import defpackage.amp;
import defpackage.anl;
import java.util.ArrayList;
import java.util.Collection;

public final class BetterAdvancedSearchActivity extends AbstractActivity {
    private final String c = getClass().getSimpleName();
    private ArrayList<aml> d = new ArrayList();
    private Integer[] e;

    private /* synthetic */ boolean a(ArrayList arrayList, j jVar, View view, int i, CharSequence charSequence) {
        TextView textView = (TextView) findViewById(R.id.ratingText);
        StringBuilder stringBuilder = new StringBuilder("Selected: ");
        stringBuilder.append(((amn) arrayList.get(i)).a());
        textView.setText(stringBuilder.toString());
        return false;
    }

    private /* synthetic */ boolean a(ArrayList arrayList, j jVar, Integer[] numArr, CharSequence[] charSequenceArr) {
        this.e = numArr;
        for (Integer intValue : numArr) {
            this.d.add(arrayList.get(intValue.intValue()));
        }
        ((TextView) findViewById(R.id.textSelectedGenres)).setText(String.format("selected %d genre(s)", new Object[]{Integer.valueOf(numArr.length)}));
        return true;
    }

    private /* synthetic */ boolean b(ArrayList arrayList, j jVar, View view, int i, CharSequence charSequence) {
        TextView textView = (TextView) findViewById(R.id.scoreText);
        StringBuilder stringBuilder = new StringBuilder("Minimum: ");
        stringBuilder.append(((amo) arrayList.get(i)).b());
        textView.setText(stringBuilder.toString());
        return false;
    }

    private /* synthetic */ boolean c(ArrayList arrayList, j jVar, View view, int i, CharSequence charSequence) {
        TextView textView = (TextView) findViewById(R.id.statusText);
        StringBuilder stringBuilder = new StringBuilder("Selected: ");
        stringBuilder.append(((amp) arrayList.get(i)).a());
        textView.setText(stringBuilder.toString());
        return false;
    }

    @OnClick
    public final void onCardViewGenreClicked() {
        Collection a = aml.a(anl.b(this.b));
        new o(this).a((CharSequence) "Pick Some Genres").a(a).a(this.e, new -$$Lambda$BetterAdvancedSearchActivity$ipbdGZKMRCBySf0gt2yNpIxVnvI(this, a)).d().l();
    }

    @OnClick
    public final void onCardViewRatingClicked() {
        boolean a = anl.a(this.b);
        Collection arrayList = new ArrayList();
        arrayList.add(new amn(1, "G - All Ages"));
        arrayList.add(new amn(2, "PG - Children"));
        arrayList.add(new amn(3, "PG-13 - Teen 13 or older"));
        arrayList.add(new amn(4, "R - 17+ (violence & profanity)"));
        arrayList.add(new amn(5, "R+ - Mild Nudity"));
        if (a) {
            arrayList.add(new amn(6, "Rx - Hentai"));
        }
        new o(this).a((CharSequence) "Pick A Rating").a(arrayList).a(new -$$Lambda$BetterAdvancedSearchActivity$JRlHQlSrFPa4bJqZIsYGV8t6uZY(this, arrayList)).d().l();
    }

    @OnClick
    public final void onCardViewScoreClicked() {
        Collection a = amo.a();
        new o(this).a((CharSequence) "Pick A Minimum Score").a(a).a(new -$$Lambda$BetterAdvancedSearchActivity$LLmOHuBEsZ9Kk52Om8WjMGgyIKE(this, a)).d().l();
    }

    @OnClick
    public final void onCardViewStatusClicked() {
        Collection b = amp.b();
        new o(this).a((CharSequence) "Pick A Status").a(b).a(new -$$Lambda$BetterAdvancedSearchActivity$j6lz_1IgckG_T0eJnNpAOpaNsck(this, b)).d().l();
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_better_advanced_search);
        ButterKnife.a(this);
    }
}
