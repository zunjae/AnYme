package org.jsoup.select;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Evaluator.AllElements;
import org.jsoup.select.Evaluator.Attribute;
import org.jsoup.select.Evaluator.AttributeStarting;
import org.jsoup.select.Evaluator.AttributeWithValue;
import org.jsoup.select.Evaluator.AttributeWithValueContaining;
import org.jsoup.select.Evaluator.AttributeWithValueEnding;
import org.jsoup.select.Evaluator.AttributeWithValueMatching;
import org.jsoup.select.Evaluator.AttributeWithValueNot;
import org.jsoup.select.Evaluator.AttributeWithValueStarting;
import org.jsoup.select.Evaluator.Class;
import org.jsoup.select.Evaluator.ContainsData;
import org.jsoup.select.Evaluator.ContainsOwnText;
import org.jsoup.select.Evaluator.ContainsText;
import org.jsoup.select.Evaluator.Id;
import org.jsoup.select.Evaluator.IndexEquals;
import org.jsoup.select.Evaluator.IndexGreaterThan;
import org.jsoup.select.Evaluator.IndexLessThan;
import org.jsoup.select.Evaluator.IsEmpty;
import org.jsoup.select.Evaluator.IsFirstChild;
import org.jsoup.select.Evaluator.IsFirstOfType;
import org.jsoup.select.Evaluator.IsLastChild;
import org.jsoup.select.Evaluator.IsLastOfType;
import org.jsoup.select.Evaluator.IsNthChild;
import org.jsoup.select.Evaluator.IsNthLastChild;
import org.jsoup.select.Evaluator.IsNthLastOfType;
import org.jsoup.select.Evaluator.IsNthOfType;
import org.jsoup.select.Evaluator.IsOnlyChild;
import org.jsoup.select.Evaluator.IsOnlyOfType;
import org.jsoup.select.Evaluator.IsRoot;
import org.jsoup.select.Evaluator.Matches;
import org.jsoup.select.Evaluator.MatchesOwn;
import org.jsoup.select.Evaluator.Tag;
import org.jsoup.select.Evaluator.TagEndsWith;
import org.jsoup.select.Selector.SelectorParseException;

