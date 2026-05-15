package y0;

import m5.AbstractC1209k;
import x0.C1893c;
import x0.C1894d;

/* JADX INFO: renamed from: y0.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1956F extends AbstractC1959I {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1894d f20177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1976i f20178f;

    public C1956F(C1894d c1894d) {
        C1976i c1976iA;
        this.f20177e = c1894d;
        long j3 = c1894d.f19877e;
        if ((j3 >>> 32) == (4294967295L & j3) && j3 == c1894d.f19878f && j3 == c1894d.f19879g && j3 == c1894d.h) {
            c1976iA = null;
        } else {
            c1976iA = AbstractC1978k.a();
            n1.c.m(c1976iA, c1894d);
        }
        this.f20178f = c1976iA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1956F) {
            return AbstractC1209k.a(this.f20177e, ((C1956F) obj).f20177e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20177e.hashCode();
    }

    @Override // y0.AbstractC1959I
    public final C1893c m() {
        C1894d c1894d = this.f20177e;
        return new C1893c(c1894d.f19873a, c1894d.f19874b, c1894d.f19875c, c1894d.f19876d);
    }
}
