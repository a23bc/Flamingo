package i2;

import androidx.glance.session.SessionWorker;
import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f13412o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ SessionWorker f13413p;

    /* JADX INFO: renamed from: q */
    public int f13414q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(SessionWorker sessionWorker, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f13413p = sessionWorker;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f13412o = obj;
        this.f13414q |= Integer.MIN_VALUE;
        return this.f13413p.h(this);
    }
}
