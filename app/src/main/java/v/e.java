package V;

import K0.E;
import M.C0265j;
import M.C0276v;
import M.k0;
import Q0.AbstractC0347f;
import R0.AbstractC0403q0;
import R0.C0404r0;
import R0.O0;
import android.graphics.Rect;
import android.view.View;
import b1.C0613I;
import b1.L;
import g1.C0969k;
import g1.C0980v;
import g1.InterfaceC0975q;
import java.lang.ref.WeakReference;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import w5.AbstractC1767D;
import w5.EnumC1766C;
import w5.InterfaceC1765B;
import w5.w0;
import x0.C1893c;
import z5.y;
import z5.z;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0975q {

    /* JADX INFO: renamed from: a */
    public q f7314a;

    /* JADX INFO: renamed from: b */
    public w0 f7315b;

    /* JADX INFO: renamed from: c */
    public u f7316c;

    /* JADX INFO: renamed from: d */
    public y f7317d;

    @Override // g1.InterfaceC0975q
    public final void a(C0980v c0980v, C0980v c0980v2) {
        u uVar = this.f7316c;
        if (uVar != null) {
            boolean z6 = (L.b(uVar.h.f12385b, c0980v2.f12385b) && AbstractC1209k.a(uVar.h.f12386c, c0980v2.f12386c)) ? false : true;
            uVar.h = c0980v2;
            int size = uVar.f7376j.size();
            for (int i7 = 0; i7 < size; i7++) {
                v vVar = (v) ((WeakReference) uVar.f7376j.get(i7)).get();
                if (vVar != null) {
                    vVar.f7385g = c0980v2;
                }
            }
            r rVar = uVar.f7378m;
            synchronized (rVar.f7353c) {
                rVar.f7359j = null;
                rVar.l = null;
                rVar.f7360k = null;
                rVar.f7361m = null;
                rVar.f7362n = null;
            }
            if (AbstractC1209k.a(c0980v, c0980v2)) {
                if (z6) {
                    o oVar = uVar.f7369b;
                    int iF = L.f(c0980v2.f12385b);
                    int iE = L.e(c0980v2.f12385b);
                    L l = uVar.h.f12386c;
                    int iF2 = l != null ? L.f(l.f9945a) : -1;
                    L l7 = uVar.h.f12386c;
                    oVar.r().updateSelection((View) oVar.f7342p, iF, iE, iF2, l7 != null ? L.e(l7.f9945a) : -1);
                    return;
                }
                return;
            }
            if (c0980v != null && (!AbstractC1209k.a(c0980v.f12384a.f9970p, c0980v2.f12384a.f9970p) || (L.b(c0980v.f12385b, c0980v2.f12385b) && !AbstractC1209k.a(c0980v.f12386c, c0980v2.f12386c)))) {
                o oVar2 = uVar.f7369b;
                oVar2.r().restartInput((View) oVar2.f7342p);
                return;
            }
            int size2 = uVar.f7376j.size();
            for (int i8 = 0; i8 < size2; i8++) {
                v vVar2 = (v) ((WeakReference) uVar.f7376j.get(i8)).get();
                if (vVar2 != null) {
                    C0980v c0980v3 = uVar.h;
                    o oVar3 = uVar.f7369b;
                    if (vVar2.f7388k) {
                        vVar2.f7385g = c0980v3;
                        if (vVar2.f7386i) {
                            oVar3.r().updateExtractedText((View) oVar3.f7342p, vVar2.h, AbstractC1267a.j(c0980v3));
                        }
                        L l8 = c0980v3.f12386c;
                        int iF3 = l8 != null ? L.f(l8.f9945a) : -1;
                        L l9 = c0980v3.f12386c;
                        int iE2 = l9 != null ? L.e(l9.f9945a) : -1;
                        long j3 = c0980v3.f12385b;
                        oVar3.r().updateSelection((View) oVar3.f7342p, L.f(j3), L.e(j3), iF3, iE2);
                    }
                }
            }
        }
    }

    @Override // g1.InterfaceC0975q
    public final void b(C0980v c0980v, B2.m mVar, C0613I c0613i, E e7, C1893c c1893c, C1893c c1893c2) {
        u uVar = this.f7316c;
        if (uVar != null) {
            r rVar = uVar.f7378m;
            synchronized (rVar.f7353c) {
                try {
                    rVar.f7359j = c0980v;
                    rVar.l = mVar;
                    rVar.f7360k = c0613i;
                    rVar.f7361m = c1893c;
                    rVar.f7362n = c1893c2;
                    if (rVar.f7355e || rVar.f7354d) {
                        rVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // g1.InterfaceC0975q
    public final void c(C1893c c1893c) {
        Rect rect;
        u uVar = this.f7316c;
        if (uVar != null) {
            uVar.l = new Rect(AbstractC1267a.H(c1893c.f19869a), AbstractC1267a.H(c1893c.f19870b), AbstractC1267a.H(c1893c.f19871c), AbstractC1267a.H(c1893c.f19872d));
            if (!uVar.f7376j.isEmpty() || (rect = uVar.l) == null) {
                return;
            }
            uVar.f7368a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // g1.InterfaceC0975q
    public final void d() {
        j(null);
    }

    @Override // g1.InterfaceC0975q
    public final void e() {
        O0 o02;
        q qVar = this.f7314a;
        if (qVar == null || (o02 = (O0) AbstractC0347f.i(qVar, AbstractC0403q0.f6515p)) == null) {
            return;
        }
        ((C0404r0) o02).b();
    }

    @Override // g1.InterfaceC0975q
    public final void f() {
        O0 o02;
        q qVar = this.f7314a;
        if (qVar == null || (o02 = (O0) AbstractC0347f.i(qVar, AbstractC0403q0.f6515p)) == null) {
            return;
        }
        ((C0404r0) o02).a();
    }

    @Override // g1.InterfaceC0975q
    public final void g() {
        w0 w0Var = this.f7315b;
        if (w0Var != null) {
            w0Var.c(null);
        }
        this.f7315b = null;
        z5.r rVarI = i();
        if (rVarI != null) {
            y yVar = (y) rVarI;
            synchronized (yVar) {
                yVar.u(yVar.o() + ((long) yVar.f21342y), yVar.f21341x, yVar.o() + ((long) yVar.f21342y), yVar.o() + ((long) yVar.f21342y) + ((long) yVar.f21343z));
            }
        }
    }

    @Override // g1.InterfaceC0975q
    public final void h(C0980v c0980v, C0969k c0969k, C0265j c0265j, C0276v c0276v) {
        j(new k0(c0980v, this, c0969k, c0265j, c0276v));
    }

    public final z5.r i() {
        y yVar = this.f7317d;
        if (yVar != null) {
            return yVar;
        }
        if (!U.c.f7025a) {
            return null;
        }
        y yVarA = z.a(2, y5.a.f20530q);
        this.f7317d = yVarA;
        return yVarA;
    }

    public final void j(k0 k0Var) {
        q qVar = this.f7314a;
        if (qVar == null) {
            return;
        }
        w0 w0VarT = null;
        d dVar = new d(k0Var, this, qVar, null);
        if (qVar.f15636B) {
            InterfaceC1765B interfaceC1765BN0 = qVar.n0();
            EnumC1766C enumC1766C = EnumC1766C.f19467o;
            w0VarT = AbstractC1767D.t(interfaceC1765BN0, null, new p(qVar, dVar, null), 1);
        }
        this.f7315b = w0VarT;
    }

    public final void k(q qVar) {
        if (this.f7314a != qVar) {
            C.b.c("Expected textInputModifierNode to be " + qVar + " but was " + this.f7314a);
        }
        this.f7314a = null;
    }
}
