package I;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class P extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f3320o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Q f3321p;

    /* JADX INFO: renamed from: q */
    public int f3322q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f3321p = q7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f3320o = obj;
        this.f3322q |= Integer.MIN_VALUE;
        return this.f3321p.a(null, 0.0f, this);
    }
}
