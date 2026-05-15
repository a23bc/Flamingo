package w;

import f0.C0879c;
import f0.C0886f0;
import f0.C0890h0;
import f0.C0894j0;
import f0.Z0;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Z0 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ j0 f18663A;

    /* JADX INFO: renamed from: o */
    public final o0 f18664o;

    /* JADX INFO: renamed from: p */
    public final C0894j0 f18665p;

    /* JADX INFO: renamed from: q */
    public final C0894j0 f18666q;

    /* JADX INFO: renamed from: r */
    public final C0894j0 f18667r;

    /* JADX INFO: renamed from: s */
    public final C0894j0 f18668s;

    /* JADX INFO: renamed from: t */
    public final C0886f0 f18669t;

    /* JADX INFO: renamed from: u */
    public boolean f18670u;

    /* JADX INFO: renamed from: v */
    public final C0894j0 f18671v;

    /* JADX INFO: renamed from: w */
    public r f18672w;

    /* JADX INFO: renamed from: x */
    public final C0890h0 f18673x;

    /* JADX INFO: renamed from: y */
    public boolean f18674y;

    /* JADX INFO: renamed from: z */
    public final S f18675z;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public f0(j0 j0Var, Object obj, r rVar, o0 o0Var) {
        this.f18663A = j0Var;
        this.f18664o = o0Var;
        C0894j0 c0894j0T = C0879c.t(obj);
        this.f18665p = c0894j0T;
        Object objB = null;
        C0894j0 c0894j0T2 = C0879c.t(AbstractC1671d.k(0.0f, 0.0f, null, 7));
        this.f18666q = c0894j0T2;
        this.f18667r = C0879c.t(new a0((InterfaceC1652A) c0894j0T2.getValue(), o0Var, obj, c0894j0T.getValue(), rVar));
        this.f18668s = C0879c.t(Boolean.TRUE);
        this.f18669t = new C0886f0(-1.0f);
        this.f18671v = C0879c.t(obj);
        this.f18672w = rVar;
        this.f18673x = new C0890h0(b().c());
        Float f7 = (Float) t0.f18747b.get(o0Var);
        if (f7 != null) {
            float fFloatValue = f7.floatValue();
            r rVar2 = (r) o0Var.f18722a.b(obj);
            int iB = rVar2.b();
            for (int i7 = 0; i7 < iB; i7++) {
                rVar2.e(i7, fFloatValue);
            }
            objB = this.f18664o.f18723b.b(rVar2);
        }
        this.f18675z = AbstractC1671d.k(0.0f, 0.0f, objB, 3);
    }

    public final a0 b() {
        return (a0) this.f18667r.getValue();
    }

    public final void c() {
        if (this.f18669t.h() == -1.0f) {
            this.f18674y = true;
            boolean zA = AbstractC1209k.a(b().f18610c, b().f18611d);
            C0894j0 c0894j0 = this.f18671v;
            if (zA) {
                c0894j0.setValue(b().f18610c);
            } else {
                c0894j0.setValue(b().b(0L));
                this.f18672w = b().f(0L);
            }
        }
    }

    public final void d(Object obj, boolean z6) {
        C0894j0 c0894j0 = this.f18665p;
        boolean zA = AbstractC1209k.a(null, c0894j0.getValue());
        C0890h0 c0890h0 = this.f18673x;
        C0894j0 c0894j02 = this.f18667r;
        InterfaceC1652A interfaceC1652A = this.f18675z;
        if (zA) {
            c0894j02.setValue(new a0(interfaceC1652A, this.f18664o, obj, obj, this.f18672w.c()));
            this.f18670u = true;
            c0890h0.j(b().c());
            return;
        }
        C0894j0 c0894j03 = this.f18666q;
        if (!z6 || this.f18674y || (((InterfaceC1652A) c0894j03.getValue()) instanceof S)) {
            interfaceC1652A = (InterfaceC1652A) c0894j03.getValue();
        }
        j0 j0Var = this.f18663A;
        long jMax = 0;
        c0894j02.setValue(new a0(j0Var.e() <= 0 ? interfaceC1652A : new T(interfaceC1652A, j0Var.e()), this.f18664o, obj, c0894j0.getValue(), this.f18672w));
        c0890h0.j(b().c());
        this.f18670u = false;
        Boolean bool = Boolean.TRUE;
        C0894j0 c0894j04 = j0Var.h;
        c0894j04.setValue(bool);
        if (j0Var.g()) {
            p0.p pVar = j0Var.f18695i;
            int size = pVar.size();
            for (int i7 = 0; i7 < size; i7++) {
                f0 f0Var = (f0) pVar.get(i7);
                jMax = Math.max(jMax, f0Var.f18673x.h());
                f0Var.c();
            }
            c0894j04.setValue(Boolean.FALSE);
        }
    }

    public final void e(Object obj, Object obj2, InterfaceC1652A interfaceC1652A) {
        this.f18665p.setValue(obj2);
        this.f18666q.setValue(interfaceC1652A);
        if (AbstractC1209k.a(b().f18611d, obj) && AbstractC1209k.a(b().f18610c, obj2)) {
            return;
        }
        d(obj, false);
    }

    public final void f(Object obj, InterfaceC1652A interfaceC1652A) {
        if (this.f18670u && AbstractC1209k.a(obj, null)) {
            return;
        }
        C0894j0 c0894j0 = this.f18665p;
        boolean zA = AbstractC1209k.a(c0894j0.getValue(), obj);
        C0886f0 c0886f0 = this.f18669t;
        if (zA && c0886f0.h() == -1.0f) {
            return;
        }
        c0894j0.setValue(obj);
        this.f18666q.setValue(interfaceC1652A);
        float fH = c0886f0.h();
        C0894j0 c0894j02 = this.f18671v;
        Object value = fH == -3.0f ? obj : c0894j02.getValue();
        C0894j0 c0894j03 = this.f18668s;
        d(value, !((Boolean) c0894j03.getValue()).booleanValue());
        c0894j03.setValue(Boolean.valueOf(c0886f0.h() == -3.0f));
        if (c0886f0.h() >= 0.0f) {
            c0894j02.setValue(b().b((long) (c0886f0.h() * b().c())));
        } else if (c0886f0.h() == -3.0f) {
            c0894j02.setValue(obj);
        }
        this.f18670u = false;
        c0886f0.j(-1.0f);
    }

    @Override // f0.Z0
    public final Object getValue() {
        return this.f18671v.getValue();
    }

    public final String toString() {
        return "current value: " + this.f18671v.getValue() + ", target: " + this.f18665p.getValue() + ", spec: " + ((InterfaceC1652A) this.f18666q.getValue());
    }
}
