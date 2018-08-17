package io.github.inflationx.viewpump;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

public final class ViewPumpContextWrapper extends ContextWrapper {
    private ViewPumpLayoutInflater mInflater;

    private ViewPumpContextWrapper(Context context) {
        super(context);
    }

    static ViewPumpActivityFactory get(Activity activity) {
        if (activity.getLayoutInflater() instanceof ViewPumpLayoutInflater) {
            return (ViewPumpActivityFactory) activity.getLayoutInflater();
        }
        throw new RuntimeException("This activity does not wrap the Base Context! See ViewPumpContextWrapper.wrap(Context)");
    }

    public static View onActivityCreateView(Activity activity, View view, View view2, String str, Context context, AttributeSet attributeSet) {
        return get(activity).onActivityCreateView(view, view2, str, context, attributeSet);
    }

    public static ContextWrapper wrap(Context context) {
        return new ViewPumpContextWrapper(context);
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.mInflater == null) {
            this.mInflater = new ViewPumpLayoutInflater(LayoutInflater.from(getBaseContext()), this, false);
        }
        return this.mInflater;
    }
}
