package R0;

import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: R0.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0410u0 extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f6536p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ V.o f6537q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f6538r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0410u0(boolean z6, V.o oVar, String str) {
        super(0);
        this.f6536p = z6;
        this.f6537q = oVar;
        this.f6538r = str;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        if (this.f6536p) {
            V.o oVar = this.f6537q;
            String str = this.f6538r;
            C2.I i7 = (C2.I) oVar.f7342p;
            synchronized (((A2.x0) i7.f986f)) {
            }
        }
        return Y4.o.f8736a;
    }
}
