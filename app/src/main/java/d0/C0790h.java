package d0;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: d0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0790h extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0801p f11007o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0801p f11009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11010r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0790h(C0801p c0801p, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f11009q = c0801p;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f11008p = obj;
        this.f11010r |= Integer.MIN_VALUE;
        return this.f11009q.b(null, null, this);
    }
}
