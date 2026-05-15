package R0;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t.z f6261o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y5.b f6262p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f6263q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f6264r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6265s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(F f7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f6264r = f7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f6263q = obj;
        this.f6265s |= Integer.MIN_VALUE;
        return this.f6264r.g(this);
    }
}
