package d0;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: d0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0796k extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0801p f11030o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11031p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0801p f11032q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11033r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0796k(C0801p c0801p, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f11032q = c0801p;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f11031p = obj;
        this.f11033r |= Integer.MIN_VALUE;
        return this.f11032q.a(null, null, null, this);
    }
}
