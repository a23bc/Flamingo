package j2;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: j2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1102e extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l5.e f13694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f13695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1103f f13696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13697r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1102e(C1103f c1103f, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f13696q = c1103f;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f13695p = obj;
        this.f13697r |= Integer.MIN_VALUE;
        return this.f13696q.d(null, null, null, null, this);
    }
}
