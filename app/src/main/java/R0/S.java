package R0;

import d5.EnumC0830a;
import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f6371o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ U f6372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6373q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f6372p = u7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f6371o = obj;
        this.f6373q |= Integer.MIN_VALUE;
        this.f6372p.a(null, this);
        return EnumC0830a.f11264o;
    }
}
