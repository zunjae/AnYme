package io.github.inflationx.calligraphy3;

import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CalligraphyConfig {
    private static final Map<Class<? extends TextView>, Integer> DEFAULT_STYLES;
    private final Set<Class<?>> hasTypefaceViews;
    private final int mAttrId;
    private final Map<Class<? extends TextView>, Integer> mClassStyleAttributeMap;
    private final boolean mCustomViewTypefaceSupport;
    private final FontMapper mFontMapper;
    private final String mFontPath;
    private final boolean mIsFontSet;

    public class Builder {
        public static final int INVALID_ATTR_ID = -1;
        private int attrId = R.attr.fontPath;
        private boolean customViewTypefaceSupport = false;
        private String fontAssetPath = null;
        private FontMapper fontMapper;
        private boolean isFontSet = false;
        private Set<Class<?>> mHasTypefaceClasses = new HashSet();
        private Map<Class<? extends TextView>, Integer> mStyleClassMap = new HashMap();

        public Builder addCustomStyle(Class<? extends TextView> cls, int i) {
            if (cls != null) {
                if (i != 0) {
                    this.mStyleClassMap.put(cls, Integer.valueOf(i));
                }
            }
            return this;
        }

        public Builder addCustomViewWithSetTypeface(Class<?> cls) {
            this.customViewTypefaceSupport = true;
            this.mHasTypefaceClasses.add(cls);
            return this;
        }

        public CalligraphyConfig build() {
            this.isFontSet = TextUtils.isEmpty(this.fontAssetPath) ^ 1;
            return new CalligraphyConfig();
        }

        public Builder setDefaultFontPath(String str) {
            this.isFontSet = TextUtils.isEmpty(str) ^ 1;
            this.fontAssetPath = str;
            return this;
        }

        public Builder setFontAttrId(int i) {
            this.attrId = i;
            return this;
        }

        public Builder setFontMapper(FontMapper fontMapper) {
            this.fontMapper = fontMapper;
            return this;
        }
    }

    static {
        Map hashMap = new HashMap();
        DEFAULT_STYLES = hashMap;
        hashMap.put(TextView.class, Integer.valueOf(16842884));
        DEFAULT_STYLES.put(Button.class, Integer.valueOf(16842824));
        DEFAULT_STYLES.put(EditText.class, Integer.valueOf(16842862));
        DEFAULT_STYLES.put(AutoCompleteTextView.class, Integer.valueOf(16842859));
        DEFAULT_STYLES.put(MultiAutoCompleteTextView.class, Integer.valueOf(16842859));
        DEFAULT_STYLES.put(CheckBox.class, Integer.valueOf(16842860));
        DEFAULT_STYLES.put(RadioButton.class, Integer.valueOf(16842878));
        DEFAULT_STYLES.put(ToggleButton.class, Integer.valueOf(16842827));
        if (CalligraphyUtils.canAddV7AppCompatViews()) {
            addAppCompatViews();
        }
    }

    private CalligraphyConfig(Builder builder) {
        this.mIsFontSet = builder.isFontSet;
        this.mFontPath = builder.fontAssetPath;
        this.mAttrId = builder.attrId;
        this.mCustomViewTypefaceSupport = builder.customViewTypefaceSupport;
        Map hashMap = new HashMap(DEFAULT_STYLES);
        hashMap.putAll(builder.mStyleClassMap);
        this.mClassStyleAttributeMap = Collections.unmodifiableMap(hashMap);
        this.hasTypefaceViews = Collections.unmodifiableSet(builder.mHasTypefaceClasses);
        this.mFontMapper = builder.fontMapper;
    }

    private static void addAppCompatViews() {
        DEFAULT_STYLES.put(AppCompatTextView.class, Integer.valueOf(16842884));
        DEFAULT_STYLES.put(AppCompatButton.class, Integer.valueOf(16842824));
        DEFAULT_STYLES.put(AppCompatEditText.class, Integer.valueOf(16842862));
        DEFAULT_STYLES.put(AppCompatAutoCompleteTextView.class, Integer.valueOf(16842859));
        DEFAULT_STYLES.put(AppCompatMultiAutoCompleteTextView.class, Integer.valueOf(16842859));
        DEFAULT_STYLES.put(AppCompatCheckBox.class, Integer.valueOf(16842860));
        DEFAULT_STYLES.put(AppCompatRadioButton.class, Integer.valueOf(16842878));
        DEFAULT_STYLES.put(AppCompatCheckedTextView.class, Integer.valueOf(16843720));
    }

    public int getAttrId() {
        return this.mAttrId;
    }

    Map<Class<? extends TextView>, Integer> getClassStyles() {
        return this.mClassStyleAttributeMap;
    }

    public FontMapper getFontMapper() {
        return this.mFontMapper;
    }

    public String getFontPath() {
        return this.mFontPath;
    }

    public boolean isCustomViewHasTypeface(View view) {
        return this.hasTypefaceViews.contains(view.getClass());
    }

    public boolean isCustomViewTypefaceSupport() {
        return this.mCustomViewTypefaceSupport;
    }

    boolean isFontSet() {
        return this.mIsFontSet;
    }
}
