package com.zunjae.anyme;

import android.arch.persistence.room.q;
import defpackage.af;
import defpackage.ag;
import defpackage.aj;
import defpackage.o;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class c extends q {
    final /* synthetic */ AppDatabase_Impl b;

    c(AppDatabase_Impl appDatabase_Impl) {
        this.b = appDatabase_Impl;
    }

    protected final void a() {
        if (this.b.c != null) {
            int size = this.b.c.size();
            for (int i = 0; i < size; i++) {
                this.b.c.get(i);
            }
        }
    }

    public final void a(o oVar) {
        oVar.c("DROP TABLE IF EXISTS `animes`");
        oVar.c("DROP TABLE IF EXISTS `characters`");
        oVar.c("DROP TABLE IF EXISTS `AnimeJikanInfoR2`");
        oVar.c("DROP TABLE IF EXISTS `animerecommendations`");
        oVar.c("DROP TABLE IF EXISTS `releasedays`");
        oVar.c("DROP TABLE IF EXISTS `MinimalAnimeInfo`");
        oVar.c("DROP TABLE IF EXISTS `minimal_kitsu_info`");
        oVar.c("DROP TABLE IF EXISTS `livechart_entry`");
        oVar.c("DROP TABLE IF EXISTS `related_animes`");
        oVar.c("DROP TABLE IF EXISTS `nsfwshows`");
        oVar.c("DROP TABLE IF EXISTS `waifus`");
    }

    public final void b(o oVar) {
        oVar.c("CREATE TABLE IF NOT EXISTS `animes` (`series_animedb_id` INTEGER NOT NULL, `series_title` TEXT, `series_synonyms` TEXT, `series_type` INTEGER NOT NULL, `series_episodes` INTEGER NOT NULL, `series_status` INTEGER NOT NULL, `series_start` TEXT, `series_end` TEXT, `series_image` TEXT, `my_watched_episodes` INTEGER NOT NULL, `my_start_date` TEXT, `my_finish_date` TEXT, `my_score` INTEGER NOT NULL, `my_rewatching` INTEGER NOT NULL, `my_rewatching_ep` INTEGER NOT NULL, `my_last_updated` INTEGER NOT NULL, `my_tags` TEXT, `my_status` INTEGER NOT NULL, `kitsu_malId` INTEGER, `kitsu_kitsuId` INTEGER, `kitsu_startDate` TEXT, `kitsu_endDate` TEXT, `kitsu_posterId` TEXT, `kitsu_coverId` TEXT, `kitsu_type` TEXT, `kitsu_titleEnJp` TEXT, `kitsu_titleEn` TEXT, `kitsu_titleJaJp` TEXT, `livechart_malid` INTEGER, `livechart_time` INTEGER, `livechart_episode` INTEGER, PRIMARY KEY(`series_animedb_id`))");
        oVar.c("CREATE TABLE IF NOT EXISTS `characters` (`name` TEXT, `characterURL` TEXT, `imageURL` TEXT NOT NULL, `animeId` INTEGER NOT NULL, PRIMARY KEY(`imageURL`))");
        oVar.c("CREATE TABLE IF NOT EXISTS `AnimeJikanInfoR2` (`malId` INTEGER, `link_canonical` TEXT, `title` TEXT, `title_english` TEXT, `title_synonyms` TEXT, `image_url` TEXT, `type` TEXT, `source` TEXT, `episodes` INTEGER, `status` TEXT, `aired_string` TEXT, `duration` TEXT, `rating` TEXT, `score` REAL, `rank` INTEGER, `synopsis` TEXT, `broadcast` TEXT, `studio` TEXT, `genre` TEXT, `opening_theme` TEXT, `ending_theme` TEXT, `expirationDate` INTEGER NOT NULL, `jikanRelated` TEXT, PRIMARY KEY(`malId`))");
        oVar.c("CREATE TABLE IF NOT EXISTS `animerecommendations` (`animeId` INTEGER NOT NULL, `parentAnimeId` INTEGER NOT NULL, `title` TEXT, `image` TEXT, `recommendedBy` TEXT, `shortDescription` TEXT, `readMoreURL` TEXT, `priority` INTEGER NOT NULL, PRIMARY KEY(`animeId`, `parentAnimeId`))");
        oVar.c("CREATE  INDEX `index_animerecommendations_parentAnimeId` ON `animerecommendations` (`parentAnimeId`)");
        oVar.c("CREATE TABLE IF NOT EXISTS `releasedays` (`day` TEXT, `anime_id` INTEGER NOT NULL, PRIMARY KEY(`anime_id`))");
        oVar.c("CREATE TABLE IF NOT EXISTS `MinimalAnimeInfo` (`series_animedb_id` INTEGER NOT NULL, `series_title` TEXT, `series_image` TEXT, PRIMARY KEY(`series_animedb_id`))");
        oVar.c("CREATE TABLE IF NOT EXISTS `minimal_kitsu_info` (`malId` INTEGER NOT NULL, `kitsuId` INTEGER NOT NULL, `startDate` TEXT, `endDate` TEXT, `posterId` TEXT, `coverId` TEXT, `type` TEXT, `titleEnJp` TEXT, `titleEn` TEXT, `titleJaJp` TEXT, PRIMARY KEY(`malId`))");
        oVar.c("CREATE TABLE IF NOT EXISTS `livechart_entry` (`malid` INTEGER, `time` INTEGER NOT NULL, `series_cover` TEXT, `tags` TEXT, `title` TEXT, `episode` INTEGER NOT NULL, `dayOfWeek` INTEGER NOT NULL, PRIMARY KEY(`malid`))");
        oVar.c("CREATE TABLE IF NOT EXISTS `related_animes` (`parent_anime_id` INTEGER NOT NULL, `series_id` INTEGER NOT NULL, `title` TEXT, `type` TEXT, `episodes` INTEGER, `picture` TEXT, `expiration_date` INTEGER NOT NULL, PRIMARY KEY(`parent_anime_id`, `series_id`))");
        oVar.c("CREATE TABLE IF NOT EXISTS `nsfwshows` (`nsfw_animeid` INTEGER NOT NULL, PRIMARY KEY(`nsfw_animeid`))");
        oVar.c("CREATE TABLE IF NOT EXISTS `waifus` (`waifu_id` INTEGER NOT NULL, `parent_anime_id` INTEGER NOT NULL, `waifu_name` TEXT, `waifu_image_url` TEXT, `date_created` INTEGER NOT NULL, PRIMARY KEY(`waifu_id`))");
        oVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        oVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"e1e6d5999a9db9ee03b44c933d47131e\")");
    }

    public final void c(o oVar) {
        this.b.a = oVar;
        this.b.a(oVar);
        if (this.b.c != null) {
            int size = this.b.c.size();
            for (int i = 0; i < size; i++) {
                this.b.c.get(i);
            }
        }
    }

    protected final void d(o oVar) {
        Map hashMap = new HashMap(31);
        hashMap.put("series_animedb_id", new ag("series_animedb_id", "INTEGER", true, 1));
        hashMap.put("series_title", new ag("series_title", "TEXT", false, 0));
        hashMap.put("series_synonyms", new ag("series_synonyms", "TEXT", false, 0));
        hashMap.put("series_type", new ag("series_type", "INTEGER", true, 0));
        hashMap.put("series_episodes", new ag("series_episodes", "INTEGER", true, 0));
        hashMap.put("series_status", new ag("series_status", "INTEGER", true, 0));
        hashMap.put("series_start", new ag("series_start", "TEXT", false, 0));
        hashMap.put("series_end", new ag("series_end", "TEXT", false, 0));
        hashMap.put("series_image", new ag("series_image", "TEXT", false, 0));
        hashMap.put("my_watched_episodes", new ag("my_watched_episodes", "INTEGER", true, 0));
        hashMap.put("my_start_date", new ag("my_start_date", "TEXT", false, 0));
        hashMap.put("my_finish_date", new ag("my_finish_date", "TEXT", false, 0));
        hashMap.put("my_score", new ag("my_score", "INTEGER", true, 0));
        hashMap.put("my_rewatching", new ag("my_rewatching", "INTEGER", true, 0));
        hashMap.put("my_rewatching_ep", new ag("my_rewatching_ep", "INTEGER", true, 0));
        hashMap.put("my_last_updated", new ag("my_last_updated", "INTEGER", true, 0));
        hashMap.put("my_tags", new ag("my_tags", "TEXT", false, 0));
        hashMap.put("my_status", new ag("my_status", "INTEGER", true, 0));
        hashMap.put("kitsu_malId", new ag("kitsu_malId", "INTEGER", false, 0));
        hashMap.put("kitsu_kitsuId", new ag("kitsu_kitsuId", "INTEGER", false, 0));
        hashMap.put("kitsu_startDate", new ag("kitsu_startDate", "TEXT", false, 0));
        hashMap.put("kitsu_endDate", new ag("kitsu_endDate", "TEXT", false, 0));
        hashMap.put("kitsu_posterId", new ag("kitsu_posterId", "TEXT", false, 0));
        hashMap.put("kitsu_coverId", new ag("kitsu_coverId", "TEXT", false, 0));
        hashMap.put("kitsu_type", new ag("kitsu_type", "TEXT", false, 0));
        hashMap.put("kitsu_titleEnJp", new ag("kitsu_titleEnJp", "TEXT", false, 0));
        hashMap.put("kitsu_titleEn", new ag("kitsu_titleEn", "TEXT", false, 0));
        hashMap.put("kitsu_titleJaJp", new ag("kitsu_titleJaJp", "TEXT", false, 0));
        hashMap.put("livechart_malid", new ag("livechart_malid", "INTEGER", false, 0));
        hashMap.put("livechart_time", new ag("livechart_time", "INTEGER", false, 0));
        hashMap.put("livechart_episode", new ag("livechart_episode", "INTEGER", false, 0));
        af afVar = new af("animes", hashMap, new HashSet(0), new HashSet(0));
        af a = af.a(oVar, "animes");
        StringBuilder stringBuilder;
        if (afVar.equals(a)) {
            hashMap = new HashMap(4);
            hashMap.put("name", new ag("name", "TEXT", false, 0));
            hashMap.put("characterURL", new ag("characterURL", "TEXT", false, 0));
            hashMap.put("imageURL", new ag("imageURL", "TEXT", true, 1));
            hashMap.put("animeId", new ag("animeId", "INTEGER", true, 0));
            afVar = new af("characters", hashMap, new HashSet(0), new HashSet(0));
            a = af.a(oVar, "characters");
            if (afVar.equals(a)) {
                hashMap = new HashMap(23);
                hashMap.put("malId", new ag("malId", "INTEGER", false, 1));
                hashMap.put("link_canonical", new ag("link_canonical", "TEXT", false, 0));
                hashMap.put("title", new ag("title", "TEXT", false, 0));
                hashMap.put("title_english", new ag("title_english", "TEXT", false, 0));
                hashMap.put("title_synonyms", new ag("title_synonyms", "TEXT", false, 0));
                hashMap.put("image_url", new ag("image_url", "TEXT", false, 0));
                hashMap.put("type", new ag("type", "TEXT", false, 0));
                hashMap.put("source", new ag("source", "TEXT", false, 0));
                hashMap.put("episodes", new ag("episodes", "INTEGER", false, 0));
                hashMap.put("status", new ag("status", "TEXT", false, 0));
                hashMap.put("aired_string", new ag("aired_string", "TEXT", false, 0));
                hashMap.put("duration", new ag("duration", "TEXT", false, 0));
                hashMap.put("rating", new ag("rating", "TEXT", false, 0));
                hashMap.put("score", new ag("score", "REAL", false, 0));
                hashMap.put("rank", new ag("rank", "INTEGER", false, 0));
                hashMap.put("synopsis", new ag("synopsis", "TEXT", false, 0));
                hashMap.put("broadcast", new ag("broadcast", "TEXT", false, 0));
                hashMap.put("studio", new ag("studio", "TEXT", false, 0));
                hashMap.put("genre", new ag("genre", "TEXT", false, 0));
                hashMap.put("opening_theme", new ag("opening_theme", "TEXT", false, 0));
                hashMap.put("ending_theme", new ag("ending_theme", "TEXT", false, 0));
                hashMap.put("expirationDate", new ag("expirationDate", "INTEGER", true, 0));
                hashMap.put("jikanRelated", new ag("jikanRelated", "TEXT", false, 0));
                afVar = new af("AnimeJikanInfoR2", hashMap, new HashSet(0), new HashSet(0));
                a = af.a(oVar, "AnimeJikanInfoR2");
                if (afVar.equals(a)) {
                    hashMap = new HashMap(8);
                    hashMap.put("animeId", new ag("animeId", "INTEGER", true, 1));
                    hashMap.put("parentAnimeId", new ag("parentAnimeId", "INTEGER", true, 2));
                    hashMap.put("title", new ag("title", "TEXT", false, 0));
                    hashMap.put("image", new ag("image", "TEXT", false, 0));
                    hashMap.put("recommendedBy", new ag("recommendedBy", "TEXT", false, 0));
                    hashMap.put("shortDescription", new ag("shortDescription", "TEXT", false, 0));
                    hashMap.put("readMoreURL", new ag("readMoreURL", "TEXT", false, 0));
                    hashMap.put("priority", new ag("priority", "INTEGER", true, 0));
                    Set hashSet = new HashSet(0);
                    Set hashSet2 = new HashSet(1);
                    hashSet2.add(new aj("index_animerecommendations_parentAnimeId", false, Arrays.asList(new String[]{"parentAnimeId"})));
                    afVar = new af("animerecommendations", hashMap, hashSet, hashSet2);
                    a = af.a(oVar, "animerecommendations");
                    if (afVar.equals(a)) {
                        hashMap = new HashMap(2);
                        hashMap.put("day", new ag("day", "TEXT", false, 0));
                        hashMap.put("anime_id", new ag("anime_id", "INTEGER", true, 1));
                        afVar = new af("releasedays", hashMap, new HashSet(0), new HashSet(0));
                        a = af.a(oVar, "releasedays");
                        if (afVar.equals(a)) {
                            hashMap = new HashMap(3);
                            hashMap.put("series_animedb_id", new ag("series_animedb_id", "INTEGER", true, 1));
                            hashMap.put("series_title", new ag("series_title", "TEXT", false, 0));
                            hashMap.put("series_image", new ag("series_image", "TEXT", false, 0));
                            afVar = new af("MinimalAnimeInfo", hashMap, new HashSet(0), new HashSet(0));
                            a = af.a(oVar, "MinimalAnimeInfo");
                            if (afVar.equals(a)) {
                                hashMap = new HashMap(10);
                                hashMap.put("malId", new ag("malId", "INTEGER", true, 1));
                                hashMap.put("kitsuId", new ag("kitsuId", "INTEGER", true, 0));
                                hashMap.put("startDate", new ag("startDate", "TEXT", false, 0));
                                hashMap.put("endDate", new ag("endDate", "TEXT", false, 0));
                                hashMap.put("posterId", new ag("posterId", "TEXT", false, 0));
                                hashMap.put("coverId", new ag("coverId", "TEXT", false, 0));
                                hashMap.put("type", new ag("type", "TEXT", false, 0));
                                hashMap.put("titleEnJp", new ag("titleEnJp", "TEXT", false, 0));
                                hashMap.put("titleEn", new ag("titleEn", "TEXT", false, 0));
                                hashMap.put("titleJaJp", new ag("titleJaJp", "TEXT", false, 0));
                                afVar = new af("minimal_kitsu_info", hashMap, new HashSet(0), new HashSet(0));
                                a = af.a(oVar, "minimal_kitsu_info");
                                if (afVar.equals(a)) {
                                    hashMap = new HashMap(7);
                                    hashMap.put("malid", new ag("malid", "INTEGER", false, 1));
                                    hashMap.put("time", new ag("time", "INTEGER", true, 0));
                                    hashMap.put("series_cover", new ag("series_cover", "TEXT", false, 0));
                                    hashMap.put("tags", new ag("tags", "TEXT", false, 0));
                                    hashMap.put("title", new ag("title", "TEXT", false, 0));
                                    hashMap.put("episode", new ag("episode", "INTEGER", true, 0));
                                    hashMap.put("dayOfWeek", new ag("dayOfWeek", "INTEGER", true, 0));
                                    af afVar2 = new af("livechart_entry", hashMap, new HashSet(0), new HashSet(0));
                                    a = af.a(oVar, "livechart_entry");
                                    if (afVar2.equals(a)) {
                                        hashMap = new HashMap(7);
                                        hashMap.put("parent_anime_id", new ag("parent_anime_id", "INTEGER", true, 1));
                                        hashMap.put("series_id", new ag("series_id", "INTEGER", true, 2));
                                        hashMap.put("title", new ag("title", "TEXT", false, 0));
                                        hashMap.put("type", new ag("type", "TEXT", false, 0));
                                        hashMap.put("episodes", new ag("episodes", "INTEGER", false, 0));
                                        hashMap.put("picture", new ag("picture", "TEXT", false, 0));
                                        hashMap.put("expiration_date", new ag("expiration_date", "INTEGER", true, 0));
                                        afVar = new af("related_animes", hashMap, new HashSet(0), new HashSet(0));
                                        a = af.a(oVar, "related_animes");
                                        if (afVar.equals(a)) {
                                            hashMap = new HashMap(1);
                                            hashMap.put("nsfw_animeid", new ag("nsfw_animeid", "INTEGER", true, 1));
                                            afVar = new af("nsfwshows", hashMap, new HashSet(0), new HashSet(0));
                                            a = af.a(oVar, "nsfwshows");
                                            if (afVar.equals(a)) {
                                                hashMap = new HashMap(5);
                                                hashMap.put("waifu_id", new ag("waifu_id", "INTEGER", true, 1));
                                                hashMap.put("parent_anime_id", new ag("parent_anime_id", "INTEGER", true, 0));
                                                hashMap.put("waifu_name", new ag("waifu_name", "TEXT", false, 0));
                                                hashMap.put("waifu_image_url", new ag("waifu_image_url", "TEXT", false, 0));
                                                hashMap.put("date_created", new ag("date_created", "INTEGER", true, 0));
                                                afVar = new af("waifus", hashMap, new HashSet(0), new HashSet(0));
                                                af a2 = af.a(oVar, "waifus");
                                                if (!afVar.equals(a2)) {
                                                    stringBuilder = new StringBuilder("Migration didn't properly handle waifus(com.zunjae.anyme.rewrite.models.kanon.KanonWaifu).\n Expected:\n");
                                                    stringBuilder.append(afVar);
                                                    stringBuilder.append("\n Found:\n");
                                                    stringBuilder.append(a2);
                                                    throw new IllegalStateException(stringBuilder.toString());
                                                }
                                                return;
                                            }
                                            stringBuilder = new StringBuilder("Migration didn't properly handle nsfwshows(com.zunjae.anyme.rewrite.models.NSFWShows).\n Expected:\n");
                                            stringBuilder.append(afVar);
                                            stringBuilder.append("\n Found:\n");
                                            stringBuilder.append(a);
                                            throw new IllegalStateException(stringBuilder.toString());
                                        }
                                        stringBuilder = new StringBuilder("Migration didn't properly handle related_animes(com.zunjae.anyme.models.anime.RelatedAnimeR2).\n Expected:\n");
                                        stringBuilder.append(afVar);
                                        stringBuilder.append("\n Found:\n");
                                        stringBuilder.append(a);
                                        throw new IllegalStateException(stringBuilder.toString());
                                    }
                                    stringBuilder = new StringBuilder("Migration didn't properly handle livechart_entry(com.zunjae.anyme.rewrite.models.LiveChartEntryR2).\n Expected:\n");
                                    stringBuilder.append(afVar2);
                                    stringBuilder.append("\n Found:\n");
                                    stringBuilder.append(a);
                                    throw new IllegalStateException(stringBuilder.toString());
                                }
                                stringBuilder = new StringBuilder("Migration didn't properly handle minimal_kitsu_info(com.zunjae.anyme.rewrite.models.kanon.MinimalKitsuInfo).\n Expected:\n");
                                stringBuilder.append(afVar);
                                stringBuilder.append("\n Found:\n");
                                stringBuilder.append(a);
                                throw new IllegalStateException(stringBuilder.toString());
                            }
                            stringBuilder = new StringBuilder("Migration didn't properly handle MinimalAnimeInfo(com.zunjae.anyme.rewrite.models.MinimalAnimeInfo).\n Expected:\n");
                            stringBuilder.append(afVar);
                            stringBuilder.append("\n Found:\n");
                            stringBuilder.append(a);
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                        stringBuilder = new StringBuilder("Migration didn't properly handle releasedays(com.zunjae.anyme.rewrite.models.ReleaseDay).\n Expected:\n");
                        stringBuilder.append(afVar);
                        stringBuilder.append("\n Found:\n");
                        stringBuilder.append(a);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    stringBuilder = new StringBuilder("Migration didn't properly handle animerecommendations(com.zunjae.anyme.rewrite.models.AnimeRecommendationR2).\n Expected:\n");
                    stringBuilder.append(afVar);
                    stringBuilder.append("\n Found:\n");
                    stringBuilder.append(a);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                stringBuilder = new StringBuilder("Migration didn't properly handle AnimeJikanInfoR2(com.zunjae.anyme.rewrite.models.jikan.AnimeJikanInfoR2).\n Expected:\n");
                stringBuilder.append(afVar);
                stringBuilder.append("\n Found:\n");
                stringBuilder.append(a);
                throw new IllegalStateException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder("Migration didn't properly handle characters(com.zunjae.anyme.rewrite.models.CharacterR2).\n Expected:\n");
            stringBuilder.append(afVar);
            stringBuilder.append("\n Found:\n");
            stringBuilder.append(a);
            throw new IllegalStateException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder("Migration didn't properly handle animes(com.zunjae.anyme.rewrite.models.AnimeR2).\n Expected:\n");
        stringBuilder.append(afVar);
        stringBuilder.append("\n Found:\n");
        stringBuilder.append(a);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
