package u4;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: u4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1537b extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public e f17283o;

    /* JADX INFO: renamed from: p */
    public long f17284p;

    /* JADX INFO: renamed from: q */
    public long f17285q;

    /* JADX INFO: renamed from: r */
    public /* synthetic */ Object f17286r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ e f17287s;

    /* JADX INFO: renamed from: t */
    public int f17288t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537b(e eVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f17287s = eVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f17286r = obj;
        this.f17288t |= Integer.MIN_VALUE;
        return this.f17287s.x(0L, 0L, this);
    }
}
