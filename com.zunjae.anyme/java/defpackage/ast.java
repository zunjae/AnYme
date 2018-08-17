package defpackage;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import com.zunjae.anyme.AppDatabase;
import com.zunjae.zasync.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ast {
    private static final String a = "ast";
    private final aoh b;

    public ast(Application application) {
        this.b = AppDatabase.a(application.getApplicationContext()).l();
    }

    public static int a() {
        return aux.b("KEY_ANIME_SORT_DB", 7);
    }

    public static void a(int i) {
        aux.a("KEY_ANIME_SORT_DB", i);
    }

    public final are a(long j) {
        return this.b.a(j);
    }

    public final void a(are are) {
        if (are != null) {
            this.b.a(are);
        }
    }

    public final void a(asc asc) {
        if (asc != null) {
            asc.v = a.a(7);
            new asv(this.b).execute(new asc[]{asc});
        }
    }

    public final void a(ArrayList<are> arrayList) {
        if (arrayList != null) {
            auo auo = new auo("Linking Kitsu and LiveChart with AnimeR2");
            List<asr> v = this.b.v();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                are are = (are) it.next();
                for (asr asr : v) {
                    if (are.d() == asr.a) {
                        are.a(asr);
                        break;
                    }
                }
            }
            for (arq arq : this.b.m()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    are are2 = (are) it2.next();
                    if (are2.d() == arq.a.intValue()) {
                        are2.a(arq);
                        break;
                    }
                }
            }
            auo.a();
            this.b.b((List) arrayList);
        }
    }

    public final void a(List<amg> list, int i) {
        if (list != null) {
            this.b.a((List) list, i);
        }
    }

    public final LiveData<List<are>> b() {
        return this.b.b();
    }

    public final LiveData<List<arl>> b(int i) {
        return this.b.d(i);
    }

    public final void b(are are) {
        if (are != null) {
            new asy(this.b, ari.c).execute(new are[]{are});
        }
    }

    public final void b(ArrayList<arg> arrayList) {
        if (arrayList != null) {
            this.b.a((ArrayList) arrayList);
        }
    }

    public final boolean b(long j) {
        return this.b.g(j).intValue() > 0;
    }

    public final LiveData<Integer> c() {
        return this.b.h();
    }

    public final void c(int i) {
        this.b.b(i);
    }

    public final void c(are are) {
        if (are != null) {
            new asy(this.b, ari.b).execute(new are[]{are});
        }
    }

    public final boolean c(long j) {
        return this.b.a(j, System.currentTimeMillis()).intValue() > 0;
    }

    public final LiveData<List<arn>> d() {
        return this.b.j();
    }

    public final LiveData<List<are>> d(int i) {
        return this.b.a(i);
    }

    public final asc d(long j) {
        return this.b.c(j);
    }

    public final LiveData<Integer> e() {
        return this.b.q();
    }

    public final LiveData<Integer> e(int i) {
        return i == 0 ? this.b.g() : this.b.c(i);
    }

    public final LiveData<asc> e(long j) {
        return this.b.d(j);
    }

    public final LiveData<List<arl>> f() {
        return this.b.l();
    }

    public final LiveData<are> f(long j) {
        return this.b.b(j);
    }

    public final boolean f(int i) {
        return this.b.g(i).intValue() > 0;
    }

    public final LiveData<List<arl>> g() {
        return this.b.n();
    }

    public final LiveData<asr> g(int i) {
        return this.b.h(i);
    }

    public final List<asm> g(long j) {
        return this.b.e(j);
    }

    public final LiveData<List<are>> h() {
        return this.b.a("anyme:favorite");
    }

    public final LiveData<List<asm>> h(long j) {
        return this.b.f(j);
    }

    public final boolean h(int i) {
        return this.b.b((long) i, System.currentTimeMillis()).intValue() > 0;
    }

    public final LiveData<List<are>> i() {
        return this.b.d();
    }

    public final LiveData<List<asn>> i(int i) {
        return this.b.e(i);
    }

    public final LiveData<List<are>> j() {
        return this.b.e();
    }

    public final List<are> k() {
        return this.b.f();
    }

    public final LiveData<List<arg>> l() {
        return this.b.o();
    }

    public final LiveData<Integer> m() {
        return this.b.p();
    }

    public final LiveData<List<are>> n() {
        return this.b.a();
    }

    public final ArrayList<Integer> o() {
        return new ArrayList(this.b.s());
    }

    public final LiveData<Integer> p() {
        return this.b.t();
    }

    public final List<Integer> q() {
        return this.b.u();
    }

    public final List<Long> r() {
        return this.b.c();
    }

    public final void s() {
        new asx(this.b).execute(new Void[0]);
    }

    public final void t() {
        new asw(this.b).execute(new Void[0]);
    }
}
