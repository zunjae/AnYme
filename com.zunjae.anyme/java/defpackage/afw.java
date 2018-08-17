package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

public class afw {
    private Uri a;
    private Drawable b;
    private Bitmap c;
    private int d;

    public afw() {
        this.d = -1;
        this.c = null;
    }

    public afw(int i) {
        this.d = -1;
        this.d = i;
    }

    public afw(String str) {
        this.d = -1;
        this.a = Uri.parse(str);
    }

    public static void a(Drawable drawable, int i, Drawable drawable2, int i2, boolean z, ImageView imageView) {
        int i3;
        if (drawable != null) {
            if (drawable2 != null) {
                if (z) {
                    imageView.setImageDrawable(new aft(drawable, drawable2, i, i2));
                    i3 = 0;
                } else {
                    drawable = afz.a(drawable, drawable2);
                }
            } else if (z) {
                imageView.setImageDrawable(new aft(drawable, i, i2));
                i3 = 0;
            }
            imageView.setImageDrawable(drawable);
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
    }

    public static boolean a(afw afw, ImageView imageView, String str) {
        return (afw == null || imageView == null) ? false : afw.a(imageView, str);
    }

    public static void b(afw afw, ImageView imageView, String str) {
        boolean a = afw.a(afw, imageView, str);
        if (imageView != null) {
            if (a) {
                imageView.setVisibility(0);
                return;
            }
            imageView.setVisibility(4);
        }
    }

    public final Uri a() {
        return this.a;
    }

    public boolean a(ImageView imageView, String str) {
        Uri uri = this.a;
        if (uri != null) {
            imageView.setImageURI(uri);
        } else {
            Drawable drawable = this.b;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Bitmap bitmap = this.c;
                if (bitmap != null) {
                    imageView.setImageBitmap(bitmap);
                } else {
                    int i = this.d;
                    if (i != -1) {
                        imageView.setImageResource(i);
                    } else {
                        imageView.setImageBitmap(null);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final Drawable b() {
        return this.b;
    }

    public final Bitmap c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }
}
