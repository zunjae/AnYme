package io.github.inflationx.viewpump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ViewPump {
    private static ViewPump INSTANCE;
    private final List<Interceptor> interceptors;
    private final boolean mCustomViewCreation;
    private final List<Interceptor> mInterceptorsWithFallback;
    private final boolean mReflection;

    public final class Builder {
        private boolean customViewCreation;
        private final List<Interceptor> interceptors;
        private boolean reflection;

        private Builder() {
            this.interceptors = new ArrayList();
            this.reflection = true;
            this.customViewCreation = true;
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        public final ViewPump build() {
            return new ViewPump();
        }

        public final Builder setCustomViewInflationEnabled(boolean z) {
            this.customViewCreation = z;
            return this;
        }

        public final Builder setPrivateFactoryInjectionEnabled(boolean z) {
            this.reflection = z;
            return this;
        }
    }

    private ViewPump(Builder builder) {
        this.interceptors = immutableList(builder.interceptors);
        List access$000 = builder.interceptors;
        access$000.add(new FallbackViewCreationInterceptor());
        this.mInterceptorsWithFallback = immutableList(access$000);
        this.mReflection = builder.reflection;
        this.mCustomViewCreation = builder.customViewCreation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ViewPump get() {
        if (INSTANCE == null) {
            INSTANCE = builder().build();
        }
        return INSTANCE;
    }

    private static <T> List<T> immutableList(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static void init(ViewPump viewPump) {
        INSTANCE = viewPump;
    }

    public final InflateResult inflate(InflateRequest inflateRequest) {
        return new InterceptorChain(this.mInterceptorsWithFallback, 0, inflateRequest).proceed(inflateRequest);
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public final boolean isCustomViewCreation() {
        return this.mCustomViewCreation;
    }

    public final boolean isReflection() {
        return this.mReflection;
    }
}
