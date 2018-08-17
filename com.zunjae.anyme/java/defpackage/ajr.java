package defpackage;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;

public final class ajr {
    private static final String a = "ajr";

    public static alg a(aln aln) {
        try {
            Response execute = Jsoup.connect("https://myanimelist.net/api/account/verify_credentials.xml").timeout(5000).userAgent("api-pocket-mal-9D7CB1C18D93BFE51A84AC1908704369").ignoreHttpErrors(true).header("Authorization", anq.a(aln)).execute();
            return new alg(execute.statusCode(), execute.body());
        } catch (Exception e) {
            return new alg(1, e.getMessage());
        }
    }
}
