package io.github.inflationx.calligraphy3;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import io.github.inflationx.viewpump.ReflectionUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

class Calligraphy {
    private static final String ACTION_BAR_SUBTITLE = "action_bar_subtitle";
    private static final String ACTION_BAR_TITLE = "action_bar_title";
    private final int[] mAttributeId;
    private final CalligraphyConfig mCalligraphyConfig;

    class ToolbarLayoutListener implements OnGlobalLayoutListener {
        static String BLANK = " ";
        private final WeakReference<Calligraphy> mCalligraphyFactory;
        private final WeakReference<Context> mContextRef;
        private final WeakReference<Toolbar> mToolbarReference;
        private final CharSequence originalSubTitle;

        private ToolbarLayoutListener(Calligraphy calligraphy, Context context, Toolbar toolbar) {
            this.mCalligraphyFactory = new WeakReference(calligraphy);
            this.mContextRef = new WeakReference(context);
            this.mToolbarReference = new WeakReference(toolbar);
            this.originalSubTitle = toolbar.getSubtitle();
            toolbar.setSubtitle(BLANK);
        }

        private void removeSelf(Toolbar toolbar) {
            if (VERSION.SDK_INT < 16) {
                toolbar.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                toolbar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }

        @TargetApi(16)
        public void onGlobalLayout() {
            Toolbar toolbar = (Toolbar) this.mToolbarReference.get();
            Context context = (Context) this.mContextRef.get();
            Calligraphy calligraphy = (Calligraphy) this.mCalligraphyFactory.get();
            if (toolbar != null) {
                if (calligraphy != null) {
                    if (context != null) {
                        int childCount = toolbar.getChildCount();
                        if (childCount != 0) {
                            for (int i = 0; i < childCount; i++) {
                                calligraphy.onViewCreated(toolbar.getChildAt(i), context, null);
                            }
                        }
                        removeSelf(toolbar);
                        toolbar.setSubtitle(this.originalSubTitle);
                        return;
                    }
                }
                removeSelf(toolbar);
            }
        }
    }

    public Calligraphy(CalligraphyConfig calligraphyConfig) {
        this.mCalligraphyConfig = calligraphyConfig;
        this.mAttributeId = new int[]{calligraphyConfig.getAttrId()};
    }

    private String applyFontMapper(String str) {
        FontMapper fontMapper = this.mCalligraphyConfig.getFontMapper();
        return fontMapper != null ? fontMapper.map(str) : str;
    }

    private Typeface getDefaultTypeface(Context context, String str) {
        Object fontPath;
        if (TextUtils.isEmpty(str)) {
            fontPath = this.mCalligraphyConfig.getFontPath();
        }
        return !TextUtils.isEmpty(fontPath) ? TypefaceUtils.load(context.getAssets(), fontPath) : null;
    }

    @SuppressLint({"NewApi"})
    protected static boolean isActionBarSubTitle(TextView textView) {
        return matchesResourceIdName(textView, ACTION_BAR_SUBTITLE) ? true : parentIsToolbarV7(textView) ? TextUtils.equals(((Toolbar) textView.getParent()).getSubtitle(), textView.getText()) : false;
    }

    @SuppressLint({"NewApi"})
    protected static boolean isActionBarTitle(TextView textView) {
        return matchesResourceIdName(textView, ACTION_BAR_TITLE) ? true : parentIsToolbarV7(textView) ? TextUtils.equals(((Toolbar) textView.getParent()).getTitle(), textView.getText()) : false;
    }

    protected static boolean matchesResourceIdName(View view, String str) {
        return view.getId() == -1 ? false : view.getResources().getResourceEntryName(view.getId()).equalsIgnoreCase(str);
    }

    protected static boolean parentIsToolbarV7(View view) {
        return CalligraphyUtils.canCheckForV7Toolbar() && view.getParent() != null && (view.getParent() instanceof Toolbar);
    }

