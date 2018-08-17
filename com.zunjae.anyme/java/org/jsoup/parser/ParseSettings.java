package org.jsoup.parser;

import java.util.Iterator;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class ParseSettings {
    public static final ParseSettings htmlDefault = new ParseSettings(false, false);
    public static final ParseSettings preserveCase = new ParseSettings(true, true);
    private final boolean a;
    private final boolean b;

    public ParseSettings(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    final String a(String str) {
        str = str.trim();
        return !this.a ? str.toLowerCase() : str;
    }

    final Attributes a(Attributes attributes) {
        if (!this.b) {
            Iterator it = attributes.iterator();
            while (it.hasNext()) {
                Attribute attribute = (Attribute) it.next();
                attribute.setKey(attribute.getKey().toLowerCase());
            }
        }
        return attributes;
    }
}
