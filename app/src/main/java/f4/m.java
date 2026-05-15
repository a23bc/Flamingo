package f4;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f12198o;

    /* JADX INFO: renamed from: p */
    public int f12199p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ O1.s f12200q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(O1.s sVar, c5.d dVar) {
        super(dVar);
        this.f12200q = sVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f12198o = obj;
        this.f12199p |= Integer.MIN_VALUE;
        return this.f12200q.f(null, this);
    }
}
