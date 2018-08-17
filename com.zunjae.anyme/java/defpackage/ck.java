package defpackage;

import android.content.Context;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.util.SimpleArrayMap;
import android.support.v7.view.menu.aj;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class ck implements cf {
    final Callback a;
    final Context b;
    final ArrayList<cj> c = new ArrayList();
    final SimpleArrayMap<Menu, Menu> d = new SimpleArrayMap();

    public ck(Context context, Callback callback) {
        this.b = context;
        this.a = callback;
    }

    private Menu a(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        menu2 = aj.a(this.b, (SupportMenu) menu);
        this.d.put(menu, menu2);
        return menu2;
    }

    public final void a(ce ceVar) {
        this.a.onDestroyActionMode(b(ceVar));
    }

    public final boolean a(ce ceVar, Menu menu) {
        return this.a.onCreateActionMode(b(ceVar), a(menu));
    }

    public final boolean a(ce ceVar, MenuItem menuItem) {
        return this.a.onActionItemClicked(b(ceVar), aj.a(this.b, (SupportMenuItem) menuItem));
    }

    public final ActionMode b(ce ceVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            cj cjVar = (cj) this.c.get(i);
            if (cjVar != null && cjVar.b == ceVar) {
                return cjVar;
            }
        }
        ActionMode cjVar2 = new cj(this.b, ceVar);
        this.c.add(cjVar2);
        return cjVar2;
    }

    public final boolean b(ce ceVar, Menu menu) {
        return this.a.onPrepareActionMode(b(ceVar), a(menu));
    }
}
