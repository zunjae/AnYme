package org.jsoup.parser;

import java.util.ArrayList;

public class ParseErrorList extends ArrayList<ParseError> {
    private final int a;

    private ParseErrorList(int i, int i2) {
        super(i);
        this.a = i2;
    }

    public static ParseErrorList noTracking() {
        return new ParseErrorList(0, 0);
    }

    public static ParseErrorList tracking(int i) {
        return new ParseErrorList(16, i);
    }

    final boolean a() {
        return size() < this.a;
    }
}
