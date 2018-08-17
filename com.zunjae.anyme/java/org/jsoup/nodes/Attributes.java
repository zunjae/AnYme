package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document.OutputSettings;

public class Attributes implements Cloneable, Iterable<Attribute> {
    private LinkedHashMap<String, Attribute> a = null;

    final void a(Appendable appendable, OutputSettings outputSettings) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap != null) {
            for (Entry value : linkedHashMap.entrySet()) {
                Attribute attribute = (Attribute) value.getValue();
                appendable.append(" ");
                attribute.a(appendable, outputSettings);
            }
        }
    }

    public void addAll(Attributes attributes) {
        if (attributes.size() != 0) {
            if (this.a == null) {
                this.a = new LinkedHashMap(attributes.size());
            }
            this.a.putAll(attributes.a);
        }
    }

    public List<Attribute> asList() {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap == null) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(linkedHashMap.size());
        for (Entry value : this.a.entrySet()) {
            arrayList.add(value.getValue());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Attributes clone() {
        if (this.a == null) {
            return new Attributes();
        }
        try {
            Attributes attributes = (Attributes) super.clone();
            attributes.a = new LinkedHashMap(this.a.size());
            Iterator it = iterator();
            while (it.hasNext()) {
                Attribute attribute = (Attribute) it.next();
                attributes.a.put(attribute.getKey(), attribute.clone());
            }
            return attributes;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, String> dataset() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attributes)) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap == null) {
            return attributes.a == null;
        } else {
            if (!linkedHashMap.equals(attributes.a)) {
            }
        }
    }

    public String get(String str) {
        Validate.notEmpty(str);
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap == null) {
            return BuildConfig.FLAVOR;
        }
        Attribute attribute = (Attribute) linkedHashMap.get(str);
        return attribute != null ? attribute.getValue() : BuildConfig.FLAVOR;
    }

    public String getIgnoreCase(String str) {
        Validate.notEmpty(str);
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap == null) {
            return BuildConfig.FLAVOR;
        }
        for (String str2 : linkedHashMap.keySet()) {
            if (str2.equalsIgnoreCase(str)) {
                return ((Attribute) this.a.get(str2)).getValue();
            }
        }
        return BuildConfig.FLAVOR;
    }

    public boolean hasKey(String str) {
        LinkedHashMap linkedHashMap = this.a;
        return linkedHashMap != null && linkedHashMap.containsKey(str);
    }

    public boolean hasKeyIgnoreCase(String str) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap == null) {
            return false;
        }
        for (String equalsIgnoreCase : linkedHashMap.keySet()) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        LinkedHashMap linkedHashMap = this.a;
        return linkedHashMap != null ? linkedHashMap.hashCode() : 0;
    }

    public String html() {
        Appendable stringBuilder = new StringBuilder();
        try {
            a(stringBuilder, new Document(BuildConfig.FLAVOR).outputSettings());
            return stringBuilder.toString();
        } catch (Throwable e) {
            throw new SerializationException(e);
        }
    }

    public Iterator<Attribute> iterator() {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap != null) {
            if (!linkedHashMap.isEmpty()) {
                return this.a.values().iterator();
            }
        }
        return Collections.emptyList().iterator();
    }

    public void put(String str, String str2) {
        put(new Attribute(str, str2));
    }

    public void put(String str, boolean z) {
        if (z) {
            put(new BooleanAttribute(str));
        } else {
            remove(str);
        }
    }

    public void put(Attribute attribute) {
        Validate.notNull(attribute);
        if (this.a == null) {
            this.a = new LinkedHashMap(2);
        }
        this.a.put(attribute.getKey(), attribute);
    }

    public void remove(String str) {
        Validate.notEmpty(str);
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap != null) {
            linkedHashMap.remove(str);
        }
    }

    public void removeIgnoreCase(String str) {
        Validate.notEmpty(str);
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap != null) {
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equalsIgnoreCase(str)) {
                    it.remove();
                }
            }
        }
    }

    public int size() {
        LinkedHashMap linkedHashMap = this.a;
        return linkedHashMap == null ? 0 : linkedHashMap.size();
    }

    public String toString() {
        return html();
    }
}
