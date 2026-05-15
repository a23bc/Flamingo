package u6;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import b1.C0615K;
import f0.C0879c;
import f0.C0888g0;
import f0.C0890h0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.Z0;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w3.C1760y;

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements l5.g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ h6.L f17349A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17350B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17351C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ D0 f17352D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f17353o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f17354p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d6.g f17355q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f17356r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f17357s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17358t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b1.M f17359u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b1.M f17360v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f17361w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f17362x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0615K f17363y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Context f17364z;

    public C0(List list, boolean z6, d6.g gVar, boolean z7, boolean z8, InterfaceC0878b0 interfaceC0878b0, b1.M m7, b1.M m8, long j3, long j7, C0615K c0615k, Context context, h6.L l, InterfaceC0878b0 interfaceC0878b02, InterfaceC0878b0 interfaceC0878b03, D0 d02) {
        this.f17353o = list;
        this.f17354p = z6;
        this.f17355q = gVar;
        this.f17356r = z7;
        this.f17357s = z8;
        this.f17358t = interfaceC0878b0;
        this.f17359u = m7;
        this.f17360v = m8;
        this.f17361w = j3;
        this.f17362x = j7;
        this.f17363y = c0615k;
        this.f17364z = context;
        this.f17349A = l;
        this.f17350B = interfaceC0878b02;
        this.f17351C = interfaceC0878b03;
        this.f17352D = d02;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        int i8;
        d6.g gVar;
        d6.f fVar;
        final int iIntValue = ((Number) obj).intValue();
        C1553a c1553a = (C1553a) obj2;
        C0912t c0912t = (C0912t) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        AbstractC1209k.f(c1553a, "aligned");
        if ((iIntValue2 & 6) == 0) {
            i7 = (c0912t.d(iIntValue) ? 4 : 2) | iIntValue2;
        } else {
            i7 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i7 |= c0912t.f(c1553a) ? 32 : 16;
        }
        if ((i7 & 147) == 146 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.X(2082301900);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = new C0888g0(-1);
                c0912t.i0(objK);
            }
            final C0888g0 c0888g0 = (C0888g0) objK;
            c0912t.p(false);
            C0890h0 c0890h0 = E0.f17384b;
            Long lValueOf = Long.valueOf(c0890h0.h());
            c0912t.X(2082305039);
            List list = this.f17353o;
            boolean zF = c0912t.f(list);
            Object objK2 = c0912t.K();
            if (zF || objK2 == w7) {
                objK2 = new B0(list, c0888g0, null);
                c0912t.i0(objK2);
            }
            c0912t.p(false);
            C0879c.e(c0912t, lValueOf, (l5.e) objK2);
            long jH = c0890h0.h();
            final d6.f fVar2 = c1553a.f17558a;
            long j3 = fVar2.f11291p;
            int iH = c0888g0.h();
            c0912t.X(2082319805);
            int i9 = i7 & 14;
            boolean zD = c0912t.d(iH) | c0912t.e(jH) | (i9 == 4) | c0912t.e(j3) | c0912t.e(fVar2.f11292q);
            Object objK3 = c0912t.K();
            if (zD || objK3 == w7) {
                objK3 = C0879c.o(new InterfaceC1180a() { // from class: u6.x0
                    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                    @Override // l5.InterfaceC1180a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a() {
                        /*
                            r5 = this;
                            d6.f r0 = r1
                            java.lang.String r1 = "$lines"
                            m5.AbstractC1209k.f(r0, r1)
                            f0.g0 r1 = r3
                            int r1 = r1.h()
                            int r2 = r2
                            if (r2 == r1) goto L29
                            r1 = 1
                            long r3 = r0.f11291p
                            long r3 = r3 + r1
                            f0.h0 r1 = u6.E0.f17384b
                            long r1 = r1.h()
                            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                            if (r3 > 0) goto L27
                            long r3 = r0.f11292q
                            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                            if (r0 >= 0) goto L27
                            goto L29
                        L27:
                            r0 = 0
                            goto L2a
                        L29:
                            r0 = 1
                        L2a:
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: u6.x0.a():java.lang.Object");
                    }
                });
                c0912t.i0(objK3);
            }
            final Z0 z02 = (Z0) objK3;
            Object objR = n1.c.r(2082340534, c0912t, false);
            if (objR == w7) {
                objR = C0879c.o(new F.n(c0888g0, this.f17350B, this.f17351C, 13));
                c0912t.i0(objR);
            }
            final Z0 z03 = (Z0) objR;
            c0912t.p(false);
            boolean zBooleanValue = ((Boolean) z03.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) z02.getValue()).booleanValue();
            c0912t.X(2082369345);
            boolean zG = c0912t.g(zBooleanValue) | c0912t.g(zBooleanValue2) | c0912t.g(this.f17354p);
            Object objK4 = c0912t.K();
            if (zG || objK4 == w7) {
                final boolean z6 = this.f17354p;
                i8 = i9;
                final boolean z7 = this.f17356r;
                InterfaceC1180a interfaceC1180a = new InterfaceC1180a(z6, iIntValue, c0888g0, z03, z02, z7) { // from class: u6.y0

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    public final /* synthetic */ boolean f17930o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    public final /* synthetic */ int f17931p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    public final /* synthetic */ C0888g0 f17932q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ Z0 f17933r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ Z0 f17934s;

                    @Override // l5.InterfaceC1180a
                    public final Object a() {
                        float fAbs;
                        C0888g0 c0888g02 = this.f17932q;
                        Z0 z04 = this.f17933r;
                        Z0 z05 = this.f17934s;
                        if (((Boolean) z04.getValue()).booleanValue() && !((Boolean) z05.getValue()).booleanValue() && this.f17930o) {
                            fAbs = Math.abs(this.f17931p - c0888g02.h()) * 2.2f;
                            if (fAbs > 5.0f) {
                                fAbs = 5.0f;
                            }
                        } else {
                            fAbs = 0.0f;
                        }
                        return Float.valueOf(fAbs);
                    }
                };
                c0912t.i0(interfaceC1180a);
                objK4 = interfaceC1180a;
            } else {
                i8 = i9;
            }
            InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) objK4;
            c0912t.p(false);
            boolean zBooleanValue3 = ((Boolean) z02.getValue()).booleanValue();
            d6.g gVar2 = this.f17355q;
            c0912t.X(2082389185);
            InterfaceC0878b0 interfaceC0878b0 = this.f17358t;
            boolean zF2 = c0912t.f(interfaceC0878b0);
            Object objK5 = c0912t.K();
            if (zF2 || objK5 == w7) {
                objK5 = new i6.r(interfaceC0878b0, 12);
                c0912t.i0(objK5);
            }
            InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) objK5;
            Object objR2 = n1.c.r(2082404290, c0912t, false);
            final D0 d02 = this.f17352D;
            if (objR2 == w7) {
                final int i10 = 0;
                objR2 = new InterfaceC1182c() { // from class: u6.z0
                    @Override // l5.InterfaceC1182c
                    public final Object b(Object obj5) {
                        int i11 = i10;
                        int iIntValue3 = ((Integer) obj5).intValue();
                        switch (i11) {
                            case 0:
                                D0 d03 = d02;
                                AbstractC1209k.f(d03, "$currentItemHeights");
                                C0888g0 c0888g02 = d03.f17373a;
                                if (c0888g02.h() != iIntValue3) {
                                    d03.f17375c.j(c0888g02.h());
                                    c0888g02.j(iIntValue3);
                                }
                                break;
                            default:
                                D0 d04 = d02;
                                AbstractC1209k.f(d04, "$currentItemHeights");
                                C0888g0 c0888g03 = d04.f17374b;
                                d04.f17376d.j(c0888g03.h());
                                c0888g03.j(iIntValue3);
                                break;
                        }
                        return Y4.o.f8736a;
                    }
                };
                c0912t.i0(objR2);
            }
            InterfaceC1182c interfaceC1182c = (InterfaceC1182c) objR2;
            Object objR3 = n1.c.r(2082415409, c0912t, false);
            if (objR3 == w7) {
                final int i11 = 1;
                objR3 = new InterfaceC1182c() { // from class: u6.z0
                    @Override // l5.InterfaceC1182c
                    public final Object b(Object obj5) {
                        int i112 = i11;
                        int iIntValue3 = ((Integer) obj5).intValue();
                        switch (i112) {
                            case 0:
                                D0 d03 = d02;
                                AbstractC1209k.f(d03, "$currentItemHeights");
                                C0888g0 c0888g02 = d03.f17373a;
                                if (c0888g02.h() != iIntValue3) {
                                    d03.f17375c.j(c0888g02.h());
                                    c0888g02.j(iIntValue3);
                                }
                                break;
                            default:
                                D0 d04 = d02;
                                AbstractC1209k.f(d04, "$currentItemHeights");
                                C0888g0 c0888g03 = d04.f17374b;
                                d04.f17376d.j(c0888g03.h());
                                c0888g03.j(iIntValue3);
                                break;
                        }
                        return Y4.o.f8736a;
                    }
                };
                c0912t.i0(objR3);
            }
            InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) objR3;
            c0912t.p(false);
            c0912t.X(2082422420);
            boolean zF3 = c0912t.f(this.f17364z);
            boolean z8 = i8 == 4;
            final h6.L l = this.f17349A;
            boolean zH = zF3 | z8 | c0912t.h(l) | c0912t.f(fVar2);
            Object objK6 = c0912t.K();
            if (zH || objK6 == w7) {
                final Context context = this.f17364z;
                final InterfaceC0878b0 interfaceC0878b02 = this.f17350B;
                gVar = gVar2;
                InterfaceC1180a interfaceC1180a4 = new InterfaceC1180a() { // from class: u6.A0
                    @Override // l5.InterfaceC1180a
                    public final Object a() {
                        Context context2 = context;
                        AbstractC1209k.f(context2, "$context");
                        C0888g0 c0888g02 = c0888g0;
                        InterfaceC0878b0 interfaceC0878b03 = interfaceC0878b02;
                        AbstractC1209k.f(interfaceC0878b03, "$enableLyricScroll");
                        h6.L l7 = l;
                        d6.f fVar3 = fVar2;
                        AbstractC1209k.f(fVar3, "$lines");
                        Object systemService = context2.getSystemService("vibrator");
                        AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                        Vibrator vibrator = (Vibrator) systemService;
                        if (Build.VERSION.SDK_INT >= 29) {
                            vibrator.vibrate(VibrationEffect.createPredefined(1));
                        } else {
                            vibrator.vibrate(30L);
                        }
                        c0888g02.j(iIntValue);
                        interfaceC0878b03.setValue(Boolean.TRUE);
                        int i12 = (int) fVar3.f11291p;
                        switch (l7.f12883a) {
                            case 0:
                                b6.i iVar = b6.i.f10421a;
                                C1760y c1760y = b6.i.f10423c;
                                if (c1760y != null) {
                                    c1760y.k(i12);
                                }
                                break;
                            default:
                                b6.i iVar2 = b6.i.f10421a;
                                C1760y c1760y2 = b6.i.f10423c;
                                if (c1760y2 != null) {
                                    c1760y2.k(i12);
                                }
                                break;
                        }
                        return Y4.o.f8736a;
                    }
                };
                fVar = fVar2;
                c0912t.i0(interfaceC1180a4);
                objK6 = interfaceC1180a4;
            } else {
                gVar = gVar2;
                fVar = fVar2;
            }
            c0912t.p(false);
            E0.d(zBooleanValue3, this.f17356r, fVar, fVar.f11295t, this.f17357s, interfaceC1180a3, gVar.f11298b, interfaceC1180a2, this.f17359u, this.f17360v, this.f17361w, this.f17362x, this.f17363y, c1553a.f17559b, interfaceC1182c, interfaceC1182c2, (InterfaceC1180a) objK6, c0912t, 0);
        }
        return Y4.o.f8736a;
    }
}
