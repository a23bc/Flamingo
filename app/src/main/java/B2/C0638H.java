package b2;

import android.content.Context;
import e5.AbstractC0865c;

/* JADX INFO: renamed from: b2.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0638H extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public A0.b f10055o;

    /* JADX INFO: renamed from: p */
    public Context f10056p;

    /* JADX INFO: renamed from: q */
    public int f10057q;

    /* JADX INFO: renamed from: r */
    public /* synthetic */ Object f10058r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ A0.b f10059s;

    /* JADX INFO: renamed from: t */
    public int f10060t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0638H(A0.b bVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f10059s = bVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f10058r = obj;
        this.f10060t |= Integer.MIN_VALUE;
        return this.f10059s.P(null, 0, this);
    }
}
