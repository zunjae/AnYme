package org.jsoup.parser;

import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class Parser {
    private da a;
    private int b = 0;
    private ParseErrorList c;
    private ParseSettings d;

    public Parser(da daVar) {
        this.a = daVar;
        this.d = daVar.a();
    }

    public static Parser htmlParser() {
        return new Parser(new HtmlTreeBuilder());
    }

    public static Document parse(String str, String str2) {
        da htmlTreeBuilder = new HtmlTreeBuilder();
        return htmlTreeBuilder.a(str, str2, ParseErrorList.noTracking(), htmlTreeBuilder.a());
    }

    public static Document parseBodyFragment(String str, String str2) {
        Document createShell = Document.createShell(str2);
        Element body = createShell.body();
        List parseFragment = parseFragment(str, body, str2);
        Node[] nodeArr = (Node[]) parseFragment.toArray(new Node[parseFragment.size()]);
        for (int length = nodeArr.length - 1; length > 0; length--) {
            nodeArr[length].remove();
        }
        for (Node appendChild : nodeArr) {
            body.appendChild(appendChild);
        }
        return createShell;
    }

    public static Document parseBodyFragmentRelaxed(String str, String str2) {
        return parse(str, str2);
    }

    public static List<Node> parseFragment(String str, Element element, String str2) {
        return new HtmlTreeBuilder().a(str, element, str2, ParseErrorList.noTracking(), ParseSettings.htmlDefault);
    }

    public static List<Node> parseFragment(String str, Element element, String str2, ParseErrorList parseErrorList) {
        return new HtmlTreeBuilder().a(str, element, str2, parseErrorList, ParseSettings.htmlDefault);
    }

    public static List<Node> parseXmlFragment(String str, String str2) {
        return new XmlTreeBuilder().c(str, str2, ParseErrorList.noTracking(), ParseSettings.preserveCase);
    }

    public static String unescapeEntities(String str, boolean z) {
        return new aj(new CharacterReader(str), ParseErrorList.noTracking()).b(z);
    }

    public static Parser xmlParser() {
        return new Parser(new XmlTreeBuilder());
    }

    public List<ParseError> getErrors() {
        return this.c;
    }

    public da getTreeBuilder() {
        return this.a;
    }

    public boolean isTrackErrors() {
        return this.b > 0;
    }

    public Document parseInput(String str, String str2) {
        this.c = isTrackErrors() ? ParseErrorList.tracking(this.b) : ParseErrorList.noTracking();
        return this.a.a(str, str2, this.c, this.d);
    }

    public Parser setTrackErrors(int i) {
        this.b = i;
        return this;
    }

    public Parser setTreeBuilder(da daVar) {
        this.a = daVar;
        return this;
    }

    public ParseSettings settings() {
        return this.d;
    }

    public Parser settings(ParseSettings parseSettings) {
        this.d = parseSettings;
        return this;
    }
}
