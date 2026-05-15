package J0;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f3599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f3600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f3601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3603s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f3602r = gVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f3601q = obj;
        this.f3603s |= Integer.MIN_VALUE;
        return this.f3602r.x(0L, 0L, this);
    }
}
