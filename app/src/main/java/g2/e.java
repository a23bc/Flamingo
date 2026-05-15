package g2;

import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f12416q = new e(2, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f12417r = new e(2, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f12418s = new e(2, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f12419t = new e(2, 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e f12420u = new e(2, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f12421v = new e(2, 5);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e f12422w = new e(2, 6);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e f12423x = new e(2, 7);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f12424p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, int i8) {
        super(i7);
        this.f12424p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12424p) {
            case 0:
                ((k) obj).f12438c = (Z1.o) obj2;
                break;
            case 1:
                ((k) obj).f12439d = (c) obj2;
                break;
            case 2:
                ((l) obj).f12440c = (Z1.o) obj2;
                break;
            case 3:
                ((l) obj).f12442e = ((C0985a) obj2).f12408a;
                break;
            case 4:
                ((l) obj).f12441d = ((C0986b) obj2).f12409a;
                break;
            case 5:
                ((m) obj).f12443c = (Z1.o) obj2;
                break;
            case 6:
                ((m) obj).f12445e = ((C0986b) obj2).f12409a;
                break;
            default:
                ((m) obj).f12444d = ((C0985a) obj2).f12408a;
                break;
        }
        return Y4.o.f8736a;
    }
}
