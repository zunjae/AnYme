package org.jsoup.examples;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeVisitor;

final class a implements NodeVisitor {
    final /* synthetic */ HtmlToPlainText a;
    private int b;
    private StringBuilder c;

    private a(HtmlToPlainText htmlToPlainText) {
        this.a = htmlToPlainText;
        this.b = 0;
        this.c = new StringBuilder();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r8) {
        /*
        r7 = this;
        r0 = "\n";
        r0 = r8.startsWith(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        r7.b = r1;
    L_0x000b:
        r0 = " ";
        r0 = r8.equals(r0);
        r2 = 1;
        if (r0 == 0) goto L_0x0036;
    L_0x0014:
        r0 = r7.c;
        r0 = r0.length();
        if (r0 == 0) goto L_0x0035;
    L_0x001c:
        r0 = r7.c;
        r3 = r0.length();
        r3 = r3 - r2;
        r0 = r0.substring(r3);
        r3 = " ";
        r4 = "\n";
        r3 = new java.lang.String[]{r3, r4};
        r0 = org.jsoup.helper.StringUtil.in(r0, r3);
        if (r0 == 0) goto L_0x0036;
    L_0x0035:
        return;
    L_0x0036:
        r0 = r8.length();
        r3 = r7.b;
        r0 = r0 + r3;
        r3 = 80;
        if (r0 <= r3) goto L_0x0093;
    L_0x0041:
        r0 = "\\s+";
        r8 = r8.split(r0);
        r0 = 0;
    L_0x0048:
        r4 = r8.length;
        if (r0 >= r4) goto L_0x0092;
    L_0x004b:
        r4 = r8[r0];
        r5 = r8.length;
        r5 = r5 - r2;
        if (r0 != r5) goto L_0x0053;
    L_0x0051:
        r5 = 1;
        goto L_0x0054;
    L_0x0053:
        r5 = 0;
    L_0x0054:
        if (r5 != 0) goto L_0x0067;
    L_0x0056:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r5.append(r4);
        r4 = " ";
        r5.append(r4);
        r4 = r5.toString();
    L_0x0067:
        r5 = r4.length();
        r6 = r7.b;
        r5 = r5 + r6;
        if (r5 <= r3) goto L_0x0081;
    L_0x0070:
        r5 = r7.c;
        r6 = "\n";
        r5.append(r6);
        r5.append(r4);
        r4 = r4.length();
        r7.b = r4;
        goto L_0x008f;
    L_0x0081:
        r5 = r7.c;
        r5.append(r4);
        r5 = r7.b;
        r4 = r4.length();
        r5 = r5 + r4;
        r7.b = r5;
    L_0x008f:
        r0 = r0 + 1;
        goto L_0x0048;
    L_0x0092:
        return;
    L_0x0093:
        r0 = r7.c;
        r0.append(r8);
        r0 = r7.b;
        r8 = r8.length();
        r0 = r0 + r8;
        r7.b = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.examples.a.a(java.lang.String):void");
    }

    public final void head(Node node, int i) {
        String text;
        String nodeName = node.nodeName();
        if (node instanceof TextNode) {
            text = ((TextNode) node).text();
        } else if (nodeName.equals("li")) {
            text = "\n * ";
        } else if (nodeName.equals("dt")) {
            text = "  ";
        } else {
            if (StringUtil.in(nodeName, "p", "h1", "h2", "h3", "h4", "h5", "tr")) {
                a("\n");
            }
            return;
        }
        a(text);
    }

    public final void tail(Node node, int i) {
        String nodeName = node.nodeName();
        if (StringUtil.in(nodeName, "br", "dd", "dt", "p", "h1", "h2", "h3", "h4", "h5")) {
            a("\n");
            return;
        }
        if (nodeName.equals("a")) {
            a(String.format(" <%s>", new Object[]{node.absUrl("href")}));
        }
    }

    public final String toString() {
        return this.c.toString();
    }
}