    private String resolveFontPath(Context context, AttributeSet attributeSet) {
        Object pullFontPathFromView = CalligraphyUtils.pullFontPathFromView(context, attributeSet, this.mAttributeId);
        if (TextUtils.isEmpty(pullFontPathFromView)) {
            pullFontPathFromView = CalligraphyUtils.pullFontPathFromStyle(context, attributeSet, this.mAttributeId);
        }
        return TextUtils.isEmpty(pullFontPathFromView) ? CalligraphyUtils.pullFontPathFromTextAppearance(context, attributeSet, this.mAttributeId) : pullFontPathFromView;
    }

    protected int[] getStyleForTextView(TextView textView) {
        int[] iArr = new int[]{-1, -1};
        if (isActionBarTitle(textView)) {
            iArr[0] = 16843470;
            iArr[1] = 16843512;
        } else if (isActionBarSubTitle(textView)) {
            iArr[0] = 16843470;
            iArr[1] = 16843513;
        }
        if (iArr[0] == -1) {
            iArr[0] = this.mCalligraphyConfig.getClassStyles().containsKey(textView.getClass()) ? ((Integer) this.mCalligraphyConfig.getClassStyles().get(textView.getClass())).intValue() : 16842804;
        }
        return iArr;
    }

    public View onViewCreated(View view, Context context, AttributeSet attributeSet) {
        if (!(view == null || view.getTag(R.id.calligraphy_tag_id) == Boolean.TRUE)) {
            onViewCreatedInternal(view, context, attributeSet);
            view.setTag(R.id.calligraphy_tag_id, Boolean.TRUE);
        }
        return view;
    }

    void onViewCreatedInternal(View view, Context context, AttributeSet attributeSet) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!TypefaceUtils.isLoaded(textView.getTypeface())) {
                boolean z;
                String resolveFontPath = resolveFontPath(context, attributeSet);
                if (TextUtils.isEmpty(resolveFontPath)) {
                    int[] styleForTextView = getStyleForTextView(textView);
                    resolveFontPath = styleForTextView[1] != -1 ? CalligraphyUtils.pullFontPathFromTheme(context, styleForTextView[0], styleForTextView[1], this.mAttributeId) : CalligraphyUtils.pullFontPathFromTheme(context, styleForTextView[0], this.mAttributeId);
                }
                resolveFontPath = applyFontMapper(resolveFontPath);
                if (!matchesResourceIdName(view, ACTION_BAR_TITLE)) {
                    if (!matchesResourceIdName(view, ACTION_BAR_SUBTITLE)) {
                        z = false;
                        CalligraphyUtils.applyFontToTextView(context, textView, this.mCalligraphyConfig, resolveFontPath, z);
                    }
                }
                z = true;
                CalligraphyUtils.applyFontToTextView(context, textView, this.mCalligraphyConfig, resolveFontPath, z);
            } else {
                return;
            }
        }
        if (CalligraphyUtils.canCheckForV7Toolbar() && (view instanceof Toolbar)) {
            Toolbar toolbar = (Toolbar) view;
            toolbar.getViewTreeObserver().addOnGlobalLayoutListener(new ToolbarLayoutListener(context, toolbar));
        }
        Typeface defaultTypeface;
        if (view instanceof HasTypeface) {
            defaultTypeface = getDefaultTypeface(context, applyFontMapper(resolveFontPath(context, attributeSet)));
            if (defaultTypeface != null) {
                ((HasTypeface) view).setTypeface(defaultTypeface);
            }
            return;
        }
        if (this.mCalligraphyConfig.isCustomViewTypefaceSupport() && this.mCalligraphyConfig.isCustomViewHasTypeface(view)) {
            Method method = ReflectionUtils.getMethod(view.getClass(), "setTypeface");
            defaultTypeface = getDefaultTypeface(context, applyFontMapper(resolveFontPath(context, attributeSet)));
            if (!(method == null || defaultTypeface == null)) {
                ReflectionUtils.invokeMethod(view, method, defaultTypeface);
            }
        }
    }
}
