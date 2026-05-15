package I;

import D.C0056b;
import f0.C0879c;
import f0.C0894j0;
import l5.InterfaceC1180a;
import o0.AbstractC1256m;

/* JADX INFO: renamed from: I.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0211c extends K {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final V1.a f3328I = AbstractC1256m.b(new C0056b(5, 0), new F.g(5));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0894j0 f3329H;

    public C0211c(int i7, float f7, InterfaceC1180a interfaceC1180a) {
        super(i7, f7);
        this.f3329H = C0879c.t(interfaceC1180a);
    }

    @Override // I.K
    public final int m() {
        return ((Number) ((InterfaceC1180a) this.f3329H.getValue()).a()).intValue();
    }
}
