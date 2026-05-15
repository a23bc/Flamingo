package b6;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f10463o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N2.z f10464p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10465q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(N2.z zVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f10464p = zVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f10463o = obj;
        this.f10465q |= Integer.MIN_VALUE;
        return N2.z.c(this.f10464p, null, null, null, this);
    }
}
