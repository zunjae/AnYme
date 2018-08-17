package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mikepenz.fastadapter.u;
import com.mikepenz.materialdrawer.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class aed<T, VH extends ViewHolder> implements afi<T, VH>, afl<T> {
    private afi a;
    private boolean b = false;
    protected long c = -1;
    protected Object d;
    protected boolean e = true;
    protected boolean f = false;
    protected boolean g = true;
    protected boolean h = true;
    public p i = null;
    protected afk j = null;
    protected List<afi> k;

    public abstract VH a(View view);

    public final VH a(ViewGroup viewGroup) {
        return a(LayoutInflater.from(viewGroup.getContext()).inflate(i(), viewGroup, false));
    }

    public final View a(Context context, ViewGroup viewGroup) {
        ViewHolder a = a(LayoutInflater.from(context).inflate(i(), viewGroup, false));
        a(a, Collections.emptyList());
        return a.itemView;
    }

    public final T a(long j) {
        this.c = j;
        return this;
    }

    public T a(p pVar) {
        this.i = pVar;
        return this;
    }

    public final T a(boolean z) {
        this.b = z;
        return this;
    }

    public final T a(afi... afiArr) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        for (afi a : afiArr) {
            a.a(this);
        }
        Collections.addAll(this.k, afiArr);
        return this;
    }

    public void a(VH vh, List<Object> list) {
        vh.itemView.setTag(this);
    }

    public final boolean a() {
        return this.b;
    }

    public final T b(boolean z) {
        this.f = z;
        return this;
    }

    public final List<afi> b() {
        return this.k;
    }

    public final long c() {
        return this.c;
    }

    public final T c(boolean z) {
        this.e = z;
        return this;
    }

    public boolean d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                if (this.c == ((aed) obj).c) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean f() {
        return this.g;
    }

    public final /* bridge */ /* synthetic */ u h() {
        return this.a;
    }

    public int hashCode() {
        return Long.valueOf(this.c).hashCode();
    }

    public T j() {
        this.g = false;
        return this;
    }

    public final T k() {
        this.h = false;
        return this;
    }

    public final boolean l() {
        return this.h;
    }

    public p m() {
        return this.i;
    }
}
