package r2;

import c5.i;
import m5.AbstractC1209k;
import w5.C1806y;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: renamed from: r2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1415a implements AutoCloseable, InterfaceC1765B {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f15759o;

    public C1415a(i iVar) {
        AbstractC1209k.f(iVar, "coroutineContext");
        this.f15759o = iVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) this.f15759o.n(C1806y.f19581p);
        if (interfaceC1786g0 != null) {
            interfaceC1786g0.c(null);
        }
    }

    @Override // w5.InterfaceC1765B
    public final i g() {
        return this.f15759o;
    }
}
