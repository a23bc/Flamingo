package O0;

import G1.InterfaceC0147n;
import android.os.Build;
import android.view.View;
import f0.C0888g0;
import java.util.List;
import java.util.WeakHashMap;
import m5.AbstractC1209k;
import t.C1444F;
import y1.C1993b;

/* JADX INFO: renamed from: O0.x */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0326x extends G1.P implements Runnable, InterfaceC0147n, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: q */
    public boolean f5466q;

    /* JADX INFO: renamed from: r */
    public int f5467r;

    /* JADX INFO: renamed from: s */
    public G1.m0 f5468s;

    /* JADX INFO: renamed from: t */
    public final t.J f5469t;

    /* JADX INFO: renamed from: u */
    public final C0888g0 f5470u;

    /* JADX INFO: renamed from: v */
    public final C1444F f5471v;

    /* JADX INFO: renamed from: w */
    public final p0.p f5472w;

    public RunnableC0326x() {
        super(1);
        t.J j3 = new t.J(9);
        G0.f5303a.getClass();
        j3.m(F0.f5295b, new I0("caption bar"));
        j3.m(F0.f5296c, new I0("display cutout"));
        j3.m(F0.f5297d, new I0("ime"));
        j3.m(F0.f5298e, new I0("mandatory system gestures"));
        j3.m(F0.f5299f, new I0("navigation bars"));
        j3.m(F0.f5300g, new I0("status bars"));
        j3.m(F0.h, new I0("system gestures"));
        j3.m(F0.f5301i, new I0("tappable element"));
        j3.m(F0.f5302j, new I0("waterfall"));
        this.f5469t = j3;
        this.f5470u = new C0888g0(0);
        this.f5471v = new C1444F(4);
        this.f5472w = new p0.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:264:0x031d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(G1.m0 r34) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.RunnableC0326x.C(G1.m0):void");
    }

    @Override // G1.P
    public final void d(G1.Z z6) {
        boolean z7 = false;
        this.f5466q = false;
        int iD = z6.f2681a.d();
        this.f5467r &= ~iD;
        this.f5468s = null;
        G0 g02 = (G0) androidx.compose.ui.layout.b.f9321c.b(iD);
        if (g02 != null) {
            Object objG = this.f5469t.g(g02);
            AbstractC1209k.c(objG);
            I0 i02 = (I0) objG;
            i02.f5312c.j(0.0f);
            i02.f5314e.j(1.0f);
            i02.f5313d.j(0L);
            i02.f5312c.j(0.0f);
            i02.f5311b.setValue(Boolean.FALSE);
            i02.f5318j = -1L;
            i02.f5319k = -1L;
            C0888g0 c0888g0 = this.f5470u;
            c0888g0.j(c0888g0.h() + 1);
            synchronized (p0.l.f14941c) {
                t.K k7 = p0.l.f14947j.h;
                if (k7 != null) {
                    if (k7.h()) {
                        z7 = true;
                    }
                }
            }
            if (z7) {
                p0.l.a();
            }
        }
    }

    @Override // G1.P
    public final void e(G1.Z z6) {
        this.f5466q = true;
    }

    @Override // G1.P
    public final G1.m0 f(G1.m0 m0Var, List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            G1.Z z6 = (G1.Z) list.get(i7);
            G0 g02 = (G0) androidx.compose.ui.layout.b.f9321c.b(z6.f2681a.d());
            if (g02 != null) {
                Object objG = this.f5469t.g(g02);
                AbstractC1209k.c(objG);
                I0 i02 = (I0) objG;
                if (((Boolean) i02.f5311b.getValue()).booleanValue()) {
                    i02.f5312c.j(z6.f2681a.c());
                    G1.Y y6 = z6.f2681a;
                    y6.getClass();
                    i02.f5314e.j(0.0f);
                    i02.f5313d.j(y6.a());
                }
            }
        }
        C(m0Var);
        return m0Var;
    }

    @Override // G1.P
    public final V.o g(G1.Z z6, V.o oVar) {
        G1.m0 m0Var = this.f5468s;
        boolean z7 = false;
        this.f5466q = false;
        this.f5468s = null;
        if (z6.f2681a.a() > 0 && m0Var != null) {
            int iD = z6.f2681a.d();
            this.f5467r |= iD;
            G0 g02 = (G0) androidx.compose.ui.layout.b.f9321c.b(iD);
            if (g02 != null) {
                Object objG = this.f5469t.g(g02);
                AbstractC1209k.c(objG);
                I0 i02 = (I0) objG;
                C1993b c1993bG = m0Var.f2725a.g(iD);
                long j3 = (((long) c1993bG.f20271a) << 48) | (((long) c1993bG.f20272b) << 32) | (((long) c1993bG.f20273c) << 16) | ((long) c1993bG.f20274d);
                long j7 = i02.h;
                if (!w0.h(j3, j7)) {
                    i02.f5318j = j7;
                    i02.f5319k = j3;
                    i02.f5311b.setValue(Boolean.TRUE);
                    i02.f5312c.j(z6.f2681a.c());
                    G1.Y y6 = z6.f2681a;
                    y6.getClass();
                    i02.f5314e.j(0.0f);
                    i02.f5313d.j(y6.a());
                    C0888g0 c0888g0 = this.f5470u;
                    c0888g0.j(c0888g0.h() + 1);
                    synchronized (p0.l.f14941c) {
                        t.K k7 = p0.l.f14947j.h;
                        if (k7 != null) {
                            if (k7.h()) {
                                z7 = true;
                            }
                        }
                    }
                    if (z7) {
                        p0.l.a();
                        return oVar;
                    }
                }
            }
        }
        return oVar;
    }

    @Override // G1.InterfaceC0147n
    public final G1.m0 j(View view, G1.m0 m0Var) {
        if (this.f5466q) {
            this.f5468s = m0Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return m0Var;
            }
        } else if (this.f5467r == 0) {
            C(m0Var);
        }
        return m0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = G1.I.f2641a;
        G1.B.h(view, this);
        G1.I.j(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = G1.I.f2641a;
        G1.B.h(view, null);
        G1.I.j(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5466q) {
            this.f5467r = 0;
            this.f5466q = false;
            G1.m0 m0Var = this.f5468s;
            if (m0Var != null) {
                C(m0Var);
                this.f5468s = null;
            }
        }
    }
}
