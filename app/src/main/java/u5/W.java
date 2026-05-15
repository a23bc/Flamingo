package U5;

import D.AbstractC0060d;
import F.C0130c;
import android.media.MediaCodecInfo;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import j5.AbstractC1107a;
import java.util.List;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import r0.C1395m;
import v.C1614k;
import w5.InterfaceC1765B;
import y0.AbstractC1959I;
import y0.C1987t;
import y3.C2019h;
import yos.music.player.R;
import yos.music.player.SettingsActivity;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class W implements l5.g {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f7203o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f7204p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f7205q;

    public /* synthetic */ W(Object obj, int i7, Object obj2) {
        this.f7203o = i7;
        this.f7204p = obj;
        this.f7205q = obj2;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        int i8;
        int i9;
        switch (this.f7203o) {
            case 0:
                n1.c.B((Number) obj4, (C1614k) obj, "$this$composable", (C2019h) obj2, "it");
                AbstractC1107a.f((SettingsActivity) this.f7204p, (y3.x) this.f7205q, (C0912t) obj3, 0);
                break;
            case 1:
                int iIntValue = ((Number) obj2).intValue();
                C0912t c0912t = (C0912t) obj3;
                ((Number) obj4).intValue();
                AbstractC1209k.f((I.A) obj, "$this$HorizontalPager");
                InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) this.f7204p;
                YosMediaItem yosMediaItem = (YosMediaItem) ((List) interfaceC0878b0.getValue()).get(iIntValue);
                String strS = I0.c.S(R.string.home_recommend_subtitle, c0912t);
                c0912t.X(511150605);
                InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f7205q;
                boolean zH = c0912t.h(interfaceC1765B) | c0912t.f(yosMediaItem);
                Object objK = c0912t.K();
                if (zH || objK == C0903o.f11850a) {
                    objK = new F.n(interfaceC1765B, yosMediaItem, interfaceC0878b0, 6);
                    c0912t.i0(objK);
                }
                c0912t.p(false);
                AbstractC1267a.f(strS, yosMediaItem, (InterfaceC1180a) objK, c0912t, 0);
                break;
            case 2:
                int iIntValue2 = ((Number) obj2).intValue();
                C0912t c0912t2 = (C0912t) obj3;
                ((Number) obj4).intValue();
                AbstractC1209k.f((I.A) obj, "$this$HorizontalPager");
                y3.x xVar = (y3.x) this.f7205q;
                if (iIntValue2 == 0) {
                    c0912t2.X(800623924);
                    AbstractC1267a.a(xVar, (Z5.a) this.f7204p, c0912t2, 0);
                    c0912t2.p(false);
                } else if (iIntValue2 != 1) {
                    c0912t2.X(-950370959);
                    c0912t2.p(false);
                } else {
                    c0912t2.X(800625735);
                    i6.g.g(xVar, c0912t2, 0);
                    c0912t2.p(false);
                }
                break;
            case 3:
                G.j jVar = (G.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C0912t c0912t3 = (C0912t) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i7 = (c0912t3.f(jVar) ? 4 : 2) | iIntValue4;
                } else {
                    i7 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i7 |= c0912t3.d(iIntValue3) ? 32 : 16;
                }
                if (c0912t3.N(i7 & 1, (i7 & 147) != 146)) {
                    String str = (String) ((List) this.f7204p).get(iIntValue3);
                    c0912t3.X(-1340638911);
                    c0912t3.X(-1567264714);
                    boolean zF = c0912t3.f(str);
                    y3.x xVar2 = (y3.x) this.f7205q;
                    boolean zH2 = zF | c0912t3.h(xVar2);
                    Object objK2 = c0912t3.K();
                    if (zH2 || objK2 == C0903o.f11850a) {
                        objK2 = new M5.k(str, 1, xVar2);
                        c0912t3.i0(objK2);
                    }
                    c0912t3.p(false);
                    j6.o.a(str, (InterfaceC1180a) objK2, c0912t3, 0);
                    c0912t3.p(false);
                } else {
                    c0912t3.Q();
                }
                break;
            case 4:
                C0130c c0130c = (C0130c) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C0912t c0912t4 = (C0912t) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i8 = (c0912t4.f(c0130c) ? 4 : 2) | iIntValue6;
                } else {
                    i8 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i8 |= c0912t4.d(iIntValue5) ? 32 : 16;
                }
                if (c0912t4.N(i8 & 1, (i8 & 147) != 146)) {
                    String str2 = (String) ((List) this.f7204p).get(iIntValue5);
                    c0912t4.X(-171595996);
                    k6.f.a(null, str2, c0912t4, 384);
                    c0912t4.U(1934129713, Integer.valueOf(iIntValue5));
                    if (iIntValue5 < ((List) this.f7205q).size() - 1) {
                        AbstractC0060d.d(c0912t4, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(i6.h.l(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 81, 0.0f, 0.0f, 0.0f, 14), 0.15f), 0.5f), t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t4), AbstractC1959I.f20180a));
                    }
                    c0912t4.p(false);
                    c0912t4.p(false);
                } else {
                    c0912t4.Q();
                }
                break;
            default:
                C0130c c0130c2 = (C0130c) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                C0912t c0912t5 = (C0912t) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i9 = (c0912t5.f(c0130c2) ? 4 : 2) | iIntValue8;
                } else {
                    i9 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i9 |= c0912t5.d(iIntValue7) ? 32 : 16;
                }
                if (c0912t5.N(i9 & 1, (i9 & 147) != 146)) {
                    MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) ((List) this.f7204p).get(iIntValue7);
                    c0912t5.X(2081432076);
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    AbstractC1209k.e(supportedTypes, "getSupportedTypes(...)");
                    i6.g.c(false, Z4.l.m0(supportedTypes, ", ", null, 62), false, mediaCodecInfo.getName(), null, null, c0912t5, 24576, 37);
                    c0912t5.U(1036981270, Integer.valueOf(iIntValue7));
                    if (iIntValue7 < ((List) ((InterfaceC0878b0) this.f7205q).getValue()).size() - 1) {
                        AbstractC1113a.j(null, c0912t5, 0);
                    }
                    c0912t5.p(false);
                    c0912t5.p(false);
                } else {
                    c0912t5.Q();
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public W(y3.x xVar, Z5.a aVar) {
        this.f7203o = 2;
        this.f7205q = xVar;
        this.f7204p = aVar;
    }
}
