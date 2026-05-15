package b2;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: b2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0669l extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0659g f10215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0671m f10217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10218r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0669l(C0671m c0671m, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f10217q = c0671m;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f10216p = obj;
        this.f10218r |= Integer.MIN_VALUE;
        return this.f10217q.f(this);
    }
}
