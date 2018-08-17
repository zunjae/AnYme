package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class af {
    public final String a;
    public final Map<String, ag> b;
    public final Set<ah> c;
    public final Set<aj> d;

    public af(String str, Map<String, ag> map, Set<ah> set, Set<aj> set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static af a(o oVar, String str) {
        return new af(str, af.c(oVar, str), af.b(oVar, str), af.d(oVar, str));
    }

    private static aj a(o oVar, String str, boolean z) {
        StringBuilder stringBuilder = new StringBuilder("PRAGMA index_xinfo(`");
        stringBuilder.append(str);
        stringBuilder.append("`)");
        Cursor b = oVar.b(stringBuilder.toString());
        try {
            int columnIndex = b.getColumnIndex("seqno");
            int columnIndex2 = b.getColumnIndex("cid");
            int columnIndex3 = b.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (b.moveToNext()) {
                        if (b.getInt(columnIndex2) >= 0) {
                            int i = b.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), b.getString(columnIndex3));
                        }
                    }
                    List arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    aj ajVar = new aj(str, z, arrayList);
                    b.close();
                    return ajVar;
                }
            }
            b.close();
            return null;
        } catch (Throwable th) {
            b.close();
        }
    }

    private static List<ai> a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        List<ai> arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new ai(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<ah> b(o oVar, String str) {
        Set<ah> hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder("PRAGMA foreign_key_list(`");
        stringBuilder.append(str);
        stringBuilder.append("`)");
        Cursor b = oVar.b(stringBuilder.toString());
        try {
            int columnIndex = b.getColumnIndex("id");
            int columnIndex2 = b.getColumnIndex("seq");
            int columnIndex3 = b.getColumnIndex("table");
            int columnIndex4 = b.getColumnIndex("on_delete");
            int columnIndex5 = b.getColumnIndex("on_update");
            List<ai> a = af.a(b);
            int count = b.getCount();
            for (int i = 0; i < count; i++) {
                b.moveToPosition(i);
                if (b.getInt(columnIndex2) == 0) {
                    int i2 = b.getInt(columnIndex);
                    List arrayList = new ArrayList();
                    List arrayList2 = new ArrayList();
                    for (ai aiVar : a) {
                        if (aiVar.a == i2) {
                            arrayList.add(aiVar.c);
                            arrayList2.add(aiVar.d);
                        }
                    }
                    hashSet.add(new ah(b.getString(columnIndex3), b.getString(columnIndex4), b.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            b.close();
        }
    }

    private static Map<String, ag> c(o oVar, String str) {
        StringBuilder stringBuilder = new StringBuilder("PRAGMA table_info(`");
        stringBuilder.append(str);
        stringBuilder.append("`)");
        Cursor b = oVar.b(stringBuilder.toString());
        Map<String, ag> hashMap = new HashMap();
        try {
            if (b.getColumnCount() > 0) {
                int columnIndex = b.getColumnIndex("name");
                int columnIndex2 = b.getColumnIndex("type");
                int columnIndex3 = b.getColumnIndex("notnull");
                int columnIndex4 = b.getColumnIndex("pk");
                while (b.moveToNext()) {
                    String string = b.getString(columnIndex);
                    hashMap.put(string, new ag(string, b.getString(columnIndex2), b.getInt(columnIndex3) != 0, b.getInt(columnIndex4)));
                }
            }
            b.close();
            return hashMap;
        } catch (Throwable th) {
            b.close();
        }
    }

    private static Set<aj> d(o oVar, String str) {
        StringBuilder stringBuilder = new StringBuilder("PRAGMA index_list(`");
        stringBuilder.append(str);
        stringBuilder.append("`)");
        Cursor b = oVar.b(stringBuilder.toString());
        try {
            int columnIndex = b.getColumnIndex("name");
            int columnIndex2 = b.getColumnIndex("origin");
            int columnIndex3 = b.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    Set hashSet = new HashSet();
                    while (b.moveToNext()) {
                        if ("c".equals(b.getString(columnIndex2))) {
                            String string = b.getString(columnIndex);
                            boolean z = true;
                            if (b.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            aj a = af.a(oVar, string, z);
                            if (a == null) {
                                b.close();
                                return null;
                            }
                            hashSet.add(a);
                        }
                    }
                    b.close();
                    return hashSet;
                }
            }
            b.close();
            return null;
        } catch (Throwable th) {
            b.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        if (r5 == 0) goto L_0x0059;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0012;
    L_0x0011:
        goto L_0x0059;
    L_0x0012:
        r5 = (defpackage.af) r5;
        r2 = r4.a;
        if (r2 == 0) goto L_0x0021;
    L_0x0018:
        r3 = r5.a;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0026;
    L_0x0020:
        goto L_0x0025;
    L_0x0021:
        r2 = r5.a;
        if (r2 == 0) goto L_0x0026;
    L_0x0025:
        return r1;
    L_0x0026:
        r2 = r4.b;
        if (r2 == 0) goto L_0x0033;
    L_0x002a:
        r3 = r5.b;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0038;
    L_0x0032:
        goto L_0x0037;
    L_0x0033:
        r2 = r5.b;
        if (r2 == 0) goto L_0x0038;
    L_0x0037:
        return r1;
    L_0x0038:
        r2 = r4.c;
        if (r2 == 0) goto L_0x0045;
    L_0x003c:
        r3 = r5.c;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x004a;
    L_0x0044:
        goto L_0x0049;
    L_0x0045:
        r2 = r5.c;
        if (r2 == 0) goto L_0x004a;
    L_0x0049:
        return r1;
    L_0x004a:
        r1 = r4.d;
        if (r1 == 0) goto L_0x0058;
    L_0x004e:
        r5 = r5.d;
        if (r5 != 0) goto L_0x0053;
    L_0x0052:
        goto L_0x0058;
    L_0x0053:
        r5 = r1.equals(r5);
        return r5;
    L_0x0058:
        return r0;
    L_0x0059:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: af.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.b;
        hashCode = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TableInfo{name='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", columns=");
        stringBuilder.append(this.b);
        stringBuilder.append(", foreignKeys=");
        stringBuilder.append(this.c);
        stringBuilder.append(", indices=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
