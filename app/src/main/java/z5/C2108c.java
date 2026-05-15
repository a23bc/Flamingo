package z5;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: z5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2108c extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f21276o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ A5.D f21277p;

    /* JADX INFO: renamed from: q */
    public int f21278q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2108c(A5.D d4, c5.d dVar) {
        super(dVar);
        this.f21277p = d4;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f21276o = obj;
        this.f21278q |= Integer.MIN_VALUE;
        return this.f21277p.f(null, this);
    }
}