public class QueryParser {
    private static final String[] a = new String[]{",", ">", "+", "~", " "};
    private static final String[] b = new String[]{"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern f = Pattern.compile("((\\+|-)?(\\d+)?)n(\\s*(\\+|-)?\\s*\\d+)?", 2);
    private static final Pattern g = Pattern.compile("(\\+|-)?(\\d+)");
    private TokenQueue c;
    private String d;
    private List<Evaluator> e = new ArrayList();

    private QueryParser(String str) {
        this.d = str;
        this.c = new TokenQueue(str);
    }

    private String a() {
        StringBuilder stringBuilder = new StringBuilder();
        while (!this.c.isEmpty()) {
            String str;
            if (!this.c.matches("(")) {
                if (!this.c.matches("[")) {
                    if (this.c.matchesAny(a)) {
                        break;
                    }
                    stringBuilder.append(this.c.consume());
                } else {
                    stringBuilder.append("[");
                    stringBuilder.append(this.c.chompBalanced('[', ']'));
                    str = "]";
                }
            } else {
                stringBuilder.append("(");
                stringBuilder.append(this.c.chompBalanced('(', ')'));
                str = ")";
            }
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    private void a(char c) {
        Evaluator evaluator;
        Object obj;
        Evaluator evaluator2;
        Object cVar;
        this.c.consumeWhitespace();
        Evaluator parse = parse(a());
        if (this.e.size() == 1) {
            evaluator = (Evaluator) this.e.get(0);
            if ((evaluator instanceof d) && c != ',') {
                obj = 1;
                evaluator2 = evaluator;
                evaluator = ((d) evaluator).a();
                this.e.clear();
                if (c == '>') {
                    cVar = new c(parse, new g(evaluator));
                } else if (c == ' ') {
                    cVar = new c(parse, new j(evaluator));
                } else if (c == '+') {
                    cVar = new c(parse, new h(evaluator));
                } else if (c == '~') {
                    cVar = new c(parse, new k(evaluator));
                } else if (c == ',') {
                    throw new SelectorParseException("Unknown combinator: ".concat(String.valueOf(c)), new Object[0]);
                } else if (evaluator instanceof d) {
                    cVar = new d();
                    cVar.b(evaluator);
                    cVar.b(parse);
                } else {
                    d dVar = (d) evaluator;
                    dVar.b(parse);
                    cVar = dVar;
                }
                if (obj != null) {
                    ((d) evaluator2).a(cVar);
                    cVar = evaluator2;
                }
                this.e.add(cVar);
            }
        }
        evaluator = new c(this.e);
        evaluator2 = evaluator;
        obj = null;
        this.e.clear();
        if (c == '>') {
            cVar = new c(parse, new g(evaluator));
        } else if (c == ' ') {
            cVar = new c(parse, new j(evaluator));
        } else if (c == '+') {
            cVar = new c(parse, new h(evaluator));
        } else if (c == '~') {
            cVar = new c(parse, new k(evaluator));
        } else if (c == ',') {
            throw new SelectorParseException("Unknown combinator: ".concat(String.valueOf(c)), new Object[0]);
        } else if (evaluator instanceof d) {
            cVar = new d();
            cVar.b(evaluator);
            cVar.b(parse);
        } else {
            d dVar2 = (d) evaluator;
            dVar2.b(parse);
            cVar = dVar2;
        }
        if (obj != null) {
            ((d) evaluator2).a(cVar);
            cVar = evaluator2;
        }
        this.e.add(cVar);
    }

    private void a(boolean z) {
        List list;
        Object containsOwnText;
        this.c.consume(z ? ":containsOwn" : ":contains");
        String unescape = TokenQueue.unescape(this.c.chompBalanced('(', ')'));
        Validate.notEmpty(unescape, ":contains(text) query must not be empty");
        if (z) {
            list = this.e;
            containsOwnText = new ContainsOwnText(unescape);
        } else {
            list = this.e;
            containsOwnText = new ContainsText(unescape);
        }
        list.add(containsOwnText);
    }

    private void a(boolean z, boolean z2) {
        List list;
        Object isNthLastOfType;
        CharSequence toLowerCase = this.c.chompTo(")").trim().toLowerCase();
        Matcher matcher = f.matcher(toLowerCase);
        Matcher matcher2 = g.matcher(toLowerCase);
        int i = 2;
        int i2 = 0;
        if ("odd".equals(toLowerCase)) {
            i2 = 1;
        } else if (!"even".equals(toLowerCase)) {
            if (matcher.matches()) {
                i = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", BuildConfig.FLAVOR)) : 1;
                if (matcher.group(4) != null) {
                    i2 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", BuildConfig.FLAVOR));
                }
            } else if (matcher2.matches()) {
                i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", BuildConfig.FLAVOR));
                i = 0;
            } else {
                throw new SelectorParseException("Could not parse nth-index '%s': unexpected format", toLowerCase);
            }
        }
        if (z2) {
            if (z) {
                list = this.e;
                isNthLastOfType = new IsNthLastOfType(i, i2);
            } else {
                list = this.e;
                isNthLastOfType = new IsNthOfType(i, i2);
            }
        } else if (z) {
            list = this.e;
            isNthLastOfType = new IsNthLastChild(i, i2);
        } else {
            list = this.e;
            isNthLastOfType = new IsNthChild(i, i2);
        }
        list.add(isNthLastOfType);
    }

    private void b() {
        if (this.c.matchChomp("#")) {
            c();
        } else if (this.c.matchChomp(".")) {
            d();
        } else {
            if (!this.c.matchesWord()) {
                if (!this.c.matches("*|")) {
                    if (this.c.matches("[")) {
                        f();
                        return;
                    } else if (this.c.matchChomp("*")) {
                        g();
                        return;
                    } else if (this.c.matchChomp(":lt(")) {
                        h();
                        return;
                    } else if (this.c.matchChomp(":gt(")) {
                        i();
                        return;
                    } else if (this.c.matchChomp(":eq(")) {
                        j();
                        return;
                    } else if (this.c.matches(":has(")) {
                        l();
                        return;
                    } else if (this.c.matches(":contains(")) {
                        a(false);
                        return;
                    } else if (this.c.matches(":containsOwn(")) {
                        a(true);
                        return;
                    } else if (this.c.matches(":containsData(")) {
                        m();
                        return;
                    } else if (this.c.matches(":matches(")) {
                        b(false);
                        return;
                    } else if (this.c.matches(":matchesOwn(")) {
                        b(true);
                        return;
                    } else if (this.c.matches(":not(")) {
                        n();
                        return;
                    } else if (this.c.matchChomp(":nth-child(")) {
                        a(false, false);
                        return;
                    } else if (this.c.matchChomp(":nth-last-child(")) {
                        a(true, false);
                        return;
                    } else if (this.c.matchChomp(":nth-of-type(")) {
                        a(false, true);
                        return;
                    } else if (this.c.matchChomp(":nth-last-of-type(")) {
                        a(true, true);
                        return;
                    } else {
                        List list;
                        Object isFirstChild;
                        if (this.c.matchChomp(":first-child")) {
                            list = this.e;
                            isFirstChild = new IsFirstChild();
                        } else if (this.c.matchChomp(":last-child")) {
                            list = this.e;
                            isFirstChild = new IsLastChild();
                        } else if (this.c.matchChomp(":first-of-type")) {
                            list = this.e;
                            isFirstChild = new IsFirstOfType();
                        } else if (this.c.matchChomp(":last-of-type")) {
                            list = this.e;
                            isFirstChild = new IsLastOfType();
                        } else if (this.c.matchChomp(":only-child")) {
                            list = this.e;
                            isFirstChild = new IsOnlyChild();
                        } else if (this.c.matchChomp(":only-of-type")) {
                            list = this.e;
                            isFirstChild = new IsOnlyOfType();
                        } else if (this.c.matchChomp(":empty")) {
                            list = this.e;
                            isFirstChild = new IsEmpty();
                        } else if (this.c.matchChomp(":root")) {
                            list = this.e;
                            isFirstChild = new IsRoot();
                        } else {
                            throw new SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.d, this.c.remainder());
                        }
                        list.add(isFirstChild);
                        return;
                    }
                }
            }
            e();
        }
    }

    private void b(boolean z) {
        List list;
        Object matchesOwn;
        this.c.consume(z ? ":matchesOwn" : ":matches");
        String chompBalanced = this.c.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, ":matches(regex) query must not be empty");
        if (z) {
            list = this.e;
            matchesOwn = new MatchesOwn(Pattern.compile(chompBalanced));
        } else {
            list = this.e;
            matchesOwn = new Matches(Pattern.compile(chompBalanced));
        }
        list.add(matchesOwn);
    }

    private void c() {
        String consumeCssIdentifier = this.c.consumeCssIdentifier();
        Validate.notEmpty(consumeCssIdentifier);
        this.e.add(new Id(consumeCssIdentifier));
    }

    private void d() {
        String consumeCssIdentifier = this.c.consumeCssIdentifier();
        Validate.notEmpty(consumeCssIdentifier);
        this.e.add(new Class(consumeCssIdentifier.trim()));
    }

    private void e() {
        List list;
        Object dVar;
        String consumeElementSelector = this.c.consumeElementSelector();
        Validate.notEmpty(consumeElementSelector);
        if (consumeElementSelector.startsWith("*|")) {
            list = this.e;
            dVar = new d(new Tag(consumeElementSelector.trim().toLowerCase()), new TagEndsWith(consumeElementSelector.replace("*|", ":").trim().toLowerCase()));
        } else {
            if (consumeElementSelector.contains("|")) {
                consumeElementSelector = consumeElementSelector.replace("|", ":");
            }
            list = this.e;
            dVar = new Tag(consumeElementSelector.trim());
        }
        list.add(dVar);
    }

    private void f() {
        TokenQueue tokenQueue = new TokenQueue(this.c.chompBalanced('[', ']'));
        String consumeToAny = tokenQueue.consumeToAny(b);
        Validate.notEmpty(consumeToAny);
        tokenQueue.consumeWhitespace();
        if (tokenQueue.isEmpty()) {
            if (consumeToAny.startsWith("^")) {
                this.e.add(new AttributeStarting(consumeToAny.substring(1)));
            } else {
                this.e.add(new Attribute(consumeToAny));
            }
        } else if (tokenQueue.matchChomp("=")) {
            this.e.add(new AttributeWithValue(consumeToAny, tokenQueue.remainder()));
        } else if (tokenQueue.matchChomp("!=")) {
            this.e.add(new AttributeWithValueNot(consumeToAny, tokenQueue.remainder()));
        } else if (tokenQueue.matchChomp("^=")) {
            this.e.add(new AttributeWithValueStarting(consumeToAny, tokenQueue.remainder()));
        } else if (tokenQueue.matchChomp("$=")) {
            this.e.add(new AttributeWithValueEnding(consumeToAny, tokenQueue.remainder()));
        } else if (tokenQueue.matchChomp("*=")) {
            this.e.add(new AttributeWithValueContaining(consumeToAny, tokenQueue.remainder()));
        } else if (tokenQueue.matchChomp("~=")) {
            this.e.add(new AttributeWithValueMatching(consumeToAny, Pattern.compile(tokenQueue.remainder())));
        } else {
            throw new SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.d, tokenQueue.remainder());
        }
    }

