package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import java.util.HashSet;

@TargetApi(11)
public final class lr extends Fragment {
    private final lg a;
    private final lu b;
    private di c;
    private final HashSet<lr> d;
    private lr e;

    public lr() {
        this(new lg());
    }

    @SuppressLint({"ValidFragment"})
    private lr(lg lgVar) {
        this.b = new ls();
        this.d = new HashSet();
        this.a = lgVar;
    }

    final lg a() {
        return this.a;
    }

    public final void a(di diVar) {
        this.c = diVar;
    }

    public final di b() {
        return this.c;
    }

    public final lu c() {
        return this.b;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.e = lt.a().a(getActivity().getFragmentManager());
        lr lrVar = this.e;
        if (lrVar != this) {
            lrVar.d.add(this);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.a.c();
    }

    public final void onDetach() {
        super.onDetach();
        lr lrVar = this.e;
        if (lrVar != null) {
            lrVar.d.remove(this);
            this.e = null;
        }
    }

    public final void onLowMemory() {
        di diVar = this.c;
        if (diVar != null) {
            diVar.a();
        }
    }

    public final void onStart() {
        super.onStart();
        this.a.a();
    }

    public final void onStop() {
        super.onStop();
        this.a.b();
    }

    public final void onTrimMemory(int i) {
        di diVar = this.c;
        if (diVar != null) {
            diVar.a(i);
        }
    }
}
