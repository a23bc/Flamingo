package z;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public C2060s f20630o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f20631p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ J f20632q;

    /* JADX INFO: renamed from: r */
    public int f20633r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(J j3, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f20632q = j3;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f20631p = obj;
        this.f20633r |= Integer.MIN_VALUE;
        return J.G0(this.f20632q, null, this);
    }
}
