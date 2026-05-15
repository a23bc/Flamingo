package F;

import e5.AbstractC0865c;
import x.EnumC1862l0;

/* JADX INFO: loaded from: classes.dex */
public final class y extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public EnumC1862l0 f2161o;

    /* JADX INFO: renamed from: p */
    public l5.e f2162p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f2163q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ A f2164r;

    /* JADX INFO: renamed from: s */
    public int f2165s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a4, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f2164r = a4;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f2163q = obj;
        this.f2165s |= Integer.MIN_VALUE;
        return this.f2164r.c(null, null, this);
    }
}
