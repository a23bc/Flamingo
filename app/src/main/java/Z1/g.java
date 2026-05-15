package Z1;

import f2.C0928a;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g f8765q = new g(0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f8766r = new g(0, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f8767s = new g(0, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f8768t = new g(0, 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g f8769u = new g(0, 4);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f8770p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i7, int i8) {
        super(i7);
        this.f8770p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f8770p) {
            case 0:
                return C0928a.f12022B;
            case 1:
                throw new IllegalStateException("No default context");
            case 2:
                throw new IllegalStateException("No default glance id");
            case 3:
                throw new IllegalStateException("No default size");
            default:
                return null;
        }
    }
}
