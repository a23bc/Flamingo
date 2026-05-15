package O0;

import f0.C0912t;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: O0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0316m extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0316m f5413q = new C0316m(2, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0316m f5414r = new C0316m(2, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5415p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0316m(int i7, int i8) {
        super(i7);
        this.f5415p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5415p) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0912t.Q();
                }
                break;
            default:
                ((W) obj2).getClass();
                break;
        }
        return Y4.o.f8736a;
    }
}
