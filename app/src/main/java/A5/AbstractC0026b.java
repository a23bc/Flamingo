package A5;

import java.util.Arrays;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: A5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0026b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC0028d[] f533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B f536r;

    public final AbstractC0028d c() {
        AbstractC0028d abstractC0028dD;
        B b7;
        synchronized (this) {
            try {
                AbstractC0028d[] abstractC0028dArrE = this.f533o;
                if (abstractC0028dArrE == null) {
                    abstractC0028dArrE = e();
                    this.f533o = abstractC0028dArrE;
                } else if (this.f534p >= abstractC0028dArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC0028dArrE, abstractC0028dArrE.length * 2);
                    AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
                    this.f533o = (AbstractC0028d[]) objArrCopyOf;
                    abstractC0028dArrE = (AbstractC0028d[]) objArrCopyOf;
                }
                int i7 = this.f535q;
                do {
                    abstractC0028dD = abstractC0028dArrE[i7];
                    if (abstractC0028dD == null) {
                        abstractC0028dD = d();
                        abstractC0028dArrE[i7] = abstractC0028dD;
                    }
                    i7++;
                    if (i7 >= abstractC0028dArrE.length) {
                        i7 = 0;
                    }
                } while (!abstractC0028dD.a(this));
                this.f535q = i7;
                this.f534p++;
                b7 = this.f536r;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b7 != null) {
            b7.w(1);
        }
        return abstractC0028dD;
    }

    public abstract AbstractC0028d d();

    public abstract AbstractC0028d[] e();

    public final void g(AbstractC0028d abstractC0028d) {
        B b7;
        int i7;
        c5.d[] dVarArrB;
        synchronized (this) {
            try {
                int i8 = this.f534p - 1;
                this.f534p = i8;
                b7 = this.f536r;
                if (i8 == 0) {
                    this.f535q = 0;
                }
                AbstractC1209k.d(abstractC0028d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                dVarArrB = abstractC0028d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (c5.d dVar : dVarArrB) {
            if (dVar != null) {
                dVar.resumeWith(Y4.o.f8736a);
            }
        }
        if (b7 != null) {
            b7.w(-1);
        }
    }

    public final B h() {
        B b7;
        synchronized (this) {
            b7 = this.f536r;
            if (b7 == null) {
                int i7 = this.f534p;
                b7 = new B(1, Integer.MAX_VALUE, y5.a.f20529p);
                b7.q(Integer.valueOf(i7));
                this.f536r = b7;
            }
        }
        return b7;
    }
}
