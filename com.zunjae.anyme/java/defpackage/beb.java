package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

final class beb extends ThreadLocal<DateFormat> {
    beb() {
    }

    protected final /* synthetic */ Object initialValue() {
        DateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(bdb.g);
        return simpleDateFormat;
    }
}
