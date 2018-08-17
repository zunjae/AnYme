package defpackage;

import com.zunjae.zasync.b;
import java.util.ArrayList;
import java.util.Iterator;

public class asc implements b {
    @xe(a = "mal_id")
    public Integer a;
    @xe(a = "link_canonical")
    public String b;
    @xe(a = "title")
    public String c;
    @xe(a = "title_english")
    public String d;
    @xe(a = "title_synonyms")
    public String e;
    @xe(a = "image_url")
    public String f;
    @xe(a = "type")
    public String g;
    @xe(a = "source")
    public String h;
    @xe(a = "episodes")
    public Integer i;
    @xe(a = "status")
    public String j;
    @xe(a = "aired_string")
    public String k;
    @xe(a = "duration")
    public String l;
    @xe(a = "rating")
    public String m;
    @xe(a = "score")
    public Double n;
    @xe(a = "rank")
    public Integer o;
    @xe(a = "synopsis")
    public String p;
    @xe(a = "broadcast")
    public String q;
    @xe(a = "studio")
    public ArrayList<asf> r = null;
    @xe(a = "genre")
    public ArrayList<asb> s = null;
    @xe(a = "opening_theme")
    public ArrayList<String> t = null;
    @xe(a = "ending_theme")
    public ArrayList<String> u = null;
    public long v;
    @xe(a = "related")
    public asi w;

    private ArrayList<asd> a(ArrayList<String> arrayList, int i) {
        if (arrayList == null) {
            return null;
        }
        ArrayList<asd> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new asd(this, (String) it.next(), i));
        }
        return arrayList2;
    }

    public final boolean a() {
        String str = this.b;
        return str != null && str.contains("myanimelist");
    }

    public final long b() {
        return this.v;
    }

    public final ArrayList<asd> c() {
        return a(this.t, ase.a);
    }

    public final ArrayList<asd> d() {
        return a(this.u, ase.b);
    }
}
