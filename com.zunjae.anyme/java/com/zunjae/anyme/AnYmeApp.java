package com.zunjae.anyme;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.joanzapata.iconify.fonts.MaterialModule;
import com.zunjae.anyme.services.UpdaterService;
import defpackage.afo;
import defpackage.ajd;
import defpackage.aux;
import io.github.inflationx.calligraphy3.CalligraphyConfig.Builder;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.calligraphy3.R;
import io.github.inflationx.viewpump.ViewPump;

public class AnYmeApp extends Application {
    private final String a = "AnYmeApp";

    public void onCreate() {
        super.onCreate();
        aux.a((Context) this);
        Intent intent = new Intent(this, UpdaterService.class);
        intent.putExtra("withAutomaticRetry", true);
        intent.putExtra("delay", 0);
        startService(intent);
        new b().execute(new Void[0]);
        ajd.a((Context) this);
        Iconify.with(new FontAwesomeModule()).with(new MaterialModule());
        ViewPump.init(ViewPump.builder().addInterceptor(new CalligraphyInterceptor(new Builder().setDefaultFontPath("fonts/GoogleSans-Bold.ttf").setFontAttrId(R.attr.fontPath).build())).build());
        afo.a(new a(this));
    }
}
