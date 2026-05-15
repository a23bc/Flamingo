package G;

import e5.AbstractC0865c;
import x.EnumC1862l0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public EnumC1862l0 f2603o;

    /* JADX INFO: renamed from: p */
    public l5.e f2604p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f2605q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ x f2606r;

    /* JADX INFO: renamed from: s */
    public int f2607s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f2606r = xVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f2605q = obj;
        this.f2607s |= Integer.MIN_VALUE;
        return this.f2606r.c(null, null, this);
    }
}
