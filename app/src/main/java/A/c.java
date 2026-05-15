package A;

import e5.AbstractC0865c;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1182c f4o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f5p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ h f6q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f6q = hVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f5p = obj;
        this.f7r |= Integer.MIN_VALUE;
        return this.f6q.c(null, 0.0f, null, this);
    }
}
