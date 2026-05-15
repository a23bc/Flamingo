package X;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class J0 extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public K0 f7928o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f7929p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K0 f7930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7931r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(K0 k02, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f7930q = k02;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f7929p = obj;
        this.f7931r |= Integer.MIN_VALUE;
        return this.f7930q.r(this);
    }
}
