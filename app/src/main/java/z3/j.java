package z3;

import D.y0;
import f0.J;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import y3.C2019h;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2019h f21152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f21153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0.p f21154r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p0.p pVar, C2019h c2019h, boolean z6) {
        super(1);
        this.f21152p = c2019h;
        this.f21153q = z6;
        this.f21154r = pVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        AbstractC1209k.f((J) obj, "$this$DisposableEffect");
        C2019h c2019h = this.f21152p;
        i iVar = new i(this.f21154r, c2019h, this.f21153q);
        c2019h.f20413v.a(iVar);
        return new y0(c2019h, 12, iVar);
    }
}
