package org.jsoup.parser;

import java.util.ArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

abstract class da {
    private ag a = new ag();
    CharacterReader b;
    aj c;
    protected Document d;
    protected ArrayList<Element> e;
    protected String f;
    protected aa g;
    protected ParseErrorList h;
    protected ParseSettings i;
    private af j = new af();

    da() {
    }

    Document a(String str, String str2, ParseErrorList parseErrorList, ParseSettings parseSettings) {
        b(str, str2, parseErrorList, parseSettings);
        x();
        return this.d;
    }

    abstract ParseSettings a();

    protected abstract boolean a(aa aaVar);

    protected void b(String str, String str2, ParseErrorList parseErrorList, ParseSettings parseSettings) {
        Validate.notNull(str, "String input must not be null");
        Validate.notNull(str2, "BaseURI must not be null");
        this.d = new Document(str2);
        this.i = parseSettings;
        this.b = new CharacterReader(str);
        this.h = parseErrorList;
        this.c = new aj(this.b, parseErrorList);
        this.e = new ArrayList(32);
        this.f = str2;
    }

    protected final boolean l(String str) {
        aa aaVar = this.g;
        aa aaVar2 = this.a;
        return a(aaVar == aaVar2 ? new ag().a(str) : aaVar2.h().a(str));
    }

    protected final boolean m(String str) {
        aa aaVar = this.g;
        aa aaVar2 = this.j;
        return a(aaVar == aaVar2 ? new af().a(str) : aaVar2.h().a(str));
    }

    public boolean processStartTag(String str, Attributes attributes) {
        aa a;
        aa aaVar = this.g;
        aa aaVar2 = this.a;
        if (aaVar == aaVar2) {
            a = new ag().a(str, attributes);
        } else {
            aaVar2.h();
            this.a.a(str, attributes);
            a = this.a;
        }
        return a(a);
    }

    protected final void x() {
        aa a;
        do {
            a = this.c.a();
            a(a);
            a.a();
        } while (a.a != ai.EOF);
    }

    protected final Element y() {
        int size = this.e.size();
        return size > 0 ? (Element) this.e.get(size - 1) : null;
    }
}
