package A5;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public m f557o;

    /* JADX INFO: renamed from: p */
    public Object f558p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f559q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ m f560r;

    /* JADX INFO: renamed from: s */
    public int f561s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, c5.d dVar) {
        super(dVar);
        this.f560r = mVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f559q = obj;
        this.f561s |= Integer.MIN_VALUE;
        return this.f560r.f(null, this);
    }
}
