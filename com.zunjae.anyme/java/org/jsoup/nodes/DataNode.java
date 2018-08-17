package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;

public class DataNode extends Node {
    public DataNode(String str, String str2) {
        super(str2);
        this.c.put("data", str);
    }

    public static DataNode createFromEncoded(String str, String str2) {
        return new DataNode(Entities.a(str), str2);
    }

    final void a(Appendable appendable, int i, OutputSettings outputSettings) {
        appendable.append(getWholeData());
    }

    final void b(Appendable appendable, int i, OutputSettings outputSettings) {
    }

    public String getWholeData() {
        return this.c.get("data");
    }

    public String nodeName() {
        return "#data";
    }

    public DataNode setWholeData(String str) {
        this.c.put("data", str);
        return this;
    }

    public String toString() {
        return outerHtml();
    }
}
