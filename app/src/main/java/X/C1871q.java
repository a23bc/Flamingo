package x;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: x.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1871q extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public long f19819o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f19820p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1875s f19821q;

    /* JADX INFO: renamed from: r */
    public int f19822r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1871q(C1875s c1875s, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f19821q = c1875s;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f19820p = obj;
        this.f19822r |= Integer.MIN_VALUE;
        return this.f19821q.b(0L, null, this);
    }
}
