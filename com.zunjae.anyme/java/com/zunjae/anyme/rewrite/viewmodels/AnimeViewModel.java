package com.zunjae.anyme.rewrite.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import defpackage.amg;
import defpackage.are;
import defpackage.arg;
import defpackage.arl;
import defpackage.arn;
import defpackage.asc;
import defpackage.asn;
import defpackage.asr;
import defpackage.ast;
import java.util.ArrayList;
import java.util.List;

public final class AnimeViewModel extends AndroidViewModel {
    private final ast a;
    private LiveData<List<are>> b;

    public AnimeViewModel(Application application) {
        super(application);
        this.a = new ast(application);
    }

    public final LiveData<List<are>> a(int i) {
        if (this.b == null) {
            this.b = i == 0 ? this.a.n() : this.a.d(i);
        }
        return this.b;
    }

    public final LiveData<are> a(long j) {
        return this.a.f(j);
    }

    public final ast a() {
        return this.a;
    }

    public final void a(are are) {
        this.a.a(are);
    }

    public final void a(asc asc) {
        this.a.a(asc);
    }

    public final void a(ArrayList<are> arrayList) {
        this.a.a((ArrayList) arrayList);
    }

    public final void a(List<amg> list, int i) {
        this.a.a(list, i);
    }

    public final LiveData<List<are>> b() {
        return this.a.b();
    }

    public final LiveData<Integer> b(int i) {
        return this.a.e(i);
    }

    public final are b(long j) {
        return this.a.a(j);
    }

    public final void b(are are) {
        this.a.b(are);
    }

    public final LiveData<List<are>> c() {
        return this.a.h();
    }

    public final void c(int i) {
        this.a.c(i);
    }

    public final boolean c(long j) {
        return this.a.b(j);
    }

    public final LiveData<List<arn>> d() {
        return this.a.d();
    }

    public final LiveData<List<arl>> d(int i) {
        return this.a.b(i);
    }

    public final boolean d(long j) {
        return this.a.c(j);
    }

    public final LiveData<List<are>> e() {
        return this.a.i();
    }

    public final asc e(long j) {
        return this.a.d(j);
    }

    public final boolean e(int i) {
        return this.a.h(i);
    }

    public final LiveData<Integer> f() {
        return this.a.c();
    }

    public final LiveData<List<asn>> f(int i) {
        return this.a.i(i);
    }

    public final LiveData<asc> f(long j) {
        return this.a.e(j);
    }

    public final LiveData<List<are>> g() {
        return this.a.n();
    }

    public final boolean g(int i) {
        return this.a.f(i);
    }

    public final LiveData<List<are>> h() {
        return this.a.j();
    }

    public final LiveData<asr> h(int i) {
        return this.a.g(i);
    }

    public final List<are> i() {
        return this.a.k();
    }

    public final LiveData<Integer> j() {
        return this.a.e();
    }

    public final LiveData<List<arg>> k() {
        return this.a.l();
    }

    public final LiveData<Integer> l() {
        return this.a.m();
    }

    public final ArrayList<Integer> m() {
        return this.a.o();
    }

    public final LiveData<Integer> n() {
        return this.a.p();
    }
}
