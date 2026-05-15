package W5;

import d5.EnumC0830a;
import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f7865o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ A0.b f7866p;

    /* JADX INFO: renamed from: q */
    public int f7867q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(A0.b bVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f7866p = bVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f7865o = obj;
        this.f7867q |= Integer.MIN_VALUE;
        this.f7866p.j0(this);
        return EnumC0830a.f11264o;
    }
}
