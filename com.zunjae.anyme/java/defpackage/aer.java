package defpackage;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.p;

final class aer implements p {
    final /* synthetic */ aeq a;

    aer(aeq aeq) {
        this.a = aeq;
    }

    public final boolean onItemClick(View view, int i, afi afi) {
        if ((afi instanceof aed) && afi.d()) {
            aed aed = (aed) afi;
            if (aed.b() != null) {
                ViewPropertyAnimatorCompat animate;
                int i2;
                if (aed.a()) {
                    animate = ViewCompat.animate(view.findViewById(R.id.material_drawer_arrow));
                    i2 = this.a.z;
                } else {
                    animate = ViewCompat.animate(view.findViewById(R.id.material_drawer_arrow));
                    i2 = this.a.b;
                }
                animate.rotation((float) i2).start();
            }
        }
        return this.a.A != null && this.a.A.onItemClick(view, i, afi);
    }
}
