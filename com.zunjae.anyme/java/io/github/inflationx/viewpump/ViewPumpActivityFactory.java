package io.github.inflationx.viewpump;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

interface ViewPumpActivityFactory {
    View onActivityCreateView(View view, View view2, String str, Context context, AttributeSet attributeSet);
}
