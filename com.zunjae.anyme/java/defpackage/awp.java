package defpackage;

public enum awp {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    
    public static final String BETA_APP_PACKAGE_NAME = "io.crash.air";
    private final int id;

    private awp(int i) {
        this.id = i;
    }

    public static awp determineFrom(String str) {
        return BETA_APP_PACKAGE_NAME.equals(str) ? TEST_DISTRIBUTION : str != null ? APP_STORE : DEVELOPER;
    }

    public final int getId() {
        return this.id;
    }

    public final String toString() {
        return Integer.toString(this.id);
    }
}
