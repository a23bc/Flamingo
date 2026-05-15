package w3;

import Q0.C0348f0;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: w3.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC1761y0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A0 f19406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1761y0(A0 a0, Looper looper) {
        super(looper);
        this.f19406c = a0;
        this.f19404a = true;
        this.f19405b = true;
    }

    public final void a(boolean z6, boolean z7) {
        boolean z8 = false;
        this.f19404a = this.f19404a && z6;
        if (this.f19405b && z7) {
            z8 = true;
        }
        this.f19405b = z8;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1747r0 c1747r0;
        int iB;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        A0 a0 = this.f19406c;
        n1 n1VarN = a0.f18913r.n(a0.f18914s.g1(), a0.f18914s.e1(), a0.f18913r.f19298k);
        a0.f18913r = n1VarN;
        boolean z6 = this.f19404a;
        boolean z7 = this.f19405b;
        i1 i1Var = a0.f18904g;
        n1 n1VarQ1 = i1Var.q1(n1VarN);
        U3.h hVar = i1Var.f19226e;
        E4.I iR = hVar.R();
        for (int i7 = 0; i7 < iR.size(); i7++) {
            C1747r0 c1747r02 = (C1747r0) iR.get(i7);
            try {
                C0348f0 c0348f0W = hVar.W(c1747r02);
                if (c0348f0W != null) {
                    iB = c0348f0W.b();
                } else if (!(i1Var.f19226e.Z(c1747r02) || a0.h.f19001f.Z(c1747r02))) {
                    break;
                } else {
                    iB = 0;
                }
                t2.T tG = k1.g(hVar.P(c1747r02), a0.f18914s.y());
                InterfaceC1746q0 interfaceC1746q0 = c1747r02.f19339d;
                AbstractC1697a.j(interfaceC1746q0);
                c1747r0 = c1747r02;
                try {
                    interfaceC1746q0.b(iB, n1VarQ1, tG, z6, z7, c1747r02.f19338c);
                } catch (DeadObjectException unused) {
                    i1Var.f19226e.k0(c1747r0);
                } catch (RemoteException e7) {
                    e = e7;
                    AbstractC1697a.x("Exception in " + c1747r0.toString(), e);
                }
            } catch (DeadObjectException unused2) {
                c1747r0 = c1747r02;
            } catch (RemoteException e8) {
                e = e8;
                c1747r0 = c1747r02;
            }
        }
        this.f19404a = true;
        this.f19405b = true;
    }
}
