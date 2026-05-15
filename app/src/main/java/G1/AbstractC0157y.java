package G1;

import a5.C0525e;
import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: G1.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0157y {

    /* JADX INFO: renamed from: o */
    public int f2742o;

    /* JADX INFO: renamed from: p */
    public int f2743p;

    /* JADX INFO: renamed from: q */
    public int f2744q;

    /* JADX INFO: renamed from: r */
    public Object f2745r;

    public AbstractC0157y() {
        if (N2.z.f5107p == null) {
            N2.z.f5107p = new N2.z();
        }
    }

    public int b(int i7) {
        if (i7 < this.f2744q) {
            return ((ByteBuffer) this.f2745r).getShort(this.f2743p + i7);
        }
        return 0;
    }

    public void c() {
        if (((C0525e) this.f2745r).f8871v != this.f2744q) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object d(View view);

    public abstract void e(View view, Object obj);

    public void f() {
        while (true) {
            int i7 = this.f2742o;
            C0525e c0525e = (C0525e) this.f2745r;
            if (i7 >= c0525e.f8869t || c0525e.f8866q[i7] >= 0) {
                return;
            } else {
                this.f2742o = i7 + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f2743p) {
            e(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f2743p) {
            tag = d(view);
        } else {
            tag = view.getTag(this.f2742o);
            if (!((Class) this.f2745r).isInstance(tag)) {
                tag = null;
            }
        }
        if (h(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateC = I.c(view);
            C0135b c0135b = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof C0134a ? ((C0134a) accessibilityDelegateC).f2682a : new C0135b(accessibilityDelegateC);
            if (c0135b == null) {
                c0135b = new C0135b();
            }
            I.h(view, c0135b);
            view.setTag(this.f2742o, obj);
            I.e(view, this.f2744q);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f2742o < ((C0525e) this.f2745r).f8869t;
    }

    public void remove() {
        c();
        if (this.f2743p == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C0525e c0525e = (C0525e) this.f2745r;
        c0525e.c();
        c0525e.m(this.f2743p);
        this.f2743p = -1;
        this.f2744q = c0525e.f8871v;
    }
}
