package v;

import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: v.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1591I extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1591I f17975q = new C1591I(0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1591I f17976r = new C1591I(0, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1591I f17977s = new C1591I(0, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1591I f17978t = new C1591I(0, 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C1591I f17979u = new C1591I(0, 4);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f17980p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1591I(int i7, int i8) {
        super(i7);
        this.f17980p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f17980p) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            default:
                p0.u uVar = new p0.u(C1606c.f18051F);
                uVar.e();
                return uVar;
        }
    }
}
