package j2;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: j2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1101d extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f13691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1103f f13692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13693q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1101d(C1103f c1103f, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f13692p = c1103f;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f13691o = obj;
        this.f13693q |= Integer.MIN_VALUE;
        return this.f13692p.c(null, null, null, this);
    }
}
