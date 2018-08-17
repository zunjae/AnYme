package com.zunjae.anyme.activities.settings;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

final class b implements OnSeekBarChangeListener {
    final /* synthetic */ CustomizeActivity a;

    b(CustomizeActivity customizeActivity) {
        this.a = customizeActivity;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        i += 200;
        this.a.seekBarImageHeightValues.setText(String.valueOf(i));
        if (this.a.e != null) {
            this.a.e.a(i);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
