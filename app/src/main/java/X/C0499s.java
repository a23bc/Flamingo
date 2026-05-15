package X;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: X.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0499s extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public CharSequence f8153o;

    /* JADX INFO: renamed from: p */
    public Object f8154p;

    /* JADX INFO: renamed from: q */
    public E5.d f8155q;

    /* JADX INFO: renamed from: r */
    public long f8156r;

    /* JADX INFO: renamed from: s */
    public /* synthetic */ Object f8157s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0505y f8158t;

    /* JADX INFO: renamed from: u */
    public int f8159u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0499s(C0505y c0505y, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f8158t = c0505y;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f8157s = obj;
        this.f8159u |= Integer.MIN_VALUE;
        return C0505y.a(this.f8158t, null, 0L, null, this);
    }
}
