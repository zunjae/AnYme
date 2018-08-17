package com.zunjae.anyme.activities.settings;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

final class a implements OnSeekBarChangeListener {
    final /* synthetic */ CustomizeActivity a;

    a(CustomizeActivity customizeActivity) {
        this.a = customizeActivity;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        i += 2;
        this.a.seekBarColumnsValue.setText(String.valueOf(i));
        CustomizeActivity customizeActivity = this.a;
        customizeActivity.a(i, customizeActivity.seekBarImageHeight.getProgress() + 200);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
