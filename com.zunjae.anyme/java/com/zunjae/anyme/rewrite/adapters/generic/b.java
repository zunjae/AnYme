package com.zunjae.anyme.rewrite.adapters.generic;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mikepenz.iconics.view.IconicsTextView;

public abstract class b extends ViewHolder {
    b(View view) {
        super(view);
    }

    public abstract ViewGroup a();

    public abstract IconicsTextView b();

    public abstract ImageView c();

    public abstract TextView d();

    public abstract IconicsTextView e();

    public abstract IconicsTextView f();
}
