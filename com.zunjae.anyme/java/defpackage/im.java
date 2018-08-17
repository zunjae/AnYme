package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

public class im<T> implements ii<String, T> {
    private final ii<Uri, T> a;

    public im(ii<Uri, T> iiVar) {
        this.a = iiVar;
    }

    private static Uri a(String str) {
        return Uri.fromFile(new File(str));
    }

    public final /* synthetic */ en a(Object obj, int i, int i2) {
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("/")) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                obj = parse;
                return this.a.a(obj, i, i2);
            }
        }
        obj = im.a(str);
        return this.a.a(obj, i, i2);
    }
}
