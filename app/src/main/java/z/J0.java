package z;

import e5.AbstractC0865c;
import m5.C1219u;

/* JADX INFO: loaded from: classes.dex */
public final class J0 extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1219u f20667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P0 f20669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20670r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(P0 p02, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f20669q = p02;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f20668p = obj;
        this.f20670r |= Integer.MIN_VALUE;
        return this.f20669q.a(0L, this);
    }
}
