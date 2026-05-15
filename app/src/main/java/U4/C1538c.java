package u4;

import e5.AbstractC0865c;
import m5.C1217s;

/* JADX INFO: renamed from: u4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1538c extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public e f17289o;

    /* JADX INFO: renamed from: p */
    public C1217s f17290p;

    /* JADX INFO: renamed from: q */
    public C1217s f17291q;

    /* JADX INFO: renamed from: r */
    public long f17292r;

    /* JADX INFO: renamed from: s */
    public long f17293s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f17294t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ e f17295u;

    /* JADX INFO: renamed from: v */
    public int f17296v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1538c(e eVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f17295u = eVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f17294t = obj;
        this.f17296v |= Integer.MIN_VALUE;
        return this.f17295u.m0(0L, this);
    }
}
