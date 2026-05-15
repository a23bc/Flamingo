package M;

import R0.O0;
import b1.AbstractC0623h;
import b1.C0622g;
import f0.C0879c;
import f0.C0894j0;
import f0.C0915u0;
import g1.C0956B;
import g1.C0966h;
import g1.C0980v;
import l5.InterfaceC1182c;
import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: A */
    public final C0894j0 f4495A;

    /* JADX INFO: renamed from: B */
    public final C0894j0 f4496B;

    /* JADX INFO: renamed from: a */
    public i0 f4497a;

    /* JADX INFO: renamed from: b */
    public final C0915u0 f4498b;

    /* JADX INFO: renamed from: c */
    public final O0 f4499c;

    /* JADX INFO: renamed from: d */
    public final V1.a f4500d;

    /* JADX INFO: renamed from: e */
    public C0956B f4501e;

    /* JADX INFO: renamed from: f */
    public final C0894j0 f4502f;

    /* JADX INFO: renamed from: g */
    public final C0894j0 f4503g;
    public O0.C h;

    /* JADX INFO: renamed from: i */
    public final C0894j0 f4504i;

    /* JADX INFO: renamed from: j */
    public C0622g f4505j;

    /* JADX INFO: renamed from: k */
    public final C0894j0 f4506k;
    public final C0894j0 l;

    /* JADX INFO: renamed from: m */
    public final C0894j0 f4507m;

    /* JADX INFO: renamed from: n */
    public final C0894j0 f4508n;

    /* JADX INFO: renamed from: o */
    public final C0894j0 f4509o;

    /* JADX INFO: renamed from: p */
    public boolean f4510p;

    /* JADX INFO: renamed from: q */
    public final C0894j0 f4511q;

    /* JADX INFO: renamed from: r */
    public final W f4512r;

    /* JADX INFO: renamed from: s */
    public final C0894j0 f4513s;

    /* JADX INFO: renamed from: t */
    public final C0894j0 f4514t;

    /* JADX INFO: renamed from: u */
    public InterfaceC1182c f4515u;

    /* JADX INFO: renamed from: v */
    public final C0276v f4516v;

    /* JADX INFO: renamed from: w */
    public final C0276v f4517w;

    /* JADX INFO: renamed from: x */
    public final C0276v f4518x;

    /* JADX INFO: renamed from: y */
    public final w2.l f4519y;

    /* JADX INFO: renamed from: z */
    public long f4520z;

    public Z(i0 i0Var, C0915u0 c0915u0, O0 o02) {
        this.f4497a = i0Var;
        this.f4498b = c0915u0;
        this.f4499c = o02;
        V1.a aVar = new V1.a();
        C0622g c0622g = AbstractC0623h.f9973a;
        long j3 = b1.L.f9943b;
        C0980v c0980v = new C0980v(c0622g, j3, (b1.L) null);
        aVar.f7389o = c0980v;
        aVar.f7390p = new C0966h(c0622g, c0980v.f12385b);
        this.f4500d = aVar;
        Boolean bool = Boolean.FALSE;
        this.f4502f = C0879c.t(bool);
        this.f4503g = C0879c.t(new n1.g(0));
        this.f4504i = C0879c.t(null);
        this.f4506k = C0879c.t(N.f4425o);
        this.l = C0879c.t(bool);
        this.f4507m = C0879c.t(bool);
        this.f4508n = C0879c.t(bool);
        this.f4509o = C0879c.t(bool);
        this.f4510p = true;
        this.f4511q = C0879c.t(Boolean.TRUE);
        this.f4512r = new W(o02);
        this.f4513s = C0879c.t(bool);
        this.f4514t = C0879c.t(bool);
        this.f4515u = new F.g(8);
        this.f4516v = new C0276v(this, 1);
        this.f4517w = new C0276v(this, 2);
        this.f4518x = new C0276v(this, 3);
        this.f4519y = AbstractC1959I.g();
        this.f4520z = C1987t.f20262j;
        this.f4495A = C0879c.t(new b1.L(j3));
        this.f4496B = C0879c.t(new b1.L(j3));
    }

    public final N a() {
        return (N) this.f4506k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f4502f.getValue()).booleanValue();
    }

    public final O0.C c() {
        O0.C c7 = this.h;
        if (c7 == null || !c7.y()) {
            return null;
        }
        return c7;
    }

    public final E0 d() {
        return (E0) this.f4504i.getValue();
    }

    public final void e(long j3) {
        this.f4496B.setValue(new b1.L(j3));
    }

    public final void f(long j3) {
        this.f4495A.setValue(new b1.L(j3));
    }
}
