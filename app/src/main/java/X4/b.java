package X4;

import L2.C0247a;
import N2.z;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f8317q = new b(0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f8318r = new b(0, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f8319s = new b(0, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f8320p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i8) {
        super(i7);
        this.f8320p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f8320p) {
            case 0:
                return c.f8321a;
            case 1:
                return new z(20);
            default:
                return new C0247a(15);
        }
    }
}
