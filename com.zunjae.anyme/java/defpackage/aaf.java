package defpackage;

final class aaf extends wz<Character> {
    aaf() {
    }

    public final /* synthetic */ Object a(abn abn) {
        if (abn.f() == abp.NULL) {
            abn.j();
            return null;
        }
        String h = abn.h();
        if (h.length() == 1) {
            return Character.valueOf(h.charAt(0));
        }
        throw new wv("Expecting character, got: ".concat(String.valueOf(h)));
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        Character ch = (Character) obj;
        abq.b(ch == null ? null : String.valueOf(ch));
    }
}
