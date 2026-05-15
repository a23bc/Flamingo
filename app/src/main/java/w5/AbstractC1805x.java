package w5;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: w5.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1805x extends c5.a implements c5.f {

    /* JADX INFO: renamed from: p */
    public static final C1804w f19579p = new C1804w(c5.e.f10684o, C1803v.f19576p);

    public AbstractC1805x() {
        super(c5.e.f10684o);
    }

    public abstract void A(c5.i iVar, Runnable runnable);

    public void B(c5.i iVar, Runnable runnable) {
        A(iVar, runnable);
    }

    public boolean C() {
        return !(this instanceof F0);
    }

    public AbstractC1805x D(int i7) {
        B5.a.a(i7);
        return new B5.h(this, i7);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l5.c, m5.l] */
    @Override // c5.a, c5.i
    public final c5.g n(c5.h hVar) {
        AbstractC1209k.f(hVar, "key");
        if (!(hVar instanceof C1804w)) {
            if (c5.e.f10684o == hVar) {
                return this;
            }
            return null;
        }
        C1804w c1804w = (C1804w) hVar;
        c5.h hVar2 = this.f10678o;
        if (hVar2 != c1804w && c1804w.f19578p != hVar2) {
            return null;
        }
        c5.g gVar = (c5.g) c1804w.f19577o.b(this);
        if (gVar instanceof c5.g) {
            return gVar;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1767D.m(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0027 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l5.c, m5.l] */
    @Override // c5.a, c5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c5.i u(c5.h r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            m5.AbstractC1209k.f(r4, r0)
            boolean r0 = r4 instanceof w5.C1804w
            c5.j r1 = c5.j.f10685o
            if (r0 == 0) goto L22
            w5.w r4 = (w5.C1804w) r4
            c5.h r0 = r3.f10678o
            if (r0 == r4) goto L17
            c5.h r2 = r4.f19578p
            if (r2 != r0) goto L16
            goto L17
        L16:
            return r3
        L17:
            m5.l r4 = r4.f19577o
            java.lang.Object r4 = r4.b(r3)
            c5.g r4 = (c5.g) r4
            if (r4 == 0) goto L27
            goto L26
        L22:
            c5.e r0 = c5.e.f10684o
            if (r0 != r4) goto L27
        L26:
            return r1
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.AbstractC1805x.u(c5.h):c5.i");
    }
}
