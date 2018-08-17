package org.jsoup.nodes;

import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document.OutputSettings;

public class TextNode extends Node {
    String f;

    public TextNode(String str, String str2) {
        this.d = str2;
        this.f = str;
    }

    static boolean a(StringBuilder stringBuilder) {
        return stringBuilder.length() != 0 && stringBuilder.charAt(stringBuilder.length() - 1) == ' ';
    }

    private void c() {
        if (this.c == null) {
            this.c = new Attributes();
            this.c.put("text", this.f);
        }
    }

    public static TextNode createFromEncoded(String str, String str2) {
        return new TextNode(Entities.a(str), str2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void a(java.lang.Appendable r3, int r4, org.jsoup.nodes.Document.OutputSettings r5) {
        /*
        r2 = this;
        r0 = r5.prettyPrint();
        if (r0 == 0) goto L_0x003d;
    L_0x0006:
        r0 = r2.siblingIndex();
        if (r0 != 0) goto L_0x0024;
    L_0x000c:
        r0 = r2.a;
        r1 = r0 instanceof org.jsoup.nodes.Element;
        if (r1 == 0) goto L_0x0024;
    L_0x0012:
        r0 = (org.jsoup.nodes.Element) r0;
        r0 = r0.tag();
        r0 = r0.formatAsBlock();
        if (r0 == 0) goto L_0x0024;
    L_0x001e:
        r0 = r2.isBlank();
        if (r0 == 0) goto L_0x003a;
    L_0x0024:
        r0 = r5.outline();
        if (r0 == 0) goto L_0x003d;
    L_0x002a:
        r0 = r2.siblingNodes();
        r0 = r0.size();
        if (r0 <= 0) goto L_0x003d;
    L_0x0034:
        r0 = r2.isBlank();
        if (r0 != 0) goto L_0x003d;
    L_0x003a:
        org.jsoup.nodes.Node.c(r3, r4, r5);
    L_0x003d:
        r4 = r5.prettyPrint();
        r0 = 0;
        if (r4 == 0) goto L_0x0058;
    L_0x0044:
        r4 = r2.parent();
        r4 = r4 instanceof org.jsoup.nodes.Element;
        if (r4 == 0) goto L_0x0058;
    L_0x004c:
        r4 = r2.parent();
        r4 = org.jsoup.nodes.Element.a(r4);
        if (r4 != 0) goto L_0x0058;
    L_0x0056:
        r4 = 1;
        goto L_0x0059;
    L_0x0058:
        r4 = 0;
    L_0x0059:
        r1 = r2.getWholeText();
        org.jsoup.nodes.Entities.a(r3, r1, r5, r0, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.TextNode.a(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings):void");
    }

    public String absUrl(String str) {
        c();
        return super.absUrl(str);
    }

    public String attr(String str) {
        c();
        return super.attr(str);
    }

    public Node attr(String str, String str2) {
        c();
        return super.attr(str, str2);
    }

    public Attributes attributes() {
        c();
        return super.attributes();
    }

    final void b(Appendable appendable, int i, OutputSettings outputSettings) {
    }

    public String getWholeText() {
        Attributes attributes = this.c;
        return attributes == null ? this.f : attributes.get("text");
    }

    public boolean hasAttr(String str) {
        c();
        return super.hasAttr(str);
    }

    public boolean isBlank() {
        return StringUtil.isBlank(getWholeText());
    }

    public String nodeName() {
        return "#text";
    }

    public Node removeAttr(String str) {
        c();
        return super.removeAttr(str);
    }

    public TextNode splitText(int i) {
        Validate.isTrue(i >= 0, "Split offset must be not be negative");
        Validate.isTrue(i < this.f.length(), "Split offset must not be greater than current text length");
        String substring = getWholeText().substring(0, i);
        String substring2 = getWholeText().substring(i);
        text(substring);
        TextNode textNode = new TextNode(substring2, baseUri());
        if (parent() != null) {
            parent().a(siblingIndex() + 1, textNode);
        }
        return textNode;
    }

    public String text() {
        return StringUtil.normaliseWhitespace(getWholeText());
    }

    public TextNode text(String str) {
        this.f = str;
        Attributes attributes = this.c;
        if (attributes != null) {
            attributes.put("text", str);
        }
        return this;
    }

    public String toString() {
        return outerHtml();
    }
}
