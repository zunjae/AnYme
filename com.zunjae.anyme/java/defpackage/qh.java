package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class qh implements OnClickListener {
    final /* synthetic */ ql a;

    qh(ql qlVar) {
        this.a = qlVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(true);
        dialogInterface.dismiss();
    }
}
