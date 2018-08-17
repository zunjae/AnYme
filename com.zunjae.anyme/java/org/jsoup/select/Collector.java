package org.jsoup.select;

import org.jsoup.nodes.Element;

public class Collector {
    private Collector() {
    }

    public static Elements collect(Evaluator evaluator, Element element) {
        Elements elements = new Elements();
        new NodeTraversor(new a(element, elements, evaluator)).traverse(element);
        return elements;
    }
}
