package defpackage;

import android.os.AsyncTask;

final class atc extends AsyncTask<asp, Void, Void> {
    private final int a;
    private final aqw b;

    private atc(int i, aqw aqw) {
        this.a = i;
        this.b = aqw;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        asp[] aspArr = (asp[]) objArr;
        switch (atb.a[this.a - 1]) {
            case tw.a /*1*/:
                this.b.a(aspArr[0]);
                break;
            case tw.b /*2*/:
                this.b.b(aspArr[0]);
                break;
            default:
                break;
        }
        return null;
    }
}
