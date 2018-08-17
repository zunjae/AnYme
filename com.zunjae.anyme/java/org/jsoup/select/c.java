package org.jsoup.select;

import java.util.Arrays;
import java.util.Collection;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;

final class c extends b {
    c(Collection<Evaluator> collection) {
        super(collection);
    }

    c(Evaluator... evaluatorArr) {
        this(Arrays.asList(evaluatorArr));
    }

    public final boolean matches(Element element, Element element2) {
        for (int i = 0; i < this.b; i++) {
            if (!((Evaluator) this.a.get(i)).matches(element, element2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return StringUtil.join(this.a, " ");
    }
}
