package z5;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: z5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2114i extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public A5.D f21288o;

    /* JADX INFO: renamed from: p */
    public Object f21289p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f21290q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ A5.D f21291r;

    /* JADX INFO: renamed from: s */
    public int f21292s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2114i(A5.D d4, c5.d dVar) {
        super(dVar);
        this.f21291r = d4;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f21290q = obj;
        this.f21292s |= Integer.MIN_VALUE;
        return this.f21291r.f(null, this);
    }
}
