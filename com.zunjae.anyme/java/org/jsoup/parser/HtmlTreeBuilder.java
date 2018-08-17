package org.jsoup.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

public class HtmlTreeBuilder extends da {
    public static final String[] TagsSearchInScope = new String[]{"applet", "caption", "html", "table", "td", "th", "marquee", "object"};
    static final /* synthetic */ boolean a = true;
    private static final String[] j = new String[]{"ol", "ul"};
    private static final String[] k = new String[]{"button"};
    private static final String[] l = new String[]{"html", "table"};
    private static final String[] m = new String[]{"optgroup", "option"};
    private static final String[] n = new String[]{"dd", "dt", "li", "option", "optgroup", "p", "rp", "rt"};
    private static final String[] o = new String[]{"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    private boolean A = false;
    private String[] B = new String[]{null};
    private a p;
    private a q;
    private boolean r = false;
    private Element s;
    private FormElement t;
    private Element u;
    private ArrayList<Element> v = new ArrayList();
    private List<String> w = new ArrayList();
    private af x = new af();
    private boolean y = a;
    private boolean z = false;

    HtmlTreeBuilder() {
    }

    private static void a(ArrayList<Element> arrayList, Element element, Element element2) {
        int lastIndexOf = arrayList.lastIndexOf(element);
        Validate.isTrue(lastIndexOf != -1 ? a : false);
        arrayList.set(lastIndexOf, element2);
    }

    private boolean a(String str, String[] strArr) {
        return a(str, TagsSearchInScope, strArr);
    }

    private boolean a(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.B;
        strArr3[0] = str;
        return a(strArr3, strArr, strArr2);
    }

    private static boolean a(ArrayList<Element> arrayList, Element element) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((Element) arrayList.get(size)) == element) {
                return a;
            }
        }
        return false;
    }

    private boolean a(String[] strArr, String[] strArr2, String[] strArr3) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String nodeName = ((Element) this.e.get(size)).nodeName();
            if (StringUtil.in(nodeName, strArr)) {
                return a;
            }
            if (StringUtil.in(nodeName, strArr2)) {
                return false;
            }
            if (strArr3 != null && StringUtil.in(nodeName, strArr3)) {
                return false;
            }
        }
        Validate.fail("Should not be reachable");
        return false;
    }

    private void b(Node node) {
        if (this.e.size() == 0) {
            this.d.appendChild(node);
        } else if (this.z) {
            a(node);
        } else {
            y().appendChild(node);
        }
        if (node instanceof Element) {
            Element element = (Element) node;
            if (element.tag().isFormListed()) {
                FormElement formElement = this.t;
                if (formElement != null) {
                    formElement.addElement(element);
                }
            }
        }
    }

    private void c(String... strArr) {
        int size = this.e.size() - 1;
        while (size >= 0) {
            Element element = (Element) this.e.get(size);
            if (!StringUtil.in(element.nodeName(), strArr) && !element.nodeName().equals("html")) {
                this.e.remove(size);
                size--;
            } else {
                return;
            }
        }
    }

    static boolean g(Element element) {
        return StringUtil.in(element.nodeName(), o);
    }

    private void k(Element element) {
        b((Node) element);
        this.e.add(element);
    }

    final List<Node> a(String str, Element element, String str2, ParseErrorList parseErrorList, ParseSettings parseSettings) {
        Element element2;
        this.p = a.Initial;
        b(str, str2, parseErrorList, parseSettings);
        this.u = element;
        this.A = a;
        if (element != null) {
            aj ajVar;
            ak akVar;
            if (element.ownerDocument() != null) {
                this.d.quirksMode(element.ownerDocument().quirksMode());
            }
            str = element.tagName();
            if (StringUtil.in(str, "title", "textarea")) {
                ajVar = this.c;
                akVar = ak.Rcdata;
            } else if (StringUtil.in(str, "iframe", "noembed", "noframes", "style", "xmp")) {
                ajVar = this.c;
                akVar = ak.Rawtext;
            } else if (str.equals("script")) {
                ajVar = this.c;
                akVar = ak.ScriptData;
            } else {
                if (!str.equals("noscript")) {
                    str.equals("plaintext");
                }
                ajVar = this.c;
                akVar = ak.Data;
            }
            ajVar.a(akVar);
            element2 = new Element(Tag.valueOf("html", parseSettings), str2);
            this.d.appendChild(element2);
            this.e.add(element2);
            n();
            Elements parents = element.parents();
            parents.add(0, element);
            Iterator it = parents.iterator();
            while (it.hasNext()) {
                Element element3 = (Element) it.next();
                if (element3 instanceof FormElement) {
                    this.t = (FormElement) element3;
                    break;
                }
            }
        }
        element2 = null;
        x();
        return (element == null || element2 == null) ? this.d.childNodes() : element2.childNodes();
    }

    final Document a(String str, String str2, ParseErrorList parseErrorList, ParseSettings parseSettings) {
        this.p = a.Initial;
        this.r = false;
        return super.a(str, str2, parseErrorList, parseSettings);
    }

    final Element a(String str) {
        Element element = new Element(Tag.valueOf(str, this.i), this.f);
        k(element);
        return element;
    }

    final Element a(ag agVar) {
        if (agVar.d) {
            Element b = b(agVar);
            this.e.add(b);
            this.c.a(ak.Data);
            this.c.a(this.x.h().a(b.tagName()));
            return b;
        }
        Element element = new Element(Tag.valueOf(agVar.k(), this.i), this.f, this.i.a(agVar.e));
        k(element);
        return element;
    }

    final FormElement a(ag agVar, boolean z) {
        Node formElement = new FormElement(Tag.valueOf(agVar.k(), this.i), this.f, agVar.e);
        this.t = formElement;
        b(formElement);
        if (z) {
            this.e.add(formElement);
        }
        return formElement;
    }

    final ParseSettings a() {
        return ParseSettings.htmlDefault;
    }

    final void a(Element element) {
        if (!this.r) {
            String absUrl = element.absUrl("href");
            if (absUrl.length() != 0) {
                this.f = absUrl;
                this.r = a;
                this.d.setBaseUri(absUrl);
            }
        }
    }

    final void a(Element element, Element element2) {
        int lastIndexOf = this.e.lastIndexOf(element);
        Validate.isTrue(lastIndexOf != -1 ? a : false);
        this.e.add(lastIndexOf + 1, element2);
    }

    final void a(Node node) {
        Element element;
        Element b = b("table");
        int i = 0;
        if (b == null) {
            element = (Element) this.e.get(0);
        } else if (b.parent() != null) {
            b.parent();
            element = null;
            i = 1;
        } else {
            element = e(b);
        }
        if (i != 0) {
            Validate.notNull(b);
            b.before(node);
            return;
        }
        element.appendChild(node);
    }

    final void a(a aVar) {
        this.p = aVar;
    }

    final void a(ab abVar) {
        Node textNode;
        String tagName = y().tagName();
        if (!tagName.equals("script")) {
            if (!tagName.equals("style")) {
                textNode = new TextNode(abVar.h(), this.f);
                y().appendChild(textNode);
            }
        }
        textNode = new DataNode(abVar.h(), this.f);
        y().appendChild(textNode);
    }

    final void a(ac acVar) {
        b(new Comment(acVar.b.toString(), this.f));
    }

    final void a(boolean z) {
        this.y = z;
    }

    final void a(String... strArr) {
        int size = this.e.size() - 1;
        while (size >= 0) {
            Element element = (Element) this.e.get(size);
            this.e.remove(size);
            if (!StringUtil.in(element.nodeName(), strArr)) {
                size--;
            } else {
                return;
            }
        }
    }

    protected final boolean a(aa aaVar) {
        this.g = aaVar;
        return this.p.process(aaVar, this);
    }

    final boolean a(aa aaVar, a aVar) {
        this.g = aaVar;
        return aVar.process(aaVar, this);
    }

    final Element b(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Element element = (Element) this.e.get(size);
            if (element.nodeName().equals(str)) {
                return element;
            }
        }
        return null;
    }

    final Element b(ag agVar) {
        Tag valueOf = Tag.valueOf(agVar.k(), this.i);
        Node element = new Element(valueOf, this.f, agVar.e);
        b(element);
        if (agVar.d) {
            if (!valueOf.isKnownTag()) {
                valueOf.a();
            } else if (valueOf.isSelfClosing()) {
            }
            this.c.b();
        }
        return element;
    }

    final a b() {
        return this.p;
    }

    final void b(Element element) {
        this.e.add(element);
    }

    final void b(Element element, Element element2) {
        a(this.e, element, element2);
    }

    final void b(a aVar) {
        if (this.h.a()) {
            this.h.add(new ParseError(this.b.pos(), "Unexpected token [%s] when in state [%s]", this.g.getClass().getSimpleName(), aVar));
        }
    }

    final void b(boolean z) {
        this.z = z;
    }

    final boolean b(String[] strArr) {
        return a(strArr, TagsSearchInScope, null);
    }

    final void c() {
        this.q = this.p;
    }

    final void c(String str) {
        int size = this.e.size() - 1;
        while (size >= 0) {
            Element element = (Element) this.e.get(size);
            this.e.remove(size);
            if (!element.nodeName().equals(str)) {
                size--;
            } else {
                return;
            }
        }
    }

    final void c(Element element, Element element2) {
        a(this.v, element, element2);
    }

    final boolean c(Element element) {
        return a(this.e, element);
    }

    final a d() {
        return this.q;
    }

    final void d(String str) {
        int size = this.e.size() - 1;
        while (size >= 0 && !((Element) this.e.get(size)).nodeName().equals(str)) {
            this.e.remove(size);
            size--;
        }
    }

    final boolean d(Element element) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((Element) this.e.get(size)) == element) {
                this.e.remove(size);
                return a;
            }
        }
        return false;
    }

    final Element e(Element element) {
        if (!a) {
            if (!c(element)) {
                throw new AssertionError();
            }
        }
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((Element) this.e.get(size)) == element) {
                return (Element) this.e.get(size - 1);
            }
        }
        return null;
    }

    final boolean e() {
        return this.y;
    }

    final boolean e(String str) {
        return a(str, null);
    }

    final Document f() {
        return this.d;
    }

    final void f(Element element) {
        this.s = element;
    }

    final boolean f(String str) {
        return a(str, j);
    }

    final String g() {
        return this.f;
    }

    final boolean g(String str) {
        return a(str, k);
    }

    final void h(Element element) {
        int i = 0;
        for (int size = this.v.size() - 1; size >= 0; size--) {
            Element element2 = (Element) this.v.get(size);
            if (element2 == null) {
                break;
            }
            Object obj = (element.nodeName().equals(element2.nodeName()) && element.attributes().equals(element2.attributes())) ? 1 : null;
            if (obj != null) {
                i++;
            }
            if (i == 3) {
                this.v.remove(size);
                break;
            }
        }
        this.v.add(element);
    }

    final boolean h() {
        return this.A;
    }

    final boolean h(String str) {
        return a(str, l, null);
    }

    final Element i() {
        return (Element) this.e.remove(this.e.size() - 1);
    }

    final void i(Element element) {
        for (int size = this.v.size() - 1; size >= 0; size--) {
            if (((Element) this.v.get(size)) == element) {
                this.v.remove(size);
                return;
            }
        }
    }

    final boolean i(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String nodeName = ((Element) this.e.get(size)).nodeName();
            if (nodeName.equals(str)) {
                return a;
            }
            if (!StringUtil.in(nodeName, m)) {
                return false;
            }
        }
        Validate.fail("Should not be reachable");
        return false;
    }

    final ArrayList<Element> j() {
        return this.e;
    }

    final void j(String str) {
        while (str != null && !y().nodeName().equals(str) && StringUtil.in(y().nodeName(), n)) {
            i();
        }
    }

    final boolean j(Element element) {
        return a(this.v, element);
    }

    final Element k(String str) {
        int size = this.v.size() - 1;
        while (size >= 0) {
            Element element = (Element) this.v.get(size);
            if (element == null) {
                break;
            } else if (element.nodeName().equals(str)) {
                return element;
            } else {
                size--;
            }
        }
        return null;
    }

    final void k() {
        c("table");
    }

    final void l() {
        c("tbody", "tfoot", "thead");
    }

    final void m() {
        c("tr");
    }

    final void n() {
        int size = this.e.size() - 1;
        Object obj = null;
        while (size >= 0) {
            a aVar;
            Element element = (Element) this.e.get(size);
            if (size == 0) {
                element = this.u;
                obj = 1;
            }
            String nodeName = element.nodeName();
            if ("select".equals(nodeName)) {
                aVar = a.InSelect;
            } else {
                if (!"td".equals(nodeName)) {
                    if (!"th".equals(nodeName) || obj != null) {
                        if ("tr".equals(nodeName)) {
                            aVar = a.InRow;
                        } else {
                            if (!("tbody".equals(nodeName) || "thead".equals(nodeName))) {
                                if (!"tfoot".equals(nodeName)) {
                                    if ("caption".equals(nodeName)) {
                                        aVar = a.InCaption;
                                    } else if ("colgroup".equals(nodeName)) {
                                        aVar = a.InColumnGroup;
                                    } else if ("table".equals(nodeName)) {
                                        aVar = a.InTable;
                                    } else {
                                        if (!"head".equals(nodeName)) {
                                            if (!"body".equals(nodeName)) {
                                                if ("frameset".equals(nodeName)) {
                                                    aVar = a.InFrameset;
                                                } else if ("html".equals(nodeName)) {
                                                    aVar = a.BeforeHead;
                                                } else if (obj == null) {
                                                    size--;
                                                }
                                            }
                                        }
                                        aVar = a.InBody;
                                    }
                                }
                            }
                            aVar = a.InTableBody;
                        }
                    }
                }
                aVar = a.InCell;
            }
            this.p = aVar;
            return;
        }
    }

    final Element o() {
        return this.s;
    }

    final FormElement p() {
        return this.t;
    }

    public /* bridge */ /* synthetic */ boolean processStartTag(String str, Attributes attributes) {
        return super.processStartTag(str, attributes);
    }

    final void q() {
        this.t = null;
    }

    final void r() {
        this.w = new ArrayList();
    }

    final List<String> s() {
        return this.w;
    }

    final void t() {
        j(null);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("TreeBuilder{currentToken=");
        stringBuilder.append(this.g);
        stringBuilder.append(", state=");
        stringBuilder.append(this.p);
        stringBuilder.append(", currentElement=");
        stringBuilder.append(y());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    final void u() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r7 = this;
        r0 = r7.v;
        r0 = r0.size();
        r1 = 1;
        if (r0 <= 0) goto L_0x0017;
    L_0x0009:
        r0 = r7.v;
        r2 = r0.size();
        r2 = r2 - r1;
        r0 = r0.get(r2);
        r0 = (org.jsoup.nodes.Element) r0;
        goto L_0x0018;
    L_0x0017:
        r0 = 0;
    L_0x0018:
        if (r0 == 0) goto L_0x006b;
    L_0x001a:
        r2 = r7.c(r0);
        if (r2 == 0) goto L_0x0021;
    L_0x0020:
        goto L_0x006b;
    L_0x0021:
        r2 = r7.v;
        r2 = r2.size();
        r2 = r2 - r1;
        r3 = r0;
        r0 = r2;
    L_0x002a:
        r4 = 0;
        if (r0 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0041;
    L_0x002e:
        r3 = r7.v;
        r0 = r0 + -1;
        r3 = r3.get(r0);
        r3 = (org.jsoup.nodes.Element) r3;
        if (r3 == 0) goto L_0x0040;
    L_0x003a:
        r5 = r7.c(r3);
        if (r5 == 0) goto L_0x002a;
    L_0x0040:
        r1 = 0;
    L_0x0041:
        if (r1 != 0) goto L_0x004e;
    L_0x0043:
        r1 = r7.v;
        r0 = r0 + 1;
        r1 = r1.get(r0);
        r1 = (org.jsoup.nodes.Element) r1;
        r3 = r1;
    L_0x004e:
        org.jsoup.helper.Validate.notNull(r3);
        r1 = r3.nodeName();
        r1 = r7.a(r1);
        r5 = r1.attributes();
        r6 = r3.attributes();
        r5.addAll(r6);
        r5 = r7.v;
        r5.set(r0, r1);
        if (r0 != r2) goto L_0x0040;
    L_0x006b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.u():void");
    }

    final void v() {
        while (!this.v.isEmpty()) {
            Element element;
            int size = this.v.size();
            if (size > 0) {
                element = (Element) this.v.remove(size - 1);
                continue;
            } else {
                element = null;
                continue;
            }
            if (element == null) {
                return;
            }
        }
    }

    final void w() {
        this.v.add(null);
    }
}
