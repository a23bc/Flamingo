package z;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public r f20621o;

    /* JADX INFO: renamed from: p */
    public B.b f20622p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f20623q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ J f20624r;

    /* JADX INFO: renamed from: s */
    public int f20625s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(J j3, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f20624r = j3;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f20623q = obj;
        this.f20625s |= Integer.MIN_VALUE;
        return J.F0(this.f20624r, null, this);
    }
}
