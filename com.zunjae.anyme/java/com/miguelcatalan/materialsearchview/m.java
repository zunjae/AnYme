package com.miguelcatalan.materialsearchview;

import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;
import java.util.List;

final class m extends Filter {
    final /* synthetic */ l a;

    m(l lVar) {
        this.a = lVar;
    }

    protected final FilterResults performFiltering(CharSequence charSequence) {
        FilterResults filterResults = new FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            List arrayList = new ArrayList();
            for (String str : this.a.b) {
                if (str.toLowerCase().startsWith(charSequence.toString().toLowerCase())) {
                    arrayList.add(str);
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
        }
        return filterResults;
    }

    protected final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Object obj = filterResults.values;
        if (obj != null) {
            this.a.a = (ArrayList) obj;
            this.a.notifyDataSetChanged();
        }
    }
}
