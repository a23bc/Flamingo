package x5;

import B5.n;
import I4.t;
import K0.A;
import android.os.Handler;
import android.os.Looper;
import c5.i;
import java.util.concurrent.CancellationException;
import m5.AbstractC1209k;
import w5.AbstractC1805x;
import w5.C1793k;
import w5.C1806y;
import w5.D0;
import w5.InterfaceC1772I;
import w5.InterfaceC1786g0;
import w5.M;
import w5.N;
import w5.t0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1805x implements InterfaceC1772I {

    /* JADX INFO: renamed from: q */
    public final Handler f20142q;

    /* JADX INFO: renamed from: r */
    public final String f20143r;

    /* JADX INFO: renamed from: s */
    public final boolean f20144s;

    /* JADX INFO: renamed from: t */
    public final d f20145t;

    public d(Handler handler, String str, boolean z6) {
        this.f20142q = handler;
        this.f20143r = str;
        this.f20144s = z6;
        this.f20145t = z6 ? this : new d(handler, str, true);
    }

    @Override // w5.AbstractC1805x
    public final void A(i iVar, Runnable runnable) {
        if (this.f20142q.post(runnable)) {
            return;
        }
        E(iVar, runnable);
    }

    @Override // w5.AbstractC1805x
    public final boolean C() {
        return (this.f20144s && AbstractC1209k.a(Looper.myLooper(), this.f20142q.getLooper())) ? false : true;
    }

    public final void E(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) iVar.n(C1806y.f19581p);
        if (interfaceC1786g0 != null) {
            interfaceC1786g0.c(cancellationException);
        }
        M.f19498b.A(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f20142q == this.f20142q && dVar.f20144s == this.f20144s;
    }

    @Override // w5.InterfaceC1772I
    public final N g(long j3, final D0 d02, i iVar) {
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f20142q.postDelayed(d02, j3)) {
            return new N() { // from class: x5.c
                @Override // w5.N
                public final void a() {
                    this.f20140o.f20142q.removeCallbacks(d02);
                }
            };
        }
        E(iVar, d02);
        return t0.f19572o;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f20142q) ^ (this.f20144s ? 1231 : 1237);
    }

    @Override // w5.AbstractC1805x
    public final String toString() {
        d dVar;
        String str;
        D5.e eVar = M.f19497a;
        d dVar2 = n.f912a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f20145t;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f20143r;
        if (string == null) {
            string = this.f20142q.toString();
        }
        return this.f20144s ? n1.c.t(string, ".immediate") : string;
    }

    @Override // w5.InterfaceC1772I
    public final void w(long j3, C1793k c1793k) {
        t tVar = new t(c1793k, 16, this);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f20142q.postDelayed(tVar, j3)) {
            c1793k.t(new A(this, 26, tVar));
        } else {
            E(c1793k.f19543s, tVar);
        }
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
