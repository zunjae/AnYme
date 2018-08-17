package defpackage;

import org.jsoup.helper.StringUtil;

public final class ajf {
    public static boolean a(String str) {
        if (StringUtil.isBlank(str)) {
            return false;
        }
        str = str.toLowerCase();
        Object obj = (str.contains("bakavideo.tv") && str.contains(".mp4")) ? 1 : null;
        if (obj == null) {
            obj = (str.contains("mediafire.com") && str.contains(".mp4")) ? 1 : null;
            if (obj == null && !str.contains("drive.amazonaws.com/cdproxy/templink/")) {
                obj = (str.contains("oose.io/play/") && str.contains(".mp4")) ? 1 : null;
                if (obj == null) {
                    obj = (!str.contains("bp.blogspot.com/") || str.contains("images2-focus-opensocial")) ? null : 1;
                    if (!(obj != null || str.contains("drive.google.com/videoplayback?") || str.contains("googlevideo.com/videoplayback?"))) {
                        obj = (str.contains("fbcdn.net") && str.contains(".mp4")) ? 1 : null;
                        if (obj == null) {
                            obj = (str.contains("gdvid") && str.contains(".mp4")) ? 1 : null;
                            if (obj == null) {
                                obj = (str.contains("trollvid.net") && str.contains(".mp4")) ? 1 : null;
                                if (obj == null) {
                                    obj = (str.contains("mp4upload") && str.contains("video.mp4")) ? 1 : null;
                                    if (obj == null) {
                                        obj = (str.contains("tiwicdn") && str.contains(".mp4")) ? 1 : null;
                                        if (obj == null) {
                                            obj = (str.contains("drive.google.com/videoplayback") && str.contains("mime=video")) ? 1 : null;
                                            if (obj == null) {
                                                obj = (str.contains("oloadcdn.net") && str.contains(".mp4")) ? 1 : null;
                                                if (obj == null) {
                                                    obj = (str.contains("mycloud.to") && str.contains("m3u8")) ? 1 : null;
                                                    if (obj == null && !str.contains("docs.google.com/videoplayback?")) {
                                                        obj = (str.contains("escdn.co") && str.contains("m3u8")) ? 1 : null;
                                                        if (obj == null) {
                                                            obj = (str.contains("hentaihaven.org") && str.endsWith(".mp4")) ? 1 : null;
                                                            if (obj == null) {
                                                                obj = (str.contains("animeheaven.eu") && str.contains(".mp4")) ? 1 : null;
                                                                if (obj == null) {
                                                                    obj = (str.contains("hanime.tv") && str.contains(".mp4")) ? 1 : null;
                                                                    if (obj == null) {
                                                                        obj = (str.contains("twist.moe") && str.endsWith(".mp4")) ? 1 : null;
                                                                        if (obj == null) {
                                                                            obj = (str.contains("moecdn.io") && str.contains("download_token")) ? 1 : null;
                                                                            if (obj == null) {
                                                                                obj = (str.contains("hh.cx") && str.endsWith(".mp4")) ? 1 : null;
                                                                                if (obj == null) {
                                                                                    obj = (str.contains("phprcdn.com") && str.contains(".mp4")) ? 1 : null;
                                                                                    if (obj == null) {
                                                                                        obj = (str.contains("anime.tv") && str.contains(".mp4")) ? 1 : null;
                                                                                        if (obj == null) {
                                                                                            obj = (str.contains("phncdn.com") && str.contains(".mp4")) ? 1 : null;
                                                                                            if (obj == null) {
                                                                                                obj = (str.contains("appspot.com") && str.contains(".mp4")) ? 1 : null;
                                                                                                if (obj == null && !str.endsWith(".mp4")) {
                                                                                                    obj = (str.contains("ohentai.com") && str.endsWith(".mp4")) ? 1 : null;
                                                                                                    if (obj == null && !str.contains("hentaihaven.org/play.php?data=")) {
                                                                                                        obj = (str.contains("aika.masterani.me") && str.contains("/v/")) ? 1 : null;
                                                                                                        if (obj == null) {
                                                                                                            obj = (str.contains("163.172.48.85") && str.endsWith(".mp4")) ? 1 : null;
                                                                                                            if (obj == null) {
                                                                                                                obj = (str.contains("fruithosted") && str.contains(".mp4")) ? 1 : null;
                                                                                                                if (obj == null) {
                                                                                                                    obj = (str.contains("vidlox.tv") && str.contains(".m3u8")) ? 1 : null;
                                                                                                                    if (obj == null) {
                                                                                                                        obj = (str.contains("thevideo.me") && str.contains(".mp4")) ? 1 : null;
                                                                                                                        if (obj == null) {
                                                                                                                            Object obj2 = (str.contains("playercdn.net") && str.endsWith(".mp4")) ? 1 : null;
                                                                                                                            if (obj2 == null) {
                                                                                                                                return false;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
