package t0;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y5.b f16137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f16138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c f16139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16140r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f16139q = cVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f16138p = obj;
        this.f16140r |= Integer.MIN_VALUE;
        return this.f16139q.a(this);
    }
}
