package D4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements j, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f1585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile transient boolean f1586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public transient Object f1587q;

    public k(j jVar) {
        this.f1585o = jVar;
    }

    @Override // D4.j
    public final Object get() {
        if (!this.f1586p) {
            synchronized (this) {
                try {
                    if (!this.f1586p) {
                        Object obj = this.f1585o.get();
                        this.f1587q = obj;
                        this.f1586p = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f1587q;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f1586p) {
            obj = "<supplier that returned " + this.f1587q + ">";
        } else {
            obj = this.f1585o;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
