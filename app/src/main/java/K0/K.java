package K0;

import e5.AbstractC0863a;
import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f3838o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ L f3839p;

    /* JADX INFO: renamed from: q */
    public int f3840q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l, AbstractC0863a abstractC0863a) {
        super(abstractC0863a);
        this.f3839p = l;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f3838o = obj;
        this.f3840q |= Integer.MIN_VALUE;
        return this.f3839p.h(0L, null, this);
    }
}
