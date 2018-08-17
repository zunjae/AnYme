package defpackage;

public enum fa {
    ALL(true, true),
    NONE(false, false),
    SOURCE(true, false),
    RESULT(false, true);
    
    private final boolean cacheResult;
    private final boolean cacheSource;

    private fa(boolean z, boolean z2) {
        this.cacheSource = z;
        this.cacheResult = z2;
    }

    public final boolean cacheResult() {
        return this.cacheResult;
    }

    public final boolean cacheSource() {
        return this.cacheSource;
    }
}
