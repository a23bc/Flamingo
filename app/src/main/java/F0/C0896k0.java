package f0;

import R0.C0371a0;
import e5.AbstractC0865c;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: f0.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0896k0 extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1182c f11816o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0371a0 f11818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11819r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0896k0(C0371a0 c0371a0, c5.d dVar) {
        super(dVar);
        this.f11818q = c0371a0;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f11817p = obj;
        this.f11819r |= Integer.MIN_VALUE;
        return this.f11818q.s(null, this);
    }
}
