package z5;

import d5.EnumC0830a;
import m5.C1216r;

/* JADX INFO: renamed from: z5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2113h implements InterfaceC2110e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A5.o f21286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F f21287p;

    public C2113h(A5.o oVar, F f7) {
        this.f21286o = oVar;
        this.f21287p = f7;
    }

    @Override // z5.InterfaceC2110e
    public final Object b(InterfaceC2111f interfaceC2111f, c5.d dVar) {
        Object objB = this.f21286o.b(new A5.D(new C1216r(), interfaceC2111f, this.f21287p), dVar);
        return objB == EnumC0830a.f11264o ? objB : Y4.o.f8736a;
    }
}
