package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

public final class aid extends ahw {
    public aid(Paint paint, ahq ahq) {
        super(paint, ahq);
    }

    public final void a(Canvas canvas, agf agf, int i, int i2) {
        if (agf instanceof agk) {
            int a = ((agk) agf).a();
            int i3 = this.b.i();
            int j = this.b.j();
            int a2 = this.b.a();
            this.a.setColor(i3);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) a2;
            canvas.drawCircle(f, f2, f3, this.a);
            this.a.setColor(j);
            if (this.b.s() == ahr.HORIZONTAL) {
                canvas.drawCircle((float) a, f2, f3, this.a);
            } else {
                canvas.drawCircle(f, (float) a, f3, this.a);
            }
        }
    }
}
