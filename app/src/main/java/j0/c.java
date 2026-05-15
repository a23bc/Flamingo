package J0;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f3592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f3593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3594q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f3593p = dVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f3592o = obj;
        this.f3594q |= Integer.MIN_VALUE;
        return this.f3593p.c(0L, this);
    }
}
