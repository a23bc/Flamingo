package U5;

import F.C0130c;
import android.content.Context;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import h6.I0;
import j5.AbstractC1109c;
import java.util.List;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import v.C1614k;
import w5.InterfaceC1765B;
import y3.C2019h;
import yos.music.player.data.libraries.YosMediaItem;
import yos.music.player.ui.settingpages.others.Library;

/* JADX INFO: loaded from: classes.dex */
public final class X implements l5.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7206o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f7207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f7208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7209r;

    public /* synthetic */ X(Object obj, Object obj2, Object obj3, int i7) {
        this.f7206o = i7;
        this.f7208q = obj;
        this.f7207p = obj2;
        this.f7209r = obj3;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        int i8;
        switch (this.f7206o) {
            case 0:
                n1.c.B((Number) obj4, (C1614k) obj, "$this$composable", (C2019h) obj2, "it");
                AbstractC1109c.d((y3.x) this.f7208q, (List) ((InterfaceC0878b0) this.f7207p).getValue(), (String) ((InterfaceC0878b0) this.f7209r).getValue(), (C0912t) obj3, 0);
                break;
            case 1:
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
                    YosMediaItem yosMediaItem = (YosMediaItem) ((List) this.f7208q).get(iIntValue);
                    c0912t.X(1505049120);
                    c0912t.X(-505636877);
                    InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f7209r;
                    boolean zH = c0912t.h(interfaceC1765B) | c0912t.f(yosMediaItem);
                    InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) this.f7207p;
                    boolean zF = zH | c0912t.f(interfaceC0878b0);
                    Object objK = c0912t.K();
                    if (zF || objK == C0903o.f11850a) {
                        objK = new I0(interfaceC1765B, yosMediaItem, interfaceC0878b0, 0);
                        c0912t.i0(objK);
                    }
                    c0912t.p(false);
                    M3.a.u(c0130c, yosMediaItem, (InterfaceC1180a) objK, c0912t, i7 & 14);
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
                    Library library = (Library) ((List) this.f7208q).get(iIntValue3);
                    c0912t2.X(-592798779);
                    c0912t2.X(-711856106);
                    Context context = (Context) this.f7207p;
                    boolean zF2 = c0912t2.f(context);
                    Object objK2 = c0912t2.K();
                    if (zF2 || objK2 == C0903o.f11850a) {
                        objK2 = new K0.E(4, context);
                        c0912t2.i0(objK2);
                    }
                    c0912t2.p(false);
                    AbstractC1109c.c(library, (InterfaceC1182c) objK2, c0912t2, 0);
                    c0912t2.U(-711847267, Integer.valueOf(iIntValue3));
                    if (iIntValue3 < ((List) this.f7209r).size() - 1) {
                        AbstractC1113a.j(null, c0912t2, 0);
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

    public X(List list, InterfaceC1765B interfaceC1765B, InterfaceC0878b0 interfaceC0878b0) {
        this.f7206o = 1;
        this.f7208q = list;
        this.f7209r = interfaceC1765B;
        this.f7207p = interfaceC0878b0;
    }
}
