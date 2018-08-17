package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ActionProvider;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class cl extends MenuInflater {
    static final Class<?>[] a;
    static final Class<?>[] b;
    final Object[] c;
    final Object[] d = this.c;
    Context e;
    private Object f;

    static {
        Class[] clsArr = new Class[]{Context.class};
        a = clsArr;
        b = clsArr;
    }

    public cl(Context context) {
        super(context);
        this.e = context;
        this.c = new Object[]{context};
    }

    private void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        cn cnVar = new cn(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            eventType = xmlPullParser.next();
            if (eventType == 1) {
                break;
            }
        }
        String name = xmlPullParser.getName();
        if (name.equals("menu")) {
            eventType = xmlPullParser.next();
            int i = eventType;
            Object obj = null;
            Object obj2 = null;
            Object obj3 = null;
            while (obj2 == null) {
                String name2;
                switch (i) {
                    case tw.a /*1*/:
                        throw new RuntimeException("Unexpected end of document");
                    case tw.b /*2*/:
                        if (obj3 != null) {
                            break;
                        }
                        name2 = xmlPullParser.getName();
                        if (!name2.equals("group")) {
                            if (!name2.equals("item")) {
                                if (!name2.equals("menu")) {
                                    obj = name2;
                                    obj3 = 1;
                                    break;
                                }
                                a(xmlPullParser, attributeSet, cnVar.c());
                                break;
                            }
                            cnVar.b(attributeSet);
                            break;
                        }
                        cnVar.a(attributeSet);
                        break;
                    case f.c /*3*/:
                        name2 = xmlPullParser.getName();
                        if (obj3 == null || !name2.equals(r6)) {
                            if (!name2.equals("group")) {
                                if (!name2.equals("item")) {
                                    if (!name2.equals("menu")) {
                                        break;
                                    }
                                    obj2 = 1;
                                    break;
                                } else if (!cnVar.d()) {
                                    ActionProvider actionProvider = cnVar.a;
                                    if (actionProvider != null && actionProvider.hasSubMenu()) {
                                        cnVar.c();
                                        break;
                                    } else {
                                        cnVar.b();
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            cnVar.a();
                            break;
                        }
                        obj = null;
                        obj3 = null;
                        break;
                    default:
                        break;
                }
                i = xmlPullParser.next();
            }
            return;
        }
        throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(name)));
    }

    final Object a() {
        if (this.f == null) {
            Object obj = this.e;
            while (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            this.f = obj;
        }
        return this.f;
    }

    public final void inflate(int i, Menu menu) {
        Throwable e;
        if (menu instanceof SupportMenu) {
            XmlResourceParser xmlResourceParser = null;
            try {
                XmlResourceParser layout = this.e.getResources().getLayout(i);
                try {
                    a(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                    return;
                } catch (XmlPullParserException e2) {
                    e = e2;
                    xmlResourceParser = layout;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (IOException e3) {
                    e = e3;
                    xmlResourceParser = layout;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (Throwable th) {
                    e = th;
                    xmlResourceParser = layout;
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                    }
                    throw e;
                }
            } catch (XmlPullParserException e4) {
                e = e4;
                throw new InflateException("Error inflating menu XML", e);
            } catch (IOException e5) {
                e = e5;
                throw new InflateException("Error inflating menu XML", e);
            } catch (Throwable th2) {
                e = th2;
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw e;
            }
        }
        super.inflate(i, menu);
    }
}
