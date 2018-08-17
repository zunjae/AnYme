package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.mikepenz.iconics.view.R;

public final class adk extends adg {
    public static adf a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.IconicsImageView);
        try {
            adf b = new adh(context, obtainStyledAttributes).a(R.styleable.IconicsImageView_iiv_icon).c(R.styleable.IconicsImageView_iiv_color).b(R.styleable.IconicsImageView_iiv_size).d(R.styleable.IconicsImageView_iiv_padding).e(R.styleable.IconicsImageView_iiv_contour_color).f(R.styleable.IconicsImageView_iiv_contour_width).g(R.styleable.IconicsImageView_iiv_background_color).h(R.styleable.IconicsImageView_iiv_corner_radius).i(R.styleable.IconicsImageView_iiv_background_contour_color).j(R.styleable.IconicsImageView_iiv_background_contour_width).b();
            return b;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static void a(Context context, AttributeSet attributeSet, adj adj) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.IconicsTextView, 0, 0);
        adf b = new adh(context, obtainStyledAttributes).a(R.styleable.IconicsTextView_iiv_all_icon).c(R.styleable.IconicsTextView_iiv_all_color).b(R.styleable.IconicsTextView_iiv_all_size).d(R.styleable.IconicsTextView_iiv_all_padding).e(R.styleable.IconicsTextView_iiv_all_contour_color).f(R.styleable.IconicsTextView_iiv_all_contour_width).g(R.styleable.IconicsTextView_iiv_all_background_color).h(R.styleable.IconicsTextView_iiv_all_corner_radius).i(R.styleable.IconicsTextView_iiv_all_background_contour_color).j(R.styleable.IconicsTextView_iiv_all_background_contour_width).b();
        adj.a = new adh(context, obtainStyledAttributes).a(R.styleable.IconicsTextView_iiv_start_icon).c(R.styleable.IconicsTextView_iiv_start_color).b(R.styleable.IconicsTextView_iiv_start_size).d(R.styleable.IconicsTextView_iiv_start_padding).e(R.styleable.IconicsTextView_iiv_start_contour_color).f(R.styleable.IconicsTextView_iiv_start_contour_width).g(R.styleable.IconicsTextView_iiv_start_background_color).h(R.styleable.IconicsTextView_iiv_start_corner_radius).i(R.styleable.IconicsTextView_iiv_start_background_contour_color).j(R.styleable.IconicsTextView_iiv_start_background_contour_width).a(b);
        adj.b = new adh(context, obtainStyledAttributes).a(R.styleable.IconicsTextView_iiv_top_icon).c(R.styleable.IconicsTextView_iiv_top_color).b(R.styleable.IconicsTextView_iiv_top_size).d(R.styleable.IconicsTextView_iiv_top_padding).e(R.styleable.IconicsTextView_iiv_top_contour_color).f(R.styleable.IconicsTextView_iiv_top_contour_width).g(R.styleable.IconicsTextView_iiv_top_background_color).h(R.styleable.IconicsTextView_iiv_top_corner_radius).i(R.styleable.IconicsTextView_iiv_top_background_contour_color).j(R.styleable.IconicsTextView_iiv_top_background_contour_width).a(b);
        adj.c = new adh(context, obtainStyledAttributes).a(R.styleable.IconicsTextView_iiv_end_icon).c(R.styleable.IconicsTextView_iiv_end_color).b(R.styleable.IconicsTextView_iiv_end_size).d(R.styleable.IconicsTextView_iiv_end_padding).e(R.styleable.IconicsTextView_iiv_end_contour_color).f(R.styleable.IconicsTextView_iiv_end_contour_width).g(R.styleable.IconicsTextView_iiv_end_background_color).h(R.styleable.IconicsTextView_iiv_end_corner_radius).i(R.styleable.IconicsTextView_iiv_end_background_contour_color).j(R.styleable.IconicsTextView_iiv_end_background_contour_width).a(b);
        adj.d = new adh(context, obtainStyledAttributes).a(R.styleable.IconicsTextView_iiv_bottom_icon).c(R.styleable.IconicsTextView_iiv_bottom_color).b(R.styleable.IconicsTextView_iiv_bottom_size).d(R.styleable.IconicsTextView_iiv_bottom_padding).e(R.styleable.IconicsTextView_iiv_bottom_contour_color).f(R.styleable.IconicsTextView_iiv_bottom_contour_width).g(R.styleable.IconicsTextView_iiv_bottom_background_color).h(R.styleable.IconicsTextView_iiv_bottom_corner_radius).i(R.styleable.IconicsTextView_iiv_bottom_background_contour_color).j(R.styleable.IconicsTextView_iiv_bottom_background_contour_width).a(b);
        obtainStyledAttributes.recycle();
    }

    public static void b(Context context, AttributeSet attributeSet, adj adj) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.IconicsCheckableTextView, 0, 0);
        adf b = new adh(context, obtainStyledAttributes).a(R.styleable.IconicsCheckableTextView_iiv_all_checked_icon).c(R.styleable.IconicsCheckableTextView_iiv_all_checked_color).b(R.styleable.IconicsCheckableTextView_iiv_all_checked_size).d(R.styleable.IconicsCheckableTextView_iiv_all_checked_padding).e(R.styleable.IconicsCheckableTextView_iiv_all_checked_contour_color).f(R.styleable.IconicsCheckableTextView_iiv_all_checked_contour_width).g(R.styleable.IconicsCheckableTextView_iiv_all_checked_background_color).h(R.styleable.IconicsCheckableTextView_iiv_all_checked_corner_radius).i(R.styleable.IconicsCheckableTextView_iiv_all_checked_background_contour_color).j(R.styleable.IconicsCheckableTextView_iiv_all_checked_background_contour_width).b();
        adj.a = new adh(context, obtainStyledAttributes).a(R.styleable.IconicsCheckableTextView_iiv_start_checked_icon).c(R.styleable.IconicsCheckableTextView_iiv_start_checked_color).b(R.styleable.IconicsCheckableTextView_iiv_start_checked_size).d(R.styleable.IconicsCheckableTextView_iiv_start_checked_padding).e(R.styleable.IconicsCheckableTextView_iiv_start_checked_contour_color).f(R.styleable.IconicsCheckableTextView_iiv_start_checked_contour_width).g(R.styleable.IconicsCheckableTextView_iiv_start_checked_background_color).h(R.styleable.IconicsCheckableTextView_iiv_start_checked_corner_radius).i(R.styleable.IconicsCheckableTextView_iiv_start_checked_background_contour_color).j(R.styleable.IconicsCheckableTextView_iiv_start_checked_background_contour_width).a(b);
        adj.b = new adh(context, obtainStyledAttributes).a(R.styleable.IconicsCheckableTextView_iiv_top_checked_icon).c(R.styleable.IconicsCheckableTextView_iiv_top_checked_color).b(R.styleable.IconicsCheckableTextView_iiv_top_checked_size).d(R.styleable.IconicsCheckableTextView_iiv_top_checked_padding).e(R.styleable.IconicsCheckableTextView_iiv_top_checked_contour_color).f(R.styleable.IconicsCheckableTextView_iiv_top_checked_contour_width).g(R.styleable.IconicsCheckableTextView_iiv_top_checked_background_color).h(R.styleable.IconicsCheckableTextView_iiv_top_checked_corner_radius).i(R.styleable.IconicsCheckableTextView_iiv_top_checked_background_contour_color).j(R.styleable.IconicsCheckableTextView_iiv_top_checked_background_contour_width).a(b);
        adj.c = new adh(context, obtainStyledAttributes).a(R.styleable.IconicsCheckableTextView_iiv_end_checked_icon).c(R.styleable.IconicsCheckableTextView_iiv_end_checked_color).b(R.styleable.IconicsCheckableTextView_iiv_end_checked_size).d(R.styleable.IconicsCheckableTextView_iiv_end_checked_padding).e(R.styleable.IconicsCheckableTextView_iiv_end_checked_contour_color).f(R.styleable.IconicsCheckableTextView_iiv_end_checked_contour_width).g(R.styleable.IconicsCheckableTextView_iiv_end_checked_background_color).h(R.styleable.IconicsCheckableTextView_iiv_end_checked_corner_radius).i(R.styleable.IconicsCheckableTextView_iiv_end_checked_background_contour_color).j(R.styleable.IconicsCheckableTextView_iiv_end_checked_background_contour_width).a(b);
        adj.d = new adh(context, obtainStyledAttributes).a(R.styleable.IconicsCheckableTextView_iiv_bottom_checked_icon).c(R.styleable.IconicsCheckableTextView_iiv_bottom_checked_color).b(R.styleable.IconicsCheckableTextView_iiv_bottom_checked_size).d(R.styleable.IconicsCheckableTextView_iiv_bottom_checked_padding).e(R.styleable.IconicsCheckableTextView_iiv_bottom_checked_contour_color).f(R.styleable.IconicsCheckableTextView_iiv_bottom_checked_contour_width).g(R.styleable.IconicsCheckableTextView_iiv_bottom_checked_background_color).h(R.styleable.IconicsCheckableTextView_iiv_bottom_checked_corner_radius).i(R.styleable.IconicsCheckableTextView_iiv_bottom_checked_background_contour_color).j(R.styleable.IconicsCheckableTextView_iiv_bottom_checked_background_contour_width).a(b);
        obtainStyledAttributes.recycle();
    }

    public static boolean b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.IconicsAnimateChanges, 0, 0);
        try {
            boolean z = obtainStyledAttributes.getBoolean(R.styleable.IconicsAnimateChanges_iiv_animate_icon_changes, true);
            return z;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
