package io.github.inflationx.viewpump;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

class ViewPumpLayoutInflater extends LayoutInflater implements ViewPumpActivityFactory {
    private static final String[] sClassPrefixList = new String[]{"android.widget.", "android.webkit."};
    private Field mConstructorArgs = null;
    private boolean mSetPrivateFactory = false;
    private FallbackViewCreator nameAndAttrsViewCreator = new NameAndAttrsViewCreator(this);
    private FallbackViewCreator parentAndNameAndAttrsViewCreator = new ParentAndNameAndAttrsViewCreator(this);

    class ActivityViewCreator implements FallbackViewCreator {
        private final ViewPumpLayoutInflater inflater;
        private final View view;

        public ActivityViewCreator(ViewPumpLayoutInflater viewPumpLayoutInflater, View view) {
            this.inflater = viewPumpLayoutInflater;
            this.view = view;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.inflater.createCustomViewInternal(view, this.view, str, context, attributeSet);
        }
    }

    class NameAndAttrsViewCreator implements FallbackViewCreator {
        private final ViewPumpLayoutInflater inflater;

        public NameAndAttrsViewCreator(ViewPumpLayoutInflater viewPumpLayoutInflater) {
            this.inflater = viewPumpLayoutInflater;
        }

        public android.view.View onCreateView(android.view.View r5, java.lang.String r6, android.content.Context r7, android.util.AttributeSet r8) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
            /*
            r4 = this;
            r5 = io.github.inflationx.viewpump.ViewPumpLayoutInflater.sClassPrefixList;
            r7 = r5.length;
            r0 = 0;
            r1 = 0;
        L_0x0007:
            if (r1 >= r7) goto L_0x0019;
        L_0x0009:
            r2 = r5[r1];
            r3 = r4.inflater;	 Catch:{ ClassNotFoundException -> 0x0016 }
            r2 = r3.createView(r6, r2, r8);	 Catch:{ ClassNotFoundException -> 0x0016 }
            if (r2 == 0) goto L_0x0015;
        L_0x0013:
            r0 = r2;
            goto L_0x0019;
        L_0x0015:
            r0 = r2;
        L_0x0016:
            r1 = r1 + 1;
            goto L_0x0007;
        L_0x0019:
            if (r0 != 0) goto L_0x0021;
        L_0x001b:
            r5 = r4.inflater;
            r0 = r5.superOnCreateView(r6, r8);
        L_0x0021:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.github.inflationx.viewpump.ViewPumpLayoutInflater.NameAndAttrsViewCreator.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
        }
    }

    class ParentAndNameAndAttrsViewCreator implements FallbackViewCreator {
        private final ViewPumpLayoutInflater inflater;

        public ParentAndNameAndAttrsViewCreator(ViewPumpLayoutInflater viewPumpLayoutInflater) {
            this.inflater = viewPumpLayoutInflater;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.inflater.superOnCreateView(view, str, attributeSet);
        }
    }

    class WrapperFactory2 implements Factory2 {
        protected final Factory2 mFactory2;
        private final WrapperFactory2ViewCreator mViewCreator;

        public WrapperFactory2(Factory2 factory2) {
            this.mFactory2 = factory2;
            this.mViewCreator = new WrapperFactory2ViewCreator(factory2);
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return ViewPump.get().inflate(InflateRequest.builder().name(str).context(context).attrs(attributeSet).parent(view).fallbackViewCreator(this.mViewCreator).build()).view();
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return onCreateView(null, str, context, attributeSet);
        }
    }

    class PrivateWrapperFactory2 extends WrapperFactory2 {
        private final PrivateWrapperFactory2ViewCreator mViewCreator;

        public PrivateWrapperFactory2(Factory2 factory2, ViewPumpLayoutInflater viewPumpLayoutInflater) {
            super(factory2);
            this.mViewCreator = new PrivateWrapperFactory2ViewCreator(factory2, viewPumpLayoutInflater);
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return ViewPump.get().inflate(InflateRequest.builder().name(str).context(context).attrs(attributeSet).parent(view).fallbackViewCreator(this.mViewCreator).build()).view();
        }
    }

    class WrapperFactory2ViewCreator implements FallbackViewCreator {
        protected final Factory2 mFactory2;

        public WrapperFactory2ViewCreator(Factory2 factory2) {
            this.mFactory2 = factory2;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.mFactory2.onCreateView(view, str, context, attributeSet);
        }
    }

    class PrivateWrapperFactory2ViewCreator extends WrapperFactory2ViewCreator implements FallbackViewCreator {
        private final ViewPumpLayoutInflater mInflater;

        public PrivateWrapperFactory2ViewCreator(Factory2 factory2, ViewPumpLayoutInflater viewPumpLayoutInflater) {
            super(factory2);
            this.mInflater = viewPumpLayoutInflater;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.mInflater.createCustomViewInternal(view, this.mFactory2.onCreateView(view, str, context, attributeSet), str, context, attributeSet);
        }
    }

    class WrapperFactory implements Factory {
        private final FallbackViewCreator mViewCreator;

        public WrapperFactory(Factory factory) {
            this.mViewCreator = new WrapperFactoryViewCreator(factory);
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return ViewPump.get().inflate(InflateRequest.builder().name(str).context(context).attrs(attributeSet).fallbackViewCreator(this.mViewCreator).build()).view();
        }
    }

    class WrapperFactoryViewCreator implements FallbackViewCreator {
        protected final Factory mFactory;

        public WrapperFactoryViewCreator(Factory factory) {
            this.mFactory = factory;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.mFactory.onCreateView(str, context, attributeSet);
        }
    }

    protected ViewPumpLayoutInflater(Context context) {
        super(context);
        setUpLayoutFactories(false);
    }

    protected ViewPumpLayoutInflater(LayoutInflater layoutInflater, Context context, boolean z) {
        super(layoutInflater, context);
        setUpLayoutFactories(z);
    }

    private android.view.View createCustomViewInternal(android.view.View r3, android.view.View r4, java.lang.String r5, android.content.Context r6, android.util.AttributeSet r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r2 = this;
        r3 = io.github.inflationx.viewpump.ViewPump.get();
        r3 = r3.isCustomViewCreation();
        if (r3 != 0) goto L_0x000b;
    L_0x000a:
        return r4;
    L_0x000b:
        if (r4 != 0) goto L_0x0053;
    L_0x000d:
        r3 = 46;
        r3 = r5.indexOf(r3);
        if (r3 < 0) goto L_0x0053;
    L_0x0015:
        r3 = r2.mConstructorArgs;
        if (r3 != 0) goto L_0x0023;
    L_0x0019:
        r3 = android.view.LayoutInflater.class;
        r0 = "mConstructorArgs";
        r3 = io.github.inflationx.viewpump.ReflectionUtils.getField(r3, r0);
        r2.mConstructorArgs = r3;
    L_0x0023:
        r3 = r2.mConstructorArgs;
        r3 = io.github.inflationx.viewpump.ReflectionUtils.getValue(r3, r2);
        r3 = (java.lang.Object[]) r3;
        r0 = 0;
        r1 = r3[r0];
        r3[r0] = r6;
        r6 = r2.mConstructorArgs;
        io.github.inflationx.viewpump.ReflectionUtils.setValue(r6, r2, r3);
        r6 = 0;
        r5 = r2.createView(r5, r6, r7);	 Catch:{ ClassNotFoundException -> 0x004c, all -> 0x0043 }
        r3[r0] = r1;
        r4 = r2.mConstructorArgs;
        io.github.inflationx.viewpump.ReflectionUtils.setValue(r4, r2, r3);
        r4 = r5;
        goto L_0x0053;
    L_0x0043:
        r4 = move-exception;
        r3[r0] = r1;
        r5 = r2.mConstructorArgs;
        io.github.inflationx.viewpump.ReflectionUtils.setValue(r5, r2, r3);
        throw r4;
    L_0x004c:
        r3[r0] = r1;
        r5 = r2.mConstructorArgs;
        io.github.inflationx.viewpump.ReflectionUtils.setValue(r5, r2, r3);
    L_0x0053:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.inflationx.viewpump.ViewPumpLayoutInflater.createCustomViewInternal(android.view.View, android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    private void setPrivateFactoryInternal() {
        if (this.mSetPrivateFactory || !ViewPump.get().isReflection()) {
            return;
        }
        if (getContext() instanceof Factory2) {
            Method method = ReflectionUtils.getMethod(LayoutInflater.class, "setPrivateFactory");
            if (method != null) {
                ReflectionUtils.invokeMethod(this, method, new PrivateWrapperFactory2((Factory2) getContext(), this));
            }
            this.mSetPrivateFactory = true;
            return;
        }
        this.mSetPrivateFactory = true;
    }

    private void setUpLayoutFactories(boolean z) {
        if (!z) {
            if (!(getFactory2() == null || (getFactory2() instanceof WrapperFactory2))) {
                setFactory2(getFactory2());
            }
            if (!(getFactory() == null || (getFactory() instanceof WrapperFactory))) {
                setFactory(getFactory());
            }
        }
    }

    private android.view.View superOnCreateView(android.view.View r1, java.lang.String r2, android.util.AttributeSet r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = this;
        r1 = super.onCreateView(r1, r2, r3);	 Catch:{ ClassNotFoundException -> 0x0005 }
        return r1;
    L_0x0005:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.inflationx.viewpump.ViewPumpLayoutInflater.superOnCreateView(android.view.View, java.lang.String, android.util.AttributeSet):android.view.View");
    }

    private android.view.View superOnCreateView(java.lang.String r1, android.util.AttributeSet r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = this;
        r1 = super.onCreateView(r1, r2);	 Catch:{ ClassNotFoundException -> 0x0005 }
        return r1;
    L_0x0005:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.inflationx.viewpump.ViewPumpLayoutInflater.superOnCreateView(java.lang.String, android.util.AttributeSet):android.view.View");
    }

    public LayoutInflater cloneInContext(Context context) {
        return new ViewPumpLayoutInflater(this, context, true);
    }

    public View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        setPrivateFactoryInternal();
        return super.inflate(xmlPullParser, viewGroup, z);
    }

    public View onActivityCreateView(View view, View view2, String str, Context context, AttributeSet attributeSet) {
        return ViewPump.get().inflate(InflateRequest.builder().name(str).context(context).attrs(attributeSet).parent(view).fallbackViewCreator(new ActivityViewCreator(this, view2)).build()).view();
    }

    protected View onCreateView(View view, String str, AttributeSet attributeSet) {
        return ViewPump.get().inflate(InflateRequest.builder().name(str).context(getContext()).attrs(attributeSet).parent(view).fallbackViewCreator(this.parentAndNameAndAttrsViewCreator).build()).view();
    }

    protected View onCreateView(String str, AttributeSet attributeSet) {
        return ViewPump.get().inflate(InflateRequest.builder().name(str).context(getContext()).attrs(attributeSet).fallbackViewCreator(this.nameAndAttrsViewCreator).build()).view();
    }

    public void setFactory(Factory factory) {
        if (factory instanceof WrapperFactory) {
            super.setFactory(factory);
        } else {
            super.setFactory(new WrapperFactory(factory));
        }
    }

    public void setFactory2(Factory2 factory2) {
        if (factory2 instanceof WrapperFactory2) {
            super.setFactory2(factory2);
        } else {
            super.setFactory2(new WrapperFactory2(factory2));
        }
    }
}
