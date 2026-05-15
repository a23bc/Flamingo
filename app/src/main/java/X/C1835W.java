package x;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: x.W */
/* JADX INFO: loaded from: classes.dex */
public final class C1835W extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f19695o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1838Z f19696p;

    /* JADX INFO: renamed from: q */
    public int f19697q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1835W(C1838Z c1838z, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f19696p = c1838z;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f19695o = obj;
        this.f19697q |= Integer.MIN_VALUE;
        return C1838Z.C0(this.f19696p, this);
    }
}
