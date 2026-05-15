package D5;

import w5.AbstractC1805x;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC1805x {

    /* JADX INFO: renamed from: q */
    public static final l f1632q = new l();

    @Override // w5.AbstractC1805x
    public final void A(c5.i iVar, Runnable runnable) {
        e eVar = e.f1619r;
        eVar.f1621q.c(runnable, k.h, false);
    }

    @Override // w5.AbstractC1805x
    public final void B(c5.i iVar, Runnable runnable) {
        e eVar = e.f1619r;
        eVar.f1621q.c(runnable, k.h, true);
    }

    @Override // w5.AbstractC1805x
    public final AbstractC1805x D(int i7) {
        B5.a.a(i7);
        return i7 >= k.f1628d ? this : super.D(i7);
    }
}
