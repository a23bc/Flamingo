package r1;

import f0.C0879c;
import f0.C0912t;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import r0.C1390h;

/* JADX INFO: renamed from: r1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1414h extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1390h f15687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f15688q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f15689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1405D f15690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n0.d f15691t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1414h(C1390h c1390h, long j3, InterfaceC1180a interfaceC1180a, C1405D c1405d, n0.d dVar, int i7) {
        super(2);
        this.f15687p = c1390h;
        this.f15688q = j3;
        this.f15689r = interfaceC1180a;
        this.f15690s = c1405d;
        this.f15691t = dVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iB = C0879c.B(24577);
        n0.d dVar = this.f15691t;
        long j3 = this.f15688q;
        InterfaceC1180a interfaceC1180a = this.f15689r;
        n.b(this.f15687p, j3, interfaceC1180a, this.f15690s, dVar, (C0912t) obj, iB);
        return Y4.o.f8736a;
    }
}
