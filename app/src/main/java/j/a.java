package J;

import e5.AbstractC0865c;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1893c f3563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object[] f3564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f3567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f3568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3569u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f3568t = bVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f3567s = obj;
        this.f3569u |= Integer.MIN_VALUE;
        return this.f3568t.a(null, this);
    }
}
