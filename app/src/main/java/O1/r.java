package O1;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f5547o;

    /* JADX INFO: renamed from: p */
    public int f5548p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ s f5549q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, c5.d dVar) {
        super(dVar);
        this.f5549q = sVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f5547o = obj;
        this.f5548p |= Integer.MIN_VALUE;
        return this.f5549q.f(null, this);
    }
}
