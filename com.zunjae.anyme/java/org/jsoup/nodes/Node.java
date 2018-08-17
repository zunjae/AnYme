package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public abstract class Node implements Cloneable {
    private static final List<Node> f = Collections.emptyList();
    Node a;
    List<Node> b;
    Attributes c;
    String d;
    int e;

    protected Node() {
        this.b = f;
        this.c = null;
    }

    protected Node(String str) {
        this(str, new Attributes());
    }

    protected Node(String str, Attributes attributes) {
        Validate.notNull(str);
        Validate.notNull(attributes);
        this.b = f;
        this.d = str.trim();
        this.c = attributes;
    }

    private void a(int i) {
        while (i < this.b.size()) {
            ((Node) this.b.get(i)).e = i;
            i++;
        }
    }

    private void a(int i, String str) {
        Validate.notNull(str);
        Validate.notNull(this.a);
        List parseFragment = Parser.parseFragment(str, parent() instanceof Element ? (Element) parent() : null, baseUri());
        this.a.a(i, (Node[]) parseFragment.toArray(new Node[parseFragment.size()]));
    }

    private void a(Node node) {
        Node node2 = this.a;
        if (node2 != null) {
            node2.b(this);
        }
        this.a = node;
    }

    private void a(Node node, Node node2) {
        Validate.isTrue(node.a == this);
        Validate.notNull(node2);
        Node node3 = node2.a;
        if (node3 != null) {
            node3.b(node2);
        }
        int i = node.e;
        this.b.set(i, node2);
        node2.a = this;
        node2.e = i;
        node.a = null;
    }

    protected static void c(Appendable appendable, int i, OutputSettings outputSettings) {
        appendable.append("\n").append(StringUtil.padding(i * outputSettings.indentAmount()));
    }

    private Node d(Node node) {
        try {
            Node node2 = (Node) super.clone();
            node2.a = node;
            node2.e = node == null ? 0 : this.e;
            Attributes attributes = this.c;
            node2.c = attributes != null ? attributes.clone() : null;
            node2.d = this.d;
            node2.b = new ArrayList(this.b.size());
            for (Node add : this.b) {
                node2.b.add(add);
            }
            return node2;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    protected final void a() {
        if (this.b == f) {
            this.b = new ArrayList(4);
        }
    }

    protected final void a(int i, Node... nodeArr) {
        Validate.noNullElements(nodeArr);
        a();
        for (int length = nodeArr.length - 1; length >= 0; length--) {
            Node node = nodeArr[length];
            c(node);
            this.b.add(i, node);
            a(i);
        }
    }

    protected final void a(Appendable appendable) {
        new NodeTraversor(new h(appendable, b())).traverse(this);
    }

    abstract void a(Appendable appendable, int i, OutputSettings outputSettings);

    protected final void a(Node... nodeArr) {
        for (Node node : nodeArr) {
            c(node);
            a();
            this.b.add(node);
            node.e = this.b.size() - 1;
        }
    }

    public String absUrl(String str) {
        Validate.notEmpty(str);
        return !hasAttr(str) ? BuildConfig.FLAVOR : StringUtil.resolve(this.d, attr(str));
    }

    public Node after(String str) {
        a(this.e + 1, str);
        return this;
    }

    public Node after(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.a);
        this.a.a(this.e + 1, node);
        return this;
    }

    public String attr(String str) {
        Validate.notNull(str);
        String ignoreCase = this.c.getIgnoreCase(str);
        return ignoreCase.length() > 0 ? ignoreCase : str.toLowerCase().startsWith("abs:") ? absUrl(str.substring(4)) : BuildConfig.FLAVOR;
    }

    public Node attr(String str, String str2) {
        this.c.put(str, str2);
        return this;
    }

    public Attributes attributes() {
        return this.c;
    }

    final OutputSettings b() {
        Document ownerDocument = ownerDocument();
        return ownerDocument != null ? ownerDocument.outputSettings() : new Document(BuildConfig.FLAVOR).outputSettings();
    }

    abstract void b(Appendable appendable, int i, OutputSettings outputSettings);

    protected final void b(Node node) {
        Validate.isTrue(node.a == this);
        int i = node.e;
        this.b.remove(i);
        a(i);
        node.a = null;
    }

    public String baseUri() {
        return this.d;
    }

    public Node before(String str) {
        a(this.e, str);
        return this;
    }

    public Node before(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.a);
        this.a.a(this.e, node);
        return this;
    }

    protected final void c(Node node) {
        Node node2 = node.a;
        if (node2 != null) {
            node2.b(node);
        }
        node.a(this);
    }

    public Node childNode(int i) {
        return (Node) this.b.get(i);
    }

    public final int childNodeSize() {
        return this.b.size();
    }

    public List<Node> childNodes() {
        return Collections.unmodifiableList(this.b);
    }

    public List<Node> childNodesCopy() {
        List<Node> arrayList = new ArrayList(this.b.size());
        for (Node clone : this.b) {
            arrayList.add(clone.clone());
        }
        return arrayList;
    }

    public Node clone() {
        Node d = d(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(d);
        while (!linkedList.isEmpty()) {
            Node node = (Node) linkedList.remove();
            for (int i = 0; i < node.b.size(); i++) {
                Node d2 = ((Node) node.b.get(i)).d(node);
                node.b.set(i, d2);
                linkedList.add(d2);
            }
        }
        return d;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public boolean hasAttr(String str) {
        Validate.notNull(str);
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (this.c.hasKeyIgnoreCase(substring) && !absUrl(substring).equals(BuildConfig.FLAVOR)) {
                return true;
            }
        }
        return this.c.hasKeyIgnoreCase(str);
    }

    public boolean hasSameValue(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return outerHtml().equals(((Node) obj).outerHtml());
            }
        }
        return false;
    }

    public <T extends Appendable> T html(T t) {
        a((Appendable) t);
        return t;
    }

    public Node nextSibling() {
        Node node = this.a;
        if (node == null) {
            return null;
        }
        List list = node.b;
        int i = this.e + 1;
        return list.size() > i ? (Node) list.get(i) : null;
    }

    public abstract String nodeName();

    public String outerHtml() {
        Appendable stringBuilder = new StringBuilder(128);
        a(stringBuilder);
        return stringBuilder.toString();
    }

    public Document ownerDocument() {
        Node root = root();
        return root instanceof Document ? (Document) root : null;
    }

    public Node parent() {
        return this.a;
    }

    public final Node parentNode() {
        return this.a;
    }

    public Node previousSibling() {
        Node node = this.a;
        if (node == null) {
            return null;
        }
        int i = this.e;
        return i > 0 ? (Node) node.b.get(i - 1) : null;
    }

    public void remove() {
        Validate.notNull(this.a);
        this.a.b(this);
    }

    public Node removeAttr(String str) {
        Validate.notNull(str);
        this.c.removeIgnoreCase(str);
        return this;
    }

    public void replaceWith(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.a);
        this.a.a(this, node);
    }

    public Node root() {
        Node node = this;
        while (true) {
            Node node2 = node.a;
            if (node2 == null) {
                return node;
            }
            node = node2;
        }
    }

    public void setBaseUri(String str) {
        Validate.notNull(str);
        traverse(new g(this, str));
    }

    public int siblingIndex() {
        return this.e;
    }

    public List<Node> siblingNodes() {
        Node node = this.a;
        if (node == null) {
            return Collections.emptyList();
        }
        List<Node> list = node.b;
        List<Node> arrayList = new ArrayList(list.size() - 1);
        for (Node node2 : list) {
            if (node2 != this) {
                arrayList.add(node2);
            }
        }
        return arrayList;
    }

    public String toString() {
        return outerHtml();
    }

    public Node traverse(NodeVisitor nodeVisitor) {
        Validate.notNull(nodeVisitor);
        new NodeTraversor(nodeVisitor).traverse(this);
        return this;
    }

    public Node unwrap() {
        Validate.notNull(this.a);
        Node node = this.b.size() > 0 ? (Node) this.b.get(0) : null;
        this.a.a(this.e, (Node[]) this.b.toArray(new Node[childNodeSize()]));
        remove();
        return node;
    }

    public Node wrap(String str) {
        Validate.notEmpty(str);
        List parseFragment = Parser.parseFragment(str, parent() instanceof Element ? (Element) parent() : null, baseUri());
        int i = 0;
        Node node = (Node) parseFragment.get(0);
        if (node != null) {
            if (node instanceof Element) {
                node = (Element) node;
                Element element = node;
                while (true) {
                    List children = element.children();
                    if (children.size() <= 0) {
                        break;
                    }
                    element = (Element) children.get(0);
                }
                this.a.a(this, node);
                element.a(this);
                if (parseFragment.size() > 0) {
                    while (i < parseFragment.size()) {
                        Node node2 = (Node) parseFragment.get(i);
                        node2.a.b(node2);
                        node.appendChild(node2);
                        i++;
                    }
                }
                return this;
            }
        }
        return null;
    }
}
