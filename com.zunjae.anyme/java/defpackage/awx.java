package defpackage;

import me.zhanghai.android.materialprogressbar.R;

public enum awx {
    WIFI_MAC_ADDRESS(1),
    BLUETOOTH_MAC_ADDRESS(2),
    FONT_TOKEN(53),
    ANDROID_ID(100),
    ANDROID_DEVICE_ID(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle),
    ANDROID_SERIAL(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu),
    ANDROID_ADVERTISING_ID(R.styleable.AppCompatTheme_textColorAlertDialogListItem);
    
    public final int protobufIndex;

    private awx(int i) {
        this.protobufIndex = i;
    }
}
