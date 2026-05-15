package i6;

import D.AbstractC0060d;
import F.C0130c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import h6.I0;
import java.util.List;
import l5.InterfaceC1180a;
import r0.C1395m;
import w5.InterfaceC1765B;
import y0.AbstractC1959I;
import y0.C1987t;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class y implements l5.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13589o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ List f13590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f13592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f13593s;

    public y(List list, InterfaceC0878b0 interfaceC0878b0, InterfaceC1765B interfaceC1765B, List list2) {
        this.f13590p = list;
        this.f13591q = interfaceC0878b0;
        this.f13592r = interfaceC1765B;
        this.f13593s = list2;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        int i8;
        switch (this.f13589o) {
            case 0:
                C0130c c0130c = (C0130c) obj;
                int iIntValue = ((Number) obj2).intValue();
                C0912t c0912t = (C0912t) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i7 = (c0912t.f(c0130c) ? 4 : 2) | iIntValue2;
                } else {
                    i7 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i7 |= c0912t.d(iIntValue) ? 32 : 16;
                }
                if (c0912t.N(i7 & 1, (i7 & 147) != 146)) {
                    YosMediaItem yosMediaItem = (YosMediaItem) this.f13590p.get(iIntValue);
                    c0912t.X(1467802658);
                    c0912t.X(324444676);
                    InterfaceC1765B interfaceC1765B = this.f13592r;
                    boolean zH = c0912t.h(interfaceC1765B) | c0912t.f(yosMediaItem);
                    List list = this.f13593s;
                    boolean zF = zH | c0912t.f(list);
                    Object objK = c0912t.K();
                    if (zF || objK == C0903o.f11850a) {
                        objK = new x(interfaceC1765B, yosMediaItem, list, this.f13591q);
                        c0912t.i0(objK);
                    }
                    c0912t.p(false);
                    h.e(yosMediaItem, (InterfaceC1180a) objK, c0912t, 0);
                    c0912t.U(324457521, Integer.valueOf(iIntValue));
                    if (iIntValue < list.size() - 1) {
                        AbstractC0060d.d(c0912t, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(h.l(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 88, 0.0f, 0.0f, 0.0f, 14), 0.15f), 0.5f), t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t), AbstractC1959I.f20180a));
                    }
                    c0912t.p(false);
                    c0912t.p(false);
                } else {
                    c0912t.Q();
                }
                break;
            default:
                C0130c c0130c2 = (C0130c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C0912t c0912t2 = (C0912t) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i8 = (c0912t2.f(c0130c2) ? 4 : 2) | iIntValue4;
                } else {
                    i8 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i8 |= c0912t2.d(iIntValue3) ? 32 : 16;
                }
                if (c0912t2.N(i8 & 1, (i8 & 147) != 146)) {
                    YosMediaItem yosMediaItem2 = (YosMediaItem) this.f13590p.get(iIntValue3);
                    c0912t2.X(-885064587);
                    c0912t2.U(664185571, yosMediaItem2);
                    List list2 = (List) this.f13591q.getValue();
                    c0912t2.X(664191191);
                    InterfaceC1765B interfaceC1765B2 = this.f13592r;
                    boolean zH2 = c0912t2.h(interfaceC1765B2) | c0912t2.f(yosMediaItem2);
                    List list3 = this.f13593s;
                    boolean zF2 = zH2 | c0912t2.f(list3);
                    Object objK2 = c0912t2.K();
                    if (zF2 || objK2 == C0903o.f11850a) {
                        objK2 = new I0(interfaceC1765B2, yosMediaItem2, list3, 1);
                        c0912t2.i0(objK2);
                    }
                    c0912t2.p(false);
                    j6.i.c(null, yosMediaItem2, list2, (InterfaceC1180a) objK2, c0912t2, 0);
                    c0912t2.p(false);
                    c0912t2.U(664202248, Integer.valueOf(iIntValue3));
                    if (iIntValue3 < list3.size() - 1) {
                        AbstractC0060d.d(c0912t2, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(h.l(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 50, 0.0f, 18, 0.0f, 10), 0.25f), 0.5f), t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t2), AbstractC1959I.f20180a));
                    }
                    c0912t2.p(false);
                    c0912t2.p(false);
                } else {
                    c0912t2.Q();
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public y(List list, InterfaceC1765B interfaceC1765B, List list2, InterfaceC0878b0 interfaceC0878b0) {
        this.f13590p = list;
        this.f13592r = interfaceC1765B;
        this.f13593s = list2;
        this.f13591q = interfaceC0878b0;
    }
}
