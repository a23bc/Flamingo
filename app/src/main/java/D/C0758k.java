package d;

import A2.RunnableC0022x;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.N;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: d.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0758k extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0759l f10776q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0758k(AbstractActivityC0759l abstractActivityC0759l, int i7) {
        super(0);
        this.f10775p = i7;
        this.f10776q = abstractActivityC0759l;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f10775p) {
            case 0:
                AbstractActivityC0759l abstractActivityC0759l = this.f10776q;
                return new N(abstractActivityC0759l.getApplication(), abstractActivityC0759l, abstractActivityC0759l.getIntent() != null ? abstractActivityC0759l.getIntent().getExtras() : null);
            case 1:
                this.f10776q.reportFullyDrawn();
                return Y4.o.f8736a;
            case 2:
                AbstractActivityC0759l abstractActivityC0759l2 = this.f10776q;
                return new C0767t(abstractActivityC0759l2.f10788t, new C0758k(abstractActivityC0759l2, 1));
            default:
                AbstractActivityC0759l abstractActivityC0759l3 = this.f10776q;
                C0743I c0743i = new C0743I(new RunnableC0751d(abstractActivityC0759l3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC1209k.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0759l3.f17150o.a(new C0753f(c0743i, abstractActivityC0759l3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0022x(abstractActivityC0759l3, 8, c0743i));
                    }
                }
                return c0743i;
        }
    }
}
