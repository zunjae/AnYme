package io.github.inflationx.viewpump;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public interface FallbackViewCreator {
    View onCreateView(View view, String str, Context context, AttributeSet attributeSet);
}
