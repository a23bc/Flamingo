package v;

import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: v.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1621r extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f18153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w.j0 f18154q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1621r(w.j0 j0Var, int i7) {
        super(0);
        this.f18153p = i7;
        this.f18154q = j0Var;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f18153p) {
            case 0:
                w.j0 j0Var = this.f18154q;
                Object objC = j0Var.c();
                EnumC1588F enumC1588F = EnumC1588F.f17964q;
                return Boolean.valueOf(objC == enumC1588F && j0Var.f18691d.getValue() == enumC1588F);
            default:
                return Long.valueOf(this.f18154q.b());
        }
    }
}
