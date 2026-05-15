package z;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: z.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2052n0 extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f20919o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C2054o0 f20920p;

    /* JADX INFO: renamed from: q */
    public int f20921q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2052n0(C2054o0 c2054o0, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f20920p = c2054o0;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f20919o = obj;
        this.f20921q |= Integer.MIN_VALUE;
        return this.f20920p.e(this);
    }
}
