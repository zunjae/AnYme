package io.github.inflationx.calligraphy3;

import io.github.inflationx.viewpump.InflateResult;
import io.github.inflationx.viewpump.Interceptor;
import io.github.inflationx.viewpump.Interceptor.Chain;

public class CalligraphyInterceptor implements Interceptor {
    private final Calligraphy calligraphy;

    public CalligraphyInterceptor(CalligraphyConfig calligraphyConfig) {
        this.calligraphy = new Calligraphy(calligraphyConfig);
    }

    public InflateResult intercept(Chain chain) {
        InflateResult proceed = chain.proceed(chain.request());
        return proceed.toBuilder().view(this.calligraphy.onViewCreated(proceed.view(), proceed.context(), proceed.attrs())).build();
    }
}
