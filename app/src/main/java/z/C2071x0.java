package z;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: z.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2071x0 extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public long f20990o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f20991p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C2073y0 f20992q;

    /* JADX INFO: renamed from: r */
    public int f20993r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2071x0(C2073y0 c2073y0, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f20992q = c2073y0;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f20991p = obj;
        this.f20993r |= Integer.MIN_VALUE;
        return this.f20992q.x(0L, 0L, this);
    }
}
