package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.animation.AnimationUtils;
import com.zunjae.anyme.R;

public final class atn {
    public static void a(Context context, RecyclerView recyclerView) {
        recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_fall_down));
        recyclerView.scheduleLayoutAnimation();
    }
}
