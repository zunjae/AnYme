package defpackage;

import com.mikepenz.fastadapter.p;
import com.mikepenz.fastadapter.q;
import java.util.List;

public abstract class acs<Identifiable extends q> implements p<Identifiable> {
    public final Identifiable a(Identifiable identifiable) {
        if (identifiable.c() == -1) {
            identifiable.a(a());
        }
        return identifiable;
    }

    public final List<Identifiable> a(List<Identifiable> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((q) list.get(i));
        }
        return list;
    }

    public final Identifiable[] a(Identifiable... identifiableArr) {
        for (q a : identifiableArr) {
            a(a);
        }
        return identifiableArr;
    }
}
