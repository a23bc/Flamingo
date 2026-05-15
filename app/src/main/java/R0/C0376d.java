package R0;

import b1.C0613I;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: R0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0376d extends AbstractC0372b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C0376d f6428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m1.j f6429e = m1.j.f14342p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m1.j f6430f = m1.j.f14341o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0613I f6431c;

    @Override // R0.AbstractC0372b
    public final int[] e(int i7) {
        int iD;
        if (i().length() <= 0 || i7 >= i().length()) {
            return null;
        }
        m1.j jVar = f6429e;
        if (i7 < 0) {
            C0613I c0613i = this.f6431c;
            if (c0613i == null) {
                AbstractC1209k.m("layoutResult");
                throw null;
            }
            iD = c0613i.f9930b.d(0);
        } else {
            C0613I c0613i2 = this.f6431c;
            if (c0613i2 == null) {
                AbstractC1209k.m("layoutResult");
                throw null;
            }
            int iD2 = c0613i2.f9930b.d(i7);
            iD = m(iD2, jVar) == i7 ? iD2 : iD2 + 1;
        }
        C0613I c0613i3 = this.f6431c;
        if (c0613i3 == null) {
            AbstractC1209k.m("layoutResult");
            throw null;
        }
        if (iD >= c0613i3.f9930b.f9992f) {
            return null;
        }
        return h(m(iD, jVar), m(iD, f6430f) + 1);
    }

    @Override // R0.AbstractC0372b
    public final int[] k(int i7) {
        int iD;
        if (i().length() <= 0 || i7 <= 0) {
            return null;
        }
        int length = i().length();
        m1.j jVar = f6430f;
        if (i7 > length) {
            C0613I c0613i = this.f6431c;
            if (c0613i == null) {
                AbstractC1209k.m("layoutResult");
                throw null;
            }
            iD = c0613i.f9930b.d(i().length());
        } else {
            C0613I c0613i2 = this.f6431c;
            if (c0613i2 == null) {
                AbstractC1209k.m("layoutResult");
                throw null;
            }
            int iD2 = c0613i2.f9930b.d(i7);
            iD = m(iD2, jVar) + 1 == i7 ? iD2 : iD2 - 1;
        }
        if (iD < 0) {
            return null;
        }
        return h(m(iD, f6429e), m(iD, jVar) + 1);
    }

    public final int m(int i7, m1.j jVar) {
        C0613I c0613i = this.f6431c;
        if (c0613i == null) {
            AbstractC1209k.m("layoutResult");
            throw null;
        }
        int iH = c0613i.h(i7);
        C0613I c0613i2 = this.f6431c;
        if (c0613i2 == null) {
            AbstractC1209k.m("layoutResult");
            throw null;
        }
        if (jVar != c0613i2.i(iH)) {
            C0613I c0613i3 = this.f6431c;
            if (c0613i3 != null) {
                return c0613i3.h(i7);
            }
            AbstractC1209k.m("layoutResult");
            throw null;
        }
        if (this.f6431c != null) {
            return r6.f9930b.c(i7, false) - 1;
        }
        AbstractC1209k.m("layoutResult");
        throw null;
    }
}
