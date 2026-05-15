package w5;

import m5.AbstractC1210l;

/* JADX INFO: renamed from: w5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1802u extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1802u f19573q = new C1802u(2, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1802u f19574r = new C1802u(2, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f19575p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1802u(int i7, int i8) {
        super(i7);
        this.f19575p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19575p) {
            case 0:
                return ((c5.i) obj).h((c5.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((c5.i) obj).h((c5.g) obj2);
        }
    }
}
