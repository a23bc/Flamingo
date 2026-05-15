package M;

import O0.InterfaceC0327y;
import g1.C0980v;
import java.util.List;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: M.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0279y implements O0.Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f4736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f4737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0980v f4738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B2.m f4739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1.d f4740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4741f;

    public C0279y(Z z6, InterfaceC1182c interfaceC1182c, C0980v c0980v, B2.m mVar, n1.d dVar, int i7) {
        this.f4736a = z6;
        this.f4737b = interfaceC1182c;
        this.f4738c = c0980v;
        this.f4739d = mVar;
        this.f4740e = dVar;
        this.f4741f = i7;
    }

    @Override // O0.Z
    public final /* synthetic */ int a(InterfaceC0327y interfaceC0327y, List list, int i7) {
        return A0.e.i(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final /* synthetic */ int b(InterfaceC0327y interfaceC0327y, List list, int i7) {
        return A0.e.l(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final int d(InterfaceC0327y interfaceC0327y, List list, int i7) {
        Z z6 = this.f4736a;
        z6.f4497a.a(interfaceC0327y.getLayoutDirection());
        F5.t tVar = z6.f4497a.f4597j;
        if (tVar != null) {
            return V.k(tVar.c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    @Override // O0.Z
    public final /* synthetic */ int f(InterfaceC0327y interfaceC0327y, List list, int i7) {
        return A0.e.c(this, interfaceC0327y, list, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    @Override // O0.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O0.InterfaceC0296a0 g(O0.InterfaceC0298b0 r29, java.util.List r30, long r31) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M.C0279y.g(O0.b0, java.util.List, long):O0.a0");
    }
}
