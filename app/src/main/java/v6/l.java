package v6;

import D.B0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class l implements F.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F.u f18382a;

    public l(F.u uVar) {
        AbstractC1209k.f(uVar, "lazyListScope");
        this.f18382a = uVar;
    }

    @Override // F.u
    public final void a(Object obj, n0.d dVar) {
        this.f18382a.a(obj, new n0.d(-1989700419, new B0(11, dVar), true));
    }

    @Override // F.u
    public final void b(int i7, InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, n0.d dVar) {
        AbstractC1209k.f(interfaceC1182c2, "contentType");
        this.f18382a.b(i7, interfaceC1182c, interfaceC1182c2, new n0.d(-297269757, new k(i7, dVar), true));
    }
}
