package O1;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class y extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public F f5582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f5583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ F f5584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5585r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(F f7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f5584q = f7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f5583p = obj;
        this.f5585r |= Integer.MIN_VALUE;
        return this.f5584q.f(this);
    }
}
