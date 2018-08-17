package com.mikepenz.fastadapter;

import java.util.List;

public interface v<Model, Item extends u> extends h<Item> {
    v<Model, Item> a();

    v<Model, Item> a(int i, int i2);

    v<Model, Item> a(int i, Model model);

    v<Model, Item> a(int i, List<Item> list);

    v<Model, Item> a(List<Model> list);

    v<Model, Item> a(Model... modelArr);
}
