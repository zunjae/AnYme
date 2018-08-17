package org.jsoup.examples;

import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ListLinks {
    private static String a(String str, int i) {
        if (str.length() <= i) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.substring(0, i - 1));
        stringBuilder.append(".");
        return stringBuilder.toString();
    }

    private static void a(String str, Object... objArr) {
        System.out.println(String.format(str, objArr));
    }

    public static void main(String[] strArr) {
        Validate.isTrue(strArr.length == 1, "usage: supply url to fetch");
        a("Fetching %s...", strArr[0]);
        Document document = Jsoup.connect(r10).get();
        Elements select = document.select("a[href]");
        Elements select2 = document.select("[src]");
        Elements select3 = document.select("link[href]");
        a("\nMedia: (%d)", Integer.valueOf(select2.size()));
        Iterator it = select2.iterator();
        while (it.hasNext()) {
            if (((Element) it.next()).tagName().equals("img")) {
                a(" * %s: <%s> %sx%s (%s)", ((Element) it.next()).tagName(), ((Element) it.next()).attr("abs:src"), ((Element) it.next()).attr("width"), ((Element) it.next()).attr("height"), a(((Element) it.next()).attr("alt"), 20));
            } else {
                a(" * %s: <%s>", ((Element) it.next()).tagName(), ((Element) it.next()).attr("abs:src"));
            }
        }
        a("\nImports: (%d)", Integer.valueOf(select3.size()));
        Iterator it2 = select3.iterator();
        while (it2.hasNext()) {
            Element element = (Element) it2.next();
            a(" * %s <%s> (%s)", element.tagName(), element.attr("abs:href"), element.attr("rel"));
        }
        a("\nLinks: (%d)", Integer.valueOf(select.size()));
        it2 = select.iterator();
        while (it2.hasNext()) {
            Element element2 = (Element) it2.next();
            a(" * a: <%s>  (%s)", element2.attr("abs:href"), a(element2.text(), 35));
        }
    }
}
