package f0;

/* JADX INFO: renamed from: f0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0891i implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0891i f11810p = new C0891i(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0891i f11811q = new C0891i(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11812o;

    public /* synthetic */ C0891i(int i7) {
        this.f11812o = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11812o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0912t.Q();
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c0912t2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0912t2.Q();
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
