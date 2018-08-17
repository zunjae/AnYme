package defpackage;

import android.widget.ImageView;

public final class nb extends nc<js> {
    private int b;
    private js c;

    public nb(ImageView imageView) {
        this(imageView, (byte) 0);
    }

    private nb(ImageView imageView, byte b) {
        super(imageView);
        this.b = -1;
    }

    protected final /* synthetic */ void a(Object obj) {
        ((ImageView) this.a).setImageDrawable((js) obj);
    }

    public final /* synthetic */ void a(Object obj, mq mqVar) {
        js jsVar = (js) obj;
        if (!jsVar.a()) {
            float intrinsicWidth = ((float) jsVar.getIntrinsicWidth()) / ((float) jsVar.getIntrinsicHeight());
            if (Math.abs((((float) ((ImageView) this.a).getWidth()) / ((float) ((ImageView) this.a).getHeight())) - 1.0f) <= 0.05f && Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                jsVar = new ng(jsVar, ((ImageView) this.a).getWidth());
            }
        }
        super.a(jsVar, mqVar);
        this.c = jsVar;
        jsVar.a(this.b);
        jsVar.start();
    }

    public final void b() {
        js jsVar = this.c;
        if (jsVar != null) {
            jsVar.start();
        }
    }

    public final void c() {
        js jsVar = this.c;
        if (jsVar != null) {
            jsVar.stop();
        }
    }
}
