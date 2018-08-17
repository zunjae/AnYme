package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Evaluator.AllElements;
import org.jsoup.select.Evaluator.Attribute;
import org.jsoup.select.Evaluator.AttributeStarting;
import org.jsoup.select.Evaluator.AttributeWithValue;
import org.jsoup.select.Evaluator.AttributeWithValueContaining;
import org.jsoup.select.Evaluator.AttributeWithValueEnding;
import org.jsoup.select.Evaluator.AttributeWithValueMatching;
import org.jsoup.select.Evaluator.AttributeWithValueNot;
import org.jsoup.select.Evaluator.AttributeWithValueStarting;
import org.jsoup.select.Evaluator.Class;
import org.jsoup.select.Evaluator.ContainsOwnText;
import org.jsoup.select.Evaluator.ContainsText;
import org.jsoup.select.Evaluator.Id;
import org.jsoup.select.Evaluator.IndexEquals;
import org.jsoup.select.Evaluator.IndexGreaterThan;
import org.jsoup.select.Evaluator.IndexLessThan;
import org.jsoup.select.Evaluator.Matches;
import org.jsoup.select.Evaluator.MatchesOwn;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;

public class Element extends Node {
    private static final Pattern g = Pattern.compile("\\s+");
    private Tag f;

    public Element(String str) {
        this(Tag.valueOf(str), BuildConfig.FLAVOR, new Attributes());
    }

    public Element(Tag tag, String str) {
        this(tag, str, new Attributes());
    }

    public Element(Tag tag, String str, Attributes attributes) {
        super(str, attributes);
        Validate.notNull(tag);
        this.f = tag;
    }

