package D;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0327y;
import java.util.List;
import o0.C1247d;

/* JADX INFO: renamed from: D.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0073n implements O0.Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0073n f1352b = new C0073n(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0073n f1353c = new C0073n(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1354a;

    public /* synthetic */ C0073n(int i7) {
        this.f1354a = i7;
    }

    @Override // O0.Z
    public final /* synthetic */ int a(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int i8 = this.f1354a;
        return A0.e.i(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final /* synthetic */ int b(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int i8 = this.f1354a;
        return A0.e.l(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final /* synthetic */ int d(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int i8 = this.f1354a;
        return A0.e.f(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final /* synthetic */ int f(InterfaceC0327y interfaceC0327y, List list, int i7) {
        int i8 = this.f1354a;
        return A0.e.c(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final InterfaceC0296a0 g(InterfaceC0298b0 interfaceC0298b0, List list, long j3) {
        switch (this.f1354a) {
            case 0:
                return interfaceC0298b0.k(n1.a.j(j3), n1.a.i(j3), Z4.w.f8819o, new C1247d(16));
            default:
                return interfaceC0298b0.k(n1.a.f(j3) ? n1.a.h(j3) : 0, n1.a.e(j3) ? n1.a.g(j3) : 0, Z4.w.f8819o, new C1247d(16));
        }
    }
}
