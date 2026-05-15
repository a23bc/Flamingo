package H;

import f0.C0879c;
import f0.C0894j0;
import w.C1670c;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: H.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0183z {

    /* JADX INFO: renamed from: q */
    public static final long f2938q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f2939r = 0;

    /* JADX INFO: renamed from: a */
    public final InterfaceC1765B f2940a;

    /* JADX INFO: renamed from: b */
    public final y0.y f2941b;

    /* JADX INFO: renamed from: c */
    public final E3.e f2942c;

    /* JADX INFO: renamed from: d */
    public w.S f2943d;

    /* JADX INFO: renamed from: e */
    public boolean f2944e;

    /* JADX INFO: renamed from: f */
    public final C0894j0 f2945f;

    /* JADX INFO: renamed from: g */
    public final C0894j0 f2946g;
    public final C0894j0 h;

    /* JADX INFO: renamed from: i */
    public final C0894j0 f2947i;

    /* JADX INFO: renamed from: j */
    public long f2948j;

    /* JADX INFO: renamed from: k */
    public long f2949k;
    public B0.d l;

    /* JADX INFO: renamed from: m */
    public final C1670c f2950m;

    /* JADX INFO: renamed from: n */
    public final C1670c f2951n;

    /* JADX INFO: renamed from: o */
    public final C0894j0 f2952o;

    /* JADX INFO: renamed from: p */
    public long f2953p;

    static {
        long j3 = Integer.MAX_VALUE;
        f2938q = (j3 & 4294967295L) | (j3 << 32);
    }

    public C0183z(InterfaceC1765B interfaceC1765B, y0.y yVar, E3.e eVar) {
        this.f2940a = interfaceC1765B;
        this.f2941b = yVar;
        this.f2942c = eVar;
        Boolean bool = Boolean.FALSE;
        this.f2945f = C0879c.t(bool);
        this.f2946g = C0879c.t(bool);
        this.h = C0879c.t(bool);
        this.f2947i = C0879c.t(bool);
        long j3 = f2938q;
        this.f2948j = j3;
        this.f2949k = 0L;
        this.l = yVar != null ? yVar.b() : null;
        this.f2950m = new C1670c(new n1.k(0L), w.p0.f18733g, null, 12);
        this.f2951n = new C1670c(Float.valueOf(1.0f), w.p0.f18727a, null, 12);
        this.f2952o = C0879c.t(new n1.k(0L));
        this.f2953p = j3;
    }

    public final void a() {
        B0.d dVar = this.l;
        ((Boolean) this.f2946g.getValue()).booleanValue();
        if (b()) {
            if (dVar != null) {
                dVar.f(1.0f);
            }
            AbstractC1767D.t(this.f2940a, null, new C0176s(this, null), 3);
        }
    }

    public final boolean b() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public final void c() {
        y0.y yVar;
        boolean zBooleanValue = ((Boolean) this.f2945f.getValue()).booleanValue();
        InterfaceC1765B interfaceC1765B = this.f2940a;
        if (zBooleanValue) {
            d(false);
            AbstractC1767D.t(interfaceC1765B, null, new C0180w(this, null), 3);
        }
        if (((Boolean) this.f2946g.getValue()).booleanValue()) {
            this.f2946g.setValue(false);
            AbstractC1767D.t(interfaceC1765B, null, new C0181x(this, null), 3);
        }
        if (b()) {
            this.h.setValue(false);
            AbstractC1767D.t(interfaceC1765B, null, new C0182y(this, null), 3);
        }
        this.f2944e = false;
        e(0L);
        this.f2948j = f2938q;
        B0.d dVar = this.l;
        if (dVar != null && (yVar = this.f2941b) != null) {
            yVar.a(dVar);
        }
        this.l = null;
        this.f2943d = null;
    }

    public final void d(boolean z6) {
        this.f2945f.setValue(Boolean.valueOf(z6));
    }

    public final void e(long j3) {
        this.f2952o.setValue(new n1.k(j3));
    }
}
