package A;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f17o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f18p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f19q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f18p = hVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f17o = obj;
        this.f19q |= Integer.MIN_VALUE;
        return this.f18p.d(null, 0.0f, null, this);
    }
}
