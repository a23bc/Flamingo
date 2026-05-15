package H;

import e5.AbstractC0865c;
import m5.C1220v;

/* JADX INFO: renamed from: H.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0162d extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public C1220v f2855o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f2856p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0163e f2857q;

    /* JADX INFO: renamed from: r */
    public int f2858r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162d(C0163e c0163e, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f2857q = c0163e;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f2856p = obj;
        this.f2858r |= Integer.MIN_VALUE;
        return this.f2857q.k(this);
    }
}
