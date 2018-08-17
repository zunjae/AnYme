package org.jsoup;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Whitelist;

public class Jsoup {
    private Jsoup() {
    }

    public static String clean(String str, String str2, Whitelist whitelist) {
        return new Cleaner(whitelist).clean(parseBodyFragment(str, str2)).body().html();
    }

    public static String clean(String str, String str2, Whitelist whitelist, OutputSettings outputSettings) {
        Document clean = new Cleaner(whitelist).clean(parseBodyFragment(str, str2));
        clean.outputSettings(outputSettings);
        return clean.body().html();
    }

    public static String clean(String str, Whitelist whitelist) {
        return clean(str, BuildConfig.FLAVOR, whitelist);
    }

    public static Connection connect(String str) {
        return HttpConnection.connect(str);
    }

    public static boolean isValid(String str, Whitelist whitelist) {
        return new Cleaner(whitelist).isValidBodyHtml(str);
    }

    public static Document parse(File file, String str) {
        return DataUtil.load(file, str, file.getAbsolutePath());
    }

    public static Document parse(File file, String str, String str2) {
        return DataUtil.load(file, str, str2);
    }

    public static Document parse(InputStream inputStream, String str, String str2) {
        return DataUtil.load(inputStream, str, str2);
    }

    public static Document parse(InputStream inputStream, String str, String str2, Parser parser) {
        return DataUtil.load(inputStream, str, str2, parser);
    }

    public static Document parse(String str) {
        return Parser.parse(str, BuildConfig.FLAVOR);
    }

    public static Document parse(String str, String str2) {
        return Parser.parse(str, str2);
    }

    public static Document parse(String str, String str2, Parser parser) {
        return parser.parseInput(str, str2);
    }

    public static Document parse(URL url, int i) {
        Connection connect = HttpConnection.connect(url);
        connect.timeout(i);
        return connect.get();
    }

    public static Document parseBodyFragment(String str) {
        return Parser.parseBodyFragment(str, BuildConfig.FLAVOR);
    }

    public static Document parseBodyFragment(String str, String str2) {
        return Parser.parseBodyFragment(str, str2);
    }
}
