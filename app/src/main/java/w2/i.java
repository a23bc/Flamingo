package w2;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B3.l f18847b = new B3.l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18849d;

    public i(Object obj) {
        this.f18846a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return this.f18846a.equals(((i) obj).f18846a);
    }

    public final int hashCode() {
        return this.f18846a.hashCode();
    }
}
