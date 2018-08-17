package com.miguelcatalan.materialsearchview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;

public final class l extends BaseAdapter implements Filterable {
    private ArrayList<String> a = new ArrayList();
    private String[] b;
    private Drawable c;
    private LayoutInflater d;
    private boolean e;

    public l(Context context, String[] strArr, Drawable drawable, boolean z) {
        this.d = LayoutInflater.from(context);
        this.b = strArr;
        this.c = drawable;
        this.e = z;
    }

    public final int getCount() {
        return this.a.size();
    }

    public final Filter getFilter() {
        return new m(this);
    }

    public final Object getItem(int i) {
        return this.a.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        n nVar;
        if (view == null) {
            view = this.d.inflate(R.layout.suggest_item, viewGroup, false);
            nVar = new n(this, view);
            view.setTag(nVar);
        } else {
            nVar = (n) view.getTag();
        }
        nVar.a.setText((String) getItem(i));
        if (this.e) {
            nVar.a.setSingleLine();
            nVar.a.setEllipsize(TruncateAt.END);
        }
        return view;
    }
}
