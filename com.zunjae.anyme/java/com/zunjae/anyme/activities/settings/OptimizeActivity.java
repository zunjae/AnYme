package com.zunjae.anyme.activities.settings;

import android.os.Bundle;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import defpackage.aux;
import java.util.Iterator;

public final class OptimizeActivity extends AbstractActivity {
    private final String c = getClass().getSimpleName();
    private final String[] d = new String[]{"KEY_ANIME_SYNOPSIS", "KEY_GENRES_ANIME", "KEY_CHARACTERS", "KEY_VIDEOS_ANIME", "KEY_ANIME_RECOMMENDATIONS", "KEY_JIKAN_INFO", "KissAnime", "GoGoAnime", "AnimeHeavenRepo", "ChiaAnimeRepository", "AnimeFrostRepository", "BetterNineAnimeRepo", "KEY_DISCOVERY_ANIME", "AnimeFLVRepository", "AnimePaheRepository", "RyuAnimeRepository"};

    static /* synthetic */ boolean a(OptimizeActivity optimizeActivity, String str) {
        for (String startsWith : optimizeActivity.d) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    private static void c() {
        Iterator it = aux.b().getAll().entrySet().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_optimize);
        c();
        new g(this, this).f();
        c();
    }
}
