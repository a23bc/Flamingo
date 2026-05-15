package z5;

import X.C0477g0;
import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public C0477g0 f21298o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f21299p;

    /* JADX INFO: renamed from: q */
    public int f21300q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0477g0 f21301r;

    /* JADX INFO: renamed from: s */
    public Object f21302s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C0477g0 c0477g0, c5.d dVar) {
        super(dVar);
        this.f21301r = c0477g0;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f21299p = obj;
        this.f21300q |= Integer.MIN_VALUE;
        return this.f21301r.f(null, this);
    }
}
