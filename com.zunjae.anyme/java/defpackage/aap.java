package defpackage;

import java.util.UUID;

final class aap extends wz<UUID> {
    aap() {
    }

    public final /* synthetic */ Object a(abn abn) {
        if (abn.f() != abp.NULL) {
            return UUID.fromString(abn.h());
        }
        abn.j();
        return null;
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        UUID uuid = (UUID) obj;
        abq.b(uuid == null ? null : uuid.toString());
    }
}
