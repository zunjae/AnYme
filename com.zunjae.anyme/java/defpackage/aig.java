package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class aig extends ahw {
    public RectF c = new RectF();

    public aig(Paint paint, ahq ahq) {
        super(paint, ahq);
    }

    public void a(Canvas canvas, agf agf, int i, int i2) {
        if (agf instanceof agn) {
            RectF rectF;
            agn agn = (agn) agf;
            int b = agn.b();
            int c = agn.c();
            int a = this.b.a();
            int i3 = this.b.i();
            int j = this.b.j();
            if (this.b.s() == ahr.HORIZONTAL) {
                rectF = this.c;
                rectF.left = (float) b;
                rectF.right = (float) c;
                rectF.top = (float) (i2 - a);
                c = i2 + a;
            } else {
                rectF = this.c;
                rectF.left = (float) (i - a);
                rectF.right = (float) (i + a);
                rectF.top = (float) b;
            }
            rectF.bottom = (float) c;
            this.a.setColor(i3);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) a;
            canvas.drawCircle(f, f2, f3, this.a);
            this.a.setColor(j);
            canvas.drawRoundRect(this.c, f3, f3, this.a);
        }
    }
}
