package r0;

import K0.C0236d;
import K0.x;
import Q0.AbstractC0347f;
import Q0.InterfaceC0357m;
import Q0.j0;
import Q0.o0;
import R0.C0415x;
import w5.AbstractC1767D;
import w5.C1792j0;
import w5.C1806y;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;
import x.C1883w;

/* JADX INFO: renamed from: r0.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1397o implements InterfaceC0357m {

    /* JADX INFO: renamed from: A */
    public C0236d f15635A;

    /* JADX INFO: renamed from: B */
    public boolean f15636B;

    /* JADX INFO: renamed from: p */
    public B5.d f15638p;

    /* JADX INFO: renamed from: q */
    public int f15639q;

    /* JADX INFO: renamed from: s */
    public AbstractC1397o f15641s;

    /* JADX INFO: renamed from: t */
    public AbstractC1397o f15642t;

    /* JADX INFO: renamed from: u */
    public o0 f15643u;

    /* JADX INFO: renamed from: v */
    public j0 f15644v;

    /* JADX INFO: renamed from: w */
    public boolean f15645w;

    /* JADX INFO: renamed from: x */
    public boolean f15646x;

    /* JADX INFO: renamed from: y */
    public boolean f15647y;

    /* JADX INFO: renamed from: z */
    public boolean f15648z;

    /* JADX INFO: renamed from: o */
    public AbstractC1397o f15637o = this;

    /* JADX INFO: renamed from: r */
    public int f15640r = -1;

    public void A0(j0 j0Var) {
        this.f15644v = j0Var;
    }

    public final InterfaceC1765B n0() {
        B5.d dVar = this.f15638p;
        if (dVar != null) {
            return dVar;
        }
        B5.d dVarA = AbstractC1767D.a(((C0415x) AbstractC0347f.y(this)).getCoroutineContext().h(new C1792j0((InterfaceC1786g0) ((C0415x) AbstractC0347f.y(this)).getCoroutineContext().n(C1806y.f19581p))));
        this.f15638p = dVarA;
        return dVarA;
    }

    public boolean o0() {
        return !(this instanceof C1883w);
    }

    public void p0() {
        if (this.f15636B) {
            N0.a.b("node attached multiple times");
        }
        if (this.f15644v == null) {
            N0.a.b("attach invoked on a node without a coordinator");
        }
        this.f15636B = true;
        this.f15647y = true;
    }

    public void q0() {
        if (!this.f15636B) {
            N0.a.b("Cannot detach a node that is not attached");
        }
        if (this.f15647y) {
            N0.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f15648z) {
            N0.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f15636B = false;
        B5.d dVar = this.f15638p;
        if (dVar != null) {
            AbstractC1767D.f(dVar, new x("The Modifier.Node was detached", 1));
            this.f15638p = null;
        }
    }

    public /* synthetic */ void s0() {
    }

    public /* synthetic */ void u0() {
    }

    public void w0() {
        if (!this.f15636B) {
            N0.a.b("reset() called on an unattached node");
        }
        v0();
    }

    public void x0() {
        if (!this.f15636B) {
            N0.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f15647y) {
            N0.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f15647y = false;
        r0();
        this.f15648z = true;
    }

    public void y0() {
        if (!this.f15636B) {
            N0.a.b("node detached multiple times");
        }
        if (this.f15644v == null) {
            N0.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f15648z) {
            N0.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f15648z = false;
        C0236d c0236d = this.f15635A;
        if (c0236d != null) {
            c0236d.a();
        }
        t0();
    }

    public void z0(AbstractC1397o abstractC1397o) {
        this.f15637o = abstractC1397o;
    }

    public void r0() {
    }

    public void t0() {
    }

    public void v0() {
    }
}
