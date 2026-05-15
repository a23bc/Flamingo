package R0;

import b1.C0613I;
import m5.AbstractC1209k;
import x0.C1893c;

/* JADX INFO: renamed from: R0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0378e extends AbstractC0372b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C0378e f6441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m1.j f6442f = m1.j.f14342p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m1.j f6443g = m1.j.f14341o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0613I f6444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y0.o f6445d;

    @Override // R0.AbstractC0372b
    public final int[] e(int i7) {
        int iE;
        if (i().length() <= 0 || i7 >= i().length()) {
            return null;
        }
        try {
            Y0.o oVar = this.f6445d;
            if (oVar == null) {
                AbstractC1209k.m("node");
                throw null;
            }
            C1893c c1893cG = oVar.g();
            int iRound = Math.round(c1893cG.f19872d - c1893cG.f19870b);
            if (i7 <= 0) {
                i7 = 0;
            }
            C0613I c0613i = this.f6444c;
            if (c0613i == null) {
                AbstractC1209k.m("layoutResult");
                throw null;
            }
            int iD = c0613i.f9930b.d(i7);
            C0613I c0613i2 = this.f6444c;
            if (c0613i2 == null) {
                AbstractC1209k.m("layoutResult");
                throw null;
            }
            float f7 = c0613i2.f9930b.f(iD) + iRound;
            C0613I c0613i3 = this.f6444c;
            if (c0613i3 == null) {
                AbstractC1209k.m("layoutResult");
                throw null;
            }
            if (c0613i3 == null) {
                AbstractC1209k.m("layoutResult");
                throw null;
            }
            if (f7 < c0613i3.f9930b.f(r0.f9992f - 1)) {
                C0613I c0613i4 = this.f6444c;
                if (c0613i4 == null) {
                    AbstractC1209k.m("layoutResult");
                    throw null;
                }
                iE = c0613i4.f9930b.e(f7);
            } else {
                C0613I c0613i5 = this.f6444c;
                if (c0613i5 == null) {
                    AbstractC1209k.m("layoutResult");
                    throw null;
                }
                iE = c0613i5.f9930b.f9992f;
            }
            return h(i7, m(iE - 1, f6443g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // R0.AbstractC0372b
    public final int[] k(int i7) {
        int iE;
        if (i().length() <= 0 || i7 <= 0) {
            return null;
        }
        try {
            Y0.o oVar = this.f6445d;
            if (oVar == null) {
                AbstractC1209k.m("node");
                throw null;
            }
            C1893c c1893cG = oVar.g();
            int iRound = Math.round(c1893cG.f19872d - c1893cG.f19870b);
            int length = i().length();
            if (length <= i7) {
                i7 = length;
            }
            C0613I c0613i = this.f6444c;
            if (c0613i == null) {
                AbstractC1209k.m("layoutResult");
                throw null;
            }
            int iD = c0613i.f9930b.d(i7);
            C0613I c0613i2 = this.f6444c;
            if (c0613i2 == null) {
                AbstractC1209k.m("layoutResult");
                throw null;
            }
            float f7 = c0613i2.f9930b.f(iD) - iRound;
            if (f7 > 0.0f) {
                C0613I c0613i3 = this.f6444c;
                if (c0613i3 == null) {
                    AbstractC1209k.m("layoutResult");
                    throw null;
                }
                iE = c0613i3.f9930b.e(f7);
            } else {
                iE = 0;
            }
            if (i7 == i().length() && iE < iD) {
                iE++;
            }
            return h(m(iE, f6442f), i7);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int m(int i7, m1.j jVar) {
        C0613I c0613i = this.f6444c;
        if (c0613i == null) {
            AbstractC1209k.m("layoutResult");
            throw null;
        }
        int iH = c0613i.h(i7);
        C0613I c0613i2 = this.f6444c;
        if (c0613i2 == null) {
            AbstractC1209k.m("layoutResult");
            throw null;
        }
        if (jVar != c0613i2.i(iH)) {
            C0613I c0613i3 = this.f6444c;
            if (c0613i3 != null) {
                return c0613i3.h(i7);
            }
            AbstractC1209k.m("layoutResult");
            throw null;
        }
        if (this.f6444c != null) {
            return r6.f9930b.c(i7, false) - 1;
        }
        AbstractC1209k.m("layoutResult");
        throw null;
    }
}
