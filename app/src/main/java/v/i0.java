package v;

import androidx.compose.animation.SharedBoundsNodeElement;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.AbstractC1223y;
import r0.InterfaceC1398p;
import w.C1662K;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends AbstractC1210l implements l5.f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f0 f18102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1592J f18103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k0 f18104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m0 f18105s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0 f18106t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f0 f0Var, C1592J c1592j, k0 k0Var, m0 m0Var, l0 l0Var) {
        super(3);
        this.f18102p = f0Var;
        this.f18103q = c1592j;
        this.f18104r = k0Var;
        this.f18105s = m0Var;
        this.f18106t = l0Var;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        InterfaceC1398p interfaceC1398p = (InterfaceC1398p) obj;
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        c0912t.X(-1843478929);
        f0 f0Var = this.f18102p;
        f0Var.getClass();
        c0912t.U(-359675295, "album");
        Object objK = c0912t.K();
        Object obj4 = C0903o.f11850a;
        k0 k0Var = this.f18104r;
        if (objK == obj4) {
            t.J j3 = k0Var.f18119w;
            Object a0Var = (a0) j3.g("album");
            if (a0Var == null) {
                a0Var = new a0(k0Var);
                j3.m("album", a0Var);
            }
            objK = a0Var;
            c0912t.i0(objK);
        }
        a0 a0Var2 = (a0) objK;
        c0912t.U(-359672306, null);
        C1592J c1592j = this.f18103q;
        c0912t.X(1735245009);
        AbstractC1223y.c(1, c1592j);
        Boolean boolValueOf = Boolean.valueOf(c1592j.f17982q);
        boolean zBooleanValue = boolValueOf.booleanValue();
        Object objK2 = c0912t.K();
        if (objK2 == obj4) {
            if (a0Var2.a() != null) {
                zBooleanValue = !zBooleanValue;
            }
            objK2 = new C1662K(Boolean.valueOf(zBooleanValue));
            c0912t.i0(objK2);
        }
        C1662K c1662k = (C1662K) objK2;
        c1662k.f18536c.setValue(boolValueOf);
        int i7 = w.m0.f18715a;
        boolean zF = c0912t.f(c1662k);
        Object objK3 = c0912t.K();
        if (zF || objK3 == obj4) {
            objK3 = new w.j0(c1662k, null, null);
            c0912t.i0(objK3);
        }
        w.j0 j0Var = (w.j0) objK3;
        c0912t.X(1030744251);
        j0Var.a(c1662k.f18536c.getValue(), c0912t, 0);
        c0912t.p(false);
        boolean zF2 = c0912t.f(j0Var);
        Object objK4 = c0912t.K();
        if (zF2 || objK4 == obj4) {
            objK4 = new C1587E(j0Var, 1);
            c0912t.i0(objK4);
        }
        C0879c.d(j0Var, (InterfaceC1182c) objK4, c0912t);
        c0912t.p(false);
        c0912t.U(-359633642, Boolean.valueOf(k0Var.b()));
        w.c0 c0VarB = w.m0.b(j0Var, w.p0.f18734i, null, c0912t, 0, 2);
        c0912t.p(false);
        boolean zF3 = c0912t.f(j0Var);
        Object objK5 = c0912t.K();
        l0 l0Var = this.f18106t;
        if (zF3 || objK5 == obj4) {
            objK5 = new C1629z(k0Var, j0Var, c0VarB, l0Var);
            c0912t.i0(objK5);
        }
        C1629z c1629z = (C1629z) objK5;
        if (!AbstractC1209k.a((w.c0) c1629z.f18197c.getValue(), c0VarB)) {
            c1629z.f18197c.setValue(c0VarB);
            c1629z.f18200f.setValue(null);
            c1629z.f18199e = AbstractC1583A.f17944a;
        }
        c1629z.f18198d.setValue(l0Var);
        c0912t.p(false);
        Object objK6 = c0912t.K();
        c0 c0Var = c0.f18063b;
        m0 m0Var = this.f18105s;
        if (objK6 == obj4) {
            objK6 = new b0(a0Var2, c1629z, m0Var, f0Var);
            c0912t.i0(objK6);
        }
        b0 b0Var = (b0) objK6;
        f0Var.f18085a.setValue(b0Var);
        b0Var.f18036q.setValue(a0Var2);
        Boolean bool = Boolean.TRUE;
        b0Var.f18039t.setValue(bool);
        b0Var.f18037r.setValue(c1629z);
        b0Var.f18038s.setValue(c0Var);
        b0Var.f18040u.setValue(m0Var);
        b0Var.f18034o.j(0.0f);
        b0Var.f18035p.setValue(bool);
        b0Var.f18041v.setValue(f0Var);
        c0912t.p(false);
        InterfaceC1398p interfaceC1398pF = interfaceC1398p.f(new SharedBoundsNodeElement(b0Var));
        c0912t.p(false);
        return interfaceC1398pF;
    }
}
