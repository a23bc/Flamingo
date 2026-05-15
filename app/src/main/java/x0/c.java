package X0;

import e5.AbstractC0865c;
import n1.l;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public Object f8231o;

    /* JADX INFO: renamed from: p */
    public l f8232p;

    /* JADX INFO: renamed from: q */
    public int f8233q;

    /* JADX INFO: renamed from: r */
    public int f8234r;

    /* JADX INFO: renamed from: s */
    public /* synthetic */ Object f8235s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ f f8236t;

    /* JADX INFO: renamed from: u */
    public int f8237u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f8236t = fVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f8235s = obj;
        this.f8237u |= Integer.MIN_VALUE;
        return f.a(this.f8236t, null, null, this);
    }
}
