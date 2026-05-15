package j0;

import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0062e;
import D.C0084z;
import D.o0;
import D.q0;
import D.s0;
import F.C0130c;
import F5.o;
import H.I;
import H.h0;
import M.J;
import O0.C0306f0;
import O0.C0318o;
import O0.Q;
import O0.Z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import R.n;
import R0.AbstractC0403q0;
import R0.D0;
import X.K;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.LongSparseArray;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.foundation.layout.LayoutWeightElement;
import d0.AbstractC0774A;
import d0.AbstractC0805u;
import d0.C0803s;
import d0.H0;
import d5.EnumC0830a;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0906p0;
import f0.W;
import f0.Z0;
import h6.C1018g;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import n1.l;
import o5.AbstractC1267a;
import p0.p;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1388f;
import r0.C1390h;
import r0.C1395m;
import r0.InterfaceC1398p;
import r5.C1423d;
import t4.C1509d;
import w2.t;
import w5.C1793k;
import x.C1842b0;
import x0.C1893c;
import y0.AbstractC1959I;
import y0.C1987t;
import y0.InterfaceC1963M;
import y3.C2019h;
import y3.x;
import yos.music.player.R;
import yos.music.player.data.libraries.Folder;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final ArrayList A(Map map, InterfaceC1182c interfaceC1182c) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() != null) {
                throw new ClassCastException();
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) interfaceC1182c.b((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final l C(C1893c c1893c) {
        return new l(Math.round(c1893c.f19869a), Math.round(c1893c.f19870b), Math.round(c1893c.f19871c), Math.round(c1893c.f19872d));
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a A[LOOP:0: B:92:0x0114->B:94:0x011a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(l5.InterfaceC1180a r19, l5.InterfaceC1182c r20, java.util.List r21, r0.InterfaceC1398p r22, f0.C0912t r23, int r24) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.k.a(l5.a, l5.c, java.util.List, r0.p, f0.t, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(z3.l r9, f0.C0912t r10, int r11) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.k.b(z3.l, f0.t, int):void");
    }

    public static final void c(C0130c c0130c, Folder folder, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, C0912t c0912t, int i7) {
        C0130c c0130c2;
        int i8;
        C0912t c0912t2 = c0912t;
        c0912t2.Z(-388257709);
        if ((i7 & 6) == 0) {
            c0130c2 = c0130c;
            i8 = (c0912t2.f(c0130c2) ? 4 : 2) | i7;
        } else {
            c0130c2 = c0130c;
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t2.f(folder) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t2.h(interfaceC1180a) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t2.h(interfaceC1180a2) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.c(A0.e.p(c0130c2), 80), 1.0f), interfaceC1180a, interfaceC1180a2), 22, 0.0f, 10, 0.0f, 10);
            q0 q0VarA = o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t2, 48);
            long j3 = c0912t2.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pJ);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0351h c0351h = C0354j.f6019f;
            C0879c.y(c0912t2, q0VarA, c0351h);
            C0351h c0351h2 = C0354j.f6018e;
            C0879c.y(c0912t2, interfaceC0906p0L, c0351h2);
            C0351h c0351h3 = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t2, i9, c0351h3);
            }
            C0351h c0351h4 = C0354j.f6017d;
            C0879c.y(c0912t2, interfaceC1398pC, c0351h4);
            folder.getName();
            System.out.getClass();
            t6.d dVarI = AbstractC1109c.i(4, null, 6);
            n1.d dVar = (n1.d) c0912t2.j(AbstractC0403q0.h);
            D0.b bVarB = AbstractC1267a.B(R.drawable.placeholder_folder, c0912t2);
            InterfaceC1398p interfaceC1398pQ = q(androidx.compose.foundation.layout.c.g(c1395m, 64), dVarI);
            c0912t2.X(1117630413);
            boolean zF = c0912t2.f(dVarI) | c0912t2.f(dVar);
            Object objK = c0912t2.K();
            if (zF || objK == C0903o.f11850a) {
                objK = new C1018g(dVarI, dVar, 6);
                c0912t2.i0(objK);
            }
            c0912t2.p(false);
            d(bVarB, androidx.compose.ui.draw.a.b(interfaceC1398pQ, (InterfaceC1182c) objK), null, null, 0.0f, c0912t2, 48);
            InterfaceC1398p interfaceC1398pJ2 = androidx.compose.foundation.layout.a.j(c1395m, 16, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            InterfaceC1398p interfaceC1398pF = interfaceC1398pJ2.f(new LayoutWeightElement(1.0f, true));
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
            long j7 = c0912t2.f11891T;
            int i10 = (int) (j7 ^ (j7 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
            InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, interfaceC1398pF);
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0879c.y(c0912t2, c0084zA, c0351h);
            C0879c.y(c0912t2, interfaceC0906p0L2, c0351h2);
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i10))) {
                n1.c.w(i10, c0912t2, i10, c0351h3);
            }
            C0879c.y(c0912t2, interfaceC1398pC2, c0351h4);
            H0.b(folder.getName(), androidx.compose.foundation.layout.a.j(c1395m, 0.0f, 0.0f, 0.0f, 1, 7), 0L, AbstractC1109c.u(16), null, null, 0L, null, AbstractC1109c.u(16), 2, false, 1, 0, null, c0912t, 3120, 3126, 119796);
            c0912t2 = c0912t;
            c0912t2.p(true);
            AbstractC1110d.n(n0.e.e(-369446516, new n(6, folder), c0912t2), c0912t2, 6);
            AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_action_next, c0912t2), null, androidx.compose.foundation.layout.a.i(i6.h.l(androidx.compose.foundation.layout.c.c(c1395m, 12), 0.3f), 8, 0.0f, 2), ((C0803s) c0912t2.j(AbstractC0805u.f11147a)).f11107o, c0912t2, 432, 0);
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new K(c0130c, folder, interfaceC1180a, interfaceC1180a2, i7, 3);
        }
    }

    public static final void d(final D0.b bVar, final InterfaceC1398p interfaceC1398p, C1390h c1390h, C0306f0 c0306f0, float f7, C0912t c0912t, final int i7) {
        final C1390h c1390h2;
        final C0306f0 c0306f02;
        final float f8;
        c0912t.Z(1142754848);
        int i8 = i7 | (c0912t.h(bVar) ? 4 : 2) | (c0912t.f(interfaceC1398p) ? 256 : 128) | 1797120;
        if (c0912t.N(i8 & 1, (599187 & i8) != 599186)) {
            C1395m c1395m = C1395m.f15634a;
            C1390h c1390h3 = C1385c.f15616s;
            C0306f0 c0306f03 = C0318o.f5426b;
            W w7 = C0903o.f11850a;
            c0912t.X(1899393602);
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pD = androidx.compose.ui.draw.a.d(r(interfaceC1398p.f(c1395m)), bVar, 1.0f, null, 2);
            Object objK = c0912t.K();
            if (objK == w7) {
                objK = C1842b0.f19714a;
                c0912t.i0(objK);
            }
            Z z6 = (Z) objK;
            long j3 = c0912t.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pD);
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, z6, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t, i9, c0351h);
            }
            c0912t.p(true);
            c1390h2 = c1390h3;
            c0306f02 = c0306f03;
            f8 = 1.0f;
        } else {
            c0912t.Q();
            c1390h2 = c1390h;
            c0306f02 = c0306f0;
            f8 = f7;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(interfaceC1398p, c1390h2, c0306f02, f8, i7) { // from class: x.a0

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1398p f19707p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ C1390h f19708q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ C0306f0 f19709r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ float f19710s;

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iB = C0879c.B(49);
                    C0306f0 c0306f04 = this.f19709r;
                    float f9 = this.f19710s;
                    j0.k.d(this.f19706o, this.f19707p, this.f19708q, c0306f04, f9, (C0912t) obj, iB);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void e(x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(1368032628);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            j(n0.e.e(-1180308808, new i6.f(xVar, 5), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.c(xVar, i7, 12);
        }
    }

    public static final void f(x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(-1222461936);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            AbstractC1110d.n(n0.e.e(-1668705491, new i6.e(xVar, 8), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.c(xVar, i7, 8);
        }
    }

    public static final void g(x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(-617988978);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            j(n0.e.e(426738122, new i6.f(xVar, 7), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.c(xVar, i7, 14);
        }
    }

    public static final void h(v6.i iVar, InterfaceC1180a interfaceC1180a, InterfaceC1182c interfaceC1182c, C0912t c0912t, int i7) {
        int i8;
        C0912t c0912t2 = c0912t;
        s0 s0Var = s0.f1386a;
        AbstractC1209k.f(iVar, "item");
        AbstractC1209k.f(interfaceC1180a, "nowLabel");
        AbstractC1209k.f(interfaceC1182c, "onLabelChange");
        c0912t2.Z(1817485462);
        if ((i7 & 6) == 0) {
            i8 = (c0912t2.f(s0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t2.f(iVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t2.h(interfaceC1180a) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t2.h(interfaceC1182c) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            C0062e c0062e = AbstractC0068i.f1331e;
            C1388f c1388f = C1385c.f15609B;
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pQ = A0.e.Q(androidx.compose.foundation.layout.c.a(c1395m, 1.0f), 1.0f);
            c0912t2.X(-1053552757);
            Object objK = c0912t2.K();
            W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = n1.c.q(c0912t2);
            }
            B.k kVar = (B.k) objK;
            c0912t2.p(false);
            c0912t2.X(-1053548515);
            boolean z6 = (i8 & 7168) == 2048;
            int i9 = i8 & 112;
            boolean z7 = z6 | (i9 == 32);
            Object objK2 = c0912t2.K();
            if (z7 || objK2 == w7) {
                objK2 = new G.i(interfaceC1182c, 21, iVar);
                c0912t2.i0(objK2);
            }
            c0912t2.p(false);
            InterfaceC1398p interfaceC1398pC = androidx.compose.foundation.a.c(interfaceC1398pQ, kVar, null, false, (InterfaceC1180a) objK2, 28);
            C0084z c0084zA = AbstractC0082x.a(c0062e, c1388f, c0912t2, 54);
            long j3 = c0912t2.f11891T;
            int i10 = (int) (j3 ^ (j3 >>> 32));
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
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i10))) {
                n1.c.w(i10, c0912t2, i10, c0351h);
            }
            C0879c.y(c0912t2, interfaceC1398pC2, C0354j.f6017d);
            c0912t2.X(1749415857);
            boolean z8 = i9 == 32;
            Object objK3 = c0912t2.K();
            if (z8 || objK3 == w7) {
                objK3 = C0879c.o(new G.i(interfaceC1180a, 22, iVar));
                c0912t2.i0(objK3);
            }
            c0912t2.p(false);
            c0912t2.X(1749420650);
            long j7 = ((Boolean) ((Z0) objK3).getValue()).booleanValue() ? ((C0803s) c0912t2.j(AbstractC0805u.f11147a)).f11095a : C1987t.f20257d;
            c0912t2.p(false);
            Z0 z0A = v.o0.a(j7, null, c0912t, 0, 14);
            AbstractC0774A.a(AbstractC1267a.B(iVar.f18375b, c0912t), null, androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.g(c1395m, 30), 0.0f, 0.0f, 0.0f, 0, 7), ((C1987t) z0A.getValue()).f20264a, c0912t, 432, 0);
            H0.b(iVar.f18374a, null, ((C1987t) z0A.getValue()).f20264a, AbstractC1109c.u(12), f1.k.f12003u, null, 0L, null, AbstractC1109c.u(12), 0, false, 0, 0, null, c0912t, 199680, 6, 130002);
            c0912t2 = c0912t;
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new I(i7, 10, iVar, interfaceC1180a, interfaceC1182c);
        }
    }

    public static final void i(p pVar, List list, C0912t c0912t, int i7) {
        AbstractC1209k.f(pVar, "<this>");
        AbstractC1209k.f(list, "transitionsInProgress");
        c0912t.Z(1537894851);
        boolean zBooleanValue = ((Boolean) c0912t.j(D0.f6266a)).booleanValue();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2019h c2019h = (C2019h) it.next();
            C0879c.d(c2019h.f20413v, new z3.j(pVar, c2019h, zBooleanValue), c0912t);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R == null) {
            return;
        }
        c0915u0R.f11932d = new Q(pVar, list, i7, 12);
    }

    public static final void j(n0.d dVar, C0912t c0912t, int i7) {
        c0912t.Z(-920793107);
        if ((i7 & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.f9203c, ((C0803s) c0912t.j(AbstractC0805u.f11147a)).f11100f, AbstractC1959I.f20180a);
            Z zD = AbstractC0074o.d(C1385c.f15612o, false);
            long j3 = c0912t.f11891T;
            int i8 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pB);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, zD, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i8))) {
                n1.c.w(i8, c0912t, i8, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            dVar.d(androidx.compose.foundation.layout.b.f9200a, c0912t, 54);
            c0912t.p(true);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new h0(dVar, i7, 1);
        }
    }

    public static final Object[] k(Object[] objArr, int i7, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        Z4.l.a0(0, i7, 6, objArr, objArr2);
        Z4.l.W(i7 + 2, i7, objArr.length, objArr, objArr2);
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] l(int i7, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        Z4.l.a0(0, i7, 6, objArr, objArr2);
        Z4.l.W(i7, i7 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] m(int i7, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        Z4.l.a0(0, i7, 6, objArr, objArr2);
        Z4.l.W(i7, i7 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object n(J5.h hVar, j4.j jVar) {
        J5.e eVar;
        C1793k c1793k = new C1793k(1, I0.c.D(jVar));
        c1793k.r();
        J j3 = new J(hVar, 12, c1793k);
        if (!hVar.f3774s.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        N5.n nVar = N5.n.f5271a;
        hVar.f3775t = N5.n.f5271a.g();
        U3.h hVar2 = hVar.f3770o.f2420o;
        J5.e eVar2 = new J5.e(hVar, j3);
        hVar2.getClass();
        synchronized (hVar2) {
            ((ArrayDeque) hVar2.f7043p).add(eVar2);
            String str = ((o) hVar.f3771p.f2441p).f2397d;
            Iterator it = ((ArrayDeque) hVar2.f7044q).iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) hVar2.f7043p).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            eVar = null;
                            break;
                        }
                        eVar = (J5.e) it2.next();
                        if (AbstractC1209k.a(((o) eVar.f3764q.f3771p.f2441p).f2397d, str)) {
                            break;
                        }
                    }
                } else {
                    eVar = (J5.e) it.next();
                    if (AbstractC1209k.a(((o) eVar.f3764q.f3771p.f2441p).f2397d, str)) {
                        break;
                    }
                }
            }
            if (eVar != null) {
                eVar2.f3763p = eVar.f3763p;
            }
        }
        hVar2.j0();
        c1793k.t(j3);
        Object objQ = c1793k.q();
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        return objQ;
    }

    public static void p(int i7) {
        if (2 > i7 || i7 >= 37) {
            StringBuilder sbV = n1.c.v(i7, "radix ", " was not in valid range ");
            sbV.append(new C1423d(2, 36, 1));
            throw new IllegalArgumentException(sbV.toString());
        }
    }

    public static final InterfaceC1398p q(InterfaceC1398p interfaceC1398p, InterfaceC1963M interfaceC1963M) {
        return androidx.compose.ui.graphics.a.c(interfaceC1398p, 0.0f, interfaceC1963M, 518143);
    }

    public static final InterfaceC1398p r(InterfaceC1398p interfaceC1398p) {
        return androidx.compose.ui.graphics.a.c(interfaceC1398p, 0.0f, null, 520191);
    }

    public static Parcelable s(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcelable parcelable2 = (Parcelable) z(parcelable);
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable2.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return (Parcelable) z((Parcelable) creator.createFromParcel(parcelObtain));
        } finally {
            parcelObtain.recycle();
        }
    }

    public static void t(t0.c cVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        Y0.p pVar;
        Y0.o oVar;
        InterfaceC1182c interfaceC1182c;
        int size = longSparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            long jKeyAt = longSparseArray.keyAt(i7);
            ViewTranslationResponse viewTranslationResponseO = T4.i.o(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseO != null && (value = viewTranslationResponseO.getValue("android:text")) != null && (text = value.getText()) != null && (pVar = (Y0.p) cVar.f().b((int) jKeyAt)) != null && (oVar = pVar.f8488a) != null) {
                Object objG = oVar.f8484d.f8473o.g(Y0.i.f8458k);
                if (objG == null) {
                    objG = null;
                }
                Y0.a aVar = (Y0.a) objG;
                if (aVar != null && (interfaceC1182c = (InterfaceC1182c) aVar.f8431b) != null) {
                }
            }
        }
    }

    public static final boolean u(char c7, char c8, boolean z6) {
        if (c7 == c8) {
            return true;
        }
        if (!z6) {
            return false;
        }
        char upperCase = Character.toUpperCase(c7);
        char upperCase2 = Character.toUpperCase(c8);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static C1509d v() {
        C1509d c1509d;
        String str = "Utils";
        HashMap map = C1509d.f17071b;
        int i7 = 0;
        while (true) {
            if (i7 >= 5) {
                str = "spUtils";
                break;
            }
            if (!Character.isWhitespace("Utils".charAt(i7))) {
                break;
            }
            i7++;
        }
        HashMap map2 = C1509d.f17071b;
        C1509d c1509d2 = (C1509d) map2.get(str);
        if (c1509d2 != null) {
            return c1509d2;
        }
        synchronized (C1509d.class) {
            try {
                c1509d = (C1509d) map2.get(str);
                if (c1509d == null) {
                    c1509d = new C1509d();
                    c1509d.f17072a = i6.h.z().getSharedPreferences(str, 0);
                    map2.put(str, c1509d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1509d;
    }

    public static final int w(int i7, int i8) {
        return (i7 >> i8) & 31;
    }

    public static final int x(int i7, int i8) {
        return (i7 >> i8) & 31;
    }

    public static boolean y(char c7) {
        return Character.isWhitespace(c7) || Character.isSpaceChar(c7);
    }

    public static Object z(Parcelable parcelable) {
        int i7 = t.f18881a;
        if (i7 >= 21 && i7 < 23) {
            if (parcelable instanceof MediaBrowserCompat$MediaItem) {
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
                MediaDescriptionCompat mediaDescriptionCompat = mediaBrowserCompat$MediaItem.f8897p;
                return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(mediaDescriptionCompat.f8898o, mediaDescriptionCompat.f8899p, mediaDescriptionCompat.f8900q, mediaDescriptionCompat.f8901r, mediaDescriptionCompat.f8902s, mediaDescriptionCompat.f8903t, mediaDescriptionCompat.f8904u, mediaDescriptionCompat.f8905v), mediaBrowserCompat$MediaItem.f8896o);
            }
            if (parcelable instanceof MediaDescriptionCompat) {
                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) parcelable;
                return new MediaDescriptionCompat(mediaDescriptionCompat2.f8898o, mediaDescriptionCompat2.f8899p, mediaDescriptionCompat2.f8900q, mediaDescriptionCompat2.f8901r, mediaDescriptionCompat2.f8902s, mediaDescriptionCompat2.f8903t, mediaDescriptionCompat2.f8904u, mediaDescriptionCompat2.f8905v);
            }
        }
        return parcelable;
    }

    public abstract void D();

    public abstract void E();

    public boolean o() {
        return false;
    }

    public void B() {
    }
}
