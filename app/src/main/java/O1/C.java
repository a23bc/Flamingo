package O1;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public F f5488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f5489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f5490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F f5492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5493t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(F f7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f5492s = f7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f5491r = obj;
        this.f5493t |= Integer.MIN_VALUE;
        return this.f5492s.j(null, null, this);
    }
}
