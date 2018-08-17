package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

public final class ahz extends ahw {
    public ahz(Paint paint, ahq ahq) {
        super(paint, ahq);
    }

    public final void a(Canvas canvas, agf agf, int i, int i2) {
        if (agf instanceof agh) {
            float a;
            agh agh = (agh) agf;
            int i3 = this.b.i();
            int j = this.b.j();
            float a2 = (float) this.b.a();
            this.a.setColor(i3);
            canvas.drawCircle((float) i, (float) i2, a2, this.a);
            this.a.setColor(j);
            if (this.b.s() == ahr.HORIZONTAL) {
                a = (float) agh.a();
                i2 = agh.b();
            } else {
                a = (float) agh.b();
                i2 = agh.a();
            }
            canvas.drawCircle(a, (float) i2, (float) agh.c(), this.a);
        }
    }
}
