package k4;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: k4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1151f extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1153h f14101o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1155j f14102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f14103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1153h f14104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14105s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1151f(C1153h c1153h, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f14104r = c1153h;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f14103q = obj;
        this.f14105s |= Integer.MIN_VALUE;
        return this.f14104r.d(null, this);
    }
}
