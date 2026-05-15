package w3;

import android.graphics.Bitmap;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f19095o = 1;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f19096p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f19097q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f19098r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f19099s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f19100t;

    public /* synthetic */ Y(C1716c0 c1716c0, AtomicInteger atomicInteger, List list, ArrayList arrayList, int i7) {
        this.f19097q = c1716c0;
        this.f19098r = atomicInteger;
        this.f19099s = list;
        this.f19100t = arrayList;
        this.f19096p = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        switch (this.f19095o) {
            case 0:
                C1716c0 c1716c0 = (C1716c0) this.f19097q;
                c1716c0.getClass();
                int iIncrementAndGet = ((AtomicInteger) this.f19098r).incrementAndGet();
                List list = (List) this.f19099s;
                if (iIncrementAndGet != list.size()) {
                    return;
                }
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) this.f19100t;
                    if (i7 >= arrayList.size()) {
                        return;
                    }
                    I4.y yVar = (I4.y) arrayList.get(i7);
                    if (yVar != null) {
                        try {
                            bitmap = (Bitmap) M3.a.O(yVar);
                        } catch (CancellationException | ExecutionException e7) {
                            synchronized (AbstractC1697a.f18830c) {
                                AbstractC1697a.a("Failed to get bitmap", e7);
                                break;
                            }
                            bitmap = null;
                        }
                    } else {
                        bitmap = null;
                    }
                    c1716c0.f19159g.t(AbstractC1748s.g((t2.G) list.get(i7), bitmap), this.f19096p + i7);
                    i7++;
                }
                break;
            default:
                J0 j02 = (J0) this.f19100t;
                K0 k02 = (K0) this.f19097q;
                if (k02.f19002g.h()) {
                    return;
                }
                boolean zIsActive = k02.f19005k.f20025a.f20005a.isActive();
                v1 v1Var = (v1) this.f19098r;
                int i8 = this.f19096p;
                x3.f0 f0Var = (x3.f0) this.f19099s;
                if (!zIsActive) {
                    StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                    sb.append(v1Var == null ? Integer.valueOf(i8) : v1Var.f19383b);
                    sb.append(", pid=");
                    sb.append(f0Var.f20039a.f20037b);
                    AbstractC1697a.w(sb.toString());
                    return;
                }
                C1747r0 c1747r0L = k02.L(f0Var);
                U3.h hVar = k02.f19001f;
                if (v1Var != null) {
                    if (!hVar.c0(c1747r0L, v1Var)) {
                        return;
                    }
                } else if (!hVar.b0(c1747r0L, i8)) {
                    return;
                }
                try {
                    j02.f(c1747r0L);
                    return;
                } catch (RemoteException e8) {
                    AbstractC1697a.x("Exception in " + c1747r0L, e8);
                    return;
                }
        }
    }

    public /* synthetic */ Y(K0 k02, v1 v1Var, int i7, x3.f0 f0Var, J0 j02) {
        this.f19097q = k02;
        this.f19098r = v1Var;
        this.f19096p = i7;
        this.f19099s = f0Var;
        this.f19100t = j02;
    }
}
