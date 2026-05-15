package H;

import f0.C0912t;

/* JADX INFO: loaded from: classes.dex */
public final class J implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f2801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2802r;

    public /* synthetic */ J(Object obj, int i7, Object obj2, int i8) {
        this.f2799o = i8;
        this.f2802r = obj;
        this.f2800p = i7;
        this.f2801q = obj2;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2799o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((K) this.f2802r).e(this.f2800p, this.f2801q, c0912t, 0);
                } else {
                    c0912t.Q();
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    ((n0.d) this.f2802r).h(Integer.valueOf(this.f2800p), this.f2801q, c0912t2, 0);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
