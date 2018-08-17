package defpackage;

import android.view.View;
import com.mikepenz.materialdrawer.p;

final class aef implements p {
    final /* synthetic */ aeh a;
    final /* synthetic */ aee b;

    aef(aee aee, aeh aeh) {
        this.b = aee;
        this.a = aeh;
    }

    public final boolean onItemClick(View view, int i, afi afi) {
        if (!this.b.f()) {
            aee aee = this.b;
            aee.b = aee.b ^ 1;
            this.a.e.setChecked(this.b.b);
        }
        return false;
    }
}
