package k6;

import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0084z;
import I.C0210b;
import M.C0265j;
import Q0.C0351h;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import U5.C0435g;
import androidx.compose.foundation.layout.FillElement;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import i6.q;
import i6.r;
import j5.AbstractC1110d;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.InterfaceC1398p;
import y3.x;
import yos.music.player.R;
import yos.music.player.data.libraries.MusicLibrary;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(r0.C1395m r26, java.lang.String r27, f0.C0912t r28, int r29) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.f.a(r0.m, java.lang.String, f0.t, int):void");
    }

    public static final void b(x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(-1254894667);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
            long j3 = c0912t.f11891T;
            int i8 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, fillElement);
            InterfaceC0355k.f6047i.getClass();
            InterfaceC1180a interfaceC1180a = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(interfaceC1180a);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, c0084zA, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i8))) {
                n1.c.w(i8, c0912t, i8, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            List<String> artists = MusicLibrary.INSTANCE.getArtists();
            c0912t.X(-1313153164);
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (objK == obj) {
                objK = C0879c.t("");
                c0912t.i0(objK);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
            Object objR = n1.c.r(-1313149787, c0912t, false);
            if (objR == obj) {
                objR = C0879c.o(new C0210b(8, artists));
                c0912t.i0(objR);
            }
            c0912t.p(false);
            if (((Boolean) ((Z0) objR).getValue()).booleanValue()) {
                c0912t.X(-2052764348);
                String strS = I0.c.S(R.string.tip_no_song, c0912t);
                String strS2 = I0.c.S(R.string.page_library_artists, c0912t);
                c0912t.X(-1313137526);
                boolean zH = c0912t.h(xVar);
                Object objK2 = c0912t.K();
                if (zH || objK2 == obj) {
                    objK2 = new i6.d(xVar, 9);
                    c0912t.i0(objK2);
                }
                InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) objK2;
                c0912t.p(false);
                c0912t.X(-1313134563);
                boolean zF = c0912t.f(strS);
                Object objK3 = c0912t.K();
                if (zF || objK3 == obj) {
                    objK3 = new C0435g(strS, 4);
                    c0912t.i0(objK3);
                }
                c0912t.p(false);
                AbstractC1110d.h(strS2, null, false, interfaceC1180a2, null, null, null, 0.0f, false, (InterfaceC1182c) objK3, c0912t, 0, 502);
                c0912t.p(false);
            } else {
                c0912t.X(-2052000291);
                c0912t.X(-1313121405);
                Object objK4 = c0912t.K();
                if (objK4 == obj) {
                    objK4 = C0879c.o(new r(interfaceC0878b0, 3));
                    c0912t.i0(objK4);
                }
                Z0 z02 = (Z0) objK4;
                Object objR2 = n1.c.r(-1313118706, c0912t, false);
                if (objR2 == obj) {
                    objR2 = C0879c.t(artists);
                    c0912t.i0(objR2);
                }
                InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) objR2;
                c0912t.p(false);
                AbstractC1110d.n(n0.e.e(-1904112968, new q(interfaceC0878b0, artists, interfaceC0878b02, z02, 2), c0912t), c0912t, 6);
                String strS3 = I0.c.S(R.string.page_library_artists, c0912t);
                c0912t.X(-1313091318);
                boolean zH2 = c0912t.h(xVar);
                Object objK5 = c0912t.K();
                if (zH2 || objK5 == obj) {
                    objK5 = new i6.d(xVar, 10);
                    c0912t.i0(objK5);
                }
                InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) objK5;
                c0912t.p(false);
                c0912t.X(-1313086914);
                boolean zF2 = c0912t.f(artists);
                Object objK6 = c0912t.K();
                if (zF2 || objK6 == obj) {
                    objK6 = new C0265j(interfaceC0878b02, interfaceC0878b0, (Object) artists, 11);
                    c0912t.i0(objK6);
                }
                c0912t.p(false);
                AbstractC1110d.h(strS3, null, false, interfaceC1180a3, null, null, null, 0.0f, false, (InterfaceC1182c) objK6, c0912t, 0, 502);
                c0912t.p(false);
            }
            c0912t.p(true);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.c(xVar, i7, 4);
        }
    }
}
