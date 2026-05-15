package c0;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public p f10562o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f10563p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ p f10564q;

    /* JADX INFO: renamed from: r */
    public int f10565r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f10564q = pVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f10563p = obj;
        this.f10565r |= Integer.MIN_VALUE;
        return this.f10564q.a(this);
    }
}
