package v;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: v.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1587E extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f17960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w.j0 f17961q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1587E(w.j0 j0Var, int i7) {
        super(1);
        this.f17960p = i7;
        this.f17961q = j0Var;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f17960p) {
            case 0:
                return Boolean.valueOf(!AbstractC1209k.a(obj, this.f17961q.f18691d.getValue()));
            case 1:
                return new w.l0(this.f17961q, 0);
            default:
                return new w.l0(this.f17961q, 1);
        }
    }
}
