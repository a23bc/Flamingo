package R0;

import android.view.View;
import androidx.lifecycle.EnumC0592o;
import androidx.lifecycle.InterfaceC0595s;
import androidx.lifecycle.InterfaceC0597u;
import java.util.ArrayList;
import m5.C1220v;
import w5.AbstractC1767D;
import w5.EnumC1766C;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements InterfaceC0595s {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ B5.d f6447o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0371a0 f6448p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ f0.B0 f6449q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1220v f6450r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ View f6451s;

    public e1(B5.d dVar, C0371a0 c0371a0, f0.B0 b0, C1220v c1220v, View view) {
        this.f6447o = dVar;
        this.f6448p = c0371a0;
        this.f6449q = b0;
        this.f6450r = c1220v;
        this.f6451s = view;
    }

    @Override // androidx.lifecycle.InterfaceC0595s
    public final void g(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
        switch (a1.f6415a[enumC0592o.ordinal()]) {
            case 1:
                B5.d dVar = this.f6447o;
                EnumC1766C enumC1766C = EnumC1766C.f19467o;
                AbstractC1767D.t(dVar, null, new d1(this.f6450r, this.f6449q, interfaceC0597u, this, this.f6451s, null), 1);
                return;
            case 2:
                C0371a0 c0371a0 = this.f6448p;
                if (c0371a0 != null) {
                    D2.B b7 = (D2.B) c0371a0.f6414q;
                    synchronized (b7.f1459p) {
                        try {
                            if (!b7.i()) {
                                ArrayList arrayList = (ArrayList) b7.f1460q;
                                b7.f1460q = (ArrayList) b7.f1461r;
                                b7.f1461r = arrayList;
                                b7.f1458o = true;
                                int size = arrayList.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    ((c5.d) arrayList.get(i7)).resumeWith(Y4.o.f8736a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.f6449q.N();
                return;
            case 3:
                this.f6449q.F();
                return;
            case 4:
                this.f6449q.A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new A2.W();
        }
    }
}
