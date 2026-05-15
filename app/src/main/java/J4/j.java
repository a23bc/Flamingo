package j4;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f13716o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ l f13717p;

    /* JADX INFO: renamed from: q */
    public int f13718q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f13717p = lVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f13716o = obj;
        this.f13718q |= Integer.MIN_VALUE;
        return this.f13717p.b(null, this);
    }
}
