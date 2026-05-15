package k4;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: k4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1154i extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public C1155j f14117o;

    /* JADX INFO: renamed from: p */
    public C1153h f14118p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f14119q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1155j f14120r;

    /* JADX INFO: renamed from: s */
    public int f14121s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1154i(C1155j c1155j, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f14120r = c1155j;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f14119q = obj;
        this.f14121s |= Integer.MIN_VALUE;
        return this.f14120r.b(null, this);
    }
}
