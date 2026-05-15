package b2;

import android.content.Context;
import e5.AbstractC0865c;

/* JADX INFO: renamed from: b2.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0666j0 extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public Context f10205o;

    /* JADX INFO: renamed from: p */
    public int f10206p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f10207q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0683y f10208r;

    /* JADX INFO: renamed from: s */
    public int f10209s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0666j0(C0683y c0683y, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f10208r = c0683y;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f10207q = obj;
        this.f10209s |= Integer.MIN_VALUE;
        return this.f10208r.b(null, 0, this);
    }
}
