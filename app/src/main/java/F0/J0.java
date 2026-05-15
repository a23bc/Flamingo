package f0;

import java.util.Iterator;
import n5.InterfaceC1237a;

/* JADX INFO: loaded from: classes.dex */
public final class J0 implements Iterable, InterfaceC1237a {

    /* JADX INFO: renamed from: o */
    public final I0 f11690o;

    /* JADX INFO: renamed from: p */
    public final int f11691p;

    /* JADX INFO: renamed from: q */
    public final int f11692q;

    public J0(I0 i02, int i7, int i8) {
        this.f11690o = i02;
        this.f11691p = i7;
        this.f11692q = i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        I0 i02 = this.f11690o;
        if (i02.f11686v != this.f11692q) {
            K0.f();
        }
        int i7 = this.f11691p;
        i02.n(i7);
        return new N(i02, i7 + 1, K0.a(i02.f11679o, i7) + i7);
    }
}
