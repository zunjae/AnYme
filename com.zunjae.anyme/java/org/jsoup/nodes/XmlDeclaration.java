package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document.OutputSettings;

public class XmlDeclaration extends Node {
    private final String f;
    private final boolean g;

    public XmlDeclaration(String str, String str2, boolean z) {
        super(str2);
        Validate.notNull(str);
        this.f = str;
        this.g = z;
    }

    final void a(Appendable appendable, int i, OutputSettings outputSettings) {
        appendable.append("<").append(this.g ? "!" : "?").append(this.f);
        this.c.a(appendable, outputSettings);
        appendable.append(this.g ? "!" : "?").append(">");
    }

    final void b(Appendable appendable, int i, OutputSettings outputSettings) {
    }

    public String getWholeDeclaration() {
        return this.c.html().trim();
    }

    public String name() {
        return this.f;
    }

    public String nodeName() {
        return "#declaration";
    }

    public String toString() {
        return outerHtml();
    }
}
