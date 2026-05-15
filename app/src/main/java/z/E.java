package z;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f20615o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ J f20616p;

    /* JADX INFO: renamed from: q */
    public int f20617q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(J j3, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f20616p = j3;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f20615o = obj;
        this.f20617q |= Integer.MIN_VALUE;
        return J.E0(this.f20616p, this);
    }
}
