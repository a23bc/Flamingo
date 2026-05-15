package z;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: z.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2050m0 extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f20908o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C2054o0 f20909p;

    /* JADX INFO: renamed from: q */
    public int f20910q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2050m0(C2054o0 c2054o0, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f20909p = c2054o0;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f20908o = obj;
        this.f20910q |= Integer.MIN_VALUE;
        return this.f20909p.d(this);
    }
}
