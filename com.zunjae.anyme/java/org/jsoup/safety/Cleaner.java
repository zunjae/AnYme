package org.jsoup.safety;

import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;

public class Cleaner {
    private Whitelist a;

    public Cleaner(Whitelist whitelist) {
        Validate.notNull(whitelist);
        this.a = whitelist;
    }

    private int a(Element element, Element element2) {
        Object aVar = new a(this, element, element2);
        new NodeTraversor(aVar).traverse(element);
        return aVar.b;
    }

    static /* synthetic */ b a(Cleaner cleaner, Element element) {
        String tagName = element.tagName();
        Attributes attributes = new Attributes();
        Element element2 = new Element(Tag.valueOf(tagName), element.baseUri(), attributes);
        Iterator it = element.attributes().iterator();
        int i = 0;
        while (it.hasNext()) {
            Attribute attribute = (Attribute) it.next();
            if (cleaner.a.a(tagName, element, attribute)) {
                attributes.put(attribute);
            } else {
                i++;
            }
        }
        attributes.addAll(cleaner.a.b(tagName));
        return new b(element2, i);
    }

    public Document clean(Document document) {
        Validate.notNull(document);
        Document createShell = Document.createShell(document.baseUri());
        if (document.body() != null) {
            a(document.body(), createShell.body());
        }
        return createShell;
    }

    public boolean isValid(Document document) {
        Validate.notNull(document);
        return a(document.body(), Document.createShell(document.baseUri()).body()) == 0 && document.head().childNodes().size() == 0;
    }

    public boolean isValidBodyHtml(String str) {
        Document createShell = Document.createShell(BuildConfig.FLAVOR);
        Document createShell2 = Document.createShell(BuildConfig.FLAVOR);
        ParseErrorList tracking = ParseErrorList.tracking(1);
        createShell2.body().insertChildren(0, Parser.parseFragment(str, createShell2.body(), BuildConfig.FLAVOR, tracking));
        return a(createShell2.body(), createShell.body()) == 0 && tracking.size() == 0;
    }
}
