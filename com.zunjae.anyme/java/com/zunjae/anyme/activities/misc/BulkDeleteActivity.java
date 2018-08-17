package com.zunjae.anyme.activities.misc;

import android.annotation.SuppressLint;
import android.arch.lifecycle.as;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.adapters.animes.AnimeBulkDeleteAdapter;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.anyme.services.BulkDeleteAnimeService;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.aiv;
import defpackage.amr;
import defpackage.ams;
import defpackage.amt;
import defpackage.are;
import defpackage.aui;
import defpackage.aul;
import java.util.ArrayList;
import java.util.List;

public final class BulkDeleteActivity extends AbstractActivity {
    private AnimeBulkDeleteAdapter c;
    private j d;
    private AnimeViewModel e;
    @BindView
    CheckBox filterSpecialsCheckbox;
    @BindView
    CheckBox longTimeNotUpdatedCheckBox;
    @BindView
    RecyclerView recyclerView;
    @BindView
    Toolbar toolbar;
    @BindView
    CheckBox unwatchedOnlyCheckBox;

    private /* synthetic */ void a(int i) {
        if (i > 0) {
            this.toolbar.setSubtitle(String.format("Selected: %d Anime", new Object[]{Integer.valueOf(i)}));
            return;
        }
        this.toolbar.setSubtitle(null);
    }

    private /* synthetic */ void a(j jVar, e eVar) {
        BulkDeleteAnimeService.a = false;
        jVar = this.d;
        if (jVar != null && !jVar.isShowing()) {
            this.d.dismiss();
            this.d = null;
        }
    }

    private /* synthetic */ void a(ArrayList arrayList, j jVar, e eVar) {
        BulkDeleteAnimeService.a = true;
        startService(BulkDeleteAnimeService.a(this.b, arrayList));
        this.c.b();
    }

    private /* synthetic */ void a(List list) {
        if (list != null) {
            this.c.a(list);
            applyFilter();
        }
    }

    @OnCheckedChanged
    public final void applyFilter() {
        AnimeBulkDeleteAdapter animeBulkDeleteAdapter = this.c;
        if (animeBulkDeleteAdapter != null) {
            animeBulkDeleteAdapter.a(this.longTimeNotUpdatedCheckBox.isChecked(), this.unwatchedOnlyCheckBox.isChecked(), this.filterSpecialsCheckbox.isChecked());
        }
    }

    @SuppressLint({"DefaultLocale"})
    @aiv
    public final void onAnimeDeletedProgress(ams ams) {
        setResult(1);
        j jVar = this.d;
        if (jVar == null) {
            this.d = new o(this).a((CharSequence) "Deleting...").g().b(String.format("Deleting %s\n(%d/%d)", new Object[]{ams.a(), Integer.valueOf(ams.b()), Integer.valueOf(ams.c())})).d("Cancel").c(new -$$Lambda$BulkDeleteActivity$4iLvxb5awvt4ReEv9y_XtNLozpg(this)).h().k();
            this.d.setCanceledOnTouchOutside(false);
            this.d.show();
        } else {
            jVar.a(String.format("Deleted %s\n(%d/%d)\n\nETA: %ds", new Object[]{ams.a(), Integer.valueOf(ams.b()), Integer.valueOf(ams.c()), Integer.valueOf(ams.d())}));
        }
        if (ams.b() == ams.c()) {
            j jVar2 = this.d;
            if (jVar2 != null && jVar2.isShowing()) {
                this.d.dismiss();
                this.d = null;
            }
        }
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_bulk_delete);
        ButterKnife.a(this);
        c(this.toolbar);
        this.e = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        this.c = new AnimeBulkDeleteAdapter(this, new -$$Lambda$BulkDeleteActivity$zvaD18kU0BGI7dkmcgIByI7PAvY(this));
        new b(this, this.recyclerView, this.c).a(2, 2).b(a.b).a();
        this.e.e().observe(this, new -$$Lambda$BulkDeleteActivity$SBAD0MMjgpRpH8eazVuGavEWPUQ(this));
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_bulk_delete, menu);
        new aul(this.b).f(menu);
        return true;
    }

    @aiv
    public final void onFailure(amt amt) {
        Toast.makeText(this.b, amt.a(), 0).show();
    }

    @SuppressLint({"DefaultLocale"})
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        AnimeBulkDeleteAdapter animeBulkDeleteAdapter;
        if (itemId == R.id.item_delete) {
            animeBulkDeleteAdapter = this.c;
            if (animeBulkDeleteAdapter != null) {
                List<are> c = animeBulkDeleteAdapter.c();
                if (c.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (are d : c) {
                        arrayList.add(Integer.valueOf(d.d()));
                    }
                    new o(this).a((CharSequence) "Are you sure?").b(String.format("You're about to delete %d show(s)", new Object[]{Integer.valueOf(arrayList.size())})).c((CharSequence) "DELETE").e("Cancel").a(new -$$Lambda$BulkDeleteActivity$q3S8q8XcEPO8ey0OwS-Kx3dAdQQ(this, arrayList)).l();
                } else {
                    Toast.makeText(this.b, "No Anime selected", 0).show();
                }
            }
        } else if (itemId == R.id.item_select_all) {
            animeBulkDeleteAdapter = this.c;
            if (animeBulkDeleteAdapter != null) {
                if (animeBulkDeleteAdapter.c().size() == this.c.d().size()) {
                    this.c.b();
                } else {
                    this.c.a();
                }
                this.toolbar.setSubtitle(String.format("Selected: %d Anime", new Object[]{Integer.valueOf(this.c.c().size())}));
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @aiv
    public final void onServiceFinished(amr amr) {
    }

    public final void onStart() {
        super.onStart();
        aui.a().a((Object) this);
    }

    public final void onStop() {
        super.onStop();
        aui.a().b((Object) this);
    }
}
