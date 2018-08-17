package org.jsoup.parser;

import java.util.HashMap;
import java.util.Map;
import org.jsoup.helper.Validate;

public class Tag {
    private static final Map<String, Tag> a = new HashMap();
    private static final String[] l = new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "s", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math"};
    private static final String[] m = new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi"};
    private static final String[] n = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
    private static final String[] o = new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
    private static final String[] p = new String[]{"pre", "plaintext", "title", "textarea"};
    private static final String[] q = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    private static final String[] r = new String[]{"input", "keygen", "object", "select", "textarea"};
    private String b;
    private boolean c = true;
    private boolean d = true;
    private boolean e = true;
    private boolean f = true;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;

    static {
        int i = 0;
        for (String tag : l) {
            a(new Tag(tag));
        }
        for (String tag2 : m) {
            Tag tag3 = new Tag(tag2);
            tag3.c = false;
            tag3.e = false;
            tag3.d = false;
            a(tag3);
        }
        for (Object obj : n) {
            tag3 = (Tag) a.get(obj);
            Validate.notNull(tag3);
            tag3.e = false;
            tag3.f = false;
            tag3.g = true;
        }
        for (Object obj2 : o) {
            tag3 = (Tag) a.get(obj2);
            Validate.notNull(tag3);
            tag3.d = false;
        }
        for (Object obj22 : p) {
            tag3 = (Tag) a.get(obj22);
            Validate.notNull(tag3);
            tag3.i = true;
        }
        for (Object obj222 : q) {
            tag3 = (Tag) a.get(obj222);
            Validate.notNull(tag3);
            tag3.j = true;
        }
        String[] strArr = r;
        int length = strArr.length;
        while (i < length) {
            Tag tag4 = (Tag) a.get(strArr[i]);
            Validate.notNull(tag4);
            tag4.k = true;
            i++;
        }
    }

    private Tag(String str) {
        this.b = str;
    }

    private static void a(Tag tag) {
        a.put(tag.b, tag);
    }

    public static boolean isKnownTag(String str) {
        return a.containsKey(str);
    }

    public static Tag valueOf(String str) {
        return valueOf(str, ParseSettings.preserveCase);
    }

    public static Tag valueOf(String str, ParseSettings parseSettings) {
        Validate.notNull(str);
        Tag tag = (Tag) a.get(str);
        if (tag != null) {
            return tag;
        }
        str = parseSettings.a(str);
        Validate.notEmpty(str);
        tag = (Tag) a.get(str);
        if (tag != null) {
            return tag;
        }
        tag = new Tag(str);
        tag.c = false;
        tag.e = true;
        return tag;
    }

    final Tag a() {
        this.h = true;
        return this;
    }

    public boolean canContainBlock() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        return this.b.equals(tag.b) && this.e == tag.e && this.f == tag.f && this.g == tag.g && this.d == tag.d && this.c == tag.c && this.i == tag.i && this.h == tag.h && this.j == tag.j && this.k == tag.k;
    }

    public boolean formatAsBlock() {
        return this.d;
    }

    public String getName() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((((((((this.b.hashCode() * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k;
    }

    public boolean isBlock() {
        return this.c;
    }

    public boolean isData() {
        return (this.f || isEmpty()) ? false : true;
    }

    public boolean isEmpty() {
        return this.g;
    }

    public boolean isFormListed() {
        return this.j;
    }

    public boolean isFormSubmittable() {
        return this.k;
    }

    public boolean isInline() {
        return !this.c;
    }

    public boolean isKnownTag() {
        return a.containsKey(this.b);
    }

    public boolean isSelfClosing() {
        if (!this.g) {
            if (!this.h) {
                return false;
            }
        }
        return true;
    }

    public boolean preserveWhitespace() {
        return this.i;
    }

    public String toString() {
        return this.b;
    }
}
