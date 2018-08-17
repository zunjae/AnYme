package org.jsoup.examples;

import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;

public class HtmlToPlainText {
    public static void main(String... strArr) {
        boolean z;
        String str;
        String str2;
        Element element;
        HtmlToPlainText htmlToPlainText;
        Iterator it;
        if (strArr.length != 1) {
            if (strArr.length != 2) {
                z = false;
                Validate.isTrue(z, "usage: java -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]");
                str = strArr[0];
                str2 = strArr.length != 2 ? strArr[1] : null;
                element = Jsoup.connect(str).userAgent("Mozilla/5.0 (jsoup)").timeout(5000).get();
                htmlToPlainText = new HtmlToPlainText();
                if (str2 == null) {
                    it = element.select(str2).iterator();
                    while (it.hasNext()) {
                        System.out.println(htmlToPlainText.getPlainText((Element) it.next()));
                    }
                }
                System.out.println(htmlToPlainText.getPlainText(element));
                return;
            }
        }
        z = true;
        Validate.isTrue(z, "usage: java -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]");
        str = strArr[0];
        if (strArr.length != 2) {
        }
        element = Jsoup.connect(str).userAgent("Mozilla/5.0 (jsoup)").timeout(5000).get();
        htmlToPlainText = new HtmlToPlainText();
        if (str2 == null) {
            System.out.println(htmlToPlainText.getPlainText(element));
            return;
        }
        it = element.select(str2).iterator();
        while (it.hasNext()) {
            System.out.println(htmlToPlainText.getPlainText((Element) it.next()));
        }
    }

    public String getPlainText(Element element) {
        Object aVar = new a();
        new NodeTraversor(aVar).traverse(element);
        return aVar.toString();
    }
}
