package io.github.inflationx.viewpump;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class InflateResult {
    private final AttributeSet attrs;
    private final Context context;
    private final String name;
    private final View view;

    public final class Builder {
        private AttributeSet attrs;
        private Context context;
        private String name;
        private View view;

        private Builder() {
        }

        private Builder(InflateResult inflateResult) {
            this.view = inflateResult.view;
            this.name = inflateResult.name;
            this.context = inflateResult.context;
            this.attrs = inflateResult.attrs;
        }

        public final Builder attrs(AttributeSet attributeSet) {
            this.attrs = attributeSet;
            return this;
        }

        public final InflateResult build() {
            String str = this.name;
            if (str == null) {
                throw new IllegalStateException("name == null");
            } else if (this.context != null) {
                View view = this.view;
                if (view != null) {
                    if (!str.equals(view.getClass().getName())) {
                        StringBuilder stringBuilder = new StringBuilder("name (");
                        stringBuilder.append(this.name);
                        stringBuilder.append(") must be the view's fully qualified name (");
                        stringBuilder.append(this.view.getClass().getName());
                        stringBuilder.append(")");
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                return new InflateResult();
            } else {
                throw new IllegalStateException("context == null");
            }
        }

        public final Builder context(Context context) {
            this.context = context;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder view(View view) {
            this.view = view;
            return this;
        }
    }

    private InflateResult(Builder builder) {
        this.view = builder.view;
        this.name = builder.name;
        this.context = builder.context;
        this.attrs = builder.attrs;
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

    public String name() {
        return this.name;
    }

    public Builder toBuilder() {
        return new Builder();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("InflateResult{view=");
        stringBuilder.append(this.view);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", context=");
        stringBuilder.append(this.context);
        stringBuilder.append(", attrs=");
        stringBuilder.append(this.attrs);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public View view() {
        return this.view;
    }
}