    private void g() {
        this.e.add(new AllElements());
    }

    private void h() {
        this.e.add(new IndexLessThan(k()));
    }

    private void i() {
        this.e.add(new IndexGreaterThan(k()));
    }

    private void j() {
        this.e.add(new IndexEquals(k()));
    }

    private int k() {
        String trim = this.c.chompTo(")").trim();
        Validate.isTrue(StringUtil.isNumeric(trim), "Index must be numeric");
        return Integer.parseInt(trim);
    }

    private void l() {
        this.c.consume(":has");
        String chompBalanced = this.c.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, ":has(el) subselect must not be empty");
        this.e.add(new f(parse(chompBalanced)));
    }

    private void m() {
        this.c.consume(":containsData");
        String unescape = TokenQueue.unescape(this.c.chompBalanced('(', ')'));
        Validate.notEmpty(unescape, ":containsData(text) query must not be empty");
        this.e.add(new ContainsData(unescape));
    }

    private void n() {
        this.c.consume(":not");
        String chompBalanced = this.c.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, ":not(selector) subselect must not be empty");
        this.e.add(new i(parse(chompBalanced)));
    }

    public static org.jsoup.select.Evaluator parse(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = new org.jsoup.select.QueryParser;
        r0.<init>(r3);
        r3 = r0.c;
        r3.consumeWhitespace();
        r3 = r0.c;
        r1 = a;
        r3 = r3.matchesAny(r1);
        if (r3 == 0) goto L_0x0028;
    L_0x0014:
        r3 = r0.e;
        r1 = new org.jsoup.select.l;
        r1.<init>();
        r3.add(r1);
    L_0x001e:
        r3 = r0.c;
        r3 = r3.consume();
    L_0x0024:
        r0.a(r3);
        goto L_0x002b;
    L_0x0028:
        r0.b();
    L_0x002b:
        r3 = r0.c;
        r3 = r3.isEmpty();
        if (r3 != 0) goto L_0x0049;
    L_0x0033:
        r3 = r0.c;
        r3 = r3.consumeWhitespace();
        r1 = r0.c;
        r2 = a;
        r1 = r1.matchesAny(r2);
        if (r1 == 0) goto L_0x0044;
    L_0x0043:
        goto L_0x001e;
    L_0x0044:
        if (r3 == 0) goto L_0x0028;
    L_0x0046:
        r3 = 32;
        goto L_0x0024;
    L_0x0049:
        r3 = r0.e;
        r3 = r3.size();
        r1 = 1;
        if (r3 != r1) goto L_0x005c;
    L_0x0052:
        r3 = r0.e;
        r0 = 0;
        r3 = r3.get(r0);
        r3 = (org.jsoup.select.Evaluator) r3;
        return r3;
    L_0x005c:
        r3 = new org.jsoup.select.c;
        r0 = r0.e;
        r3.<init>(r0);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.parse(java.lang.String):org.jsoup.select.Evaluator");
    }
}
