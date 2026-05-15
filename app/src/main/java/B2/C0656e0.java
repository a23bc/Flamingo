package b2;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: b2.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0656e0 extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public C0660g0 f10171o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f10172p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0660g0 f10173q;

    /* JADX INFO: renamed from: r */
    public int f10174r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0656e0(C0660g0 c0660g0, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f10173q = c0660g0;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f10172p = obj;
        this.f10174r |= Integer.MIN_VALUE;
        return C0660g0.a(this.f10173q, null, this);
    }
}
