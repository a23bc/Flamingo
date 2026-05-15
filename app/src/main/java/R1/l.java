package r1;

import android.os.Handler;
import android.os.Looper;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15700p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ z f15701q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(z zVar, int i7) {
        super(1);
        this.f15700p = i7;
        this.f15701q = zVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f15700p) {
            case 0:
                O0.C cJ = ((O0.C) obj).j();
                AbstractC1209k.c(cJ);
                this.f15701q.m(cJ);
                break;
            case 1:
                n1.m mVar = new n1.m(((n1.m) obj).f14520a);
                z zVar = this.f15701q;
                zVar.m7setPopupContentSizefhxjrPA(mVar);
                zVar.n();
                break;
            default:
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) obj;
                z zVar2 = this.f15701q;
                Handler handler = zVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1180a.a();
                } else {
                    Handler handler2 = zVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new R.c(interfaceC1180a, 2));
                    }
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
