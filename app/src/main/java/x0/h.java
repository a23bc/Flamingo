package X0;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f8252o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ i f8253p;

    /* JADX INFO: renamed from: q */
    public int f8254q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f8253p = iVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f8252o = obj;
        this.f8254q |= Integer.MIN_VALUE;
        return this.f8253p.b(0.0f, this);
    }
}
