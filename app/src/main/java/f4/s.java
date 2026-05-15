package f4;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f12219o;

    /* JADX INFO: renamed from: p */
    public int f12220p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ O1.s f12221q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(O1.s sVar, c5.d dVar) {
        super(dVar);
        this.f12221q = sVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f12219o = obj;
        this.f12220p |= Integer.MIN_VALUE;
        return this.f12221q.f(null, this);
    }
}
