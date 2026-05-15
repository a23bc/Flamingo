package z3;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f21188o;

    /* JADX INFO: renamed from: p */
    public int f21189p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ O1.s f21190q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(O1.s sVar, c5.d dVar) {
        super(dVar);
        this.f21190q = sVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f21188o = obj;
        this.f21189p |= Integer.MIN_VALUE;
        return this.f21190q.f(null, this);
    }
}
