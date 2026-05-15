package V4;

import f0.C0879c;
import f0.C0912t;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import r0.InterfaceC1398p;
import r5.C1420a;

/* JADX INFO: renamed from: V4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0462i extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f7505p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f7506q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f7507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f7508s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1420a f7509t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0458e f7510u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ B.k f7511v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0.d f7512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n0.d f7513x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0462i(float f7, InterfaceC1182c interfaceC1182c, InterfaceC1398p interfaceC1398p, boolean z6, C1420a c1420a, C0458e c0458e, B.k kVar, n0.d dVar, n0.d dVar2, int i7) {
        super(2);
        this.f7505p = f7;
        this.f7506q = interfaceC1182c;
        this.f7507r = interfaceC1398p;
        this.f7508s = z6;
        this.f7509t = c1420a;
        this.f7510u = c0458e;
        this.f7511v = kVar;
        this.f7512w = dVar;
        this.f7513x = dVar2;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iB = C0879c.B(905969713);
        n0.d dVar = this.f7512w;
        C1420a c1420a = this.f7509t;
        C0458e c0458e = this.f7510u;
        B.k kVar = this.f7511v;
        x.a(this.f7505p, this.f7506q, this.f7507r, this.f7508s, c1420a, c0458e, kVar, dVar, this.f7513x, (C0912t) obj, iB);
        return Y4.o.f8736a;
    }
}
