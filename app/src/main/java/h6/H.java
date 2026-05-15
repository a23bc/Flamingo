package h6;

import F.C0130c;
import R0.AbstractC0403q0;
import R0.C0404r0;
import R0.O0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import j5.AbstractC1109c;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.C1395m;
import r0.InterfaceC1398p;
import v.InterfaceC1626w;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class H implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12860p;

    public /* synthetic */ H(InterfaceC0878b0 interfaceC0878b0, int i7) {
        this.f12859o = i7;
        this.f12860p = interfaceC0878b0;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f12859o) {
            case 0:
                ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC1626w) obj, "$this$AnimatedVisibility");
                d0.H0.b((String) this.f12860p.getValue(), null, 0L, AbstractC1109c.u(11), f1.k.f12004v, null, 0L, null, AbstractC1109c.u(16), 2, false, 1, 0, null, (C0912t) obj2, 199680, 3126, 119766);
                break;
            case 1:
                ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC1626w) obj, "$this$AnimatedVisibility");
                d0.H0.b((String) this.f12860p.getValue(), null, 0L, AbstractC1109c.u(12), f1.k.f12004v, null, 0L, null, AbstractC1109c.u(12), 2, false, 1, 0, null, (C0912t) obj2, 199680, 3126, 119766);
                break;
            case 2:
                C0912t c0912t = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue & 17) == 16 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    final R0.O0 o02 = (R0.O0) c0912t.j(AbstractC0403q0.f6515p);
                    final InterfaceC0878b0 interfaceC0878b0 = this.f12860p;
                    String str = (String) interfaceC0878b0.getValue();
                    String strS = I0.c.S(R.string.page_library_search_songs, c0912t);
                    InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 18, 0.0f, 2), 0.0f, 5, 0.0f, 0.0f, 13);
                    c0912t.X(324359690);
                    Object objK = c0912t.K();
                    f0.W w7 = C0903o.f11850a;
                    if (objK == w7) {
                        objK = new M.t0(interfaceC0878b0, 15);
                        c0912t.i0(objK);
                    }
                    InterfaceC1182c interfaceC1182c = (InterfaceC1182c) objK;
                    c0912t.p(false);
                    c0912t.X(324370586);
                    boolean zF = c0912t.f(o02);
                    Object objK2 = c0912t.K();
                    if (zF || objK2 == w7) {
                        final int i7 = 0;
                        objK2 = new InterfaceC1180a() { // from class: i6.s
                            @Override // l5.InterfaceC1180a
                            public final Object a() {
                                O0 o03;
                                O0 o04;
                                O0 o05;
                                switch (i7) {
                                    case 0:
                                        InterfaceC0878b0 interfaceC0878b02 = interfaceC0878b0;
                                        AbstractC1209k.f(interfaceC0878b02, "$searchText");
                                        if (((CharSequence) interfaceC0878b02.getValue()).length() > 0 && (o03 = o02) != null) {
                                            ((C0404r0) o03).a();
                                        }
                                        break;
                                    case 1:
                                        InterfaceC0878b0 interfaceC0878b03 = interfaceC0878b0;
                                        AbstractC1209k.f(interfaceC0878b03, "$searchText");
                                        if (((CharSequence) interfaceC0878b03.getValue()).length() > 0 && (o04 = o02) != null) {
                                            ((C0404r0) o04).a();
                                        }
                                        break;
                                    default:
                                        InterfaceC0878b0 interfaceC0878b04 = interfaceC0878b0;
                                        AbstractC1209k.f(interfaceC0878b04, "$searchText");
                                        if (((CharSequence) interfaceC0878b04.getValue()).length() > 0 && (o05 = o02) != null) {
                                            ((C0404r0) o05).a();
                                        }
                                        break;
                                }
                                return Y4.o.f8736a;
                            }
                        };
                        c0912t.i0(objK2);
                    }
                    c0912t.p(false);
                    i6.g.k(str, strS, interfaceC1182c, (InterfaceC1180a) objK2, interfaceC1398pJ, c0912t, 24960);
                }
                break;
            case 3:
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC1209k.f((G.j) obj, "$this$item");
                if ((iIntValue2 & 17) == 16 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    final R0.O0 o03 = (R0.O0) c0912t2.j(AbstractC0403q0.f6515p);
                    final InterfaceC0878b0 interfaceC0878b02 = this.f12860p;
                    String str2 = (String) interfaceC0878b02.getValue();
                    String strS2 = I0.c.S(R.string.page_library_search_album, c0912t2);
                    InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f);
                    c0912t2.X(-1567287566);
                    Object objK3 = c0912t2.K();
                    f0.W w8 = C0903o.f11850a;
                    if (objK3 == w8) {
                        objK3 = new M.t0(interfaceC0878b02, 17);
                        c0912t2.i0(objK3);
                    }
                    InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) objK3;
                    c0912t2.p(false);
                    c0912t2.X(-1567280966);
                    boolean zF2 = c0912t2.f(o03);
                    Object objK4 = c0912t2.K();
                    if (zF2 || objK4 == w8) {
                        final int i8 = 1;
                        objK4 = new InterfaceC1180a() { // from class: i6.s
                            @Override // l5.InterfaceC1180a
                            public final Object a() {
                                O0 o032;
                                O0 o04;
                                O0 o05;
                                switch (i8) {
                                    case 0:
                                        InterfaceC0878b0 interfaceC0878b022 = interfaceC0878b02;
                                        AbstractC1209k.f(interfaceC0878b022, "$searchText");
                                        if (((CharSequence) interfaceC0878b022.getValue()).length() > 0 && (o032 = o03) != null) {
                                            ((C0404r0) o032).a();
                                        }
                                        break;
                                    case 1:
                                        InterfaceC0878b0 interfaceC0878b03 = interfaceC0878b02;
                                        AbstractC1209k.f(interfaceC0878b03, "$searchText");
                                        if (((CharSequence) interfaceC0878b03.getValue()).length() > 0 && (o04 = o03) != null) {
                                            ((C0404r0) o04).a();
                                        }
                                        break;
                                    default:
                                        InterfaceC0878b0 interfaceC0878b04 = interfaceC0878b02;
                                        AbstractC1209k.f(interfaceC0878b04, "$searchText");
                                        if (((CharSequence) interfaceC0878b04.getValue()).length() > 0 && (o05 = o03) != null) {
                                            ((C0404r0) o05).a();
                                        }
                                        break;
                                }
                                return Y4.o.f8736a;
                            }
                        };
                        c0912t2.i0(objK4);
                    }
                    c0912t2.p(false);
                    i6.g.k(str2, strS2, interfaceC1182c2, (InterfaceC1180a) objK4, interfaceC1398pB, c0912t2, 24960);
                }
                break;
            default:
                C0912t c0912t3 = (C0912t) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue3 & 17) == 16 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    final R0.O0 o04 = (R0.O0) c0912t3.j(AbstractC0403q0.f6515p);
                    final InterfaceC0878b0 interfaceC0878b03 = this.f12860p;
                    String str3 = (String) interfaceC0878b03.getValue();
                    String strS3 = I0.c.S(R.string.page_library_search_artists, c0912t3);
                    InterfaceC1398p interfaceC1398pJ2 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 18, 0.0f, 2), 0.0f, 5, 0.0f, 12, 5);
                    c0912t3.X(1934102160);
                    Object objK5 = c0912t3.K();
                    f0.W w9 = C0903o.f11850a;
                    if (objK5 == w9) {
                        objK5 = new M.t0(interfaceC0878b03, 19);
                        c0912t3.i0(objK5);
                    }
                    InterfaceC1182c interfaceC1182c3 = (InterfaceC1182c) objK5;
                    c0912t3.p(false);
                    c0912t3.X(1934112664);
                    boolean zF3 = c0912t3.f(o04);
                    Object objK6 = c0912t3.K();
                    if (zF3 || objK6 == w9) {
                        final int i9 = 2;
                        objK6 = new InterfaceC1180a() { // from class: i6.s
                            @Override // l5.InterfaceC1180a
                            public final Object a() {
                                O0 o032;
                                O0 o042;
                                O0 o05;
                                switch (i9) {
                                    case 0:
                                        InterfaceC0878b0 interfaceC0878b022 = interfaceC0878b03;
                                        AbstractC1209k.f(interfaceC0878b022, "$searchText");
                                        if (((CharSequence) interfaceC0878b022.getValue()).length() > 0 && (o032 = o04) != null) {
                                            ((C0404r0) o032).a();
                                        }
                                        break;
                                    case 1:
                                        InterfaceC0878b0 interfaceC0878b032 = interfaceC0878b03;
                                        AbstractC1209k.f(interfaceC0878b032, "$searchText");
                                        if (((CharSequence) interfaceC0878b032.getValue()).length() > 0 && (o042 = o04) != null) {
                                            ((C0404r0) o042).a();
                                        }
                                        break;
                                    default:
                                        InterfaceC0878b0 interfaceC0878b04 = interfaceC0878b03;
                                        AbstractC1209k.f(interfaceC0878b04, "$searchText");
                                        if (((CharSequence) interfaceC0878b04.getValue()).length() > 0 && (o05 = o04) != null) {
                                            ((C0404r0) o05).a();
                                        }
                                        break;
                                }
                                return Y4.o.f8736a;
                            }
                        };
                        c0912t3.i0(objK6);
                    }
                    c0912t3.p(false);
                    i6.g.k(str3, strS3, interfaceC1182c3, (InterfaceC1180a) objK6, interfaceC1398pJ2, c0912t3, 24960);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
