package O0;

import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: O0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0314k extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0314k f5406q = new C0314k(0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0314k f5407r = new C0314k(0, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0314k f5408s = new C0314k(0, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5409p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0314k(int i7, int i8) {
        super(i7);
        this.f5409p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f5409p) {
            case 0:
                return null;
            case 1:
                return new Q0.K(2);
            default:
                return null;
        }
    }
}
