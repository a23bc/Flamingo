package J0;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f3604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f3605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g f3606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3607r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f3606q = gVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f3605p = obj;
        this.f3607r |= Integer.MIN_VALUE;
        return this.f3606q.m0(0L, this);
    }
}
