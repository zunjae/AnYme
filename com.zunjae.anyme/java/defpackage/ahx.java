package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;

public final class ahx extends ahw {
    private Paint c = new Paint();

    public ahx(Paint paint, ahq ahq) {
        super(paint, ahq);
        this.c.setStyle(Style.STROKE);
        this.c.setAntiAlias(true);
        this.c.setStrokeWidth((float) ahq.g());
    }

    public final void a(Canvas canvas, int i, boolean z, int i2, int i3) {
        Paint paint;
        float a = (float) this.b.a();
        int g = this.b.g();
        float h = this.b.h();
        int j = this.b.j();
        int i4 = this.b.i();
        int o = this.b.o();
        ago t = this.b.t();
        if (t != ago.SCALE || z) {
            if (t == ago.SCALE_DOWN && z) {
            }
            if (i == o) {
                j = i4;
            }
            if (t == ago.FILL || i == o) {
                paint = this.a;
            } else {
                paint = this.c;
                paint.setStrokeWidth((float) g);
            }
            paint.setColor(j);
            canvas.drawCircle((float) i2, (float) i3, a, paint);
        }
        a *= h;
        if (i == o) {
            j = i4;
        }
        if (t == ago.FILL) {
        }
        paint = this.a;
        paint.setColor(j);
        canvas.drawCircle((float) i2, (float) i3, a, paint);
    }
}
