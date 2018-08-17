package io.github.inflationx.viewpump;

import android.view.View;
import io.github.inflationx.viewpump.Interceptor.Chain;

class FallbackViewCreationInterceptor implements Interceptor {
    FallbackViewCreationInterceptor() {
    }

    public InflateResult intercept(Chain chain) {
        InflateRequest request = chain.request();
        View onCreateView = request.fallbackViewCreator().onCreateView(request.parent(), request.name(), request.context(), request.attrs());
        return InflateResult.builder().view(onCreateView).name(onCreateView != null ? onCreateView.getClass().getName() : request.name()).context(request.context()).attrs(request.attrs()).build();
    }
}
