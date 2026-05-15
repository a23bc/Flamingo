package r1;

import f0.C0912t;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f15711q = new q(2, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f15712r = new q(2, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15713p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i7, int i8) {
        super(i7);
        this.f15713p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15713p) {
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
