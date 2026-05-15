package z;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: z.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2044j0 extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f20869o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ A3.b f20870p;

    /* JADX INFO: renamed from: q */
    public int f20871q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2044j0(A3.b bVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f20870p = bVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f20869o = obj;
        this.f20871q |= Integer.MIN_VALUE;
        return this.f20870p.h(null, null, this);
    }
}
