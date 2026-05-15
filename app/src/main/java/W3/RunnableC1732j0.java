package w3;

import android.os.RemoteException;
import java.util.Set;
import k.C1116d;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: w3.j0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1732j0 implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f19229o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean f19230p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f19231q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f19232r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f19233s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f19234t;

    public /* synthetic */ RunnableC1732j0(Object obj, Object obj2, Object obj3, Object obj4, boolean z6, int i7) {
        this.f19229o = i7;
        this.f19231q = obj;
        this.f19232r = obj2;
        this.f19233s = obj3;
        this.f19234t = obj4;
        this.f19230p = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19229o) {
            case 0:
                C1116d c1116d = (C1116d) this.f19231q;
                A2.F f7 = (A2.F) this.f19234t;
                InterfaceC1730i0 interfaceC1730i0 = (InterfaceC1730i0) c1116d.f13885d;
                C1751t0 c1751t0 = (C1751t0) this.f19232r;
                ((C2.O) c1116d.f13888g).execute(new RunnableC1734k0(c1116d, c1751t0, interfaceC1730i0.a(c1751t0, (E4.I) this.f19233s, (C1.k) c1116d.f13886e, f7), this.f19230p));
                return;
            default:
                x3.f0 f0Var = (x3.f0) this.f19233s;
                C1725g c1725g = (C1725g) this.f19234t;
                boolean z6 = this.f19230p;
                M0 m02 = (M0) this.f19231q;
                Set set = m02.f19019f;
                InterfaceC1737m interfaceC1737m = (InterfaceC1737m) this.f19232r;
                set.remove(interfaceC1737m);
                boolean z7 = true;
                try {
                    N0 n02 = (N0) m02.f19016c.get();
                    if (n02 != null) {
                        C1747r0 c1747r0 = new C1747r0(f0Var, c1725g.f19189a, c1725g.f19190b, z6, new e1(interfaceC1737m), c1725g.f19193e);
                        try {
                            C1751t0 c1751t02 = b6.i.f10425e;
                            if (c1751t02 != null) {
                                n02.a(c1751t02);
                                z7 = false;
                                c1751t02.f19363a.f18904g.o1(interfaceC1737m, c1747r0);
                                break;
                            }
                        } catch (Exception e7) {
                            AbstractC1697a.x("Failed to add a session to session service", e7);
                            break;
                        }
                        if (!z7) {
                            return;
                        }
                    }
                    try {
                        interfaceC1737m.a();
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                } catch (Throwable th) {
                    if (z7) {
                        try {
                            interfaceC1737m.a();
                            break;
                        } catch (RemoteException unused2) {
                        }
                    }
                    throw th;
                }
        }
    }
}
