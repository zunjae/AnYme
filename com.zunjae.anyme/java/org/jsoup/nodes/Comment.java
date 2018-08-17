package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;

public class Comment extends Node {
    public Comment(String str, String str2) {
        super(str2);
        this.c.put("comment", str);
    }

    final void a(Appendable appendable, int i, OutputSettings outputSettings) {
        if (outputSettings.prettyPrint()) {
            Node.c(appendable, i, outputSettings);
        }
        appendable.append("<!--").append(getData()).append("-->");
    }

    final void b(Appendable appendable, int i, OutputSettings outputSettings) {
    }

    public String getData() {
        return this.c.get("comment");
    }

    public String nodeName() {
        return "#comment";
    }

    public String toString() {
        return outerHtml();
    }
}
