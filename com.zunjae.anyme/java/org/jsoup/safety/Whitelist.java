package org.jsoup.safety;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class Whitelist {
    private Set<f> a = new HashSet();
    private Map<f, Set<c>> b = new HashMap();
    private Map<f, Map<c, d>> c = new HashMap();
    private Map<f, Map<c, Set<e>>> d = new HashMap();
    private boolean e = false;

    public static Whitelist basic() {
        return new Whitelist().addTags("a", "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em", "i", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "u", "ul").addAttributes("a", "href").addAttributes("blockquote", "cite").addAttributes("q", "cite").addProtocols("a", "href", "ftp", "http", "https", "mailto").addProtocols("blockquote", "cite", "http", "https").addProtocols("cite", "cite", "http", "https").addEnforcedAttribute("a", "rel", "nofollow");
    }

    public static Whitelist basicWithImages() {
        return basic().addTags("img").addAttributes("img", "align", "alt", "height", "src", "title", "width").addProtocols("img", "src", "http", "https");
    }

    public static Whitelist none() {
        return new Whitelist();
    }

    public static Whitelist relaxed() {
        return new Whitelist().addTags("a", "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u", "ul").addAttributes("a", "href", "title").addAttributes("blockquote", "cite").addAttributes("col", "span", "width").addAttributes("colgroup", "span", "width").addAttributes("img", "align", "alt", "height", "src", "title", "width").addAttributes("ol", "start", "type").addAttributes("q", "cite").addAttributes("table", "summary", "width").addAttributes("td", "abbr", "axis", "colspan", "rowspan", "width").addAttributes("th", "abbr", "axis", "colspan", "rowspan", "scope", "width").addAttributes("ul", "type").addProtocols("a", "href", "ftp", "http", "https", "mailto").addProtocols("blockquote", "cite", "http", "https").addProtocols("cite", "cite", "http", "https").addProtocols("img", "src", "http", "https").addProtocols("q", "cite", "http", "https");
    }

    public static Whitelist simpleText() {
        return new Whitelist().addTags("b", "em", "i", "strong", "u");
    }

    protected final boolean a(String str) {
        return this.a.contains(f.a(str));
    }

    protected final boolean a(String str, Element element, Attribute attribute) {
        f a = f.a(str);
        c a2 = c.a(attribute.getKey());
        Set set = (Set) this.b.get(a);
        if (set == null || !set.contains(a2)) {
            if (((Map) this.c.get(a)) != null) {
                Attributes b = b(str);
                String key = attribute.getKey();
                if (b.hasKeyIgnoreCase(key)) {
                    return b.getIgnoreCase(key).equals(attribute.getValue());
                }
            }
            return !str.equals(":all") && a(":all", element, attribute);
        } else {
            if (this.d.containsKey(a)) {
                Map map = (Map) this.d.get(a);
                if (map.containsKey(a2)) {
                    Object obj;
                    Set<e> set2 = (Set) map.get(a2);
                    String absUrl = element.absUrl(attribute.getKey());
                    if (absUrl.length() == 0) {
                        absUrl = attribute.getValue();
                    }
                    if (!this.e) {
                        attribute.setValue(absUrl);
                    }
                    for (e eVar : set2) {
                        String eVar2 = eVar.toString();
                        if (eVar2.equals("#")) {
                            Object obj2 = (!absUrl.startsWith("#") || absUrl.matches(".*\\s.*")) ? null : 1;
                            if (obj2 != null) {
                            }
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(eVar2);
                            stringBuilder.append(":");
                            if (absUrl.toLowerCase().startsWith(stringBuilder.toString())) {
                            }
                        }
                        obj = 1;
                    }
                    obj = null;
                    if (obj == null) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public Whitelist addAttributes(String str, String... strArr) {
        Validate.notEmpty(str);
        Validate.notNull(strArr);
        Validate.isTrue(strArr.length > 0, "No attribute names supplied.");
        f a = f.a(str);
        if (!this.a.contains(a)) {
            this.a.add(a);
        }
        Collection hashSet = new HashSet();
        for (String str2 : strArr) {
            Validate.notEmpty(str2);
            hashSet.add(c.a(str2));
        }
        if (this.b.containsKey(a)) {
            ((Set) this.b.get(a)).addAll(hashSet);
        } else {
            this.b.put(a, hashSet);
        }
        return this;
    }

    public Whitelist addEnforcedAttribute(String str, String str2, String str3) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notEmpty(str3);
        f a = f.a(str);
        if (!this.a.contains(a)) {
            this.a.add(a);
        }
        c a2 = c.a(str2);
        d dVar = new d(str3);
        if (this.c.containsKey(a)) {
            ((Map) this.c.get(a)).put(a2, dVar);
        } else {
            Map hashMap = new HashMap();
            hashMap.put(a2, dVar);
            this.c.put(a, hashMap);
        }
        return this;
    }

    public Whitelist addProtocols(String str, String str2, String... strArr) {
        Map map;
        Set set;
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notNull(strArr);
        f a = f.a(str);
        c a2 = c.a(str2);
        if (this.d.containsKey(a)) {
            map = (Map) this.d.get(a);
        } else {
            HashMap hashMap = new HashMap();
            this.d.put(a, hashMap);
            map = hashMap;
        }
        if (map.containsKey(a2)) {
            set = (Set) map.get(a2);
        } else {
            HashSet hashSet = new HashSet();
            map.put(a2, hashSet);
            set = hashSet;
        }
        for (String str3 : strArr) {
            Validate.notEmpty(str3);
            set.add(e.a(str3));
        }
        return this;
    }

    public Whitelist addTags(String... strArr) {
        Validate.notNull(strArr);
        for (String str : strArr) {
            Validate.notEmpty(str);
            this.a.add(f.a(str));
        }
        return this;
    }

    final Attributes b(String str) {
        Attributes attributes = new Attributes();
        f a = f.a(str);
        if (this.c.containsKey(a)) {
            for (Entry entry : ((Map) this.c.get(a)).entrySet()) {
                attributes.put(((c) entry.getKey()).toString(), ((d) entry.getValue()).toString());
            }
        }
        return attributes;
    }

    public Whitelist preserveRelativeLinks(boolean z) {
        this.e = z;
        return this;
    }

    public Whitelist removeAttributes(String str, String... strArr) {
        Validate.notEmpty(str);
        Validate.notNull(strArr);
        Validate.isTrue(strArr.length > 0, "No attribute names supplied.");
        f a = f.a(str);
        Collection hashSet = new HashSet();
        for (String str2 : strArr) {
            Validate.notEmpty(str2);
            hashSet.add(c.a(str2));
        }
        if (this.a.contains(a) && this.b.containsKey(a)) {
            Set set = (Set) this.b.get(a);
            set.removeAll(hashSet);
            if (set.isEmpty()) {
                this.b.remove(a);
            }
        }
        if (str.equals(":all")) {
            for (f fVar : this.b.keySet()) {
                Set set2 = (Set) this.b.get(fVar);
                set2.removeAll(hashSet);
                if (set2.isEmpty()) {
                    this.b.remove(fVar);
                }
            }
        }
        return this;
    }

    public Whitelist removeEnforcedAttribute(String str, String str2) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        f a = f.a(str);
        if (this.a.contains(a) && this.c.containsKey(a)) {
            Map map = (Map) this.c.get(a);
            map.remove(c.a(str2));
            if (map.isEmpty()) {
                this.c.remove(a);
            }
        }
        return this;
    }

    public Whitelist removeProtocols(String str, String str2, String... strArr) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notNull(strArr);
        f a = f.a(str);
        c a2 = c.a(str2);
        Validate.isTrue(this.d.containsKey(a), "Cannot remove a protocol that is not set.");
        Map map = (Map) this.d.get(a);
        Validate.isTrue(map.containsKey(a2), "Cannot remove a protocol that is not set.");
        Set set = (Set) map.get(a2);
        for (String str3 : strArr) {
            Validate.notEmpty(str3);
            set.remove(e.a(str3));
        }
        if (set.isEmpty()) {
            map.remove(a2);
            if (map.isEmpty()) {
                this.d.remove(a);
            }
        }
        return this;
    }

    public Whitelist removeTags(String... strArr) {
        Validate.notNull(strArr);
        for (String str : strArr) {
            Validate.notEmpty(str);
            f a = f.a(str);
            if (this.a.remove(a)) {
                this.b.remove(a);
                this.c.remove(a);
                this.d.remove(a);
            }
        }
        return this;
    }
}
