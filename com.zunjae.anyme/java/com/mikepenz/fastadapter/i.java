package com.mikepenz.fastadapter;

import android.os.Bundle;
import android.view.View;
import javax.annotation.Nullable;

public interface i<Item extends u> {
    i<Item> a(b<Item> bVar);

    void a();

    void a(int i, int i2);

    void a(@Nullable Bundle bundle, String str);

    boolean a(View view, int i, Item item);

    void b();

    void b(@Nullable Bundle bundle, String str);

    boolean b(View view, int i, Item item);
}
