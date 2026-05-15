package f0;

import d5.EnumC0830a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.C1218t;
import n0.C1226a;
import t.C1444F;
import w5.C1793k;

/* JADX INFO: renamed from: f0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0887g implements X {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC1180a f11801o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Throwable f11803q;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f11802p = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1226a f11804r = new C1226a(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1444F f11805s = new C1444F();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1444F f11806t = new C1444F();

    public C0887g(InterfaceC1180a interfaceC1180a) {
        this.f11801o = interfaceC1180a;
    }

    public static final void a(C0887g c0887g, Throwable th) {
        int i7;
        synchronized (c0887g.f11802p) {
            try {
                if (c0887g.f11803q != null) {
                    return;
                }
                c0887g.f11803q = th;
                C1444F c1444f = c0887g.f11805s;
                Object[] objArr = c1444f.f15983a;
                int i8 = c1444f.f15984b;
                for (int i9 = 0; i9 < i8; i9++) {
                    C1793k c1793k = ((C0883e) objArr[i9]).f11795b;
                    if (c1793k != null) {
                        c1793k.resumeWith(android.support.v4.media.session.b.l(th));
                    }
                }
                c0887g.f11805s.c();
                C1226a c1226a = c0887g.f11804r;
                do {
                    i7 = c1226a.get();
                } while (!c1226a.compareAndSet(i7, ((((i7 >>> 27) & 15) + 1) & 15) << 27));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(long j3) {
        int i7;
        C1793k c1793k;
        Object objL;
        synchronized (this.f11802p) {
            try {
                C1444F c1444f = this.f11805s;
                this.f11805s = this.f11806t;
                this.f11806t = c1444f;
                C1226a c1226a = this.f11804r;
                do {
                    i7 = c1226a.get();
                } while (!c1226a.compareAndSet(i7, ((((i7 >>> 27) & 15) + 1) & 15) << 27));
                int i8 = c1444f.f15984b;
                for (int i9 = 0; i9 < i8; i9++) {
                    C0883e c0883e = (C0883e) c1444f.e(i9);
                    InterfaceC1182c interfaceC1182c = c0883e.f11794a;
                    if (interfaceC1182c != null && (c1793k = c0883e.f11795b) != null) {
                        try {
                            objL = interfaceC1182c.b(Long.valueOf(j3));
                        } catch (Throwable th) {
                            objL = android.support.v4.media.session.b.l(th);
                        }
                        c1793k.resumeWith(objL);
                    }
                }
                c1444f.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c5.g
    public final c5.h getKey() {
        return W.f11763p;
    }

    @Override // c5.i
    public final c5.i h(c5.i iVar) {
        return I0.c.L(this, iVar);
    }

    @Override // c5.i
    public final c5.g n(c5.h hVar) {
        return I0.c.z(this, hVar);
    }

    @Override // f0.X
    public final Object s(InterfaceC1182c interfaceC1182c, c5.d dVar) {
        int i7;
        int i8;
        boolean z6 = true;
        C1793k c1793k = new C1793k(1, I0.c.D(dVar));
        c1793k.r();
        C0883e c0883e = new C0883e();
        c0883e.f11794a = interfaceC1182c;
        c0883e.f11795b = c1793k;
        C1218t c1218t = new C1218t();
        c1218t.f14437o = -1;
        synchronized (this.f11802p) {
            Throwable th = this.f11803q;
            if (th != null) {
                c1793k.resumeWith(android.support.v4.media.session.b.l(th));
            } else {
                C1226a c1226a = this.f11804r;
                do {
                    i7 = c1226a.get();
                    i8 = i7 + 1;
                } while (!c1226a.compareAndSet(i7, i8));
                if ((134217727 & i8) != 1) {
                    z6 = false;
                }
                c1218t.f14437o = (i8 >>> 27) & 15;
                this.f11805s.a(c0883e);
                c1793k.t(new C0885f(c0883e, this, c1218t));
                if (z6) {
                    try {
                        this.f11801o.a();
                    } catch (Throwable th2) {
                        a(this, th2);
                    }
                }
            }
        }
        Object objQ = c1793k.q();
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        return objQ;
    }

    @Override // c5.i
    public final c5.i u(c5.h hVar) {
        return I0.c.H(this, hVar);
    }

    @Override // c5.i
    public final Object y(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }
}
