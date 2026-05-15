package u4;

import e5.AbstractC0865c;
import m5.C1217s;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public C1217s f17307o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f17308p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ h f17309q;

    /* JADX INFO: renamed from: r */
    public int f17310r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f17309q = hVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f17308p = obj;
        this.f17310r |= Integer.MIN_VALUE;
        return this.f17309q.a(null, 0.0f, this);
    }
}
