package defpackage;

import java.lang.reflect.Array;

public final class bix {
    private static final String[][] a;
    private static final String[][] b;
    private static final String[][] c;
    private static final String[][] d;
    private static final String[][] e;
    private static final String[][] f;
    private static final String[][] g;
    private static final String[][] h;
    private static final String[][] i;
    private static final String[][] j;

    static {
        String[][] strArr = new String[][]{new String[]{"\u00a0", "&nbsp;"}, new String[]{"\u00a1", "&iexcl;"}, new String[]{"\u00a2", "&cent;"}, new String[]{"\u00a3", "&pound;"}, new String[]{"\u00a4", "&curren;"}, new String[]{"\u00a5", "&yen;"}, new String[]{"\u00a6", "&brvbar;"}, new String[]{"\u00a7", "&sect;"}, new String[]{"\u00a8", "&uml;"}, new String[]{"\u00a9", "&copy;"}, new String[]{"\u00aa", "&ordf;"}, new String[]{"\u00ab", "&laquo;"}, new String[]{"\u00ac", "&not;"}, new String[]{"\u00ad", "&shy;"}, new String[]{"\u00ae", "&reg;"}, new String[]{"\u00af", "&macr;"}, new String[]{"\u00b0", "&deg;"}, new String[]{"\u00b1", "&plusmn;"}, new String[]{"\u00b2", "&sup2;"}, new String[]{"\u00b3", "&sup3;"}, new String[]{"\u00b4", "&acute;"}, new String[]{"\u00b5", "&micro;"}, new String[]{"\u00b6", "&para;"}, new String[]{"\u00b7", "&middot;"}, new String[]{"\u00b8", "&cedil;"}, new String[]{"\u00b9", "&sup1;"}, new String[]{"\u00ba", "&ordm;"}, new String[]{"\u00bb", "&raquo;"}, new String[]{"\u00bc", "&frac14;"}, new String[]{"\u00bd", "&frac12;"}, new String[]{"\u00be", "&frac34;"}, new String[]{"\u00bf", "&iquest;"}, new String[]{"\u00c0", "&Agrave;"}, new String[]{"\u00c1", "&Aacute;"}, new String[]{"\u00c2", "&Acirc;"}, new String[]{"\u00c3", "&Atilde;"}, new String[]{"\u00c4", "&Auml;"}, new String[]{"\u00c5", "&Aring;"}, new String[]{"\u00c6", "&AElig;"}, new String[]{"\u00c7", "&Ccedil;"}, new String[]{"\u00c8", "&Egrave;"}, new String[]{"\u00c9", "&Eacute;"}, new String[]{"\u00ca", "&Ecirc;"}, new String[]{"\u00cb", "&Euml;"}, new String[]{"\u00cc", "&Igrave;"}, new String[]{"\u00cd", "&Iacute;"}, new String[]{"\u00ce", "&Icirc;"}, new String[]{"\u00cf", "&Iuml;"}, new String[]{"\u00d0", "&ETH;"}, new String[]{"\u00d1", "&Ntilde;"}, new String[]{"\u00d2", "&Ograve;"}, new String[]{"\u00d3", "&Oacute;"}, new String[]{"\u00d4", "&Ocirc;"}, new String[]{"\u00d5", "&Otilde;"}, new String[]{"\u00d6", "&Ouml;"}, new String[]{"\u00d7", "&times;"}, new String[]{"\u00d8", "&Oslash;"}, new String[]{"\u00d9", "&Ugrave;"}, new String[]{"\u00da", "&Uacute;"}, new String[]{"\u00db", "&Ucirc;"}, new String[]{"\u00dc", "&Uuml;"}, new String[]{"\u00dd", "&Yacute;"}, new String[]{"\u00de", "&THORN;"}, new String[]{"\u00df", "&szlig;"}, new String[]{"\u00e0", "&agrave;"}, new String[]{"\u00e1", "&aacute;"}, new String[]{"\u00e2", "&acirc;"}, new String[]{"\u00e3", "&atilde;"}, new String[]{"\u00e4", "&auml;"}, new String[]{"\u00e5", "&aring;"}, new String[]{"\u00e6", "&aelig;"}, new String[]{"\u00e7", "&ccedil;"}, new String[]{"\u00e8", "&egrave;"}, new String[]{"\u00e9", "&eacute;"}, new String[]{"\u00ea", "&ecirc;"}, new String[]{"\u00eb", "&euml;"}, new String[]{"\u00ec", "&igrave;"}, new String[]{"\u00ed", "&iacute;"}, new String[]{"\u00ee", "&icirc;"}, new String[]{"\u00ef", "&iuml;"}, new String[]{"\u00f0", "&eth;"}, new String[]{"\u00f1", "&ntilde;"}, new String[]{"\u00f2", "&ograve;"}, new String[]{"\u00f3", "&oacute;"}, new String[]{"\u00f4", "&ocirc;"}, new String[]{"\u00f5", "&otilde;"}, new String[]{"\u00f6", "&ouml;"}, new String[]{"\u00f7", "&divide;"}, new String[]{"\u00f8", "&oslash;"}, new String[]{"\u00f9", "&ugrave;"}, new String[]{"\u00fa", "&uacute;"}, new String[]{"\u00fb", "&ucirc;"}, new String[]{"\u00fc", "&uuml;"}, new String[]{"\u00fd", "&yacute;"}, new String[]{"\u00fe", "&thorn;"}, new String[]{"\u00ff", "&yuml;"}};
        a = strArr;
        b = bix.a(strArr);
        String[][] strArr2 = new String[][]{new String[]{"\u0192", "&fnof;"}, new String[]{"\u0391", "&Alpha;"}, new String[]{"\u0392", "&Beta;"}, new String[]{"\u0393", "&Gamma;"}, new String[]{"\u0394", "&Delta;"}, new String[]{"\u0395", "&Epsilon;"}, new String[]{"\u0396", "&Zeta;"}, new String[]{"\u0397", "&Eta;"}, new String[]{"\u0398", "&Theta;"}, new String[]{"\u0399", "&Iota;"}, new String[]{"\u039a", "&Kappa;"}, new String[]{"\u039b", "&Lambda;"}, new String[]{"\u039c", "&Mu;"}, new String[]{"\u039d", "&Nu;"}, new String[]{"\u039e", "&Xi;"}, new String[]{"\u039f", "&Omicron;"}, new String[]{"\u03a0", "&Pi;"}, new String[]{"\u03a1", "&Rho;"}, new String[]{"\u03a3", "&Sigma;"}, new String[]{"\u03a4", "&Tau;"}, new String[]{"\u03a5", "&Upsilon;"}, new String[]{"\u03a6", "&Phi;"}, new String[]{"\u03a7", "&Chi;"}, new String[]{"\u03a8", "&Psi;"}, new String[]{"\u03a9", "&Omega;"}, new String[]{"\u03b1", "&alpha;"}, new String[]{"\u03b2", "&beta;"}, new String[]{"\u03b3", "&gamma;"}, new String[]{"\u03b4", "&delta;"}, new String[]{"\u03b5", "&epsilon;"}, new String[]{"\u03b6", "&zeta;"}, new String[]{"\u03b7", "&eta;"}, new String[]{"\u03b8", "&theta;"}, new String[]{"\u03b9", "&iota;"}, new String[]{"\u03ba", "&kappa;"}, new String[]{"\u03bb", "&lambda;"}, new String[]{"\u03bc", "&mu;"}, new String[]{"\u03bd", "&nu;"}, new String[]{"\u03be", "&xi;"}, new String[]{"\u03bf", "&omicron;"}, new String[]{"\u03c0", "&pi;"}, new String[]{"\u03c1", "&rho;"}, new String[]{"\u03c2", "&sigmaf;"}, new String[]{"\u03c3", "&sigma;"}, new String[]{"\u03c4", "&tau;"}, new String[]{"\u03c5", "&upsilon;"}, new String[]{"\u03c6", "&phi;"}, new String[]{"\u03c7", "&chi;"}, new String[]{"\u03c8", "&psi;"}, new String[]{"\u03c9", "&omega;"}, new String[]{"\u03d1", "&thetasym;"}, new String[]{"\u03d2", "&upsih;"}, new String[]{"\u03d6", "&piv;"}, new String[]{"\u2022", "&bull;"}, new String[]{"\u2026", "&hellip;"}, new String[]{"\u2032", "&prime;"}, new String[]{"\u2033", "&Prime;"}, new String[]{"\u203e", "&oline;"}, new String[]{"\u2044", "&frasl;"}, new String[]{"\u2118", "&weierp;"}, new String[]{"\u2111", "&image;"}, new String[]{"\u211c", "&real;"}, new String[]{"\u2122", "&trade;"}, new String[]{"\u2135", "&alefsym;"}, new String[]{"\u2190", "&larr;"}, new String[]{"\u2191", "&uarr;"}, new String[]{"\u2192", "&rarr;"}, new String[]{"\u2193", "&darr;"}, new String[]{"\u2194", "&harr;"}, new String[]{"\u21b5", "&crarr;"}, new String[]{"\u21d0", "&lArr;"}, new String[]{"\u21d1", "&uArr;"}, new String[]{"\u21d2", "&rArr;"}, new String[]{"\u21d3", "&dArr;"}, new String[]{"\u21d4", "&hArr;"}, new String[]{"\u2200", "&forall;"}, new String[]{"\u2202", "&part;"}, new String[]{"\u2203", "&exist;"}, new String[]{"\u2205", "&empty;"}, new String[]{"\u2207", "&nabla;"}, new String[]{"\u2208", "&isin;"}, new String[]{"\u2209", "&notin;"}, new String[]{"\u220b", "&ni;"}, new String[]{"\u220f", "&prod;"}, new String[]{"\u2211", "&sum;"}, new String[]{"\u2212", "&minus;"}, new String[]{"\u2217", "&lowast;"}, new String[]{"\u221a", "&radic;"}, new String[]{"\u221d", "&prop;"}, new String[]{"\u221e", "&infin;"}, new String[]{"\u2220", "&ang;"}, new String[]{"\u2227", "&and;"}, new String[]{"\u2228", "&or;"}, new String[]{"\u2229", "&cap;"}, new String[]{"\u222a", "&cup;"}, new String[]{"\u222b", "&int;"}, new String[]{"\u2234", "&there4;"}, new String[]{"\u223c", "&sim;"}, new String[]{"\u2245", "&cong;"}, new String[]{"\u2248", "&asymp;"}, new String[]{"\u2260", "&ne;"}, new String[]{"\u2261", "&equiv;"}, new String[]{"\u2264", "&le;"}, new String[]{"\u2265", "&ge;"}, new String[]{"\u2282", "&sub;"}, new String[]{"\u2283", "&sup;"}, new String[]{"\u2284", "&nsub;"}, new String[]{"\u2286", "&sube;"}, new String[]{"\u2287", "&supe;"}, new String[]{"\u2295", "&oplus;"}, new String[]{"\u2297", "&otimes;"}, new String[]{"\u22a5", "&perp;"}, new String[]{"\u22c5", "&sdot;"}, new String[]{"\u2308", "&lceil;"}, new String[]{"\u2309", "&rceil;"}, new String[]{"\u230a", "&lfloor;"}, new String[]{"\u230b", "&rfloor;"}, new String[]{"\u2329", "&lang;"}, new String[]{"\u232a", "&rang;"}, new String[]{"\u25ca", "&loz;"}, new String[]{"\u2660", "&spades;"}, new String[]{"\u2663", "&clubs;"}, new String[]{"\u2665", "&hearts;"}, new String[]{"\u2666", "&diams;"}, new String[]{"\u0152", "&OElig;"}, new String[]{"\u0153", "&oelig;"}, new String[]{"\u0160", "&Scaron;"}, new String[]{"\u0161", "&scaron;"}, new String[]{"\u0178", "&Yuml;"}, new String[]{"\u02c6", "&circ;"}, new String[]{"\u02dc", "&tilde;"}, new String[]{"\u2002", "&ensp;"}, new String[]{"\u2003", "&emsp;"}, new String[]{"\u2009", "&thinsp;"}, new String[]{"\u200c", "&zwnj;"}, new String[]{"\u200d", "&zwj;"}, new String[]{"\u200e", "&lrm;"}, new String[]{"\u200f", "&rlm;"}, new String[]{"\u2013", "&ndash;"}, new String[]{"\u2014", "&mdash;"}, new String[]{"\u2018", "&lsquo;"}, new String[]{"\u2019", "&rsquo;"}, new String[]{"\u201a", "&sbquo;"}, new String[]{"\u201c", "&ldquo;"}, new String[]{"\u201d", "&rdquo;"}, new String[]{"\u201e", "&bdquo;"}, new String[]{"\u2020", "&dagger;"}, new String[]{"\u2021", "&Dagger;"}, new String[]{"\u2030", "&permil;"}, new String[]{"\u2039", "&lsaquo;"}, new String[]{"\u203a", "&rsaquo;"}, new String[]{"\u20ac", "&euro;"}};
        c = strArr2;
        d = bix.a(strArr2);
        strArr2 = new String[][]{new String[]{"\"", "&quot;"}, new String[]{"&", "&amp;"}, new String[]{"<", "&lt;"}, new String[]{">", "&gt;"}};
        e = strArr2;
        f = bix.a(strArr2);
        strArr2 = new String[][]{new String[]{"'", "&apos;"}};
        g = strArr2;
        h = bix.a(strArr2);
        strArr2 = new String[][]{new String[]{"\b", "\\b"}, new String[]{"\n", "\\n"}, new String[]{"\t", "\\t"}, new String[]{"\f", "\\f"}, new String[]{"\r", "\\r"}};
        i = strArr2;
        j = bix.a(strArr2);
    }

    public static String[][] a() {
        return (String[][]) a.clone();
    }

    private static String[][] a(String[][] strArr) {
        String[][] strArr2 = (String[][]) Array.newInstance(String.class, new int[]{strArr.length, 2});
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i][0] = strArr[i][1];
            strArr2[i][1] = strArr[i][0];
        }
        return strArr2;
    }

    public static String[][] b() {
        return (String[][]) b.clone();
    }

    public static String[][] c() {
        return (String[][]) c.clone();
    }

    public static String[][] d() {
        return (String[][]) d.clone();
    }

    public static String[][] e() {
        return (String[][]) e.clone();
    }

    public static String[][] f() {
        return (String[][]) f.clone();
    }

    public static String[][] g() {
        return (String[][]) g.clone();
    }

    public static String[][] h() {
        return (String[][]) h.clone();
    }

    public static String[][] i() {
        return (String[][]) i.clone();
    }

    public static String[][] j() {
        return (String[][]) j.clone();
    }
}
