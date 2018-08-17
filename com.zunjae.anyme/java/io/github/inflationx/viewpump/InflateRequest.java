package io.github.inflationx.viewpump;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class InflateRequest {
    private final AttributeSet attrs;
    private final Context context;
    private final FallbackViewCreator fallbackViewCreator;
    private final String name;
    private final View parent;

    public final class Builder {
        private AttributeSet attrs;
        private Context context;
        private FallbackViewCreator fallbackViewCreator;
        private String name;
        private View parent;

        private Builder() {
        }

        private Builder(InflateRequest inflateRequest) {
            this.name = inflateRequest.name;
            this.context = inflateRequest.context;
            this.attrs = inflateRequest.attrs;
            this.parent = inflateRequest.parent;
            this.fallbackViewCreator = inflateRequest.fallbackViewCreator;
        }

        public final Builder attrs(AttributeSet attributeSet) {
            this.attrs = attributeSet;
            return this;
        }

        public final InflateRequest build() {
            if (this.name == null) {
                throw new IllegalStateException("name == null");
            } else if (this.context == null) {
                throw new IllegalStateException("context == null");
            } else if (this.fallbackViewCreator != null) {
                return new InflateRequest();
            } else {
                throw new IllegalStateException("fallbackViewCreator == null");
            }
        }

        public final Builder context(Context context) {
            this.context = context;
            return this;
        }

        public final Builder fallbackViewCreator(FallbackViewCreator fallbackViewCreator) {
            this.fallbackViewCreator = fallbackViewCreator;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder parent(View view) {
            this.parent = view;
            return this;
        }
    }

    private InflateRequest(Builder builder) {
        this.name = builder.name;
        this.context = builder.context;
        this.attrs = builder.attrs;
        this.parent = builder.parent;
        this.fallbackViewCreator = builder.fallbackViewCreator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public AttributeSet attrs() {
        return this.attrs;
    }

    public Context context() {
        return this.context;
    }

    public FallbackViewCreator fallbackViewCreator() {
        return this.fallbackViewCreator;
    }

    public String name() {
        return this.name;
    }

    public View parent() {
        return this.parent;
    }

    public Builder toBuilder() {
        return new Builder();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("InflateRequest{name='");
        stringBuilder.append(this.name);
        stringBuilder.append('\'');
        stringBuilder.append(", context=");
        stringBuilder.append(this.context);
        stringBuilder.append(", attrs=");
        stringBuilder.append(this.attrs);
        stringBuilder.append(", parent=");
        stringBuilder.append(this.parent);
        stringBuilder.append(", fallbackViewCreator=");
        stringBuilder.append(this.fallbackViewCreator);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
