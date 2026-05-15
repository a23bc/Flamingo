package D4;

import A2.C0016q;

/* JADX INFO: loaded from: classes.dex */
public final class l implements j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0016q f1588q = new C0016q(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile j f1589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f1590p;

    @Override // D4.j
    public final Object get() {
        j jVar = this.f1589o;
        C0016q c0016q = f1588q;
        if (jVar != c0016q) {
            synchronized (this) {
                try {
                    if (this.f1589o != c0016q) {
                        Object obj = this.f1589o.get();
                        this.f1590p = obj;
                        this.f1589o = c0016q;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f1590p;
    }

    public final String toString() {
        Object obj = this.f1589o;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f1588q) {
            obj = "<supplier that returned " + this.f1590p + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
