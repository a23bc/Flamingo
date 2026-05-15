package k2;

import Z1.o;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: k2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1142d extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1142d f14007q = new C1142d(2, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1142d f14008r = new C1142d(2, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1142d f14009s = new C1142d(2, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1142d f14010t = new C1142d(2, 3);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f14011p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1142d(int i7, int i8) {
        super(i7);
        this.f14011p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14011p) {
            case 0:
                ((C1139a) obj).f14002a = (String) obj2;
                break;
            case 1:
                ((C1139a) obj).f14005d = (o) obj2;
                break;
            case 2:
                ((C1139a) obj).f14003b = (C1144f) obj2;
                break;
            default:
                ((C1139a) obj).f14004c = ((Number) obj2).intValue();
                break;
        }
        return Y4.o.f8736a;
    }
}
