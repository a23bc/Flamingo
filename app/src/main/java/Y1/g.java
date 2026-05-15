package Y1;

import G1.InterfaceC0143j;
import android.os.Handler;
import androidx.lifecycle.K;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import d.C0743I;
import d.C0757j;
import d.InterfaceC0744J;
import g.InterfaceC0939f;
import k.AbstractActivityC1121i;
import v1.InterfaceC1632b;
import v1.InterfaceC1633c;

/* JADX INFO: loaded from: classes.dex */
public final class g implements InterfaceC1632b, InterfaceC1633c, u1.s, u1.t, Y, InterfaceC0744J, InterfaceC0939f, E3.f, InterfaceC0143j {

    /* JADX INFO: renamed from: o */
    public final AbstractActivityC1121i f8597o;

    /* JADX INFO: renamed from: p */
    public final Handler f8598p;

    /* JADX INFO: renamed from: q */
    public final q f8599q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ AbstractActivityC1121i f8600r;

    public g(AbstractActivityC1121i abstractActivityC1121i) {
        this.f8600r = abstractActivityC1121i;
        Handler handler = new Handler();
        this.f8599q = new q();
        this.f8597o = abstractActivityC1121i;
        this.f8598p = handler;
    }

    @Override // d.InterfaceC0744J
    public final C0743I a() {
        return this.f8600r.a();
    }

    @Override // E3.f
    public final V.o b() {
        return (V.o) this.f8600r.f10786r.f7343q;
    }

    @Override // g.InterfaceC0939f
    public final C0757j f() {
        return this.f8600r.f10790v;
    }

    @Override // androidx.lifecycle.Y
    public final X g() {
        return this.f8600r.g();
    }

    @Override // androidx.lifecycle.InterfaceC0597u
    public final K h() {
        return this.f8600r.f13917I;
    }
}
