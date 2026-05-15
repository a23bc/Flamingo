package U5;

import D.AbstractC0060d;
import F.C0130c;
import I.C0211c;
import M.t0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import h6.I0;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import r0.C1395m;
import v.C1614k;
import w5.InterfaceC1765B;
import y0.AbstractC1959I;
import y0.C1987t;
import y3.C2019h;
import yos.music.player.MainActivity;
import yos.music.player.data.libraries.Folder;
import yos.music.player.data.libraries.PlayList;

/* JADX INFO: renamed from: U5.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0447t implements l5.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y3.x f7266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f7267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7269s;

    public /* synthetic */ C0447t(List list, Object obj, y3.x xVar, List list2, int i7) {
        this.f7265o = i7;
        this.f7267q = list;
        this.f7268r = obj;
        this.f7266p = xVar;
        this.f7269s = list2;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        int i8;
        switch (this.f7265o) {
            case 0:
                C0912t c0912t = (C0912t) obj3;
                n1.c.B((Number) obj4, (C1614k) obj, "$this$composable", (C2019h) obj2, "it");
                Z5.a aVar = (Z5.a) ((MainActivity) this.f7268r).f20576J.getValue();
                c0912t.X(1113567319);
                InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) this.f7269s;
                boolean zF = c0912t.f(interfaceC0878b0);
                Object objK = c0912t.K();
                if (zF || objK == C0903o.f11850a) {
                    objK = new t0(interfaceC0878b0, 5);
                    c0912t.i0(objK);
                }
                c0912t.p(false);
                I0.c.d(this.f7266p, (C0211c) this.f7267q, aVar, (InterfaceC1182c) objK, c0912t, 0);
                break;
            case 1:
                C0130c c0130c = (C0130c) obj;
                int iIntValue = ((Number) obj2).intValue();
                C0912t c0912t2 = (C0912t) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i7 = (c0912t2.f(c0130c) ? 4 : 2) | iIntValue2;
                } else {
                    i7 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i7 |= c0912t2.d(iIntValue) ? 32 : 16;
                }
                if (c0912t2.N(i7 & 1, (i7 & 147) != 146)) {
                    PlayList playList = (PlayList) ((List) this.f7267q).get(iIntValue);
                    c0912t2.X(-106722959);
                    c0912t2.X(-1943104830);
                    InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f7268r;
                    boolean zH = c0912t2.h(interfaceC1765B) | c0912t2.f(playList);
                    y3.x xVar = this.f7266p;
                    boolean zH2 = zH | c0912t2.h(xVar);
                    Object objK2 = c0912t2.K();
                    if (zH2 || objK2 == C0903o.f11850a) {
                        objK2 = new I0(interfaceC1765B, playList, xVar, 2);
                        c0912t2.i0(objK2);
                    }
                    c0912t2.p(false);
                    i6.h.g(c0130c, playList, (InterfaceC1180a) objK2, c0912t2, i7 & 14);
                    c0912t2.U(-1943089206, Integer.valueOf(iIntValue));
                    if (iIntValue < ((List) this.f7269s).size() - 1) {
                        AbstractC0060d.d(c0912t2, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(i6.h.l(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 102, 0.0f, 0.0f, 0.0f, 14), 0.15f), 0.5f), t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t2), AbstractC1959I.f20180a));
                    }
                    c0912t2.p(false);
                    c0912t2.p(false);
                } else {
                    c0912t2.Q();
                }
                break;
            default:
                C0130c c0130c2 = (C0130c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C0912t c0912t3 = (C0912t) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i8 = (c0912t3.f(c0130c2) ? 4 : 2) | iIntValue4;
                } else {
                    i8 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i8 |= c0912t3.d(iIntValue3) ? 32 : 16;
                }
                if (c0912t3.N(i8 & 1, (i8 & 147) != 146)) {
                    Folder folder = (Folder) ((List) this.f7267q).get(iIntValue3);
                    c0912t3.X(-825163018);
                    c0912t3.X(-1134996342);
                    boolean zF2 = c0912t3.f(folder);
                    e.i iVar = (e.i) this.f7268r;
                    boolean zH3 = zF2 | c0912t3.h(iVar);
                    Object objK3 = c0912t3.K();
                    f0.W w7 = C0903o.f11850a;
                    if (zH3 || objK3 == w7) {
                        objK3 = new M5.k(iVar, 2, folder);
                        c0912t3.i0(objK3);
                    }
                    InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK3;
                    c0912t3.p(false);
                    c0912t3.X(-1134981090);
                    boolean zF3 = c0912t3.f(folder);
                    y3.x xVar2 = this.f7266p;
                    boolean zH4 = zF3 | c0912t3.h(xVar2);
                    Object objK4 = c0912t3.K();
                    if (zH4 || objK4 == w7) {
                        objK4 = new M5.k(folder, 3, xVar2);
                        c0912t3.i0(objK4);
                    }
                    c0912t3.p(false);
                    j0.k.c(c0130c2, folder, interfaceC1180a, (InterfaceC1180a) objK4, c0912t3, i8 & 14);
                    c0912t3.U(-1134971244, Integer.valueOf(iIntValue3));
                    if (iIntValue3 < ((List) this.f7269s).size() - 1) {
                        AbstractC0060d.d(c0912t3, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(i6.h.l(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 102, 0.0f, 0.0f, 0.0f, 14), 0.15f), 0.5f), t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t3), AbstractC1959I.f20180a));
                    }
                    c0912t3.p(false);
                    c0912t3.p(false);
                } else {
                    c0912t3.Q();
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public C0447t(y3.x xVar, C0211c c0211c, MainActivity mainActivity, InterfaceC0878b0 interfaceC0878b0) {
        this.f7265o = 0;
        this.f7266p = xVar;
        this.f7267q = c0211c;
        this.f7268r = mainActivity;
        this.f7269s = interfaceC0878b0;
    }
}
