package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public final class ans {
    public static ArrayList<String> a(String str) {
        if (bit.b(str)) {
            return null;
        }
        Elements select = Jsoup.parse(str).select("img[src~=^https:\\/\\/s1\\.zerochan\\..+$");
        ArrayList<String> arrayList = new ArrayList();
        Iterator it = select.iterator();
        while (it.hasNext()) {
            arrayList.add(((Element) it.next()).attr("src"));
        }
        return arrayList;
    }
}
