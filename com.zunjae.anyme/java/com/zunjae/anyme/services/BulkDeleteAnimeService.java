package com.zunjae.anyme.services;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import defpackage.amr;
import defpackage.ams;
import defpackage.amt;
import defpackage.ang;
import defpackage.are;
import defpackage.ast;
import defpackage.atj;
import defpackage.aui;
import java.util.ArrayList;
import java.util.List;

public class BulkDeleteAnimeService extends IntentService {
    public static boolean a;
    private final String b = getClass().getSimpleName();
    private final int c = 2500;
    private final ArrayList<ang> d = new ArrayList();

    public BulkDeleteAnimeService() {
        super("BulkDeleteAnimeService");
    }

    public static Intent a(Context context, ArrayList<Integer> arrayList) {
        Intent intent = new Intent(context, BulkDeleteAnimeService.class);
        intent.putExtra("selectedIDs", arrayList);
        return intent;
    }

    protected void onHandleIntent(Intent intent) {
        getApplication();
        ast ast = new ast(getApplication());
        List<are> k = ast.k();
        ArrayList integerArrayListExtra = intent.getIntegerArrayListExtra("selectedIDs");
        if (integerArrayListExtra != null) {
            int i = 0;
            for (are are : k) {
                if (integerArrayListExtra.contains(Integer.valueOf(are.d()))) {
                    this.d.add(new ang(are.d(), are.g()));
                    i++;
                    aui.a().d(new ams(are.g(), i, integerArrayListExtra.size(), ((integerArrayListExtra.size() - i) * 2500) / 1000));
                    if (!a) {
                        break;
                    }
                    try {
                        int b = atj.b(are.d());
                        if (b < 200 || b >= 300) {
                            aui.a().d(new amt(String.format("Could not delete %s", new Object[]{are.g()})));
                        } else {
                            ast.c(are);
                        }
                        Thread.sleep(2500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            aui.a().d(new amr());
            return;
        }
        throw new NullPointerException("Incorrectly set the arguments");
    }
}
