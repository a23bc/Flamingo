package h6;

import U5.C0450w;
import android.content.Context;
import f0.C0888g0;
import f0.C0890h0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.Z0;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.C1395m;
import r0.InterfaceC1398p;
import v.InterfaceC1626w;
import w.C1670c;

/* JADX INFO: renamed from: h6.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1015e0 implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f13025o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f13026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13027q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f13028r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f13029s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f13030t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13031u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f13032v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C1670c f13033w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Z0 f13034x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f13035y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13036z;

    public C1015e0(InterfaceC1180a interfaceC1180a, InterfaceC1182c interfaceC1182c, InterfaceC0878b0 interfaceC0878b0, C0890h0 c0890h0, InterfaceC1180a interfaceC1180a2, InterfaceC1182c interfaceC1182c2, InterfaceC0878b0 interfaceC0878b02, C0888g0 c0888g0, C1670c c1670c, Z0 z02, Context context, InterfaceC0878b0 interfaceC0878b03) {
        this.f13025o = interfaceC1180a;
        this.f13026p = interfaceC1182c;
        this.f13027q = interfaceC0878b0;
        this.f13028r = c0890h0;
        this.f13029s = interfaceC1180a2;
        this.f13030t = interfaceC1182c2;
        this.f13031u = interfaceC0878b02;
        this.f13032v = c0888g0;
        this.f13033w = c1670c;
        this.f13034x = z02;
        this.f13035y = context;
        this.f13036z = interfaceC0878b03;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        AbstractC1209k.f((InterfaceC1626w) obj, "$this$AnimatedVisibility");
        AbstractC1110d.n(n0.e.e(-1312686329, new C0450w(this.f13033w, this.f13034x, this.f13035y, this.f13036z, this.f13027q, this.f13028r), c0912t), c0912t, 6);
        InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(C1395m.f15634a, 0.0f, 52, 0.0f, 0.0f, 13);
        c0912t.X(-923584358);
        InterfaceC0878b0 interfaceC0878b0 = this.f13027q;
        boolean zF = c0912t.f(interfaceC0878b0);
        C0890h0 c0890h0 = this.f13028r;
        boolean zF2 = zF | c0912t.f(c0890h0);
        Object objK = c0912t.K();
        f0.W w7 = C0903o.f11850a;
        if (zF2 || objK == w7) {
            objK = new C1007a0(interfaceC0878b0, c0890h0, 0);
            c0912t.i0(objK);
        }
        InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK;
        c0912t.p(false);
        c0912t.X(-923570048);
        boolean zF3 = c0912t.f(interfaceC0878b0) | c0912t.f(c0890h0);
        Object objK2 = c0912t.K();
        if (zF3 || objK2 == w7) {
            objK2 = new C1009b0(interfaceC0878b0, c0890h0, 0);
            c0912t.i0(objK2);
        }
        InterfaceC1182c interfaceC1182c = (InterfaceC1182c) objK2;
        c0912t.p(false);
        c0912t.X(-923547946);
        boolean zF4 = c0912t.f(interfaceC0878b0) | c0912t.f(c0890h0);
        Object objK3 = c0912t.K();
        if (zF4 || objK3 == w7) {
            objK3 = new C1007a0(interfaceC0878b0, c0890h0, 1);
            c0912t.i0(objK3);
        }
        InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) objK3;
        c0912t.p(false);
        b6.k kVar = new b6.k(17);
        c0912t.X(-923527142);
        InterfaceC1180a interfaceC1180a3 = this.f13029s;
        boolean zF5 = c0912t.f(interfaceC1180a3);
        InterfaceC1182c interfaceC1182c2 = this.f13030t;
        boolean zF6 = zF5 | c0912t.f(interfaceC1182c2);
        Object objK4 = c0912t.K();
        if (zF6 || objK4 == w7) {
            objK4 = new S(interfaceC1180a3, interfaceC1182c2, 2);
            c0912t.i0(objK4);
        }
        InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) objK4;
        c0912t.p(false);
        c0912t.X(-923511994);
        boolean zF7 = c0912t.f(interfaceC1180a3) | c0912t.f(interfaceC1182c2);
        Object objK5 = c0912t.K();
        if (zF7 || objK5 == w7) {
            objK5 = new S(interfaceC1180a3, interfaceC1182c2, 3);
            c0912t.i0(objK5);
        }
        InterfaceC1180a interfaceC1180a5 = (InterfaceC1180a) objK5;
        c0912t.p(false);
        c0912t.X(-923496873);
        boolean zF8 = c0912t.f(interfaceC1180a3);
        Object objK6 = c0912t.K();
        if (zF8 || objK6 == w7) {
            objK6 = new I.L(interfaceC1180a3, 5);
            c0912t.i0(objK6);
        }
        InterfaceC1180a interfaceC1180a6 = (InterfaceC1180a) objK6;
        c0912t.p(false);
        c0912t.X(-923490946);
        boolean zF9 = c0912t.f(interfaceC0878b0) | c0912t.f(c0890h0);
        Object objK7 = c0912t.K();
        if (zF9 || objK7 == w7) {
            objK7 = new C1007a0(interfaceC0878b0, c0890h0, 2);
            c0912t.i0(objK7);
        }
        InterfaceC1180a interfaceC1180a7 = (InterfaceC1180a) objK7;
        c0912t.p(false);
        c0912t.X(-923462862);
        InterfaceC0878b0 interfaceC0878b02 = this.f13031u;
        boolean zF10 = c0912t.f(interfaceC0878b02);
        C0888g0 c0888g0 = this.f13032v;
        boolean zF11 = zF10 | c0912t.f(c0888g0);
        Object objK8 = c0912t.K();
        if (zF11 || objK8 == w7) {
            objK8 = new C1013d0(interfaceC0878b02, c0888g0, null, 0);
            c0912t.i0(objK8);
        }
        c0912t.p(false);
        M3.a.k(this.f13025o, this.f13026p, interfaceC1180a, interfaceC1182c, interfaceC1180a2, kVar, interfaceC1180a4, interfaceC1180a5, interfaceC1180a6, interfaceC1180a7, (InterfaceC1182c) objK8, interfaceC1398pJ, c0912t, 196608);
        return Y4.o.f8736a;
    }
}
