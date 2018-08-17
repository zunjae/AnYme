package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class qi implements OnClickListener {
    final /* synthetic */ ql a;

    qi(ql qlVar) {
        this.a = qlVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(false);
        dialogInterface.dismiss();
    }
}
