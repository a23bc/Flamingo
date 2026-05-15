package H;

import f0.C0894j0;
import f0.Z0;
import r5.C1423d;

/* JADX INFO: loaded from: classes.dex */
public final class S implements Z0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0894j0 f2816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2817r;

    public S(int i7, int i8, int i9) {
        this.f2814o = i8;
        this.f2815p = i9;
        int i10 = (i7 / i8) * i8;
        this.f2816q = new C0894j0(i6.h.M(Math.max(i10 - i9, 0), i10 + i8 + i9), f0.W.f11767t);
        this.f2817r = i7;
    }

    public final void b(int i7) {
        if (i7 != this.f2817r) {
            this.f2817r = i7;
            int i8 = this.f2814o;
            int i9 = (i7 / i8) * i8;
            int i10 = this.f2815p;
            this.f2816q.setValue(i6.h.M(Math.max(i9 - i10, 0), i9 + i8 + i10));
        }
    }

    @Override // f0.Z0
    public final Object getValue() {
        return (C1423d) this.f2816q.getValue();
    }
}
