package org.jsoup.helper;

import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class W3CDom {
    protected DocumentBuilderFactory a = DocumentBuilderFactory.newInstance();

    public class W3CBuilder implements NodeVisitor {
        private final Document a;
        private final HashMap<String, String> b = new HashMap();
        private Element c;

        public W3CBuilder(Document document) {
            this.a = document;
        }

        public void head(Node node, int i) {
            if (node instanceof org.jsoup.nodes.Element) {
                Attribute attribute;
                String key;
                org.jsoup.nodes.Element element = (org.jsoup.nodes.Element) node;
                Iterator it = element.attributes().iterator();
                while (it.hasNext()) {
                    Object obj;
                    attribute = (Attribute) it.next();
                    key = attribute.getKey();
                    if (key.equals("xmlns")) {
                        obj = BuildConfig.FLAVOR;
                    } else if (key.startsWith("xmlns:")) {
                        obj = key.substring(6);
                    }
                    this.b.put(obj, attribute.getValue());
                }
                i = element.tagName().indexOf(":");
                Object createElementNS = this.a.createElementNS((String) this.b.get(i > 0 ? element.tagName().substring(0, i) : BuildConfig.FLAVOR), element.tagName());
                Iterator it2 = element.attributes().iterator();
                while (it2.hasNext()) {
                    attribute = (Attribute) it2.next();
                    key = attribute.getKey().replaceAll("[^-a-zA-Z0-9_:.]", BuildConfig.FLAVOR);
                    if (key.matches("[a-zA-Z_:]{1}[-a-zA-Z0-9_:.]*")) {
                        createElementNS.setAttribute(key, attribute.getValue());
                    }
                }
                Element element2 = this.c;
                if (element2 == null) {
                    this.a.appendChild(createElementNS);
                } else {
                    element2.appendChild(createElementNS);
                }
                this.c = createElementNS;
                return;
            }
            org.w3c.dom.Node createTextNode;
            if (node instanceof TextNode) {
                createTextNode = this.a.createTextNode(((TextNode) node).getWholeText());
            } else if (node instanceof Comment) {
                createTextNode = this.a.createComment(((Comment) node).getData());
            } else {
                if (node instanceof DataNode) {
                    this.c.appendChild(this.a.createTextNode(((DataNode) node).getWholeData()));
                }
                return;
            }
            this.c.appendChild(createTextNode);
        }

        public void tail(Node node, int i) {
            if ((node instanceof org.jsoup.nodes.Element) && (this.c.getParentNode() instanceof Element)) {
                this.c = (Element) this.c.getParentNode();
            }
        }
    }

    public String asString(Document document) {
        try {
            Source dOMSource = new DOMSource(document);
            Writer stringWriter = new StringWriter();
            TransformerFactory.newInstance().newTransformer().transform(dOMSource, new StreamResult(stringWriter));
            return stringWriter.toString();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void convert(org.jsoup.nodes.Document document, Document document2) {
        if (!StringUtil.isBlank(document.location())) {
            document2.setDocumentURI(document.location());
        }
        new NodeTraversor(new W3CBuilder(document2)).traverse(document.child(0));
    }

    public Document fromJsoup(org.jsoup.nodes.Document document) {
        Validate.notNull(document);
        try {
            this.a.setNamespaceAware(true);
            Document newDocument = this.a.newDocumentBuilder().newDocument();
            convert(document, newDocument);
            return newDocument;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
