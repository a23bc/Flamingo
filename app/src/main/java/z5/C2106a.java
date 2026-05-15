package z5;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: z5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2106a extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A5.v f21271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f21272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ z3.t f21273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21274r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2106a(z3.t tVar, c5.d dVar) {
        super(dVar);
        this.f21273q = tVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f21272p = obj;
        this.f21274r |= Integer.MIN_VALUE;
        return this.f21273q.b(null, this);
    }
}
