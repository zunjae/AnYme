package mehdi.sakout.fancybuttons;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

@TargetApi(21)
final class a extends ViewOutlineProvider {
    int a;
    int b;
    final /* synthetic */ FancyButton c;

    a(FancyButton fancyButton, int i, int i2) {
        this.c = fancyButton;
        this.a = i;
        this.b = i2;
    }

    public final void getOutline(View view, Outline outline) {
        if (this.c.x == 0) {
            outline.setRect(0, 10, this.a, this.b);
            return;
        }
        outline.setRoundRect(0, 10, this.a, this.b, (float) this.c.x);
    }
}
