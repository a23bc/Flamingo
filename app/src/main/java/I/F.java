package I;

import e5.AbstractC0865c;
import w.InterfaceC1679l;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC1679l f3263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f3264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ K f3265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3266s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(K k7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f3265r = k7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f3264q = obj;
        this.f3266s |= Integer.MIN_VALUE;
        return this.f3265r.f(0, null, this);
    }
}
