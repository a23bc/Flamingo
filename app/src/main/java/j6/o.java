package j6;

import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0078t;
import D.C0084z;
import I.C0210b;
import M.C0265j;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import U5.C0435g;
import androidx.compose.foundation.layout.FillElement;
import d0.H0;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.W;
import f0.Z0;
import i6.q;
import i6.r;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import v6.EnumC1649c;
import y3.x;
import yos.music.player.R;
import yos.music.player.data.libraries.MusicLibrary;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final void a(String str, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        C0912t c0912t2 = c0912t;
        c0912t2.Z(1123479995);
        int i8 = i7 | (c0912t2.f(str) ? 4 : 2) | (c0912t2.h(interfaceC1180a) ? 32 : 16);
        if ((i8 & 19) == 18 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            List<YosMediaItem> list = MusicLibrary.Album.INSTANCE.get(str);
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(c1395m, 1.0f);
            c0912t2.X(-1222419234);
            Object objK = c0912t2.K();
            W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = n1.c.q(c0912t2);
            }
            c0912t2.p(false);
            InterfaceC1398p interfaceC1398pC = androidx.compose.foundation.a.c(interfaceC1398pB, (B.k) objK, null, false, interfaceC1180a, 28);
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
            long j3 = c0912t2.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
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
            C0879c.y(c0912t2, c0084zA, C0354j.f6019f);
            C0879c.y(c0912t2, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t2, i9, c0351h);
            }
            C0879c.y(c0912t2, interfaceC1398pC2, C0354j.f6017d);
            c0912t2.X(1697319795);
            boolean zF = c0912t2.f(list);
            Object objK2 = c0912t2.K();
            if (zF || objK2 == w7) {
                objK2 = new C0210b(7, list);
                c0912t2.i0(objK2);
            }
            c0912t2.p(false);
            AbstractC1109c.e((InterfaceC1180a) objK2, "Album", androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 0.0f, 0.0f, 0.0f, 5, 7), 0.0f, null, 7, EnumC1649c.f18350q, c0912t2, 14159280, 48);
            H0.b(str, i6.h.l(c1395m, 0.9f), 0L, AbstractC1109c.u(14), null, null, 0L, null, 0L, 2, false, 1, 0, null, c0912t, (14 & i8) | 3120, 3120, 120820);
            H0.b(I0.c.T(R.string.page_library_album_desc, new Object[]{Integer.valueOf(list.size())}, c0912t), i6.h.l(c1395m, 0.6f), 0L, AbstractC1109c.u(13), null, null, 0L, null, AbstractC1109c.u(17), 2, false, 1, 0, null, c0912t, 3120, 3126, 119796);
            c0912t2 = c0912t;
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(str, interfaceC1180a, i7, 16);
        }
    }

    public static final void b(x xVar, C0912t c0912t, int i7) {
        C0912t c0912t2 = c0912t;
        AbstractC1209k.f(xVar, "navController");
        c0912t2.Z(-397854131);
        if ((((c0912t2.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
            long j3 = c0912t2.f11891T;
            int i8 = (int) (j3 ^ (j3 >>> 32));
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
            C0879c.y(c0912t2, c0084zA, C0354j.f6019f);
            C0879c.y(c0912t2, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i8))) {
                n1.c.w(i8, c0912t2, i8, c0351h);
            }
            C0879c.y(c0912t2, interfaceC1398pC, C0354j.f6017d);
            c0912t2.X(1294204726);
            Object objK = c0912t2.K();
            W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = MusicLibrary.INSTANCE.getAlbums();
                c0912t2.i0(objK);
            }
            List list = (List) objK;
            Object objR = n1.c.r(1294208085, c0912t2, false);
            if (objR == w7) {
                objR = C0879c.t("");
                c0912t2.i0(objR);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objR;
            Object objR2 = n1.c.r(1294211429, c0912t2, false);
            if (objR2 == w7) {
                objR2 = C0879c.o(new C0210b(6, list));
                c0912t2.i0(objR2);
            }
            c0912t2.p(false);
            if (((Boolean) ((Z0) objR2).getValue()).booleanValue()) {
                c0912t2.X(1466020067);
                String strS = I0.c.S(R.string.tip_no_song, c0912t2);
                String strS2 = I0.c.S(R.string.page_library_albums, c0912t2);
                c0912t2.X(1294223596);
                boolean zH = c0912t2.h(xVar);
                Object objK2 = c0912t2.K();
                if (zH || objK2 == w7) {
                    objK2 = new i6.d(xVar, 7);
                    c0912t2.i0(objK2);
                }
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK2;
                c0912t2.p(false);
                c0912t2.X(1294226559);
                boolean zF = c0912t2.f(strS);
                Object objK3 = c0912t2.K();
                if (zF || objK3 == w7) {
                    objK3 = new C0435g(strS, 3);
                    c0912t2.i0(objK3);
                }
                c0912t2.p(false);
                AbstractC1110d.h(strS2, null, false, interfaceC1180a, null, null, null, 0.0f, false, (InterfaceC1182c) objK3, c0912t, 0, 502);
                c0912t2 = c0912t;
                c0912t2.p(false);
            } else {
                c0912t2.X(1466766485);
                c0912t2.X(1294239717);
                Object objK4 = c0912t2.K();
                if (objK4 == w7) {
                    objK4 = C0879c.o(new r(interfaceC0878b0, 2));
                    c0912t2.i0(objK4);
                }
                Z0 z02 = (Z0) objK4;
                Object objR3 = n1.c.r(1294242415, c0912t2, false);
                if (objR3 == w7) {
                    objR3 = C0879c.t(list);
                    c0912t2.i0(objR3);
                }
                InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) objR3;
                c0912t2.p(false);
                AbstractC1110d.n(n0.e.e(-1529898454, new q(interfaceC0878b0, interfaceC0878b02, z02, list), c0912t2), c0912t2, 6);
                String strS3 = I0.c.S(R.string.page_library_albums, c0912t2);
                c0912t2.X(1294270252);
                boolean zH2 = c0912t2.h(xVar);
                Object objK5 = c0912t2.K();
                if (zH2 || objK5 == w7) {
                    objK5 = new i6.d(xVar, 8);
                    c0912t2.i0(objK5);
                }
                InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) objK5;
                c0912t2.p(false);
                c0912t2.X(1294274104);
                boolean zH3 = c0912t2.h(xVar);
                Object objK6 = c0912t2.K();
                if (zH3 || objK6 == w7) {
                    objK6 = new C0265j(interfaceC0878b02, interfaceC0878b0, (Object) xVar, 10);
                    c0912t2.i0(objK6);
                }
                c0912t2.p(false);
                AbstractC1110d.l(strS3, interfaceC1180a2, null, (InterfaceC1182c) objK6, c0912t2, 0);
                c0912t2.p(false);
            }
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.c(xVar, i7, 3);
        }
    }
}
