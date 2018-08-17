package defpackage;

import android.os.AsyncTask;

final class asy extends AsyncTask<are, Void, Void> {
    private final aoh a;
    private final int b;

    asy(aoh aoh, int i) {
        this.a = aoh;
        this.b = i;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        are[] areArr = (are[]) objArr;
        switch (asu.a[this.b - 1]) {
            case tw.a /*1*/:
                this.a.b(areArr[0]);
                break;
            case tw.b /*2*/:
                this.a.a(areArr[0]);
                break;
            case f.c /*3*/:
                this.a.c(areArr[0]);
                break;
            default:
                break;
        }
        return null;
    }
}
