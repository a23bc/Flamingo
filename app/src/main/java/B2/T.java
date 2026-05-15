package b2;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public W f10111o;

    /* JADX INFO: renamed from: p */
    public Class f10112p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f10113q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ W f10114r;

    /* JADX INFO: renamed from: s */
    public int f10115s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(W w7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f10114r = w7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f10113q = obj;
        this.f10115s |= Integer.MIN_VALUE;
        return this.f10114r.a(null, this);
    }
}
