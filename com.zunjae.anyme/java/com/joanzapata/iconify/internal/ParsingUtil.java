package com.joanzapata.iconify.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.view.ViewCompat;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.widget.TextView;
import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.internal.HasOnViewAttachListener.OnViewAttachListener;
import java.util.List;

public final class ParsingUtil {
    private static final String ANDROID_PACKAGE_NAME = "android";

    final class AnonymousClass1 implements OnViewAttachListener {
        boolean isAttached = false;
        final /* synthetic */ TextView val$target;

        AnonymousClass1(TextView textView) {
            this.val$target = textView;
        }

        public final void onAttach() {
            this.isAttached = true;
            ViewCompat.postOnAnimation(this.val$target, new Runnable() {
                public void run() {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    if (anonymousClass1.isAttached) {
                        anonymousClass1.val$target.invalidate();
                        ViewCompat.postOnAnimation(AnonymousClass1.this.val$target, this);
                    }
                }
            });
        }

        public final void onDetach() {
            this.isAttached = false;
        }
    }

    private ParsingUtil() {
    }

    public static float dpToPx(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static int getColorFromResource(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str2, "color", str);
        return identifier <= 0 ? Integer.MAX_VALUE : resources.getColor(identifier);
    }

    public static float getPxFromDimen(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str2, "dimen", str);
        return identifier <= 0 ? -1.0f : resources.getDimension(identifier);
    }

    private static boolean hasAnimatedSpans(SpannableStringBuilder spannableStringBuilder) {
        for (CustomTypefaceSpan isAnimated : (CustomTypefaceSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CustomTypefaceSpan.class)) {
            if (isAnimated.isAnimated()) {
                return true;
            }
        }
        return false;
    }

    public static CharSequence parse(Context context, List<IconFontDescriptorWrapper> list, CharSequence charSequence, TextView textView) {
        context = context.getApplicationContext();
        if (charSequence == null) {
            return charSequence;
        }
        CharSequence spannableStringBuilder = new SpannableStringBuilder(charSequence);
        recursivePrepareSpannableIndexes(context, charSequence.toString(), spannableStringBuilder, list, 0);
        if (hasAnimatedSpans(spannableStringBuilder)) {
            if (textView == null) {
                throw new IllegalArgumentException("You can't use \"spin\" without providing the target TextView.");
            } else if (textView instanceof HasOnViewAttachListener) {
                ((HasOnViewAttachListener) textView).setOnViewAttachListener(new AnonymousClass1(textView));
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(textView.getClass().getSimpleName());
                stringBuilder.append(" does not implement HasOnViewAttachListener. Please use IconTextView, IconButton or IconToggleButton.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } else if (textView instanceof HasOnViewAttachListener) {
            ((HasOnViewAttachListener) textView).setOnViewAttachListener(null);
        }
        return spannableStringBuilder;
    }

    private static void recursivePrepareSpannableIndexes(Context context, String str, SpannableStringBuilder spannableStringBuilder, List<IconFontDescriptorWrapper> list, int i) {
        Context context2 = context;
        String str2 = str;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i2 = i;
        while (true) {
            String spannableStringBuilder3 = spannableStringBuilder2.toString();
            i2 = spannableStringBuilder3.indexOf("{", i2);
            if (i2 != -1) {
                int indexOf = spannableStringBuilder3.indexOf("}", i2) + 1;
                if (indexOf != -1) {
                    int i3;
                    int i4 = i2 + 1;
                    String[] split = spannableStringBuilder3.substring(i4, indexOf - 1).split(" ");
                    String str3 = split[0];
                    Icon icon = null;
                    IconFontDescriptorWrapper iconFontDescriptorWrapper = icon;
                    for (i3 = 0; i3 < list.size(); i3++) {
                        iconFontDescriptorWrapper = (IconFontDescriptorWrapper) list.get(i3);
                        icon = iconFontDescriptorWrapper.getIcon(str3);
                        if (icon != null) {
                            break;
                        }
                    }
                    List<IconFontDescriptorWrapper> list2 = list;
                    Icon icon2 = icon;
                    if (icon2 == null) {
                        i2 = indexOf;
                    } else {
                        float f = -1.0f;
                        float f2 = -1.0f;
                        int i5 = Integer.MAX_VALUE;
                        boolean z = false;
                        boolean z2 = false;
                        for (int i6 = 1; i6 < split.length; i6++) {
                            String str4 = split[i6];
                            if (str4.equalsIgnoreCase("spin")) {
                                z = true;
                            } else if (str4.equalsIgnoreCase("baseline")) {
                                z2 = true;
                            } else if (str4.matches("([0-9]*(\\.[0-9]*)?)dp")) {
                                f = dpToPx(context2, Float.valueOf(str4.substring(0, str4.length() - 2)).floatValue());
                            } else if (str4.matches("([0-9]*(\\.[0-9]*)?)sp")) {
                                f = spToPx(context2, Float.valueOf(str4.substring(0, str4.length() - 2)).floatValue());
                            } else if (str4.matches("([0-9]*)px")) {
                                f = (float) Integer.valueOf(str4.substring(0, str4.length() - 2)).intValue();
                            } else if (str4.matches("@dimen/(.*)")) {
                                f = getPxFromDimen(context2, context.getPackageName(), str4.substring(7));
                                if (f < 0.0f) {
                                    r2 = new StringBuilder("Unknown resource ");
                                    r2.append(str4);
                                    r2.append(" in \"");
                                    r2.append(str2);
                                    r2.append("\"");
                                    throw new IllegalArgumentException(r2.toString());
                                }
                            } else if (str4.matches("@android:dimen/(.*)")) {
                                f = getPxFromDimen(context2, ANDROID_PACKAGE_NAME, str4.substring(15));
                                if (f < 0.0f) {
                                    r2 = new StringBuilder("Unknown resource ");
                                    r2.append(str4);
                                    r2.append(" in \"");
                                    r2.append(str2);
                                    r2.append("\"");
                                    throw new IllegalArgumentException(r2.toString());
                                }
                            } else if (str4.matches("([0-9]*(\\.[0-9]*)?)%")) {
                                f2 = Float.valueOf(str4.substring(0, str4.length() - 1)).floatValue() / 100.0f;
                            } else if (str4.matches("#([0-9A-Fa-f]{6}|[0-9A-Fa-f]{8})")) {
                                i5 = Color.parseColor(str4);
                            } else {
                                if (str4.matches("@color/(.*)")) {
                                    i3 = getColorFromResource(context2, context.getPackageName(), str4.substring(7));
                                    if (i3 == Integer.MAX_VALUE) {
                                        r2 = new StringBuilder("Unknown resource ");
                                        r2.append(str4);
                                        r2.append(" in \"");
                                        r2.append(str2);
                                        r2.append("\"");
                                        throw new IllegalArgumentException(r2.toString());
                                    }
                                } else if (str4.matches("@android:color/(.*)")) {
                                    i3 = getColorFromResource(context2, ANDROID_PACKAGE_NAME, str4.substring(15));
                                    if (i3 == Integer.MAX_VALUE) {
                                        r2 = new StringBuilder("Unknown resource ");
                                        r2.append(str4);
                                        r2.append(" in \"");
                                        r2.append(str2);
                                        r2.append("\"");
                                        throw new IllegalArgumentException(r2.toString());
                                    }
                                } else {
                                    r2 = new StringBuilder("Unknown expression ");
                                    r2.append(str4);
                                    r2.append(" in \"");
                                    r2.append(str2);
                                    r2.append("\"");
                                    throw new IllegalArgumentException(r2.toString());
                                }
                                i5 = i3;
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(icon2.character());
                        spannableStringBuilder2 = spannableStringBuilder2.replace(i2, indexOf, stringBuilder.toString());
                        spannableStringBuilder2.setSpan(new CustomTypefaceSpan(icon2, iconFontDescriptorWrapper.getTypeface(context2), f, f2, i5, z, z2), i2, i4, 17);
                    }
                } else {
                    return;
                }
            }
            return;
        }
    }

    public static float spToPx(Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }
}
