package org.jsoup.nodes;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;

public class DocumentType extends Node {
    public static final String PUBLIC_KEY = "PUBLIC";
    public static final String SYSTEM_KEY = "SYSTEM";

    public DocumentType(String str, String str2, String str3, String str4) {
        super(str4);
        attr("name", str);
        attr("publicId", str2);
        if (a("publicId")) {
            attr("pubSysKey", PUBLIC_KEY);
        }
        attr("systemId", str3);
    }

    public DocumentType(String str, String str2, String str3, String str4, String str5) {
        super(str5);
        attr("name", str);
        if (str2 != null) {
            attr("pubSysKey", str2);
        }
        attr("publicId", str3);
        attr("systemId", str4);
    }

    private boolean a(String str) {
        return !StringUtil.isBlank(attr(str));
    }

    final void a(Appendable appendable, int i, OutputSettings outputSettings) {
        CharSequence charSequence = (outputSettings.syntax() != Syntax.html || a("publicId") || a("systemId")) ? "<!DOCTYPE" : "<!doctype";
        appendable.append(charSequence);
        if (a("name")) {
            appendable.append(" ").append(attr("name"));
        }
        if (a("pubSysKey")) {
            appendable.append(" ").append(attr("pubSysKey"));
        }
        if (a("publicId")) {
            appendable.append(" \"").append(attr("publicId")).append('\"');
        }
        if (a("systemId")) {
            appendable.append(" \"").append(attr("systemId")).append('\"');
        }
        appendable.append('>');
    }

    final void b(Appendable appendable, int i, OutputSettings outputSettings) {
    }

    public String nodeName() {
        return "#doctype";
    }
}
