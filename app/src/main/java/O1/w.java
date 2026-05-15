package O1;

import e5.AbstractC0865c;
import m5.C1220v;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public Object f5570o;

    /* JADX INFO: renamed from: p */
    public Object f5571p;

    /* JADX INFO: renamed from: q */
    public Object f5572q;

    /* JADX INFO: renamed from: r */
    public C1220v f5573r;

    /* JADX INFO: renamed from: s */
    public F f5574s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f5575t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ x f5576u;

    /* JADX INFO: renamed from: v */
    public int f5577v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f5576u = xVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f5575t = obj;
        this.f5577v |= Integer.MIN_VALUE;
        return this.f5576u.a(null, this);
    }
}
