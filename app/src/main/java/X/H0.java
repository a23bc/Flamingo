package X;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f7916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0 f7917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7918q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(K0 k02, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f7917p = k02;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f7916o = obj;
        this.f7918q |= Integer.MIN_VALUE;
        return K0.b(this.f7917p, this);
    }
}
