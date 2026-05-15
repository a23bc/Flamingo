package g2;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f12410c = new c(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f12411d = new c(1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f12412e = new c(2, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12414b;

    public c(int i7, int i8) {
        this.f12413a = i7;
        this.f12414b = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1209k.d(obj, "null cannot be cast to non-null type androidx.glance.layout.Alignment");
        c cVar = (c) obj;
        return this.f12413a == cVar.f12413a && this.f12414b == cVar.f12414b;
    }

    public final int hashCode() {
        return (this.f12413a * 31) + this.f12414b;
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) C0985a.b(this.f12413a)) + ", vertical=" + ((Object) C0986b.b(this.f12414b)) + ')';
    }
}
