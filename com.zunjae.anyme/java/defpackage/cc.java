package defpackage;

import java.util.Comparator;

public abstract class cc<T2> implements Comparator<T2> {
    public abstract boolean areContentsTheSame(T2 t2, T2 t22);

    public abstract boolean areItemsTheSame(T2 t2, T2 t22);

    public abstract int compare(T2 t2, T2 t22);

    public Object getChangePayload(T2 t2, T2 t22) {
        return null;
    }

    public abstract void onChanged(int i, int i2);

    public void onChanged(int i, int i2, Object obj) {
        onChanged(i, i2);
    }
}
