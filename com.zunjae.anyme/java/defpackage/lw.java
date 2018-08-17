package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v4.app.Fragment;
import java.util.HashSet;

public final class lw extends Fragment {
    private di a;
    private final lg b;
    private final lu c;
    private final HashSet<lw> d;
    private lw e;

    public lw() {
        this(new lg());
    }

    @SuppressLint({"ValidFragment"})
    private lw(lg lgVar) {
        this.c = new lx();
        this.d = new HashSet();
        this.b = lgVar;
    }

    final lg a() {
        return this.b;
    }

    public final void a(di diVar) {
        this.a = diVar;
    }

    public final di b() {
        return this.a;
    }

    public final lu c() {
        return this.c;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.e = lt.a().a(getActivity().getSupportFragmentManager());
        lw lwVar = this.e;
        if (lwVar != this) {
            lwVar.d.add(this);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    public final void onDetach() {
        super.onDetach();
        lw lwVar = this.e;
        if (lwVar != null) {
            lwVar.d.remove(this);
            this.e = null;
        }
    }

    public final void onLowMemory() {
        super.onLowMemory();
        di diVar = this.a;
        if (diVar != null) {
            diVar.a();
        }
    }

    public final void onStart() {
        super.onStart();
        this.b.a();
    }

    public final void onStop() {
        super.onStop();
        this.b.b();
    }
}
