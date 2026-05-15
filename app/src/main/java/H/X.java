package H;

import j5.AbstractC1110d;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f2829a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D2.B f2831c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2834f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.b f2830b = new A0.b(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2832d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2833e = -1;

    public X(InterfaceC1182c interfaceC1182c) {
        this.f2829a = interfaceC1182c;
    }

    public final W a(int i7, long j3, boolean z6, InterfaceC1182c interfaceC1182c) {
        D2.B b7 = this.f2831c;
        if (b7 == null) {
            return C0166h.f2877a;
        }
        k0 k0Var = (k0) b7.f1461r;
        boolean z7 = k0Var instanceof ViewOnAttachStateChangeListenerC0160b;
        j0 j0Var = new j0(b7, i7, this.f2830b, interfaceC1182c);
        j0Var.f2893d = new n1.a(j3);
        if (!z7) {
            k0Var.a(j0Var);
        } else if (z6) {
            ViewOnAttachStateChangeListenerC0160b viewOnAttachStateChangeListenerC0160b = (ViewOnAttachStateChangeListenerC0160b) k0Var;
            viewOnAttachStateChangeListenerC0160b.f2843p.add(new n0(1, j0Var));
            if (!viewOnAttachStateChangeListenerC0160b.f2844q) {
                viewOnAttachStateChangeListenerC0160b.f2844q = true;
                viewOnAttachStateChangeListenerC0160b.f2842o.post(viewOnAttachStateChangeListenerC0160b);
            }
        } else {
            ViewOnAttachStateChangeListenerC0160b viewOnAttachStateChangeListenerC0160b2 = (ViewOnAttachStateChangeListenerC0160b) k0Var;
            viewOnAttachStateChangeListenerC0160b2.f2843p.add(new n0(0, j0Var));
            if (!viewOnAttachStateChangeListenerC0160b2.f2844q) {
                viewOnAttachStateChangeListenerC0160b2.f2844q = true;
                viewOnAttachStateChangeListenerC0160b2.f2842o.post(viewOnAttachStateChangeListenerC0160b2);
            }
        }
        AbstractC1110d.K("compose:lazy:schedule_prefetch:index", i7);
        return j0Var;
    }
}
