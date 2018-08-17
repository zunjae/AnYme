package com.afollestad.materialdialogs;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.CompoundButton;
import android.widget.TextView;

final class c extends ViewHolder implements OnClickListener, OnLongClickListener {
    final CompoundButton a;
    final TextView b;
    final a c;

    c(View view, a aVar) {
        super(view);
        this.a = (CompoundButton) view.findViewById(R.id.md_control);
        this.b = (TextView) view.findViewById(R.id.md_title);
        this.c = aVar;
        view.setOnClickListener(this);
        if (aVar.a.b.E != null) {
            view.setOnLongClickListener(this);
        }
    }

    public final void onClick(View view) {
        if (this.c.d != null && getAdapterPosition() != -1) {
            if (this.c.a.b.l != null && getAdapterPosition() < this.c.a.b.l.size()) {
                this.c.a.b.l.get(getAdapterPosition());
            }
            d b = this.c.d;
            this.c.a;
            b.a(view, getAdapterPosition(), false);
        }
    }

    public final boolean onLongClick(View view) {
        if (this.c.d == null || getAdapterPosition() == -1) {
            return false;
        }
        if (this.c.a.b.l != null && getAdapterPosition() < this.c.a.b.l.size()) {
            this.c.a.b.l.get(getAdapterPosition());
        }
        d b = this.c.d;
        this.c.a;
        return b.a(view, getAdapterPosition(), true);
    }
}
