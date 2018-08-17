package org.jsoup.select;

import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;

public class Selector {
    private final Evaluator a;
    private final Element b;

    public class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    private Selector(String str, Element element) {
        Validate.notNull(str);
        str = str.trim();
        Validate.notEmpty(str);
        Validate.notNull(element);
        this.a = QueryParser.parse(str);
        this.b = element;
    }

    private Selector(Evaluator evaluator, Element element) {
        Validate.notNull(evaluator);
        Validate.notNull(element);
        this.a = evaluator;
        this.b = element;
    }

    private Elements a() {
        return Collector.collect(this.a, this.b);
    }

    static Elements a(Collection<Element> collection, Collection<Element> collection2) {
        Elements elements = new Elements();
        for (Element element : collection) {
            Object obj = null;
            for (Element equals : collection2) {
                if (element.equals(equals)) {
                    obj = 1;
                    break;
                }
            }
            if (obj == null) {
                elements.add(element);
            }
        }
        return elements;
    }

    public static Elements select(String str, Iterable<Element> iterable) {
        Validate.notEmpty(str);
        Validate.notNull(iterable);
        Evaluator parse = QueryParser.parse(str);
        List arrayList = new ArrayList();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (Element select : iterable) {
            Iterator it = select(parse, select).iterator();
            while (it.hasNext()) {
                Element element = (Element) it.next();
                if (!identityHashMap.containsKey(element)) {
                    arrayList.add(element);
                    identityHashMap.put(element, Boolean.TRUE);
                }
            }
        }
        return new Elements(arrayList);
    }

    public static Elements select(String str, Element element) {
        return new Selector(str, element).a();
    }

    public static Elements select(Evaluator evaluator, Element element) {
        return new Selector(evaluator, element).a();
    }
}
