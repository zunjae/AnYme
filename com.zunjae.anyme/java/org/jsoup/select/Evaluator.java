package org.jsoup.select;

import java.util.Iterator;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;

public abstract class Evaluator {

    public final class AllElements extends Evaluator {
        public final boolean matches(Element element, Element element2) {
            return true;
        }

        public final String toString() {
            return "*";
        }
    }

    public final class Attribute extends Evaluator {
        private String a;

        public Attribute(String str) {
            this.a = str;
        }

        public final boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.a);
        }

        public final String toString() {
            return String.format("[%s]", new Object[]{this.a});
        }
    }

    public abstract class AttributeKeyPair extends Evaluator {
        String a;
        String b;

        public AttributeKeyPair(String str, String str2) {
            Validate.notEmpty(str);
            Validate.notEmpty(str2);
            this.a = str.trim().toLowerCase();
            if ((str2.startsWith("\"") && str2.endsWith("\"")) || (str2.startsWith("'") && str2.endsWith("'"))) {
                str2 = str2.substring(1, str2.length() - 1);
            }
            this.b = str2.trim().toLowerCase();
        }
    }

    public final class AttributeStarting extends Evaluator {
        private String a;

        public AttributeStarting(String str) {
            Validate.notEmpty(str);
            this.a = str.toLowerCase();
        }

        public final boolean matches(Element element, Element element2) {
            for (org.jsoup.nodes.Attribute key : element2.attributes().asList()) {
                if (key.getKey().toLowerCase().startsWith(this.a)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return String.format("[^%s]", new Object[]{this.a});
        }
    }

    public final class AttributeWithValue extends AttributeKeyPair {
        public AttributeWithValue(String str, String str2) {
            super(str, str2);
        }

        public final boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.a) && this.b.equalsIgnoreCase(element2.attr(this.a).trim());
        }

        public final String toString() {
            return String.format("[%s=%s]", new Object[]{this.a, this.b});
        }
    }

    public final class AttributeWithValueContaining extends AttributeKeyPair {
        public AttributeWithValueContaining(String str, String str2) {
            super(str, str2);
        }

        public final boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.a) && element2.attr(this.a).toLowerCase().contains(this.b);
        }

        public final String toString() {
            return String.format("[%s*=%s]", new Object[]{this.a, this.b});
        }
    }

    public final class AttributeWithValueEnding extends AttributeKeyPair {
        public AttributeWithValueEnding(String str, String str2) {
            super(str, str2);
        }

        public final boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.a) && element2.attr(this.a).toLowerCase().endsWith(this.b);
        }

        public final String toString() {
            return String.format("[%s$=%s]", new Object[]{this.a, this.b});
        }
    }

    public final class AttributeWithValueMatching extends Evaluator {
        String a;
        Pattern b;

        public AttributeWithValueMatching(String str, Pattern pattern) {
            this.a = str.trim().toLowerCase();
            this.b = pattern;
        }

        public final boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.a) && this.b.matcher(element2.attr(this.a)).find();
        }

        public final String toString() {
            return String.format("[%s~=%s]", new Object[]{this.a, this.b.toString()});
        }
    }

    public final class AttributeWithValueNot extends AttributeKeyPair {
        public AttributeWithValueNot(String str, String str2) {
            super(str, str2);
        }

        public final boolean matches(Element element, Element element2) {
            return !this.b.equalsIgnoreCase(element2.attr(this.a));
        }

        public final String toString() {
            return String.format("[%s!=%s]", new Object[]{this.a, this.b});
        }
    }

    public final class AttributeWithValueStarting extends AttributeKeyPair {
        public AttributeWithValueStarting(String str, String str2) {
            super(str, str2);
        }

        public final boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.a) && element2.attr(this.a).toLowerCase().startsWith(this.b);
        }

        public final String toString() {
            return String.format("[%s^=%s]", new Object[]{this.a, this.b});
        }
    }

    public final class Class extends Evaluator {
        private String a;

        public Class(String str) {
            this.a = str;
        }

        public final boolean matches(Element element, Element element2) {
            return element2.hasClass(this.a);
        }

        public final String toString() {
            return String.format(".%s", new Object[]{this.a});
        }
    }

    public final class ContainsData extends Evaluator {
        private String a;

        public ContainsData(String str) {
            this.a = str.toLowerCase();
        }

        public final boolean matches(Element element, Element element2) {
            return element2.data().toLowerCase().contains(this.a);
        }

        public final String toString() {
            return String.format(":containsData(%s)", new Object[]{this.a});
        }
    }

    public final class ContainsOwnText extends Evaluator {
        private String a;

        public ContainsOwnText(String str) {
            this.a = str.toLowerCase();
        }

        public final boolean matches(Element element, Element element2) {
            return element2.ownText().toLowerCase().contains(this.a);
        }

        public final String toString() {
            return String.format(":containsOwn(%s)", new Object[]{this.a});
        }
    }

    public final class ContainsText extends Evaluator {
        private String a;

        public ContainsText(String str) {
            this.a = str.toLowerCase();
        }

        public final boolean matches(Element element, Element element2) {
            return element2.text().toLowerCase().contains(this.a);
        }

        public final String toString() {
            return String.format(":contains(%s)", new Object[]{this.a});
        }
    }

    public abstract class CssNthEvaluator extends Evaluator {
        protected final int a;
        protected final int b;

        public CssNthEvaluator(int i) {
            this(0, i);
        }

        public CssNthEvaluator(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        protected abstract int a(Element element);

        protected abstract String a();

        public boolean matches(Element element, Element element2) {
            element = element2.parent();
            if (element != null) {
                if (!(element instanceof Document)) {
                    int a = a(element2);
                    int i = this.a;
                    if (i == 0) {
                        return a == this.b;
                    } else {
                        int i2 = this.b;
                        return (a - i2) * i >= 0 && (a - i2) % i == 0;
                    }
                }
            }
        }

        public String toString() {
            if (this.a == 0) {
                return String.format(":%s(%d)", new Object[]{a(), Integer.valueOf(this.b)});
            } else if (this.b == 0) {
                return String.format(":%s(%dn)", new Object[]{a(), Integer.valueOf(this.a)});
            } else {
                return String.format(":%s(%dn%+d)", new Object[]{a(), Integer.valueOf(this.a), Integer.valueOf(this.b)});
            }
        }
    }

    public final class Id extends Evaluator {
        private String a;

        public Id(String str) {
            this.a = str;
        }

        public final boolean matches(Element element, Element element2) {
            return this.a.equals(element2.id());
        }

        public final String toString() {
            return String.format("#%s", new Object[]{this.a});
        }
    }

    public abstract class IndexEvaluator extends Evaluator {
        int a;

        public IndexEvaluator(int i) {
            this.a = i;
        }
    }

    public final class IndexEquals extends IndexEvaluator {
        public IndexEquals(int i) {
            super(i);
        }

        public final boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() == this.a;
        }

        public final String toString() {
            return String.format(":eq(%d)", new Object[]{Integer.valueOf(this.a)});
        }
    }

    public final class IndexGreaterThan extends IndexEvaluator {
        public IndexGreaterThan(int i) {
            super(i);
        }

        public final boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() > this.a;
        }

        public final String toString() {
            return String.format(":gt(%d)", new Object[]{Integer.valueOf(this.a)});
        }
    }

    public final class IndexLessThan extends IndexEvaluator {
        public IndexLessThan(int i) {
            super(i);
        }

        public final boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() < this.a;
        }

        public final String toString() {
            return String.format(":lt(%d)", new Object[]{Integer.valueOf(this.a)});
        }
    }

    public final class IsEmpty extends Evaluator {
        public final boolean matches(Element element, Element element2) {
            for (Node node : element2.childNodes()) {
                if (!(node instanceof Comment) && !(node instanceof XmlDeclaration) && !(node instanceof DocumentType)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return ":empty";
        }
    }

    public final class IsFirstChild extends Evaluator {
        public final boolean matches(Element element, Element element2) {
            element = element2.parent();
            return (element == null || (element instanceof Document) || element2.elementSiblingIndex().intValue() != 0) ? false : true;
        }

        public final String toString() {
            return ":first-child";
        }
    }

    public class IsNthOfType extends CssNthEvaluator {
        public IsNthOfType(int i, int i2) {
            super(i, i2);
        }

        protected final int a(Element element) {
            Iterator it = element.parent().children().iterator();
            int i = 0;
            while (it.hasNext()) {
                Element element2 = (Element) it.next();
                if (element2.tag().equals(element.tag())) {
                    i++;
                    continue;
                }
                if (element2 == element) {
                    break;
                }
            }
            return i;
        }

        protected final String a() {
            return "nth-of-type";
        }
    }

    public final class IsFirstOfType extends IsNthOfType {
        public IsFirstOfType() {
            super(0, 1);
        }

        public final String toString() {
            return ":first-of-type";
        }
    }

    public final class IsLastChild extends Evaluator {
        public final boolean matches(Element element, Element element2) {
            element = element2.parent();
            return (element == null || (element instanceof Document) || element2.elementSiblingIndex().intValue() != element.children().size() - 1) ? false : true;
        }

        public final String toString() {
            return ":last-child";
        }
    }

    public class IsNthLastOfType extends CssNthEvaluator {
        public IsNthLastOfType(int i, int i2) {
            super(i, i2);
        }

        protected final int a(Element element) {
            Elements children = element.parent().children();
            int i = 0;
            for (int intValue = element.elementSiblingIndex().intValue(); intValue < children.size(); intValue++) {
                if (((Element) children.get(intValue)).tag().equals(element.tag())) {
                    i++;
                }
            }
            return i;
        }

        protected final String a() {
            return "nth-last-of-type";
        }
    }

    public final class IsLastOfType extends IsNthLastOfType {
        public IsLastOfType() {
            super(0, 1);
        }

        public final String toString() {
            return ":last-of-type";
        }
    }

    public final class IsNthChild extends CssNthEvaluator {
        public IsNthChild(int i, int i2) {
            super(i, i2);
        }

        protected final int a(Element element) {
            return element.elementSiblingIndex().intValue() + 1;
        }

        protected final String a() {
            return "nth-child";
        }
    }

    public final class IsNthLastChild extends CssNthEvaluator {
        public IsNthLastChild(int i, int i2) {
            super(i, i2);
        }

        protected final int a(Element element) {
            return element.parent().children().size() - element.elementSiblingIndex().intValue();
        }

        protected final String a() {
            return "nth-last-child";
        }
    }

    public final class IsOnlyChild extends Evaluator {
        public final boolean matches(Element element, Element element2) {
            element = element2.parent();
            return (element == null || (element instanceof Document) || element2.siblingElements().size() != 0) ? false : true;
        }

        public final String toString() {
            return ":only-child";
        }
    }

    public final class IsOnlyOfType extends Evaluator {
        public final boolean matches(Element element, Element element2) {
            element = element2.parent();
            if (element != null) {
                if (!(element instanceof Document)) {
                    Iterator it = element.children().iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        if (((Element) it.next()).tag().equals(element2.tag())) {
                            i++;
                        }
                    }
                    if (i == 1) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final String toString() {
            return ":only-of-type";
        }
    }

    public final class IsRoot extends Evaluator {
        public final boolean matches(Element element, Element element2) {
            if (element instanceof Document) {
                element = element.child(0);
            }
            return element2 == element;
        }

        public final String toString() {
            return ":root";
        }
    }

    public final class Matches extends Evaluator {
        private Pattern a;

        public Matches(Pattern pattern) {
            this.a = pattern;
        }

        public final boolean matches(Element element, Element element2) {
            return this.a.matcher(element2.text()).find();
        }

        public final String toString() {
            return String.format(":matches(%s)", new Object[]{this.a});
        }
    }

    public final class MatchesOwn extends Evaluator {
        private Pattern a;

        public MatchesOwn(Pattern pattern) {
            this.a = pattern;
        }

        public final boolean matches(Element element, Element element2) {
            return this.a.matcher(element2.ownText()).find();
        }

        public final String toString() {
            return String.format(":matchesOwn(%s)", new Object[]{this.a});
        }
    }

    public final class Tag extends Evaluator {
        private String a;

        public Tag(String str) {
            this.a = str;
        }

        public final boolean matches(Element element, Element element2) {
            return element2.tagName().equalsIgnoreCase(this.a);
        }

        public final String toString() {
            return String.format("%s", new Object[]{this.a});
        }
    }

    public final class TagEndsWith extends Evaluator {
        private String a;

        public TagEndsWith(String str) {
            this.a = str;
        }

        public final boolean matches(Element element, Element element2) {
            return element2.tagName().endsWith(this.a);
        }

        public final String toString() {
            return String.format("%s", new Object[]{this.a});
        }
    }

    protected Evaluator() {
    }

    public abstract boolean matches(Element element, Element element2);
}
