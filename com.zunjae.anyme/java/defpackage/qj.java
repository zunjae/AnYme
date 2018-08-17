package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class qj implements OnClickListener {
    final /* synthetic */ qk a;
    final /* synthetic */ ql b;

    qj(qk qkVar, ql qlVar) {
        this.a = qkVar;
        this.b = qlVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a();
        this.b.a(true);
        dialogInterface.dismiss();
    }
}
