package m1;

import h1.AbstractC0996a;
import l5.InterfaceC1180a;
import y0.AbstractC1983p;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14329a;

    public c(long j3) {
        this.f14329a = j3;
        if (j3 != 16) {
            return;
        }
        AbstractC0996a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // m1.o
    public final float a() {
        return C1987t.d(this.f14329a);
    }

    @Override // m1.o
    public final long b() {
        return this.f14329a;
    }

    @Override // m1.o
    public final AbstractC1983p c() {
        return null;
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
        return (obj instanceof c) && C1987t.c(this.f14329a, ((c) obj).f14329a);
    }

    public final int hashCode() {
        return C1987t.i(this.f14329a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C1987t.j(this.f14329a)) + ')';
    }
}
