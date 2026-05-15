package w5;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: w5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1779d implements InterfaceC1789i {

    /* JADX INFO: renamed from: a */
    public final C1777c[] f19525a;

    public C1779d(C1777c[] c1777cArr) {
        this.f19525a = c1777cArr;
    }

    public final void a() {
        for (C1777c c1777c : this.f19525a) {
            N n7 = c1777c.f19522t;
            if (n7 == null) {
                AbstractC1209k.m("handle");
                throw null;
            }
            n7.a();
        }
    }

    @Override // w5.InterfaceC1789i
    public final void c(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f19525a + ']';
    }
}
