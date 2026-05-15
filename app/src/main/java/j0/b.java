package J0;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f3589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f3590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3591q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f3590p = dVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f3589o = obj;
        this.f3591q |= Integer.MIN_VALUE;
        return this.f3590p.a(0L, 0L, this);
    }
}
