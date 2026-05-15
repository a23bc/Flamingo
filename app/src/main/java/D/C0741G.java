package d;

import androidx.lifecycle.EnumC0592o;
import androidx.lifecycle.InterfaceC0595s;
import androidx.lifecycle.InterfaceC0597u;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0741G implements InterfaceC0595s, InterfaceC0750c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.K f10731o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC0773z f10732p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0742H f10733q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0743I f10734r;

    public C0741G(C0743I c0743i, androidx.lifecycle.K k7, AbstractC0773z abstractC0773z) {
        AbstractC1209k.f(abstractC0773z, "onBackPressedCallback");
        this.f10734r = c0743i;
        this.f10731o = k7;
        this.f10732p = abstractC0773z;
        k7.a(this);
    }

    @Override // d.InterfaceC0750c
    public final void cancel() {
        this.f10731o.l(this);
        this.f10732p.f10812b.remove(this);
        C0742H c0742h = this.f10733q;
        if (c0742h != null) {
            c0742h.cancel();
        }
        this.f10733q = null;
    }

    @Override // androidx.lifecycle.InterfaceC0595s
    public final void g(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
        if (enumC0592o != EnumC0592o.ON_START) {
            if (enumC0592o != EnumC0592o.ON_STOP) {
                if (enumC0592o == EnumC0592o.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0742H c0742h = this.f10733q;
                if (c0742h != null) {
                    c0742h.cancel();
                    return;
                }
                return;
            }
        }
        C0743I c0743i = this.f10734r;
        c0743i.getClass();
        AbstractC0773z abstractC0773z = this.f10732p;
        AbstractC1209k.f(abstractC0773z, "onBackPressedCallback");
        c0743i.f10738b.addLast(abstractC0773z);
        C0742H c0742h2 = new C0742H(c0743i, abstractC0773z);
        abstractC0773z.f10812b.add(c0742h2);
        c0743i.e();
        abstractC0773z.f10813c = new R.o(0, c0743i, C0743I.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3);
        this.f10733q = c0742h2;
    }
}
