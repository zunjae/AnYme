package com.zunjae.anyme.activities.misc;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class b implements OnCheckedChangeListener {
    final /* synthetic */ BulkDeleteActivity a;
    final /* synthetic */ BulkDeleteActivity_ViewBinding b;

    b(BulkDeleteActivity_ViewBinding bulkDeleteActivity_ViewBinding, BulkDeleteActivity bulkDeleteActivity) {
        this.b = bulkDeleteActivity_ViewBinding;
        this.a = bulkDeleteActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.applyFilter();
    }
}
