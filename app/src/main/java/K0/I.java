package K0;

import e5.AbstractC0865c;
import w5.w0;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public w0 f3831o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f3832p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ L f3833q;

    /* JADX INFO: renamed from: r */
    public int f3834r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(L l, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f3833q = l;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f3832p = obj;
        this.f3834r |= Integer.MIN_VALUE;
        return this.f3833q.g(0L, null, this);
    }
}
