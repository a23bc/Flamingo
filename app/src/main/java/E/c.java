package e;

import Y4.o;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e f11308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f11309q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, boolean z6) {
        super(0);
        this.f11308p = eVar;
        this.f11309q = z6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l5.a, m5.i] */
    @Override // l5.InterfaceC1180a
    public final Object a() {
        e eVar = this.f11308p;
        eVar.f10811a = this.f11309q;
        ?? r02 = eVar.f10813c;
        if (r02 != 0) {
            r02.a();
        }
        return o.f8736a;
    }
}
