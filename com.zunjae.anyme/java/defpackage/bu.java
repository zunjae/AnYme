package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class bu {
    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xmlPullParser.getName();
            if (name.equals("selector")) {
                return bu.a(resources, xmlPullParser, asAttributeSet, theme);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(xmlPullParser.getPositionDescription());
            stringBuilder.append(": invalid color state list tag ");
            stringBuilder.append(name);
            throw new XmlPullParserException(stringBuilder.toString());
        }
        throw new XmlPullParserException("No start tag found");
    }

    private static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        AttributeSet attributeSet2 = attributeSet;
        Theme theme2 = theme;
        int i = 1;
        int depth = xmlPullParser.getDepth() + 1;
        Object obj = new int[20][];
        Object obj2 = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            }
            Resources resources2;
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray obtainAttributes;
                int i3;
                int[] iArr;
                int i4;
                int i5;
                int attributeNameResource;
                Object trimStateSet;
                int[] iArr2 = R.styleable.ColorStateListItem;
                if (theme2 == null) {
                    obtainAttributes = resources.obtainAttributes(attributeSet2, iArr2);
                } else {
                    resources2 = resources;
                    obtainAttributes = theme2.obtainStyledAttributes(attributeSet2, iArr2, 0, 0);
                }
                int color = obtainAttributes.getColor(R.styleable.ColorStateListItem_android_color, -65281);
                float f = 1.0f;
                if (obtainAttributes.hasValue(R.styleable.ColorStateListItem_android_alpha)) {
                    i3 = R.styleable.ColorStateListItem_android_alpha;
                } else {
                    if (obtainAttributes.hasValue(R.styleable.ColorStateListItem_alpha)) {
                        i3 = R.styleable.ColorStateListItem_alpha;
                    }
                    obtainAttributes.recycle();
                    next = attributeSet.getAttributeCount();
                    iArr = new int[next];
                    i4 = 0;
                    for (i5 = 0; i5 < next; i5++) {
                        attributeNameResource = attributeSet2.getAttributeNameResource(i5);
                        if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == R.attr.alpha)) {
                            i = i4 + 1;
                            if (attributeSet2.getAttributeBooleanValue(i5, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i4] = attributeNameResource;
                            i4 = i;
                        }
                    }
                    trimStateSet = StateSet.trimStateSet(iArr, i4);
                    obj2 = bx.a((int[]) obj2, i2, ColorUtils.setAlphaComponent(color, Math.round(((float) Color.alpha(color)) * f)));
                    obj = (int[][]) bx.a((Object[]) obj, i2, trimStateSet);
                    i2++;
                }
                f = obtainAttributes.getFloat(i3, 1.0f);
                obtainAttributes.recycle();
                next = attributeSet.getAttributeCount();
                iArr = new int[next];
                i4 = 0;
                for (i5 = 0; i5 < next; i5++) {
                    attributeNameResource = attributeSet2.getAttributeNameResource(i5);
                    i = i4 + 1;
                    if (attributeSet2.getAttributeBooleanValue(i5, false)) {
                        attributeNameResource = -attributeNameResource;
                    }
                    iArr[i4] = attributeNameResource;
                    i4 = i;
                }
                trimStateSet = StateSet.trimStateSet(iArr, i4);
                obj2 = bx.a((int[]) obj2, i2, ColorUtils.setAlphaComponent(color, Math.round(((float) Color.alpha(color)) * f)));
                obj = (int[][]) bx.a((Object[]) obj, i2, trimStateSet);
                i2++;
            } else {
                resources2 = resources;
            }
            i = 1;
        }
        Object obj3 = new int[i2];
        Object obj4 = new int[i2][];
        System.arraycopy(obj2, 0, obj3, 0, i2);
        System.arraycopy(obj, 0, obj4, 0, i2);
        return new ColorStateList(obj4, obj3);
    }
}
