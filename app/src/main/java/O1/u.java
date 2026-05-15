package O1;

import e5.AbstractC0865c;
import w5.C1799q;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f5555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public F f5556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1799q f5557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F f5559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5560t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(F f7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f5559s = f7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f5558r = obj;
        this.f5560t |= Integer.MIN_VALUE;
        return F.c(this.f5559s, null, this);
    }
}
