package defpackage;

public enum alx {
    ALL(0, "All"),
    AIRING(1, "Currently Airing"),
    FINISHED(2, "Finished Airing"),
    NOT_YET_AIRED(3, "Not yet Aired");
    
    private final String name;
    private final int value;

    private alx(int i, String str) {
        this.value = i;
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    public final int getValue() {
        return this.value;
    }

    public final String toString() {
        return this.name;
    }
}
