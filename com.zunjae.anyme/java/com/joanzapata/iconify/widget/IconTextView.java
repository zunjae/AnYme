package com.joanzapata.iconify.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.internal.HasOnViewAttachListener;
import com.joanzapata.iconify.internal.HasOnViewAttachListener.HasOnViewAttachListenerDelegate;
import com.joanzapata.iconify.internal.HasOnViewAttachListener.OnViewAttachListener;

public class IconTextView extends TextView implements HasOnViewAttachListener {
    private HasOnViewAttachListenerDelegate delegate;

    public IconTextView(Context context) {
        super(context);
        init();
    }

    public IconTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public IconTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        setTransformationMethod(null);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.delegate.onAttachedToWindow();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.delegate.onDetachedFromWindow();
    }

    public void setOnViewAttachListener(OnViewAttachListener onViewAttachListener) {
        if (this.delegate == null) {
            this.delegate = new HasOnViewAttachListenerDelegate(this);
        }
        this.delegate.setOnViewAttachListener(onViewAttachListener);
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(Iconify.compute(getContext(), charSequence, this), bufferType);
    }
}
