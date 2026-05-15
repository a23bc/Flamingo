package g4;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: g4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0991d extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public Object f12499o;

    /* JADX INFO: renamed from: p */
    public E5.i f12500p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f12501q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ e f12502r;

    /* JADX INFO: renamed from: s */
    public int f12503s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0991d(e eVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f12502r = eVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f12501q = obj;
        this.f12503s |= Integer.MIN_VALUE;
        return this.f12502r.a(this);
    }
}
