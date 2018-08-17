package com.zunjae.anyme.activities.misc;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import butterknife.Unbinder;
import com.zunjae.anyme.R;
import defpackage.ct;

public final class BulkDeleteActivity_ViewBinding implements Unbinder {
    private BulkDeleteActivity b;
    private View c;
    private View d;
    private View e;

    public BulkDeleteActivity_ViewBinding(BulkDeleteActivity bulkDeleteActivity, View view) {
        this.b = bulkDeleteActivity;
        bulkDeleteActivity.recyclerView = (RecyclerView) ct.a(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        bulkDeleteActivity.toolbar = (Toolbar) ct.a(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        View a = ct.a(view, R.id.filterLongTimeNotUpdated, "field 'longTimeNotUpdatedCheckBox' and method 'applyFilter'");
        bulkDeleteActivity.longTimeNotUpdatedCheckBox = (CheckBox) ct.b(a, R.id.filterLongTimeNotUpdated, "field 'longTimeNotUpdatedCheckBox'", CheckBox.class);
        this.c = a;
        ((CompoundButton) a).setOnCheckedChangeListener(new b(this, bulkDeleteActivity));
        a = ct.a(view, R.id.filterUnwatchedOnly, "field 'unwatchedOnlyCheckBox' and method 'applyFilter'");
        bulkDeleteActivity.unwatchedOnlyCheckBox = (CheckBox) ct.b(a, R.id.filterUnwatchedOnly, "field 'unwatchedOnlyCheckBox'", CheckBox.class);
        this.d = a;
        ((CompoundButton) a).setOnCheckedChangeListener(new c(this, bulkDeleteActivity));
        view = ct.a(view, R.id.filterSpecial, "field 'filterSpecialsCheckbox' and method 'applyFilter'");
        bulkDeleteActivity.filterSpecialsCheckbox = (CheckBox) ct.b(view, R.id.filterSpecial, "field 'filterSpecialsCheckbox'", CheckBox.class);
        this.e = view;
        ((CompoundButton) view).setOnCheckedChangeListener(new d(this, bulkDeleteActivity));
    }

    public final void a() {
        BulkDeleteActivity bulkDeleteActivity = this.b;
        if (bulkDeleteActivity != null) {
            this.b = null;
            bulkDeleteActivity.recyclerView = null;
            bulkDeleteActivity.toolbar = null;
            bulkDeleteActivity.longTimeNotUpdatedCheckBox = null;
            bulkDeleteActivity.unwatchedOnlyCheckBox = null;
            bulkDeleteActivity.filterSpecialsCheckbox = null;
            ((CompoundButton) this.c).setOnCheckedChangeListener(null);
            this.c = null;
            ((CompoundButton) this.d).setOnCheckedChangeListener(null);
            this.d = null;
            ((CompoundButton) this.e).setOnCheckedChangeListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
