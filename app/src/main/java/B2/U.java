package b2;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class U extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public W f10116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public W f10117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f10118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W f10119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10120s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f10119r = w7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f10118q = obj;
        this.f10120s |= Integer.MIN_VALUE;
        return this.f10119r.b(this);
    }
}
