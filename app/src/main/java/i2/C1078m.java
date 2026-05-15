package i2;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: i2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1078m extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public o f13397o;

    /* JADX INFO: renamed from: p */
    public String f13398p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f13399q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ o f13400r;

    /* JADX INFO: renamed from: s */
    public int f13401s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1078m(o oVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f13400r = oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f13399q = obj;
        this.f13401s |= Integer.MIN_VALUE;
        return this.f13400r.a(null, null, this);
    }
}
