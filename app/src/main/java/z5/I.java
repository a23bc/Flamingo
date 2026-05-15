package z5;

import d5.EnumC0830a;
import e5.AbstractC0865c;
import w5.InterfaceC1786g0;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public J f21260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC2111f f21261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public K f21262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC1786g0 f21263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f21264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f21265t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J f21266u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f21267v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j3, c5.d dVar) {
        super(dVar);
        this.f21266u = j3;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f21265t = obj;
        this.f21267v |= Integer.MIN_VALUE;
        this.f21266u.b(null, this);
        return EnumC0830a.f11264o;
    }
}
