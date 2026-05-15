package O1;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f5483o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f5484p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f5485q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f5486r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5487s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(F f7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f5486r = f7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f5485q = obj;
        this.f5487s |= Integer.MIN_VALUE;
        return this.f5486r.i(this);
    }
}
