package defpackage;

import java.util.Comparator;
import java.util.SortedSet;
import javax.annotation.Nullable;
import ut.vf;

final class vk extends vf implements SortedSet<V> {
    final /* synthetic */ ut a;

    vk(ut utVar, @Nullable K k, SortedSet<V> sortedSet, @Nullable vf vfVar) {
        this.a = utVar;
        super(utVar, k, sortedSet, vfVar);
    }

    public final Comparator<? super V> comparator() {
        return ((SortedSet) this.c).comparator();
    }

    public final V first() {
        a();
        return ((SortedSet) this.c).first();
    }

    public final SortedSet<V> headSet(V v) {
        a();
        ut utVar = this.a;
        Object obj = this.b;
        SortedSet headSet = ((SortedSet) this.c).headSet(v);
        vf vfVar = this.d;
        if (vfVar == null) {
            vfVar = this;
        }
        return new vk(utVar, obj, headSet, vfVar);
    }

    public final V last() {
        a();
        return ((SortedSet) this.c).last();
    }

    public final SortedSet<V> subSet(V v, V v2) {
        a();
        ut utVar = this.a;
        Object obj = this.b;
        SortedSet subSet = ((SortedSet) this.c).subSet(v, v2);
        vf vfVar = this.d;
        if (vfVar == null) {
            vfVar = this;
        }
        return new vk(utVar, obj, subSet, vfVar);
    }

    public final SortedSet<V> tailSet(V v) {
        a();
        ut utVar = this.a;
        Object obj = this.b;
        SortedSet tailSet = ((SortedSet) this.c).tailSet(v);
        vf vfVar = this.d;
        if (vfVar == null) {
            vfVar = this;
        }
        return new vk(utVar, obj, tailSet, vfVar);
    }
}
