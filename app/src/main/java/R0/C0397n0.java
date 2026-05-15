package R0;

import f0.C0912t;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: R0.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0397n0 extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0397n0 f6487p = new C0397n0(2);

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            c0912t.Q();
        }
        return Y4.o.f8736a;
    }
}
