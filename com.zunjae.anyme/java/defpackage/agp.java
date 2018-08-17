package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

public abstract class agp<T extends Animator> {
    protected long a = 350;
    protected age b;
    protected T c;

    public agp(age age) {
        this.b = age;
        this.c = a();
    }

    public abstract agp a(float f);

    public agp a(long j) {
        this.a = j;
        Animator animator = this.c;
        if (animator instanceof ValueAnimator) {
            animator.setDuration(this.a);
        }
        return this;
    }

    public abstract T a();

    public final void b() {
        Animator animator = this.c;
        if (animator != null && !animator.isRunning()) {
            this.c.start();
        }
    }

    public final void c() {
        Animator animator = this.c;
        if (animator != null && animator.isStarted()) {
            this.c.end();
        }
    }
}
