package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class aeg implements OnCheckedChangeListener {
    final /* synthetic */ aee a;

    aeg(aee aee) {
        this.a = aee;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.a.d()) {
            this.a.b = z;
            if (this.a.n() != null) {
                this.a.n().a(z);
                return;
            }
        }
        compoundButton.setOnCheckedChangeListener(null);
        compoundButton.setChecked(z ^ 1);
        compoundButton.setOnCheckedChangeListener(this.a.A);
    }
}
