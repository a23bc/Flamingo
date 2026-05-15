package q1;

import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.s0;
import R0.C0415x;
import android.view.View;
import android.view.ViewTreeObserver;
import r0.AbstractC1397o;
import w0.u;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC1397o implements w0.o, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f15515C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ViewTreeObserver f15516D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final n f15517E = new n(this, 0);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final n f15518F = new n(this, 1);

    public final u B0() {
        if (!this.f15637o.f15636B) {
            N0.a.b("visitLocalDescendants called on an unattached node");
        }
        AbstractC1397o abstractC1397o = this.f15637o;
        if ((abstractC1397o.f15640r & 1024) != 0) {
            boolean z6 = false;
            for (AbstractC1397o abstractC1397o2 = abstractC1397o.f15642t; abstractC1397o2 != null; abstractC1397o2 = abstractC1397o2.f15642t) {
                if ((abstractC1397o2.f15639q & 1024) != 0) {
                    AbstractC1397o abstractC1397oF = abstractC1397o2;
                    h0.e eVar = null;
                    while (abstractC1397oF != null) {
                        if (abstractC1397oF instanceof u) {
                            u uVar = (u) abstractC1397oF;
                            if (z6) {
                                return uVar;
                            }
                            z6 = true;
                        } else if ((abstractC1397oF.f15639q & 1024) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                            int i7 = 0;
                            for (AbstractC1397o abstractC1397o3 = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o3 != null; abstractC1397o3 = abstractC1397o3.f15642t) {
                                if ((abstractC1397o3.f15639q & 1024) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        abstractC1397oF = abstractC1397o3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new h0.e(new AbstractC1397o[16]);
                                        }
                                        if (abstractC1397oF != null) {
                                            eVar.b(abstractC1397oF);
                                            abstractC1397oF = null;
                                        }
                                        eVar.b(abstractC1397o3);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        abstractC1397oF = AbstractC0347f.f(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // w0.o
    public final void G(w0.l lVar) {
        lVar.c(false);
        lVar.d(this.f15517E);
        lVar.a(this.f15518F);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC0347f.x(this).f5803B == null) {
            return;
        }
        View viewC = k.c(this);
        w0.i focusOwner = ((C0415x) AbstractC0347f.y(this)).getFocusOwner();
        s0 s0VarY = AbstractC0347f.y(this);
        boolean z6 = (view == null || view.equals(s0VarY) || !k.a(viewC, view)) ? false : true;
        boolean z7 = (view2 == null || view2.equals(s0VarY) || !k.a(viewC, view2)) ? false : true;
        if (z6 && z7) {
            this.f15515C = view2;
            return;
        }
        if (z7) {
            this.f15515C = view2;
            u uVarB0 = B0();
            if (uVarB0.D0().a()) {
                return;
            }
            w0.f.v(uVarB0);
            return;
        }
        if (!z6) {
            this.f15515C = null;
            return;
        }
        this.f15515C = null;
        if (B0().D0().b()) {
            ((w0.k) focusOwner).b(8, false, false);
        }
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        ViewTreeObserver viewTreeObserver = AbstractC0347f.z(this).getViewTreeObserver();
        this.f15516D = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        ViewTreeObserver viewTreeObserver = this.f15516D;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f15516D = null;
        AbstractC0347f.z(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f15515C = null;
    }
}
