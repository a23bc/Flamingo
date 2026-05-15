package A;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f20o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f21p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f21p = hVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f20o = obj;
        this.f22q |= Integer.MIN_VALUE;
        return h.b(this.f21p, null, 0.0f, 0.0f, null, this);
    }
}
