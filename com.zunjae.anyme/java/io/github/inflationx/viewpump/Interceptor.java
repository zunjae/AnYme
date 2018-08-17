package io.github.inflationx.viewpump;

public interface Interceptor {

    public interface Chain {
        InflateResult proceed(InflateRequest inflateRequest);

        InflateRequest request();
    }

    InflateResult intercept(Chain chain);
}
