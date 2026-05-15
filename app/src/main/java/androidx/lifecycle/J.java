package androidx.lifecycle;

import R0.C0408t0;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class J implements InterfaceC0595s, AutoCloseable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f9697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final I f9698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9699q;

    public J(String str, I i7) {
        this.f9697o = str;
        this.f9698p = i7;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.InterfaceC0595s
    public final void g(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
        if (enumC0592o == EnumC0592o.ON_DESTROY) {
            this.f9699q = false;
            interfaceC0597u.h().l(this);
        }
    }

    public final void n(V.o oVar, K k7) {
        AbstractC1209k.f(oVar, "registry");
        AbstractC1209k.f(k7, "lifecycle");
        if (this.f9699q) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f9699q = true;
        k7.a(this);
        oVar.G(this.f9697o, (C0408t0) this.f9698p.f9696b.f2445t);
    }
}
