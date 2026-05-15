package y3;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0599w;
import androidx.lifecycle.EnumC0593p;
import androidx.lifecycle.N;
import androidx.lifecycle.W;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import m5.AbstractC1221w;

/* JADX INFO: renamed from: y3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2018g extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f20404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2019h f20405q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2018g(C2019h c2019h, int i7) {
        super(0);
        this.f20404p = i7;
        this.f20405q = c2019h;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f20404p) {
            case 0:
                C2019h c2019h = this.f20405q;
                Context context = c2019h.f20406o;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new N(applicationContext instanceof Application ? (Application) applicationContext : null, c2019h, c2019h.c());
            default:
                C2019h c2019h2 = this.f20405q;
                if (!c2019h2.f20415x) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                C0599w c0599w = c2019h2.f20413v;
                if (c0599w.f9756g == EnumC0593p.f9745o) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                C2016e c2016e = new C2016e();
                c2016e.f20401a = (V.o) c2019h2.f20414w.f7343q;
                c2016e.f20402b = c0599w;
                return ((C2017f) new W(c2019h2.g(), c2016e, c2019h2.e()).a(AbstractC1221w.a(C2017f.class))).f20403b;
        }
    }
}
