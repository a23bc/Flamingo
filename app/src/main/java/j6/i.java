package j6;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0080v;
import D.C0084z;
import D.k0;
import D.o0;
import D.q0;
import F.A;
import F.D;
import F.u;
import H.L;
import I.C0210b;
import M.J;
import M.m0;
import O0.Z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import U5.C0435g;
import X.C0489m0;
import androidx.compose.foundation.layout.FillElement;
import com.cormor.overscroll.core.OverScrollKt;
import d0.AbstractC0774A;
import d0.AbstractC0805u;
import d0.C0803s;
import d0.H0;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.W;
import f0.Z0;
import f0.a1;
import h6.C1048w;
import h6.J0;
import i6.r;
import i6.y;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o0.AbstractC1256m;
import o5.AbstractC1267a;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1390h;
import r0.C1395m;
import r0.InterfaceC1398p;
import w5.InterfaceC1765B;
import y0.AbstractC1959I;
import y0.C1987t;
import y3.x;
import yos.music.player.R;
import yos.music.player.data.libraries.MediaItemExtraKt;
import yos.music.player.data.libraries.MusicLibrary;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final void a(C1395m c1395m, C0912t c0912t, int i7) {
        c0912t.Z(-1870639186);
        if ((i7 & 1) == 0 && c0912t.z()) {
            c0912t.Q();
        } else {
            c1395m = C1395m.f15634a;
            AbstractC0060d.d(c0912t, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(i6.h.l(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 18, 0.0f, 2), 0.2f), 0.5f), t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t), AbstractC1959I.f20180a));
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.a(c1395m, i7, 1);
        }
    }

    public static final void b(x xVar, C0912t c0912t, int i7) {
        boolean z6;
        C0351h c0351h;
        int i8;
        boolean z7;
        x xVar2 = xVar;
        C0912t c0912t2 = c0912t;
        AbstractC1209k.f(xVar2, "navController");
        c0912t2.Z(1523718605);
        if (((i7 | (c0912t2.h(xVar2) ? 4 : 2)) & 3) == 2 && c0912t2.z()) {
            c0912t2.Q();
            i8 = 2;
        } else {
            C1395m c1395m = C1395m.f15634a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
            C1390h c1390h = C1385c.f15612o;
            Z zD = AbstractC0074o.d(c1390h, false);
            long j3 = c0912t2.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, fillElement);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0351h c0351h2 = C0354j.f6019f;
            C0879c.y(c0912t2, zD, c0351h2);
            C0351h c0351h3 = C0354j.f6018e;
            C0879c.y(c0912t2, interfaceC0906p0L, c0351h3);
            C0351h c0351h4 = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t2, i9, c0351h4);
            }
            C0351h c0351h5 = C0354j.f6017d;
            C0879c.y(c0912t2, interfaceC1398pC, c0351h5);
            final InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) AbstractC1256m.c(new Object[0], null, "AlbumInfo_albumName", new C1048w(16), c0912t2, 3456, 2);
            c0912t2.X(-2016762442);
            Object objK = c0912t2.K();
            W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = C0879c.o(new r(interfaceC0878b0, 1));
                c0912t2.i0(objK);
            }
            c0912t2.p(false);
            if (((Boolean) ((Z0) objK).getValue()).booleanValue()) {
                c0912t2.X(1905046875);
                String strS = I0.c.S(R.string.tip_no_album_info, c0912t2);
                String strS2 = I0.c.S(R.string.page_library_album_info_title, c0912t2);
                c0912t2.X(-2016751398);
                boolean zH = c0912t2.h(xVar2);
                Object objK2 = c0912t2.K();
                if (zH || objK2 == w7) {
                    objK2 = new i6.d(xVar2, 6);
                    c0912t2.i0(objK2);
                }
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK2;
                c0912t2.p(false);
                c0912t2.X(-2016748435);
                boolean zF = c0912t2.f(strS);
                Object objK3 = c0912t2.K();
                if (zF || objK3 == w7) {
                    objK3 = new C0435g(strS, 2);
                    c0912t2.i0(objK3);
                }
                c0912t2.p(false);
                AbstractC1110d.h(strS2, null, false, interfaceC1180a, null, null, null, 0.0f, false, (InterfaceC1182c) objK3, c0912t, 0, 502);
                c0912t2 = c0912t;
                c0912t2.p(false);
                z7 = true;
                i8 = 2;
            } else {
                c0912t2.X(1906003473);
                final List listG0 = Z4.n.G0(MusicLibrary.Album.INSTANCE.get((String) interfaceC0878b0.getValue()), new C0489m0(3, new h()));
                A a4 = D.a(0, c0912t2, 0, 3);
                Object[] objArr = new Object[0];
                c0912t2.X(-2016698593);
                boolean zF2 = c0912t2.f(listG0);
                Object objK4 = c0912t2.K();
                if (zF2 || objK4 == w7) {
                    objK4 = new C0210b(3, listG0);
                    c0912t2.i0(objK4);
                }
                c0912t2.p(false);
                final InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) AbstractC1256m.c(objArr, null, "AlbumInfo_mainArtists", (InterfaceC1180a) objK4, c0912t2, 384, 2);
                List list = (List) interfaceC0878b02.getValue();
                c0912t2.X(-2016695099);
                boolean zF3 = c0912t2.f(list);
                Object objK5 = c0912t2.K();
                if (zF3 || objK5 == w7) {
                    objK5 = C0879c.t(MediaItemExtraKt.toArtistsString((List) interfaceC0878b02.getValue()));
                    c0912t2.i0(objK5);
                }
                final InterfaceC0878b0 interfaceC0878b03 = (InterfaceC0878b0) objK5;
                c0912t2.p(false);
                Object[] objArr2 = {listG0};
                c0912t2.X(-2016689197);
                boolean zF4 = c0912t2.f(listG0);
                Object objK6 = c0912t2.K();
                if (zF4 || objK6 == w7) {
                    objK6 = new C0210b(4, listG0);
                    c0912t2.i0(objK6);
                }
                c0912t2.p(false);
                Y4.h hVar = (Y4.h) AbstractC1256m.e(objArr2, (InterfaceC1180a) objK6, c0912t2, 0);
                final int iIntValue = ((Number) hVar.f8726o).intValue();
                final long jLongValue = ((Number) hVar.f8727p).longValue();
                Object objK7 = c0912t2.K();
                if (objK7 == w7) {
                    objK7 = C0879c.l(c0912t2);
                    c0912t2.i0(objK7);
                }
                final InterfaceC1765B interfaceC1765B = (InterfaceC1765B) objK7;
                InterfaceC1398p interfaceC1398pA = OverScrollKt.a(fillElement);
                c0912t2.X(-2016673217);
                boolean zF5 = c0912t2.f(a4);
                Object objK8 = c0912t2.K();
                if (zF5 || objK8 == w7) {
                    z6 = false;
                    objK8 = new a(a4, 0);
                    c0912t2.i0(objK8);
                } else {
                    z6 = false;
                }
                c0912t2.p(z6);
                u4.h hVarB = OverScrollKt.b((InterfaceC1180a) objK8, c0912t2);
                float f7 = 54;
                k0 k0VarA = androidx.compose.foundation.layout.a.a(0.0f, f7, 0.0f, 18, 5);
                c0912t2.X(-2016663168);
                boolean zF6 = c0912t2.f(listG0) | c0912t2.f(interfaceC0878b0) | c0912t2.f(interfaceC0878b03) | c0912t2.h(interfaceC1765B) | c0912t2.f(interfaceC0878b02) | c0912t2.d(iIntValue) | c0912t2.e(jLongValue);
                Object objK9 = c0912t2.K();
                if (zF6 || objK9 == w7) {
                    objK9 = new InterfaceC1182c() { // from class: j6.b
                        @Override // l5.InterfaceC1182c
                        public final Object b(Object obj) {
                            u uVar = (u) obj;
                            List list2 = listG0;
                            InterfaceC0878b0 interfaceC0878b04 = interfaceC0878b0;
                            InterfaceC0878b0 interfaceC0878b05 = interfaceC0878b03;
                            AbstractC1209k.f(interfaceC0878b05, "$mainArtistsName");
                            InterfaceC1765B interfaceC1765B2 = interfaceC1765B;
                            AbstractC1209k.f(interfaceC1765B2, "$scope");
                            InterfaceC0878b0 interfaceC0878b06 = interfaceC0878b02;
                            AbstractC1209k.f(uVar, "$this$LazyColumn");
                            A0.e.z(uVar, "AlbumInfo", new n0.d(2103950540, new m0(list2, interfaceC0878b04, interfaceC0878b05, interfaceC1765B2, 1), true), 2);
                            A0.e.z(uVar, null, k.f13760a, 3);
                            uVar.b(list2.size(), new J(new b1.x(8), 5, list2), new J0(2, list2), new n0.d(2039820996, new y(list2, interfaceC0878b06, interfaceC1765B2, list2), true));
                            A0.e.z(uVar, null, k.f13761b, 3);
                            A0.e.z(uVar, "AlbumInfo_others", new n0.d(881978885, new g(jLongValue, iIntValue), true), 2);
                            A0.e.z(uVar, "navbar", k.f13762c, 2);
                            return Y4.o.f8736a;
                        }
                    };
                    c0912t2.i0(objK9);
                }
                c0912t2.p(false);
                I0.c.e(0, 440, null, k0VarA, a4, c0912t2, (InterfaceC1182c) objK9, null, interfaceC1398pA, null, hVarB, false);
                InterfaceC1398p interfaceC1398pJ = i6.h.J(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), f7);
                Z zD2 = AbstractC0074o.d(c1390h, false);
                long j7 = c0912t2.f11891T;
                int i10 = (int) (j7 ^ (j7 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
                InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, interfaceC1398pJ);
                c0912t2.b0();
                if (c0912t2.f11890S) {
                    c0912t2.k(c0353i);
                } else {
                    c0912t2.l0();
                }
                C0879c.y(c0912t2, zD2, c0351h2);
                C0879c.y(c0912t2, interfaceC0906p0L2, c0351h3);
                if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i10))) {
                    c0351h = c0351h4;
                    n1.c.w(i10, c0912t2, i10, c0351h);
                } else {
                    c0351h = c0351h4;
                }
                C0879c.y(c0912t2, interfaceC1398pC2, c0351h5);
                InterfaceC1398p interfaceC1398pJ2 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 0.0f, 5, 0.0f, 0.0f, 13);
                C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
                long j8 = c0912t2.f11891T;
                int i11 = (int) (j8 ^ (j8 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L3 = c0912t2.l();
                InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t2, interfaceC1398pJ2);
                c0912t2.b0();
                if (c0912t2.f11890S) {
                    c0912t2.k(c0353i);
                } else {
                    c0912t2.l0();
                }
                C0879c.y(c0912t2, c0084zA, c0351h2);
                C0879c.y(c0912t2, interfaceC0906p0L3, c0351h3);
                if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i11))) {
                    n1.c.w(i11, c0912t2, i11, c0351h);
                }
                C0879c.y(c0912t2, interfaceC1398pC3, c0351h5);
                InterfaceC1398p interfaceC1398pJ3 = i6.h.J(c1395m, 48);
                Z zD3 = AbstractC0074o.d(C1385c.f15615r, false);
                long j9 = c0912t2.f11891T;
                int i12 = (int) (j9 ^ (j9 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L4 = c0912t2.l();
                InterfaceC1398p interfaceC1398pC4 = AbstractC1383a.c(c0912t2, interfaceC1398pJ3);
                c0912t2.b0();
                if (c0912t2.f11890S) {
                    c0912t2.k(c0353i);
                } else {
                    c0912t2.l0();
                }
                C0879c.y(c0912t2, zD3, c0351h2);
                C0879c.y(c0912t2, interfaceC0906p0L4, c0351h3);
                if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i12))) {
                    n1.c.w(i12, c0912t2, i12, c0351h);
                }
                C0879c.y(c0912t2, interfaceC1398pC4, c0351h5);
                D0.b bVarB = AbstractC1267a.B(R.drawable.ic_back, c0912t2);
                i8 = 2;
                InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.a.i(AbstractC0060d.l(c1395m), 10, 0.0f, 2), 17.5f);
                c0912t2.X(664275802);
                Object objK10 = c0912t2.K();
                if (objK10 == w7) {
                    objK10 = n1.c.q(c0912t2);
                }
                B.k kVar = (B.k) objK10;
                c0912t2.p(false);
                c0912t2.X(664280415);
                xVar2 = xVar;
                boolean zH2 = c0912t2.h(xVar2);
                Object objK11 = c0912t2.K();
                if (zH2 || objK11 == w7) {
                    objK11 = new i6.d(xVar2, 5);
                    c0912t2.i0(objK11);
                }
                c0912t2.p(false);
                AbstractC0774A.a(bVarB, null, androidx.compose.foundation.a.c(interfaceC1398pG, kVar, null, false, (InterfaceC1180a) objK11, 28), ((C0803s) c0912t2.j(AbstractC0805u.f11147a)).f11095a, c0912t, 48, 0);
                c0912t2 = c0912t;
                z7 = true;
                c0912t2.p(true);
                c0912t2.p(true);
                c0912t2.p(true);
                c0912t2.p(false);
            }
            c0912t2.p(z7);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.c(xVar2, i7, i8);
        }
    }

    public static final void c(C1395m c1395m, YosMediaItem yosMediaItem, List list, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        C1395m c1395m2;
        C0912t c0912t2;
        c0912t.Z(-418013882);
        if (((i7 | 6 | (c0912t.f(yosMediaItem) ? 32 : 16) | (c0912t.f(list) ? 256 : 128) | (c0912t.h(interfaceC1180a) ? 2048 : 1024)) & 1171) == 1170 && c0912t.z()) {
            c0912t.Q();
            c1395m2 = c1395m;
            c0912t2 = c0912t;
        } else {
            c1395m2 = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.b(c1395m2, 1.0f), false, null, interfaceC1180a, 15), 18, 0.0f, 2);
            q0 q0VarA = o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t, 48);
            long j3 = c0912t.f11891T;
            int i8 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pI);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0351h c0351h = C0354j.f6019f;
            C0879c.y(c0912t, q0VarA, c0351h);
            C0351h c0351h2 = C0354j.f6018e;
            C0879c.y(c0912t, interfaceC0906p0L, c0351h2);
            C0351h c0351h3 = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i8))) {
                n1.c.w(i8, c0912t, i8, c0351h3);
            }
            C0351h c0351h4 = C0354j.f6017d;
            C0879c.y(c0912t, interfaceC1398pC, c0351h4);
            C1390h c1390h = C1385c.f15613p;
            InterfaceC1398p interfaceC1398pA = androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.k(c1395m2, 24), 1.0f);
            Z zD = AbstractC0074o.d(c1390h, false);
            long j7 = c0912t.f11891T;
            int i9 = (int) (j7 ^ (j7 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L2 = c0912t.l();
            InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t, interfaceC1398pA);
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, zD, c0351h);
            C0879c.y(c0912t, interfaceC0906p0L2, c0351h2);
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t, i9, c0351h3);
            }
            C0879c.y(c0912t, interfaceC1398pC2, c0351h4);
            Object trackNumber = yosMediaItem.getTrackNumber();
            if (trackNumber == null) {
                trackNumber = "-";
            }
            H0.b(String.valueOf(trackNumber), i6.h.l(c1395m2, 0.4f), 0L, AbstractC1109c.u(16), null, null, 0L, null, 0L, 2, false, 1, 0, null, c0912t, 3120, 3120, 120820);
            c0912t.p(true);
            float f7 = 10;
            AbstractC0060d.d(c0912t, androidx.compose.foundation.layout.c.k(c1395m2, f7));
            InterfaceC1398p interfaceC1398pI2 = androidx.compose.foundation.layout.a.i(c1395m2, 0.0f, f7, 1);
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
            long j8 = c0912t.f11891T;
            int i10 = (int) (j8 ^ (j8 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L3 = c0912t.l();
            InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t, interfaceC1398pI2);
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, c0084zA, c0351h);
            C0879c.y(c0912t, interfaceC0906p0L3, c0351h2);
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i10))) {
                n1.c.w(i10, c0912t, i10, c0351h3);
            }
            C0879c.y(c0912t, interfaceC1398pC3, c0351h4);
            String title = yosMediaItem.getTitle();
            if (title == null) {
                title = "Unknown Work";
            }
            H0.b(title, null, 0L, AbstractC1109c.u(16), null, null, 0L, null, AbstractC1109c.u(20), 2, false, 1, 0, null, c0912t, 3072, 3126, 119798);
            c0912t2 = c0912t;
            AbstractC1110d.n(n0.e.e(1428602147, new C0080v(yosMediaItem, 10, list), c0912t2), c0912t2, 6);
            c0912t2.p(true);
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new L(c1395m2, yosMediaItem, list, interfaceC1180a, i7, 3);
        }
    }

    public static final void d(D0.b bVar, String str, InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        C0912t c0912t2 = c0912t;
        AbstractC1209k.f(bVar, "icon");
        AbstractC1209k.f(str, "label");
        AbstractC1209k.f(interfaceC1180a, "onClick");
        c0912t2.Z(1626087747);
        int i8 = i7 | (c0912t2.h(bVar) ? 4 : 2) | (c0912t2.f(str) ? 32 : 16) | (c0912t2.f(interfaceC1398p) ? 256 : 128) | (c0912t2.h(interfaceC1180a) ? 2048 : 1024);
        if ((i8 & 1171) == 1170 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            L.e eVarA = L.f.a(10);
            InterfaceC1398p interfaceC1398pC = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.a.d(j0.k.q(androidx.compose.foundation.a.b(interfaceC1398p, C1987t.b(t6.a.b(C1987t.f20258e, C1987t.f20256c, c0912t2), 0.25f), eVarA), eVarA), false, null, interfaceC1180a, 15), 44);
            q0 q0VarA = o0.a(AbstractC0068i.f1331e, C1385c.f15622y, c0912t2, 54);
            long j3 = c0912t2.f11891T;
            int i9 = (int) ((j3 >>> 32) ^ j3);
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, interfaceC1398pC);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0879c.y(c0912t2, q0VarA, C0354j.f6019f);
            C0879c.y(c0912t2, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t2, i9, c0351h);
            }
            C0879c.y(c0912t2, interfaceC1398pC2, C0354j.f6017d);
            a1 a1Var = AbstractC0805u.f11147a;
            AbstractC0774A.a(bVar, null, androidx.compose.foundation.layout.c.g(c1395m, 22), ((C0803s) c0912t2.j(a1Var)).f11095a, c0912t2, (i8 & 14) | 432, 0);
            AbstractC0060d.d(c0912t2, androidx.compose.foundation.layout.c.k(c1395m, 5));
            H0.b(str, null, ((C0803s) c0912t2.j(a1Var)).f11095a, AbstractC1109c.u(17), f1.k.f12003u, null, 0L, null, 0L, 0, false, 0, 0, null, c0912t, ((i8 >> 3) & 14) | 199680, 0, 131026);
            c0912t2 = c0912t;
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new L(bVar, str, interfaceC1398p, interfaceC1180a, i7);
        }
    }
}
