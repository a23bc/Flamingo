package x;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: x.V */
/* JADX INFO: loaded from: classes.dex */
public final class C1834V extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public B.h f19691o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f19692p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1838Z f19693q;

    /* JADX INFO: renamed from: r */
    public int f19694r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1834V(C1838Z c1838z, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f19693q = c1838z;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f19692p = obj;
        this.f19694r |= Integer.MIN_VALUE;
        return C1838Z.B0(this.f19693q, this);
    }
}
