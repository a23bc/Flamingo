package p0;

import n0.C1226a;

/* JADX INFO: loaded from: classes.dex */
public abstract class z implements y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1226a f14992o = new C1226a(0);

    public final boolean d(int i7) {
        return (i7 & this.f14992o.get()) != 0;
    }

    @Override // p0.y
    public /* synthetic */ AbstractC1280A e(AbstractC1280A abstractC1280A, AbstractC1280A abstractC1280A2, AbstractC1280A abstractC1280A3) {
        return null;
    }

    public final void f(int i7) {
        C1226a c1226a;
        int i8;
        do {
            c1226a = this.f14992o;
            i8 = c1226a.get();
            if ((i8 & i7) != 0) {
                return;
            }
        } while (!c1226a.compareAndSet(i8, i8 | i7));
    }
}
