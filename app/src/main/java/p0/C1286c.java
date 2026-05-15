package p0;

import java.util.Arrays;
import java.util.HashMap;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import t.K;

/* JADX INFO: renamed from: p0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1286c extends C1285b {

    /* JADX INFO: renamed from: o */
    public final C1285b f14913o;

    /* JADX INFO: renamed from: p */
    public boolean f14914p;

    public C1286c(long j3, j jVar, InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, C1285b c1285b) {
        super(j3, jVar, interfaceC1182c, interfaceC1182c2);
        this.f14913o = c1285b;
        c1285b.k();
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final void c() {
        if (this.f14921c) {
            return;
        }
        super.c();
        if (this.f14914p) {
            return;
        }
        this.f14914p = true;
        this.f14913o.l();
    }

    @Override // p0.C1285b
    public final q w() throws Throwable {
        C1286c c1286c;
        C1285b c1285b = this.f14913o;
        if (c1285b.f14912m || c1285b.f14921c) {
            return new C1290g(this);
        }
        K k7 = this.h;
        long j3 = this.f14920b;
        HashMap mapC = k7 != null ? l.c(c1285b.g(), this, this.f14913o.d()) : null;
        synchronized (l.f14941c) {
            try {
                l.d(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (k7 == null || k7.f16012d == 0) {
                    c1286c = this;
                    a();
                } else {
                    c1286c = this;
                    q qVarZ = c1286c.z(this.f14913o.g(), k7, mapC, this.f14913o.d());
                    if (!qVarZ.equals(h.f14924c)) {
                        return qVarZ;
                    }
                    K kX = c1286c.f14913o.x();
                    if (kX != null) {
                        kX.k(k7);
                    } else {
                        c1286c.f14913o.C(k7);
                        c1286c.h = null;
                    }
                }
                if (AbstractC1209k.h(c1286c.f14913o.g(), j3) < 0) {
                    c1286c.f14913o.v();
                }
                C1285b c1285b2 = c1286c.f14913o;
                c1285b2.r(c1285b2.d().c(j3).b(c1286c.f14910j));
                c1286c.f14913o.A(j3);
                C1285b c1285b3 = c1286c.f14913o;
                int i7 = c1286c.f14922d;
                c1286c.f14922d = -1;
                if (i7 >= 0) {
                    int[] iArr = c1285b3.f14911k;
                    AbstractC1209k.f(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i7;
                    c1285b3.f14911k = iArrCopyOf;
                } else {
                    c1285b3.getClass();
                }
                c1286c.f14913o.B(c1286c.f14910j);
                C1285b c1285b4 = c1286c.f14913o;
                int[] iArr2 = c1286c.f14911k;
                c1285b4.getClass();
                if (iArr2.length != 0) {
                    int[] iArr3 = c1285b4.f14911k;
                    if (iArr3.length != 0) {
                        int length2 = iArr3.length;
                        int length3 = iArr2.length;
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                        System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                        AbstractC1209k.c(iArrCopyOf2);
                        iArr2 = iArrCopyOf2;
                    }
                    c1285b4.f14911k = iArr2;
                }
                c1286c.f14912m = true;
                if (!c1286c.f14914p) {
                    c1286c.f14914p = true;
                    c1286c.f14913o.l();
                }
                return h.f14924c;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
