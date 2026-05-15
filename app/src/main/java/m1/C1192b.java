package m1;

import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import y0.AbstractC1961K;
import y0.AbstractC1983p;
import y0.C1987t;

/* JADX INFO: renamed from: m1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1192b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1961K f14327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14328b;

    public C1192b(AbstractC1961K abstractC1961K, float f7) {
        this.f14327a = abstractC1961K;
        this.f14328b = f7;
    }

    @Override // m1.o
    public final float a() {
        return this.f14328b;
    }

    @Override // m1.o
    public final long b() {
        int i7 = C1987t.f20263k;
        return C1987t.f20262j;
    }

    @Override // m1.o
    public final AbstractC1983p c() {
        return this.f14327a;
    }

    @Override // m1.o
    public final /* synthetic */ o d(o oVar) {
        return Z1.l.b(this, oVar);
    }

    @Override // m1.o
    public final o e(InterfaceC1180a interfaceC1180a) {
        return !equals(n.f14350a) ? this : (o) interfaceC1180a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1192b)) {
            return false;
        }
        C1192b c1192b = (C1192b) obj;
        return AbstractC1209k.a(this.f14327a, c1192b.f14327a) && Float.compare(this.f14328b, c1192b.f14328b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f14328b) + (this.f14327a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f14327a);
        sb.append(", alpha=");
        return n1.c.u(sb, this.f14328b, ')');
    }
}
