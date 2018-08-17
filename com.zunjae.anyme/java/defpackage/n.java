package defpackage;

public final class n implements v {
    private final String a;
    private final Object[] b;

    public n(String str) {
        this(str, null);
    }

    public n(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    public final String a() {
        return this.a;
    }

    public final void a(u uVar) {
        Object[] objArr = this.b;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    uVar.a(i);
                } else if (obj instanceof byte[]) {
                    uVar.a(i, (byte[]) obj);
                } else {
                    double floatValue;
                    if (obj instanceof Float) {
                        floatValue = (double) ((Float) obj).floatValue();
                    } else if (obj instanceof Double) {
                        floatValue = ((Double) obj).doubleValue();
                    } else {
                        long longValue;
                        if (obj instanceof Long) {
                            longValue = ((Long) obj).longValue();
                        } else {
                            int intValue;
                            if (obj instanceof Integer) {
                                intValue = ((Integer) obj).intValue();
                            } else if (obj instanceof Short) {
                                intValue = ((Short) obj).shortValue();
                            } else if (obj instanceof Byte) {
                                intValue = ((Byte) obj).byteValue();
                            } else if (obj instanceof String) {
                                uVar.a(i, (String) obj);
                            } else if (obj instanceof Boolean) {
                                longValue = ((Boolean) obj).booleanValue() ? 1 : 0;
                            } else {
                                StringBuilder stringBuilder = new StringBuilder("Cannot bind ");
                                stringBuilder.append(obj);
                                stringBuilder.append(" at index ");
                                stringBuilder.append(i);
                                stringBuilder.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            longValue = (long) intValue;
                        }
                        uVar.a(i, longValue);
                    }
                    uVar.a(i, floatValue);
                }
            }
        }
    }
}
