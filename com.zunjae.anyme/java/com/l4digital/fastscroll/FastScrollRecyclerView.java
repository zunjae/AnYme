package com.l4digital.fastscroll;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;

public class FastScrollRecyclerView extends RecyclerView {
    private FastScroller a;

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new FastScroller(context, attributeSet);
        this.a.setId(R.id.fastscroller);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a((RecyclerView) this);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.addView(this.a);
            this.a.setLayoutParams(viewGroup);
        }
    }

    protected void onDetachedFromWindow() {
        this.a.a();
        super.onDetachedFromWindow();
    }

    public void setAdapter(Adapter adapter) {
        super.setAdapter(adapter);
        if (adapter instanceof i) {
            setSectionIndexer((i) adapter);
            return;
        }
        if (adapter == null) {
            setSectionIndexer(null);
        }
    }

    public void setBubbleColor(int i) {
        this.a.setBubbleColor(i);
    }

    public void setBubbleTextColor(int i) {
        this.a.setBubbleTextColor(i);
    }

    public void setBubbleVisible(boolean z) {
        this.a.setBubbleVisible(z);
    }

    public void setFastScrollEnabled(boolean z) {
        this.a.setEnabled(z);
    }

    public void setFastScrollStateChangeListener(a aVar) {
        this.a.setFastScrollStateChangeListener(aVar);
    }

    public void setHandleColor(int i) {
        this.a.setHandleColor(i);
    }

    public void setHideScrollbar(boolean z) {
        this.a.setHideScrollbar(z);
    }

    public void setSectionIndexer(i iVar) {
        this.a.setSectionIndexer(iVar);
    }

    public void setTrackColor(int i) {
        this.a.setTrackColor(i);
    }

    public void setTrackVisible(boolean z) {
        this.a.setTrackVisible(z);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.a.setVisibility(i);
    }
}
