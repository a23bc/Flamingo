package i2;

import java.util.concurrent.atomic.AtomicReference;
import v5.AbstractC1643a;
import v5.EnumC1645c;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC1765B {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1765B f13334o;

    /* JADX INFO: renamed from: p */
    public final AtomicReference f13335p = new AtomicReference(null);

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ B2.g f13336q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1765B f13337r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ w f13338s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ AtomicReference f13339t;

    public K(InterfaceC1765B interfaceC1765B, B2.g gVar, InterfaceC1765B interfaceC1765B2, w wVar, AtomicReference atomicReference) {
        this.f13336q = gVar;
        this.f13337r = interfaceC1765B2;
        this.f13338s = wVar;
        this.f13339t = atomicReference;
        this.f13334o = interfaceC1765B;
    }

    public final long a() {
        Long l = (Long) this.f13335p.get();
        if (l == null) {
            return AbstractC1643a.f18313o;
        }
        long jLongValue = l.longValue();
        this.f13336q.getClass();
        long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
        int i7 = AbstractC1643a.f18315q;
        return i6.g.D(jCurrentTimeMillis, EnumC1645c.f18318q);
    }

    public final void b(long j3) {
        if (AbstractC1643a.d(j3) <= 0) {
            AbstractC1767D.f(this.f13337r, new H("Timed out immediately", this.f13338s.hashCode()));
            return;
        }
        if (AbstractC1643a.c(a(), j3) < 0) {
            return;
        }
        AtomicReference atomicReference = this.f13335p;
        this.f13336q.getClass();
        atomicReference.set(Long.valueOf(AbstractC1643a.d(j3) + System.currentTimeMillis()));
        B2.g gVar = this.f13336q;
        InterfaceC1765B interfaceC1765B = this.f13337r;
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) this.f13339t.getAndSet(AbstractC1767D.t(interfaceC1765B, null, new J(this, gVar, interfaceC1765B, this.f13338s, null), 3));
        if (interfaceC1786g0 != null) {
            interfaceC1786g0.c(null);
        }
    }

    @Override // w5.InterfaceC1765B
    public final c5.i g() {
        return this.f13334o.g();
    }
}
