package h6;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0074o;
import D.C0062e;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import U5.C0445q;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d0.AbstractC0774A;
import f0.C0879c;
import f0.C0886f0;
import f0.C0890h0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1389g;
import r0.C1390h;
import r0.C1395m;
import r0.InterfaceC1398p;
import r5.C1420a;
import y0.AbstractC1959I;
import y0.C1987t;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class A0 implements l5.e {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Y4.c f12757A;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f12758o = 1;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC0878b0 f12759p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0878b0 f12760q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1180a f12761r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Context f12762s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f12763t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f12764u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f12765v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f12766w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f12767x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f12768y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f12769z;

    public A0(InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, InterfaceC1180a interfaceC1180a, Context context, InterfaceC1182c interfaceC1182c, InterfaceC1180a interfaceC1180a2, InterfaceC1182c interfaceC1182c2, InterfaceC1180a interfaceC1180a3, InterfaceC1182c interfaceC1182c3, InterfaceC1180a interfaceC1180a4, InterfaceC1182c interfaceC1182c4, InterfaceC1180a interfaceC1180a5) {
        this.f12759p = interfaceC0878b0;
        this.f12760q = interfaceC0878b02;
        this.f12761r = interfaceC1180a;
        this.f12762s = context;
        this.f12763t = interfaceC1182c;
        this.f12764u = interfaceC1180a2;
        this.f12765v = interfaceC1182c2;
        this.f12766w = interfaceC1180a3;
        this.f12767x = interfaceC1182c3;
        this.f12768y = interfaceC1180a4;
        this.f12769z = interfaceC1182c4;
        this.f12757A = interfaceC1180a5;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0353i c0353i;
        C0351h c0351h;
        C0351h c0351h2;
        switch (this.f12758o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue() & 3;
                Y4.o oVar = Y4.o.f8736a;
                if (iIntValue == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    C0886f0 c0886f0 = (C0886f0) this.f12763t;
                    float fH = c0886f0.h();
                    C0890h0 c0890h0 = (C0890h0) this.f12764u;
                    float fH2 = c0890h0.h();
                    if (fH2 < 0.0f) {
                        fH2 = 0.0f;
                    }
                    C1420a c1420a = new C1420a(0.0f, fH2);
                    d0.p0 p0VarA = d0.r0.a(C1987t.f20259f, AbstractC1959I.c(234881023), c0912t);
                    InterfaceC1398p interfaceC1398pC = androidx.compose.foundation.layout.c.c(AbstractC1109c.v(c0912t, C1395m.f15634a), 14);
                    c0912t.X(-1373877203);
                    Z0 z02 = (Z0) this.f12765v;
                    boolean zF = c0912t.f(z02);
                    Z0 z03 = (Z0) this.f12766w;
                    boolean zF2 = zF | c0912t.f(z03);
                    Object objK = c0912t.K();
                    f0.W w7 = C0903o.f11850a;
                    if (zF2 || objK == w7) {
                        objK = new C1043t(z02, z03, 1);
                        c0912t.i0(objK);
                    }
                    c0912t.p(false);
                    InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.ui.graphics.a.a(interfaceC1398pC, (InterfaceC1182c) objK), 25, 0.0f, 2);
                    c0912t.X(-1373866781);
                    Object objK2 = c0912t.K();
                    if (objK2 == w7) {
                        objK2 = new y0((InterfaceC0878b0) this.f12768y, 0);
                        c0912t.i0(objK2);
                    }
                    c0912t.p(false);
                    InterfaceC1398p interfaceC1398pB = K0.H.b(interfaceC1398pI, oVar, (PointerInputEventHandler) objK2);
                    c0912t.X(-1373921434);
                    boolean zF3 = c0912t.f(this.f12759p) | c0912t.f(c0890h0) | c0912t.f(this.f12760q) | c0912t.f(this.f12761r);
                    Object objK3 = c0912t.K();
                    if (zF3 || objK3 == w7) {
                        objK3 = new w0((InterfaceC0878b0) this.f12769z, (C0886f0) this.f12763t, this.f12759p, (C0890h0) this.f12764u, this.f12760q, this.f12761r, 0);
                        c0912t.i0(objK3);
                    }
                    InterfaceC1182c interfaceC1182c = (InterfaceC1182c) objK3;
                    c0912t.p(false);
                    c0912t.X(-1373900645);
                    Context context = this.f12762s;
                    boolean zF4 = c0912t.f(context);
                    b6.k kVar = (b6.k) this.f12757A;
                    boolean zF5 = zF4 | c0912t.f(kVar);
                    Object objK4 = c0912t.K();
                    if (zF5 || objK4 == w7) {
                        C0445q c0445q = new C0445q(context, (InterfaceC1182c) kVar, c0886f0, (InterfaceC0878b0) this.f12769z, 2);
                        c0912t.i0(c0445q);
                        objK4 = c0445q;
                    }
                    c0912t.p(false);
                    d0.A0.a(fH, interfaceC1182c, interfaceC1398pB, false, (InterfaceC1180a) objK4, p0VarA, null, AbstractC1014e.f13021e, n0.e.e(1517532413, new z0((Object) c0886f0, (Object) c0890h0, this.f12767x, 0), c0912t), c1420a, c0912t, 905969664);
                }
                return oVar;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    C1395m c1395m = C1395m.f15634a;
                    InterfaceC1398p interfaceC1398pC2 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 7, 4), 22);
                    C1390h c1390h = C1385c.f15616s;
                    O0.Z zD = AbstractC0074o.d(c1390h, false);
                    long j3 = c0912t2.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t2, interfaceC1398pC2);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i2);
                    } else {
                        c0912t2.l0();
                    }
                    C0351h c0351h3 = C0354j.f6019f;
                    C0879c.y(c0912t2, zD, c0351h3);
                    C0351h c0351h4 = C0354j.f6018e;
                    C0879c.y(c0912t2, interfaceC0906p0L, c0351h4);
                    C0351h c0351h5 = C0354j.f6020g;
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i7))) {
                        n1.c.w(i7, c0912t2, i7, c0351h5);
                    }
                    C0351h c0351h6 = C0354j.f6017d;
                    C0879c.y(c0912t2, interfaceC1398pC3, c0351h6);
                    InterfaceC1398p interfaceC1398pB2 = androidx.compose.foundation.layout.c.b(c1395m, 1.0f);
                    C0062e c0062e = AbstractC0068i.f1332f;
                    C1389g c1389g = C1385c.f15621x;
                    D.q0 q0VarA = D.o0.a(c0062e, c1389g, c0912t2, 6);
                    long j7 = c0912t2.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC4 = AbstractC1383a.c(c0912t2, interfaceC1398pB2);
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i2);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, q0VarA, c0351h3);
                    C0879c.y(c0912t2, interfaceC0906p0L2, c0351h4);
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t2, i8, c0351h5);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC4, c0351h6);
                    String str = (String) this.f12759p.getValue();
                    long jU = AbstractC1109c.u(12);
                    f1.k kVar2 = f1.k.f12003u;
                    long jT = AbstractC1109c.t(0.3d);
                    long j8 = C1987t.f20259f;
                    d0.H0.b(str, AbstractC1109c.v(c0912t2, c1395m), C1987t.b(j8, 0.3f), jU, kVar2, null, jT, null, 0L, 0, false, 0, 0, null, c0912t2, 12782976, 0, 130896);
                    d0.H0.b((String) this.f12760q.getValue(), AbstractC1109c.v(c0912t2, c1395m), C1987t.b(j8, 0.3f), AbstractC1109c.u(12), kVar2, null, AbstractC1109c.t(0.3d), null, 0L, 0, false, 0, 0, null, c0912t2, 12782976, 0, 130896);
                    c0912t2.p(true);
                    u6.L.b(0, c0912t2);
                    c0912t2.p(true);
                    InterfaceC1398p interfaceC1398pB3 = androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.c(c1395m, 75), 1.0f);
                    O0.Z zD2 = AbstractC0074o.d(c1390h, false);
                    long j9 = c0912t2.f11891T;
                    int i9 = (int) (j9 ^ (j9 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L3 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC5 = AbstractC1383a.c(c0912t2, interfaceC1398pB3);
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0353i = c0353i2;
                        c0912t2.k(c0353i);
                    } else {
                        c0353i = c0353i2;
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, zD2, c0351h3);
                    C0879c.y(c0912t2, interfaceC0906p0L3, c0351h4);
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                        c0351h = c0351h5;
                        n1.c.w(i9, c0912t2, i9, c0351h);
                    } else {
                        c0351h = c0351h5;
                    }
                    C0879c.y(c0912t2, interfaceC1398pC5, c0351h6);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                    InterfaceC1398p interfaceC1398pI2 = androidx.compose.foundation.layout.a.i(fillElement, 5, 0.0f, 2);
                    D.q0 q0VarA2 = D.o0.a(AbstractC0068i.f1327a, c1389g, c0912t2, 0);
                    long j10 = c0912t2.f11891T;
                    int i10 = (int) (j10 ^ (j10 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L4 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC6 = AbstractC1383a.c(c0912t2, interfaceC1398pI2);
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, q0VarA2, c0351h3);
                    C0879c.y(c0912t2, interfaceC0906p0L4, c0351h4);
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i10))) {
                        n1.c.w(i10, c0912t2, i10, c0351h);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC6, c0351h6);
                    float f7 = 26;
                    InterfaceC1398p interfaceC1398pF = A0.e.Q(i6.h.l(AbstractC1109c.v(c0912t2, c1395m), 0.6f), 1.0f).f(fillElement);
                    O0.Z zD3 = AbstractC0074o.d(C1385c.f15615r, false);
                    long j11 = c0912t2.f11891T;
                    int i11 = (int) (j11 ^ (j11 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L5 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC7 = AbstractC1383a.c(c0912t2, interfaceC1398pF);
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, zD3, c0351h3);
                    C0879c.y(c0912t2, interfaceC0906p0L5, c0351h4);
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i11))) {
                        n1.c.w(i11, c0912t2, i11, c0351h);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC7, c0351h6);
                    InterfaceC1180a interfaceC1180a = this.f12761r;
                    Context context2 = this.f12762s;
                    M3.a.t(interfaceC1180a, context2, (InterfaceC1182c) this.f12763t, f7, c0912t2, 3072);
                    c0912t2.p(true);
                    InterfaceC1398p interfaceC1398pF2 = A0.e.Q(i6.h.l(AbstractC1109c.v(c0912t2, c1395m), 0.6f), 1.0f).f(fillElement);
                    O0.Z zD4 = AbstractC0074o.d(C1385c.f15617t, false);
                    long j12 = c0912t2.f11891T;
                    int i12 = (int) (j12 ^ (j12 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L6 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC8 = AbstractC1383a.c(c0912t2, interfaceC1398pF2);
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, zD4, c0351h3);
                    C0879c.y(c0912t2, interfaceC0906p0L6, c0351h4);
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i12))) {
                        n1.c.w(i12, c0912t2, i12, c0351h);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC8, c0351h6);
                    M3.a.s((InterfaceC1180a) this.f12764u, context2, (InterfaceC1182c) this.f12765v, f7, c0912t2, 3072);
                    c0912t2.p(true);
                    c0912t2.p(true);
                    D.q0 q0VarA3 = D.o0.a(AbstractC0068i.f1331e, C1385c.f15622y, c0912t2, 54);
                    long j13 = c0912t2.f11891T;
                    int i13 = (int) (j13 ^ (j13 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L7 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC9 = AbstractC1383a.c(c0912t2, fillElement);
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, q0VarA3, c0351h3);
                    C0879c.y(c0912t2, interfaceC0906p0L7, c0351h4);
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i13))) {
                        n1.c.w(i13, c0912t2, i13, c0351h);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC9, c0351h6);
                    float f8 = 51;
                    InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.c.g(c1395m, f8);
                    c0912t2.X(-1591624041);
                    Object objK5 = c0912t2.K();
                    f0.W w8 = C0903o.f11850a;
                    if (objK5 == w8) {
                        objK5 = n1.c.q(c0912t2);
                    }
                    B.k kVar3 = (B.k) objK5;
                    c0912t2.p(false);
                    Y.n nVarA = Y.m.a();
                    c0912t2.X(-1591618504);
                    boolean zF6 = c0912t2.f(context2);
                    InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) this.f12766w;
                    boolean zF7 = zF6 | c0912t2.f(interfaceC1180a2);
                    Object objK6 = c0912t2.K();
                    if (zF7 || objK6 == w8) {
                        objK6 = new C1047v(context2, interfaceC1180a2, 4);
                        c0912t2.i0(objK6);
                    }
                    c0912t2.p(false);
                    InterfaceC1398p interfaceC1398pC10 = androidx.compose.foundation.a.c(interfaceC1398pG, kVar3, nVarA, false, (InterfaceC1180a) objK6, 28);
                    O0.Z zD5 = AbstractC0074o.d(c1390h, false);
                    long j14 = c0912t2.f11891T;
                    int i14 = (int) (j14 ^ (j14 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L8 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC11 = AbstractC1383a.c(c0912t2, interfaceC1398pC10);
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, zD5, c0351h3);
                    C0879c.y(c0912t2, interfaceC0906p0L8, c0351h4);
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i14))) {
                        n1.c.w(i14, c0912t2, i14, c0351h);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC11, c0351h6);
                    float f9 = 10;
                    C0351h c0351h7 = c0351h;
                    AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_rewind, c0912t2), "Previous", androidx.compose.foundation.layout.a.g(fillElement, f9), 0L, c0912t2, 432, 8);
                    c0912t2.p(true);
                    float f10 = 23;
                    AbstractC0060d.d(c0912t2, androidx.compose.foundation.layout.c.k(c1395m, f10));
                    InterfaceC1398p interfaceC1398pG2 = androidx.compose.foundation.layout.c.g(c1395m, 53.5f);
                    c0912t2.X(-1591586121);
                    Object objK7 = c0912t2.K();
                    if (objK7 == w8) {
                        objK7 = n1.c.q(c0912t2);
                    }
                    B.k kVar4 = (B.k) objK7;
                    c0912t2.p(false);
                    Y.n nVarA2 = Y.m.a();
                    c0912t2.X(-1591580486);
                    boolean zF8 = c0912t2.f(context2);
                    InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) this.f12767x;
                    boolean zF9 = zF8 | c0912t2.f(interfaceC1182c2);
                    InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) this.f12768y;
                    boolean zF10 = zF9 | c0912t2.f(interfaceC1180a3);
                    InterfaceC1182c interfaceC1182c3 = (InterfaceC1182c) this.f12769z;
                    boolean zF11 = zF10 | c0912t2.f(interfaceC1182c3);
                    Object objK8 = c0912t2.K();
                    if (zF11 || objK8 == w8) {
                        objK8 = new B0(context2, interfaceC1182c2, interfaceC1180a3, interfaceC1182c3, 1);
                        c0912t2.i0(objK8);
                    }
                    c0912t2.p(false);
                    InterfaceC1398p interfaceC1398pC12 = androidx.compose.foundation.a.c(interfaceC1398pG2, kVar4, nVarA2, false, (InterfaceC1180a) objK8, 28);
                    O0.Z zD6 = AbstractC0074o.d(c1390h, false);
                    long j15 = c0912t2.f11891T;
                    int i15 = (int) (j15 ^ (j15 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L9 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC13 = AbstractC1383a.c(c0912t2, interfaceC1398pC12);
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, zD6, c0351h3);
                    C0879c.y(c0912t2, interfaceC0906p0L9, c0351h4);
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i15))) {
                        c0351h2 = c0351h7;
                        n1.c.w(i15, c0912t2, i15, c0351h2);
                    } else {
                        c0351h2 = c0351h7;
                    }
                    C0879c.y(c0912t2, interfaceC1398pC13, c0351h6);
                    C0351h c0351h8 = c0351h2;
                    C0353i c0353i3 = c0353i;
                    AbstractC1110d.a(interfaceC1180a3.a(), null, new b6.k(21), null, null, null, AbstractC1014e.h, c0912t2, 1573248, 58);
                    c0912t2.p(true);
                    AbstractC0060d.d(c0912t2, androidx.compose.foundation.layout.c.k(c1395m, f10));
                    InterfaceC1398p interfaceC1398pG3 = androidx.compose.foundation.layout.c.g(c1395m, f8);
                    c0912t2.X(-1591484873);
                    Object objK9 = c0912t2.K();
                    if (objK9 == w8) {
                        objK9 = n1.c.q(c0912t2);
                    }
                    B.k kVar5 = (B.k) objK9;
                    c0912t2.p(false);
                    Y.n nVarA3 = Y.m.a();
                    c0912t2.X(-1591479340);
                    boolean zF12 = c0912t2.f(context2);
                    InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) this.f12757A;
                    boolean zF13 = zF12 | c0912t2.f(interfaceC1180a4);
                    Object objK10 = c0912t2.K();
                    if (zF13 || objK10 == w8) {
                        objK10 = new C1047v(context2, interfaceC1180a4, 3);
                        c0912t2.i0(objK10);
                    }
                    c0912t2.p(false);
                    InterfaceC1398p interfaceC1398pC14 = androidx.compose.foundation.a.c(interfaceC1398pG3, kVar5, nVarA3, false, (InterfaceC1180a) objK10, 28);
                    O0.Z zD7 = AbstractC0074o.d(c1390h, false);
                    long j16 = c0912t2.f11891T;
                    int i16 = (int) (j16 ^ (j16 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L10 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC15 = AbstractC1383a.c(c0912t2, interfaceC1398pC14);
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i3);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, zD7, c0351h3);
                    C0879c.y(c0912t2, interfaceC0906p0L10, c0351h4);
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i16))) {
                        n1.c.w(i16, c0912t2, i16, c0351h8);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC15, c0351h6);
                    AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_fforward, c0912t2), "Next", androidx.compose.foundation.layout.a.g(fillElement, f9), 0L, c0912t2, 432, 8);
                    c0912t2.p(true);
                    c0912t2.p(true);
                    c0912t2.p(true);
                }
                return Y4.o.f8736a;
        }
    }

    public A0(C0886f0 c0886f0, C0890h0 c0890h0, Z0 z02, Z0 z03, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, InterfaceC1180a interfaceC1180a, Context context, b6.k kVar, InterfaceC0878b0 interfaceC0878b03, InterfaceC0878b0 interfaceC0878b04, Z0 z04) {
        this.f12763t = c0886f0;
        this.f12764u = c0890h0;
        this.f12765v = z02;
        this.f12766w = z03;
        this.f12759p = interfaceC0878b0;
        this.f12760q = interfaceC0878b02;
        this.f12761r = interfaceC1180a;
        this.f12762s = context;
        this.f12757A = kVar;
        this.f12768y = interfaceC0878b03;
        this.f12769z = interfaceC0878b04;
        this.f12767x = z04;
    }
}
