package io.github.inflationx.viewpump;

import io.github.inflationx.viewpump.Interceptor.Chain;
import java.util.List;

class InterceptorChain implements Chain {
    private final int index;
    private final List<Interceptor> interceptors;
    private final InflateRequest request;

    InterceptorChain(List<Interceptor> list, int i, InflateRequest inflateRequest) {
        this.interceptors = list;
        this.index = i;
        this.request = inflateRequest;
    }

    public InflateResult proceed(InflateRequest inflateRequest) {
        if (this.index < this.interceptors.size()) {
            Chain interceptorChain = new InterceptorChain(this.interceptors, this.index + 1, inflateRequest);
            Interceptor interceptor = (Interceptor) this.interceptors.get(this.index);
            InflateResult intercept = interceptor.intercept(interceptorChain);
            if (intercept != null) {
                return intercept;
            }
            StringBuilder stringBuilder = new StringBuilder("interceptor ");
            stringBuilder.append(interceptor);
            stringBuilder.append(" returned null");
            throw new NullPointerException(stringBuilder.toString());
        }
        throw new AssertionError("no interceptors added to the chain");
    }

    public InflateRequest request() {
        return this.request;
    }
}
