package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities.EscapeMode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class Document extends Element {
    private OutputSettings f = new OutputSettings();
    private QuirksMode g = QuirksMode.noQuirks;
    private String h;
    private boolean i = false;

    public class OutputSettings implements Cloneable {
        private EscapeMode a = EscapeMode.base;
        private Charset b = Charset.forName("UTF-8");
        private boolean c = true;
        private boolean d = false;
        private int e = 1;
        private Syntax f = Syntax.html;

        public enum Syntax {
            html,
            xml
        }

        final CharsetEncoder a() {
            return this.b.newEncoder();
        }

        public Charset charset() {
            return this.b;
        }

        public OutputSettings charset(String str) {
            charset(Charset.forName(str));
            return this;
        }

        public OutputSettings charset(Charset charset) {
            this.b = charset;
            return this;
        }

        public OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                outputSettings.charset(this.b.name());
                outputSettings.a = EscapeMode.valueOf(this.a.name());
                return outputSettings;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public OutputSettings escapeMode(EscapeMode escapeMode) {
            this.a = escapeMode;
            return this;
        }

        public EscapeMode escapeMode() {
            return this.a;
        }

        public int indentAmount() {
            return this.e;
        }

        public OutputSettings indentAmount(int i) {
            Validate.isTrue(i >= 0);
            this.e = i;
            return this;
        }

        public OutputSettings outline(boolean z) {
            this.d = z;
            return this;
        }

        public boolean outline() {
            return this.d;
        }

        public OutputSettings prettyPrint(boolean z) {
            this.c = z;
            return this;
        }

        public boolean prettyPrint() {
            return this.c;
        }

        public Syntax syntax() {
            return this.f;
        }

        public OutputSettings syntax(Syntax syntax) {
            this.f = syntax;
            return this;
        }
    }

    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public Document(String str) {
        super(Tag.valueOf("#root", ParseSettings.htmlDefault), str);
        this.h = str;
    }

    private Element a(String str, Node node) {
        if (node.nodeName().equals(str)) {
            return (Element) node;
        }
        for (Node a : node.b) {
            Element a2 = a(str, a);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private void a(String str, Element element) {
        Elements elementsByTag = getElementsByTag(str);
        Node first = elementsByTag.first();
        int i = 1;
        if (elementsByTag.size() > 1) {
            List<Node> arrayList = new ArrayList();
            while (i < elementsByTag.size()) {
                Node node = (Node) elementsByTag.get(i);
                for (Node add : node.b) {
                    arrayList.add(add);
                }
                node.remove();
                i++;
            }
            for (Node appendChild : arrayList) {
                first.appendChild(appendChild);
            }
        }
        if (!first.parent().equals(element)) {
            element.appendChild(first);
        }
    }

    private void b(Element element) {
        List arrayList = new ArrayList();
        for (Node node : element.b) {
            Node node2;
            if (node2 instanceof TextNode) {
                TextNode textNode = (TextNode) node2;
                if (!textNode.isBlank()) {
                    arrayList.add(textNode);
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            node2 = (Node) arrayList.get(size);
            element.b(node2);
            body().prependChild(new TextNode(" ", BuildConfig.FLAVOR));
            body().prependChild(node2);
        }
    }

    private void c() {
        if (this.i) {
            Syntax syntax = outputSettings().syntax();
            if (syntax == Syntax.html) {
                Element first = select("meta[charset]").first();
                if (first == null) {
                    first = head();
                    if (first != null) {
                        first = first.appendElement("meta");
                    }
                    select("meta[name=charset]").remove();
                }
                first.attr("charset", charset().displayName());
                select("meta[name=charset]").remove();
            } else if (syntax == Syntax.xml) {
                Node node = (Node) childNodes().get(0);
                if (node instanceof XmlDeclaration) {
                    XmlDeclaration xmlDeclaration = (XmlDeclaration) node;
                    if (xmlDeclaration.name().equals("xml")) {
                        xmlDeclaration.attr("encoding", charset().displayName());
                        if (xmlDeclaration.attr("version") != null) {
                            xmlDeclaration.attr("version", "1.0");
                        }
                        return;
                    }
                    node = new XmlDeclaration("xml", this.d, false);
                    node.attr("version", "1.0");
                    node.attr("encoding", charset().displayName());
                    prependChild(node);
                    return;
                }
                node = new XmlDeclaration("xml", this.d, false);
                node.attr("version", "1.0");
                node.attr("encoding", charset().displayName());
                prependChild(node);
            }
        }
    }

    public static Document createShell(String str) {
        Validate.notNull(str);
        Document document = new Document(str);
        Element appendElement = document.appendElement("html");
        appendElement.appendElement("head");
        appendElement.appendElement("body");
        return document;
    }

    public Element body() {
        return a("body", (Node) this);
    }

    public Charset charset() {
        return this.f.charset();
    }

    public void charset(Charset charset) {
        updateMetaCharsetElement(true);
        this.f.charset(charset);
        c();
    }

    public Document clone() {
        Document document = (Document) super.clone();
        document.f = this.f.clone();
        return document;
    }

    public Element createElement(String str) {
        return new Element(Tag.valueOf(str, ParseSettings.preserveCase), baseUri());
    }

    public Element head() {
        return a("head", (Node) this);
    }

    public String location() {
        return this.h;
    }

    public String nodeName() {
        return "#document";
    }

    public Document normalise() {
        Element a = a("html", (Node) this);
        if (a == null) {
            a = appendElement("html");
        }
        if (head() == null) {
            a.prependElement("head");
        }
        if (body() == null) {
            a.appendElement("body");
        }
        b(head());
        b(a);
        b(this);
        a("head", a);
        a("body", a);
        c();
        return this;
    }

    public String outerHtml() {
        return super.html();
    }

    public OutputSettings outputSettings() {
        return this.f;
    }

    public Document outputSettings(OutputSettings outputSettings) {
        Validate.notNull(outputSettings);
        this.f = outputSettings;
        return this;
    }

    public QuirksMode quirksMode() {
        return this.g;
    }

    public Document quirksMode(QuirksMode quirksMode) {
        this.g = quirksMode;
        return this;
    }

    public Element text(String str) {
        body().text(str);
        return this;
    }

    public String title() {
        Element first = getElementsByTag("title").first();
        return first != null ? StringUtil.normaliseWhitespace(first.text()).trim() : BuildConfig.FLAVOR;
    }

    public void title(String str) {
        Validate.notNull(str);
        Element first = getElementsByTag("title").first();
        if (first == null) {
            head().appendElement("title").text(str);
        } else {
            first.text(str);
        }
    }

    public void updateMetaCharsetElement(boolean z) {
        this.i = z;
    }

    public boolean updateMetaCharsetElement() {
        return this.i;
    }
}
