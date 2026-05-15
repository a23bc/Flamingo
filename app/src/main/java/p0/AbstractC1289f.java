package p0;

import l5.InterfaceC1182c;
import o0.C1247d;

/* JADX INFO: renamed from: p0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1289f {

    /* JADX INFO: renamed from: a */
    public j f14919a;

    /* JADX INFO: renamed from: b */
    public long f14920b;

    /* JADX INFO: renamed from: c */
    public boolean f14921c;

    /* JADX INFO: renamed from: d */
    public int f14922d;

    public AbstractC1289f(long j3, j jVar) {
        int iB;
        int iNumberOfTrailingZeros;
        this.f14919a = jVar;
        this.f14920b = j3;
        C1247d c1247d = l.f14939a;
        if (j3 != 0) {
            j jVarD = d();
            long[] jArr = jVarD.f14935r;
            if (jArr != null) {
                j3 = jArr[0];
            } else {
                long j7 = jVarD.f14933p;
                long j8 = jVarD.f14934q;
                if (j7 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j7);
                } else {
                    long j9 = jVarD.f14932o;
                    if (j9 != 0) {
                        j8 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j9);
                    }
                }
                j3 = ((long) iNumberOfTrailingZeros) + j8;
            }
            synchronized (l.f14941c) {
                iB = l.f14944f.b(j3);
            }
        } else {
            iB = -1;
        }
        this.f14922d = iB;
    }

    public static void q(AbstractC1289f abstractC1289f) {
        l.f14940b.l0(abstractC1289f);
    }

    public final void a() {
        synchronized (l.f14941c) {
            b();
            p();
        }
    }

    public void b() {
        l.f14942d = l.f14942d.c(g());
    }

    public abstract void c();

    public j d() {
        return this.f14919a;
    }

    public abstract InterfaceC1182c e();

    public abstract boolean f();

    public long g() {
        return this.f14920b;
    }

    public int h() {
        return 0;
    }

    public abstract InterfaceC1182c i();

    public final AbstractC1289f j() {
        A0.b bVar = l.f14940b;
        AbstractC1289f abstractC1289f = (AbstractC1289f) bVar.R();
        bVar.l0(this);
        return abstractC1289f;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(y yVar);

    public final void o() {
        int i7 = this.f14922d;
        if (i7 >= 0) {
            l.v(i7);
            this.f14922d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(j jVar) {
        this.f14919a = jVar;
    }

    public void s(long j3) {
        this.f14920b = j3;
    }

    public void t(int i7) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract AbstractC1289f u(InterfaceC1182c interfaceC1182c);
}
