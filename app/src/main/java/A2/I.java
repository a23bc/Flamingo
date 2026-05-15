package A2;

import G1.C0137d;
import G1.InterfaceC0136c;
import G1.InterfaceC0147n;
import N2.InterfaceC0289f;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.Surface;
import android.view.View;
import d.C0746L;
import f0.InterfaceC0878b0;
import g.InterfaceC0935b;
import java.util.List;
import k.AbstractC1113a;
import k3.C1145a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import q.C1340u;
import t2.C1487p;
import v2.C1636c;
import w2.AbstractC1697a;
import w3.A0;
import w3.B1;
import w3.C1709a;
import w3.C1729i;
import w3.C1747r0;
import w3.C1760y;
import w3.InterfaceC1722e0;
import w3.InterfaceC1741o;
import w3.InterfaceC1746q0;
import w3.InterfaceC1763z0;
import w3.f1;
import w3.h1;
import w3.i1;
import w3.k1;
import w3.r1;
import w3.y1;
import w3.z1;
import y1.C1993b;
import z4.C2091j;
import z4.C2092k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements w2.g, F2.z, J2.l, InterfaceC0289f, InterfaceC0935b, D4.e, w2.c, InterfaceC1722e0, InterfaceC1763z0, h1, f1, InterfaceC0147n {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f79o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f80p;

    public /* synthetic */ I(int i7, Object obj) {
        this.f79o = i7;
        this.f80p = obj;
    }

    private final void l() {
        K0.A a4 = (K0.A) this.f80p;
        synchronized (p0.l.f14941c) {
            p0.l.f14946i = Z4.n.A0((List) p0.l.f14946i, a4);
        }
        p0.l.a();
    }

    @Override // J2.l
    public E4.b0 a(int i7, t2.i0 i0Var, int[] iArr) {
        E4.F fO = E4.I.o();
        int i8 = 0;
        while (i8 < i0Var.f16490a) {
            int i9 = i7;
            t2.i0 i0Var2 = i0Var;
            fO.a(new J2.f(i9, i0Var2, i8, (J2.i) this.f80p, iArr[i8]));
            i8++;
            i7 = i9;
            i0Var = i0Var2;
        }
        return fO.f();
    }

    @Override // D4.e
    public Object apply(Object obj) {
        h3.q qVar = (h3.q) obj;
        ((h3.j) this.f80p).getClass();
        return qVar;
    }

    @Override // w2.g
    public void b(Object obj) {
        switch (this.f79o) {
            case 0:
                ((t2.V) obj).n((C1636c) this.f80p);
                break;
            case 1:
                ((t2.V) obj).R(((K) this.f80p).f83a.f102N);
                break;
            case 2:
                ((t2.V) obj).l((t2.L) this.f80p);
                break;
            case 3:
                ((t2.V) obj).s((List) this.f80p);
                break;
            case 4:
            default:
                ((B2.n) obj).getClass();
                break;
            case 5:
                B2.n nVar = (B2.n) obj;
                int i7 = nVar.f803x;
                C0007h c0007h = (C0007h) this.f80p;
                nVar.f803x = i7 + c0007h.f299g;
                nVar.f804y += c0007h.f297e;
                break;
        }
    }

    @Override // w2.c
    public void c(Object obj) {
        switch (this.f79o) {
            case 16:
                C1145a c1145a = (C1145a) obj;
                k3.h hVar = (k3.h) this.f80p;
                hVar.getClass();
                k3.g gVar = new k3.g(c1145a.f14022b, C0746L.p(c1145a.f14021a, c1145a.f14023c));
                hVar.f14033c.add(gVar);
                long j3 = hVar.f14039j;
                if (j3 == -9223372036854775807L || c1145a.f14022b >= j3) {
                    hVar.d(gVar);
                }
                break;
            case 17:
                ((E4.F) this.f80p).a((C1145a) obj);
                break;
            default:
                ((r1) obj).q((Surface) this.f80p);
                break;
        }
    }

    @Override // g.InterfaceC0935b
    public void d(Object obj) {
        ((InterfaceC1182c) ((InterfaceC0878b0) this.f80p).getValue()).b(obj);
    }

    @Override // w3.InterfaceC1763z0
    public void e(InterfaceC1746q0 interfaceC1746q0, int i7) {
        interfaceC1746q0.d(i7, (E4.I) this.f80p);
    }

    @Override // w3.f1
    public void f(r1 r1Var, C1747r0 c1747r0) {
        ((w2.c) this.f80p).c(r1Var);
    }

    @Override // F2.z
    public int g(Object obj) {
        F2.m mVar = (F2.m) obj;
        mVar.getClass();
        C1487p c1487p = (C1487p) this.f80p;
        String str = c1487p.f16701m;
        String str2 = mVar.f2226b;
        return ((str2.equals(str) || str2.equals(F2.A.b(c1487p))) && mVar.c(c1487p, false)) ? 1 : 0;
    }

    @Override // w3.InterfaceC1722e0
    public void h(w3.U u7) {
        switch (this.f79o) {
            case 21:
                InterfaceC1741o interfaceC1741o = u7.f19079w;
                C1760y c1760y = u7.f19059a;
                if (interfaceC1741o != null) {
                    AbstractC1697a.m("Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    c1760y.a();
                } else {
                    C1729i c1729i = (C1729i) this.f80p;
                    u7.f19079w = c1729i.f19215c;
                    u7.f19073q = c1729i.f19217e;
                    t2.T t7 = c1729i.f19218f;
                    u7.f19074r = t7;
                    t2.T t8 = c1729i.f19219g;
                    u7.f19075s = t8;
                    t2.T tO0 = w3.U.O0(t7, t8);
                    u7.f19076t = tO0;
                    E4.I i7 = c1729i.f19222k;
                    u7.f19071o = i7;
                    u7.f19072p = C1709a.a(i7, u7.f19073q, tO0);
                    u7.f19070n = c1729i.f19221j;
                    try {
                        c1729i.f19215c.asBinder().linkToDeath(u7.f19065g, 0);
                        B1 b12 = u7.f19063e;
                        u7.f19068k = new B1(b12.f18932a.b(), c1729i.f19213a, c1729i.f19214b, b12.f18932a.n(), c1729i.f19215c, c1729i.h);
                        c1760y.P0();
                    } catch (RemoteException unused) {
                        c1760y.a();
                        return;
                    }
                }
                break;
            default:
                if (u7.H0() && u7.f19067j.isEmpty()) {
                    y1 y1Var = u7.f19070n.f19291c;
                    long j3 = y1Var.f19420c;
                    y1 y1Var2 = (y1) this.f80p;
                    if (j3 < y1Var2.f19420c && k1.d(y1Var2, y1Var)) {
                        u7.f19070n = u7.f19070n.j(y1Var2);
                        break;
                    }
                }
                break;
        }
    }

    @Override // w3.h1
    public Object i(A0 a0, C1747r0 c1747r0, int i7) {
        I4.v vVar = I4.v.f3536p;
        if (!a0.h()) {
            ((f1) this.f80p).f(a0.f18914s, c1747r0);
            i1.v1(c1747r0, i7, new z1(0));
        }
        return I4.v.f3536p;
    }

    @Override // G1.InterfaceC0147n
    public G1.m0 j(View view, G1.m0 m0Var) {
        C2092k c2092k = (C2092k) this.f80p;
        AbstractC1209k.f(c2092k, "$windowInsets");
        AbstractC1209k.f(view, "<anonymous parameter 0>");
        C2091j c2091j = c2092k.f21228d;
        U3.h hVar = c2091j.f21221p;
        G1.j0 j0Var = m0Var.f2725a;
        C1993b c1993bG = j0Var.g(1);
        AbstractC1209k.e(c1993bG, "wic.getInsets(WindowInse…Compat.Type.statusBars())");
        AbstractC1113a.O(hVar, c1993bG);
        c2091j.d(j0Var.q(1));
        C2091j c2091j2 = c2092k.f21227c;
        U3.h hVar2 = c2091j2.f21221p;
        C1993b c1993bG2 = j0Var.g(2);
        AbstractC1209k.e(c1993bG2, "wic.getInsets(WindowInse…at.Type.navigationBars())");
        AbstractC1113a.O(hVar2, c1993bG2);
        c2091j2.d(j0Var.q(2));
        C2091j c2091j3 = c2092k.f21226b;
        U3.h hVar3 = c2091j3.f21221p;
        C1993b c1993bG3 = j0Var.g(16);
        AbstractC1209k.e(c1993bG3, "wic.getInsets(WindowInse…at.Type.systemGestures())");
        AbstractC1113a.O(hVar3, c1993bG3);
        c2091j3.d(j0Var.q(16));
        C2091j c2091j4 = c2092k.f21229e;
        U3.h hVar4 = c2091j4.f21221p;
        C1993b c1993bG4 = j0Var.g(8);
        AbstractC1209k.e(c1993bG4, "wic.getInsets(WindowInsetsCompat.Type.ime())");
        AbstractC1113a.O(hVar4, c1993bG4);
        c2091j4.d(j0Var.q(8));
        C2091j c2091j5 = c2092k.f21230f;
        U3.h hVar5 = c2091j5.f21221p;
        C1993b c1993bG5 = j0Var.g(128);
        AbstractC1209k.e(c1993bG5, "wic.getInsets(WindowInse…pat.Type.displayCutout())");
        AbstractC1113a.O(hVar5, c1993bG5);
        c2091j5.d(j0Var.q(128));
        return G1.m0.f2724b;
    }

    public void k() {
        switch (this.f79o) {
            case 19:
                l();
                return;
            default:
                l5.e eVar = (l5.e) this.f80p;
                synchronized (p0.l.f14941c) {
                    p0.l.h = Z4.n.A0((List) p0.l.h, eVar);
                }
                return;
        }
    }

    public boolean m(A.b bVar, int i7, Bundle bundle) {
        InterfaceC0136c bVar2;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 25 && (i7 & 1) != 0) {
            try {
                ((I1.h) bVar.f3p).A();
                Parcelable parcelable = (Parcelable) ((I1.h) bVar.f3p).u();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        ClipDescription clipDescriptionO = ((I1.h) bVar.f3p).o();
        I1.h hVar = (I1.h) bVar.f3p;
        ClipData clipData = new ClipData(clipDescriptionO, new ClipData.Item(hVar.w()));
        if (i8 >= 31) {
            bVar2 = new A.b(clipData, 2);
        } else {
            C0137d c0137d = new C0137d(0);
            c0137d.f2693p = clipData;
            c0137d.f2694q = 2;
            bVar2 = c0137d;
        }
        bVar2.h(hVar.C());
        bVar2.f(bundle);
        return G1.I.f((C1340u) this.f80p, bVar2.a()) == null;
    }

    @Override // N2.InterfaceC0289f
    public long p(long j3) {
        N2.s sVar = (N2.s) this.f80p;
        return w2.t.h((j3 * ((long) sVar.f5075e)) / 1000000, 0L, sVar.f5079j - 1);
    }

    public /* synthetic */ I(B2.a aVar, C0007h c0007h) {
        this.f79o = 5;
        this.f80p = c0007h;
    }

    public /* synthetic */ I(B2.a aVar, Object obj, long j3) {
        this.f79o = 6;
        this.f80p = obj;
    }
}
