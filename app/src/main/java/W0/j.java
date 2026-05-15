package w0;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import m5.C1220v;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1220v f18784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18785q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C1220v c1220v, int i7) {
        super(1);
        this.f18784p = c1220v;
        this.f18785q = i7;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((u) obj).F0(this.f18785q));
        this.f18784p.f14439o = boolValueOf;
        return boolValueOf;
    }
}
