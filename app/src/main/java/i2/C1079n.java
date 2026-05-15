package i2;

import android.content.Context;
import e5.AbstractC0865c;

/* JADX INFO: renamed from: i2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1079n extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public o f13402o;

    /* JADX INFO: renamed from: p */
    public Context f13403p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f13404q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ o f13405r;

    /* JADX INFO: renamed from: s */
    public int f13406s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1079n(o oVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f13405r = oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f13404q = obj;
        this.f13406s |= Integer.MIN_VALUE;
        return this.f13405r.b(null, null, this);
    }
}
