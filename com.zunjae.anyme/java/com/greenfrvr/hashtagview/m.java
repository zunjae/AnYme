package com.greenfrvr.hashtagview;

import java.util.List;
import java.util.ListIterator;

final class m {
    public static <T> void a(List<T> list) {
        int i;
        Object[] objArr = new Object[list.size()];
        int i2 = 0;
        for (i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                objArr[((list.size() - i) / 2) + ((list.size() % 2) - 1)] = list.get(i);
            } else {
                objArr[(list.size() + i) / 2] = list.get(i);
            }
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
            i = i2 + 1;
            listIterator.set(objArr[i2]);
            i2 = i;
        }
    }
}
