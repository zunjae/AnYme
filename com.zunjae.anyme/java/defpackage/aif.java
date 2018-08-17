package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public final class aif extends aig {
    public aif(Paint paint, ahq ahq) {
        super(paint, ahq);
    }

    public final void a(Canvas canvas, agf agf, int i, int i2) {
        if (agf instanceof agm) {
            RectF rectF;
            float f;
            agm agm = (agm) agf;
            int b = agm.b();
            int c = agm.c();
            int a = agm.a() / 2;
            int a2 = this.b.a();
            int i3 = this.b.i();
            int j = this.b.j();
            if (this.b.s() == ahr.HORIZONTAL) {
                rectF = this.c;
                rectF.left = (float) b;
                rectF.right = (float) c;
                rectF.top = (float) (i2 - a);
                f = (float) (a + i2);
            } else {
                rectF = this.c;
                rectF.left = (float) (i - a);
                rectF.right = (float) (a + i);
                rectF.top = (float) b;
                f = (float) c;
            }
            rectF.bottom = f;
            this.a.setColor(i3);
            f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) a2;
            canvas.drawCircle(f, f2, f3, this.a);
            this.a.setColor(j);
            canvas.drawRoundRect(this.c, f3, f3, this.a);
        }
    }
}