    private static <E extends Element> Integer a(Element element, List<E> list) {
        Validate.notNull(element);
        Validate.notNull(list);
        for (int i = 0; i < list.size(); i++) {
            if (((Element) list.get(i)) == element) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    private void a(StringBuilder stringBuilder) {
        for (Node node : this.b) {
            if (node instanceof TextNode) {
                b(stringBuilder, (TextNode) node);
            } else if ((node instanceof Element) && ((Element) node).f.getName().equals("br") && !TextNode.a(stringBuilder)) {
                stringBuilder.append(" ");
            }
        }
    }

    static boolean a(Node node) {
        if (node == null || !(node instanceof Element)) {
            return false;
        }
        Element element = (Element) node;
        if (!element.f.preserveWhitespace()) {
            if (element.parent() == null || !element.parent().f.preserveWhitespace()) {
                return false;
            }
        }
        return true;
    }

    private void b(StringBuilder stringBuilder) {
        for (Node a : this.b) {
            a.a((Appendable) stringBuilder);
        }
    }

    private static void b(StringBuilder stringBuilder, TextNode textNode) {
        String wholeText = textNode.getWholeText();
        if (a(textNode.a)) {
            stringBuilder.append(wholeText);
        } else {
            StringUtil.appendNormalisedWhitespace(stringBuilder, wholeText, TextNode.a(stringBuilder));
        }
    }

    final void a(Appendable appendable, int i, OutputSettings outputSettings) {
        if (outputSettings.prettyPrint() && ((this.f.formatAsBlock() || ((parent() != null && parent().tag().formatAsBlock()) || outputSettings.outline())) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0))) {
            Node.c(appendable, i, outputSettings);
        }
        appendable.append("<").append(tagName());
        this.c.a(appendable, outputSettings);
        if (!this.b.isEmpty() || !this.f.isSelfClosing()) {
            appendable.append(">");
        } else if (outputSettings.syntax() == Syntax.html && this.f.isEmpty()) {
            appendable.append('>');
        } else {
            appendable.append(" />");
        }
    }

    public Element addClass(String str) {
        Validate.notNull(str);
        Set classNames = classNames();
        classNames.add(str);
        classNames(classNames);
        return this;
    }

    public Element after(String str) {
        return (Element) super.after(str);
    }

    public Element after(Node node) {
        return (Element) super.after(node);
    }

    public Element append(String str) {
        Validate.notNull(str);
        List parseFragment = Parser.parseFragment(str, this, baseUri());
        a((Node[]) parseFragment.toArray(new Node[parseFragment.size()]));
        return this;
    }

    public Element appendChild(Node node) {
        Validate.notNull(node);
        c(node);
        a();
        this.b.add(node);
        node.e = this.b.size() - 1;
        return this;
    }

    public Element appendElement(String str) {
        Node element = new Element(Tag.valueOf(str), baseUri());
        appendChild(element);
        return element;
    }

    public Element appendText(String str) {
        Validate.notNull(str);
        appendChild(new TextNode(str, baseUri()));
        return this;
    }

    public Element attr(String str, String str2) {
        super.attr(str, str2);
        return this;
    }

    public Element attr(String str, boolean z) {
        this.c.put(str, z);
        return this;
    }

    final void b(Appendable appendable, int i, OutputSettings outputSettings) {
        if (!this.b.isEmpty() || !this.f.isSelfClosing()) {
            if (outputSettings.prettyPrint() && !this.b.isEmpty() && (this.f.formatAsBlock() || (outputSettings.outline() && (this.b.size() > 1 || (this.b.size() == 1 && !(this.b.get(0) instanceof TextNode)))))) {
                Node.c(appendable, i, outputSettings);
            }
            appendable.append("</").append(tagName()).append(">");
        }
    }

    public Element before(String str) {
        return (Element) super.before(str);
    }

    public Element before(Node node) {
        return (Element) super.before(node);
    }

    public Element child(int i) {
        return (Element) children().get(i);
    }

    public Elements children() {
        List arrayList = new ArrayList(this.b.size());
        for (Node node : this.b) {
            if (node instanceof Element) {
                arrayList.add((Element) node);
            }
        }
        return new Elements(arrayList);
    }

    public String className() {
        return attr("class").trim();
    }

    public Set<String> classNames() {
        Set<String> linkedHashSet = new LinkedHashSet(Arrays.asList(g.split(className())));
        linkedHashSet.remove(BuildConfig.FLAVOR);
        return linkedHashSet;
    }

    public Element classNames(Set<String> set) {
        Validate.notNull(set);
        this.c.put("class", StringUtil.join((Collection) set, " "));
        return this;
    }

    public Element clone() {
        return (Element) super.clone();
    }

    public String cssSelector() {
        StringBuilder stringBuilder;
        String id;
        if (id().length() > 0) {
            stringBuilder = new StringBuilder("#");
            id = id();
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(tagName().replace(':', '|'));
            String join = StringUtil.join(classNames(), ".");
            if (join.length() > 0) {
                stringBuilder2.append('.');
                stringBuilder2.append(join);
            }
            if (parent() != null) {
                if (!(parent() instanceof Document)) {
                    stringBuilder2.insert(0, " > ");
                    if (parent().select(stringBuilder2.toString()).size() > 1) {
                        stringBuilder2.append(String.format(":nth-child(%d)", new Object[]{Integer.valueOf(elementSiblingIndex().intValue() + 1)}));
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(parent().cssSelector());
                    id = stringBuilder2.toString();
                }
            }
            return stringBuilder2.toString();
        }
        stringBuilder.append(id);
        return stringBuilder.toString();
    }

    public String data() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node node : this.b) {
            String wholeData;
            if (node instanceof DataNode) {
                wholeData = ((DataNode) node).getWholeData();
            } else if (node instanceof Comment) {
                wholeData = ((Comment) node).getData();
            } else if (node instanceof Element) {
                wholeData = ((Element) node).data();
            }
            stringBuilder.append(wholeData);
        }
        return stringBuilder.toString();
    }

    public List<DataNode> dataNodes() {
        List arrayList = new ArrayList();
        for (Node node : this.b) {
            if (node instanceof DataNode) {
                arrayList.add((DataNode) node);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Map<String, String> dataset() {
        return this.c.dataset();
    }

    public Integer elementSiblingIndex() {
        return parent() == null ? Integer.valueOf(0) : a(this, parent().children());
    }

    public Element empty() {
        this.b.clear();
        return this;
    }

    public Element firstElementSibling() {
        List children = parent().children();
        return children.size() > 1 ? (Element) children.get(0) : null;
    }

    public Elements getAllElements() {
        return Collector.collect(new AllElements(), this);
    }

    public Element getElementById(String str) {
        Validate.notEmpty(str);
        Elements collect = Collector.collect(new Id(str), this);
        return collect.size() > 0 ? (Element) collect.get(0) : null;
    }

    public Elements getElementsByAttribute(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Attribute(str.trim()), this);
    }

    public Elements getElementsByAttributeStarting(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new AttributeStarting(str.trim()), this);
    }

    public Elements getElementsByAttributeValue(String str, String str2) {
        return Collector.collect(new AttributeWithValue(str, str2), this);
    }

    public Elements getElementsByAttributeValueContaining(String str, String str2) {
        return Collector.collect(new AttributeWithValueContaining(str, str2), this);
    }

    public Elements getElementsByAttributeValueEnding(String str, String str2) {
        return Collector.collect(new AttributeWithValueEnding(str, str2), this);
    }

    public Elements getElementsByAttributeValueMatching(String str, String str2) {
        try {
            return getElementsByAttributeValueMatching(str, Pattern.compile(str2));
        } catch (Throwable e) {
            throw new IllegalArgumentException("Pattern syntax error: ".concat(String.valueOf(str2)), e);
        }
    }

    public Elements getElementsByAttributeValueMatching(String str, Pattern pattern) {
        return Collector.collect(new AttributeWithValueMatching(str, pattern), this);
    }

    public Elements getElementsByAttributeValueNot(String str, String str2) {
        return Collector.collect(new AttributeWithValueNot(str, str2), this);
    }

    public Elements getElementsByAttributeValueStarting(String str, String str2) {
        return Collector.collect(new AttributeWithValueStarting(str, str2), this);
    }

    public Elements getElementsByClass(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Class(str), this);
    }

