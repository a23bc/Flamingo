package d;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0592o;
import androidx.lifecycle.InterfaceC0595s;
import androidx.lifecycle.InterfaceC0597u;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0753f implements InterfaceC0595s {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C0743I f10760o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ AbstractActivityC0759l f10761p;

    public /* synthetic */ C0753f(C0743I c0743i, AbstractActivityC0759l abstractActivityC0759l) {
        this.f10760o = c0743i;
        this.f10761p = abstractActivityC0759l;
    }

    @Override // androidx.lifecycle.InterfaceC0595s
    public final void g(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
        C0743I c0743i = this.f10760o;
        AbstractActivityC0759l abstractActivityC0759l = this.f10761p;
        if (enumC0592o == EnumC0592o.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = C0754g.f10762a.a(abstractActivityC0759l);
            AbstractC1209k.f(onBackInvokedDispatcherA, "invoker");
            c0743i.f10741e = onBackInvokedDispatcherA;
            c0743i.d(c0743i.f10743g);
        }
    }
}