    public Elements getElementsByIndexEquals(int i) {
        return Collector.collect(new IndexEquals(i), this);
    }

    public Elements getElementsByIndexGreaterThan(int i) {
        return Collector.collect(new IndexGreaterThan(i), this);
    }

    public Elements getElementsByIndexLessThan(int i) {
        return Collector.collect(new IndexLessThan(i), this);
    }

    public Elements getElementsByTag(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Tag(str.toLowerCase().trim()), this);
    }

    public Elements getElementsContainingOwnText(String str) {
        return Collector.collect(new ContainsOwnText(str), this);
    }

    public Elements getElementsContainingText(String str) {
        return Collector.collect(new ContainsText(str), this);
    }

    public Elements getElementsMatchingOwnText(String str) {
        try {
            return getElementsMatchingOwnText(Pattern.compile(str));
        } catch (Throwable e) {
            throw new IllegalArgumentException("Pattern syntax error: ".concat(String.valueOf(str)), e);
        }
    }

    public Elements getElementsMatchingOwnText(Pattern pattern) {
        return Collector.collect(new MatchesOwn(pattern), this);
    }

    public Elements getElementsMatchingText(String str) {
        try {
            return getElementsMatchingText(Pattern.compile(str));
        } catch (Throwable e) {
            throw new IllegalArgumentException("Pattern syntax error: ".concat(String.valueOf(str)), e);
        }
    }

    public Elements getElementsMatchingText(Pattern pattern) {
        return Collector.collect(new Matches(pattern), this);
    }

    public boolean hasClass(String str) {
        String str2 = this.c.get("class");
        int length = str2.length();
        int length2 = str.length();
        if (length != 0) {
            if (length >= length2) {
                if (length == length2) {
                    return str.equalsIgnoreCase(str2);
                }
                Object obj = null;
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (Character.isWhitespace(str2.charAt(i2))) {
                        if (obj == null) {
                            continue;
                        } else if (i2 - i == length2 && str2.regionMatches(true, i, str, 0, length2)) {
                            return true;
                        } else {
                            obj = null;
                        }
                    } else if (obj == null) {
                        i = i2;
                        obj = 1;
                    }
                }
                if (obj != null && length - i == length2) {
                    return str2.regionMatches(true, i, str, 0, length2);
                }
            }
        }
        return false;
    }

    public boolean hasText() {
        for (Node node : this.b) {
            if (node instanceof TextNode) {
                if (!((TextNode) node).isBlank()) {
                    return true;
                }
            } else if ((node instanceof Element) && ((Element) node).hasText()) {
                return true;
            }
        }
        return false;
    }

    public <T extends Appendable> T html(T t) {
        for (Node a : this.b) {
            a.a((Appendable) t);
        }
        return t;
    }

    public String html() {
        StringBuilder stringBuilder = new StringBuilder();
        b(stringBuilder);
        return b().prettyPrint() ? stringBuilder.toString().trim() : stringBuilder.toString();
    }

    public Element html(String str) {
        empty();
        append(str);
        return this;
    }

    public String id() {
        return this.c.getIgnoreCase("id");
    }

    public Element insertChildren(int i, Collection<? extends Node> collection) {
        Validate.notNull(collection, "Children collection to be inserted must not be null.");
        int childNodeSize = childNodeSize();
        if (i < 0) {
            i += childNodeSize + 1;
        }
        boolean z = i >= 0 && i <= childNodeSize;
        Validate.isTrue(z, "Insert position out of bounds.");
        ArrayList arrayList = new ArrayList(collection);
        a(i, (Node[]) arrayList.toArray(new Node[arrayList.size()]));
        return this;
    }

    public boolean is(String str) {
        return is(QueryParser.parse(str));
    }

    public boolean is(Evaluator evaluator) {
        return evaluator.matches((Element) root(), this);
    }

    public boolean isBlock() {
        return this.f.isBlock();
    }

    public Element lastElementSibling() {
        List children = parent().children();
        return children.size() > 1 ? (Element) children.get(children.size() - 1) : null;
    }

    public Element nextElementSibling() {
        if (this.a == null) {
            return null;
        }
        List children = parent().children();
        Integer a = a(this, children);
        Validate.notNull(a);
        return children.size() > a.intValue() + 1 ? (Element) children.get(a.intValue() + 1) : null;
    }

    public String nodeName() {
        return this.f.getName();
    }

    public String ownText() {
        StringBuilder stringBuilder = new StringBuilder();
        a(stringBuilder);
        return stringBuilder.toString().trim();
    }

    public final Element parent() {
        return (Element) this.a;
    }

    public Elements parents() {
        Elements elements = new Elements();
        Element element = this;
        while (true) {
            element = element.parent();
            if (element == null || element.tagName().equals("#root")) {
                return elements;
            }
            elements.add(element);
        }
        return elements;
    }

    public Element prepend(String str) {
        Validate.notNull(str);
        List parseFragment = Parser.parseFragment(str, this, baseUri());
        a(0, (Node[]) parseFragment.toArray(new Node[parseFragment.size()]));
        return this;
    }

    public Element prependChild(Node node) {
        Validate.notNull(node);
        a(0, node);
        return this;
    }

    public Element prependElement(String str) {
        Node element = new Element(Tag.valueOf(str), baseUri());
        prependChild(element);
        return element;
    }

    public Element prependText(String str) {
        Validate.notNull(str);
        prependChild(new TextNode(str, baseUri()));
        return this;
    }

    public Element previousElementSibling() {
        if (this.a == null) {
            return null;
        }
        List children = parent().children();
        Integer a = a(this, children);
        Validate.notNull(a);
        return a.intValue() > 0 ? (Element) children.get(a.intValue() - 1) : null;
    }

    public Element removeClass(String str) {
        Validate.notNull(str);
        Set classNames = classNames();
        classNames.remove(str);
        classNames(classNames);
        return this;
    }

    public Elements select(String str) {
        return Selector.select(str, this);
    }

    public Elements siblingElements() {
        if (this.a == null) {
            return new Elements(0);
        }
        List<Element> children = parent().children();
        Elements elements = new Elements(children.size() - 1);
        for (Element element : children) {
            if (element != this) {
                elements.add(element);
            }
        }
        return elements;
    }

    public Tag tag() {
        return this.f;
    }

    public String tagName() {
        return this.f.getName();
    }

    public Element tagName(String str) {
        Validate.notEmpty(str, "Tag name must not be empty.");
        this.f = Tag.valueOf(str, ParseSettings.preserveCase);
        return this;
    }

    public String text() {
        StringBuilder stringBuilder = new StringBuilder();
        new NodeTraversor(new d(this, stringBuilder)).traverse(this);
        return stringBuilder.toString().trim();
    }

    public Element text(String str) {
        Validate.notNull(str);
        empty();
        appendChild(new TextNode(str, this.d));
        return this;
    }

    public List<TextNode> textNodes() {
        List arrayList = new ArrayList();
        for (Node node : this.b) {
            if (node instanceof TextNode) {
                arrayList.add((TextNode) node);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String toString() {
        return outerHtml();
    }

    public Element toggleClass(String str) {
        Validate.notNull(str);
        Set classNames = classNames();
        if (classNames.contains(str)) {
            classNames.remove(str);
        } else {
            classNames.add(str);
        }
        classNames(classNames);
        return this;
    }

    public String val() {
        return tagName().equals("textarea") ? text() : attr("value");
    }

    public Element val(String str) {
        if (tagName().equals("textarea")) {
            text(str);
        } else {
            attr("value", str);
        }
        return this;
    }

    public Element wrap(String str) {
        return (Element) super.wrap(str);
    }
}
