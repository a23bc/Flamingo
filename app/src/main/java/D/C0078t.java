package D;

import G.C0133a;
import M.C0265j;
import X.AbstractC0498r0;
import X.C0495p0;
import X.K0;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import b1.AbstractC0607C;
import b1.C0622g;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import f0.AbstractC0914u;
import f0.C0879c;
import f0.C0907q;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0895k;
import f0.L0;
import j5.AbstractC1107a;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import java.util.ArrayList;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.C1217s;
import o5.AbstractC1267a;
import r0.C1395m;
import r0.InterfaceC1398p;
import w5.InterfaceC1765B;
import y.C1947c;
import y.C1948d;
import yos.music.player.data.libraries.YosMediaItem;
import yos.music.player.ui.settingpages.others.Library;
import z.InterfaceC2058q0;

/* JADX INFO: renamed from: D.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0078t implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1387o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f1389q;

    public /* synthetic */ C0078t(int i7, String str, String str2) {
        this.f1387o = 22;
        n0.d dVar = s6.b.f15945a;
        this.f1388p = str;
        this.f1389q = str2;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        b1.L l;
        int i7 = 0;
        Y4.o oVar = Y4.o.f8736a;
        Object obj3 = this.f1389q;
        Object obj4 = this.f1388p;
        switch (this.f1387o) {
            case 0:
                O0.B0 b0 = (O0.B0) obj;
                n1.a aVar = (n1.a) obj2;
                break;
            case 1:
                n1.d dVar = (n1.d) obj;
                n1.a aVar2 = (n1.a) obj2;
                if (n1.a.h(aVar2.f14505a) == Integer.MAX_VALUE) {
                    C.b.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = n1.a.h(aVar2.f14505a);
                InterfaceC0064f interfaceC0064f = (InterfaceC0064f) obj3;
                int iL = dVar.L(interfaceC0064f.a());
                int i8 = ((C0133a) obj4).f2484a;
                int i9 = iH - ((i8 - 1) * iL);
                int i10 = i9 / i8;
                int i11 = i9 % i8;
                ArrayList arrayList = new ArrayList(i8);
                int i12 = 0;
                while (i12 < i8) {
                    arrayList.add(Integer.valueOf((i12 < i11 ? 1 : 0) + i10));
                    i12++;
                }
                int[] iArrJ0 = Z4.n.J0(arrayList);
                int[] iArr = new int[iArrJ0.length];
                interfaceC0064f.c(dVar, iH, iArrJ0, n1.n.f14521o, iArr);
                break;
            case 2:
                break;
            case 3:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                C1217s c1217s = (C1217s) obj4;
                c1217s.f14436o += ((InterfaceC2058q0) ((I.B) obj3).f3257b).a(fFloatValue - c1217s.f14436o);
                break;
            case 4:
                ((Integer) obj2).getClass();
                M.V.c((C0495p0) obj4, (n0.d) obj3, (C0912t) obj, C0879c.B(49));
                break;
            case 5:
                ((Integer) obj2).getClass();
                R.p.a((P.g) obj4, (P.c) obj3, (C0912t) obj, C0879c.B(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((R.v) obj4).a((Drawable) obj3, (C0912t) obj, C0879c.B(49));
                break;
            case 7:
                ((Integer) obj2).getClass();
                Context context = (Context) obj4;
                AbstractC1209k.f(context, "$thisContext");
                N5.l.b(context, (Z1.o) obj3, (C0912t) obj, C0879c.B(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                Z1.o oVar2 = (Z1.o) obj3;
                AbstractC1209k.f(oVar2, "$modifier");
                N5.l.d((Bitmap) obj4, oVar2, (C0912t) obj, C0879c.B(1));
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                ((Integer) obj2).getClass();
                AbstractC0498r0.b((C1395m) obj4, (n0.d) obj3, (C0912t) obj, C0879c.B(49));
                break;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                AbstractC0498r0.f((InterfaceC1398p) obj4, (n0.d) obj3, (C0912t) obj, C0879c.B(49));
                break;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                O.a aVar3 = (O.a) obj;
                Context context2 = (Context) obj2;
                K0 k02 = (K0) obj4;
                boolean zBooleanValue = ((Boolean) k02.l.getValue()).booleanValue();
                C0622g c0622gL = k02.l();
                String str = c0622gL != null ? c0622gL.f9970p : null;
                b1.L l7 = k02.f7958v;
                if (l7 != null) {
                    B2.m mVar = k02.f7940b;
                    long j3 = l7.f9945a;
                    int i13 = (int) (j3 >> 32);
                    mVar.a(i13);
                    int i14 = (int) (j3 & 4294967295L);
                    mVar.a(i14);
                    l = new b1.L(AbstractC0607C.b(i13, i14));
                } else {
                    l = null;
                }
                X.A.a(aVar3, context2, zBooleanValue, str, l, k02.f7946i, new C0265j(k02, (InterfaceC1765B) obj3, context2, 7));
                break;
            case 12:
                int iIntValue = ((Integer) obj).intValue();
                n0.j jVar = (n0.j) obj4;
                if (!(obj2 instanceof InterfaceC0895k)) {
                    L0 l02 = (L0) obj3;
                    if (obj2 instanceof f0.D0) {
                        f0.D0 d02 = (f0.D0) obj2;
                        if (!(d02.f11647a instanceof C0907q)) {
                            AbstractC0914u.g(l02, iIntValue, obj2);
                            jVar.e(d02);
                        }
                    } else if (obj2 instanceof C0915u0) {
                        AbstractC0914u.g(l02, iIntValue, obj2);
                        ((C0915u0) obj2).d();
                    }
                } else {
                    jVar.f14496f.b((InterfaceC0895k) obj2);
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                y3.x xVar = (y3.x) obj4;
                AbstractC1209k.f(xVar, "$navController");
                AbstractC1267a.a(xVar, (Z5.a) obj3, (C0912t) obj, C0879c.B(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                Context context3 = (Context) obj4;
                AbstractC1209k.f(context3, "$context");
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) obj3;
                AbstractC1209k.f(interfaceC1180a, "$onSlider");
                M3.a.y(context3, interfaceC1180a, (C0912t) obj, C0879c.B(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                YosMediaItem yosMediaItem = (YosMediaItem) obj4;
                AbstractC1209k.f(yosMediaItem, "$music");
                InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) obj3;
                AbstractC1209k.f(interfaceC1180a2, "$itemClick");
                i6.h.e(yosMediaItem, interfaceC1180a2, (C0912t) obj, C0879c.B(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                String str2 = (String) obj4;
                AbstractC1209k.f(str2, "$albumName");
                InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) obj3;
                AbstractC1209k.f(interfaceC1180a3, "$onClick");
                j6.o.a(str2, interfaceC1180a3, (C0912t) obj, C0879c.B(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                String str3 = (String) obj3;
                AbstractC1209k.f(str3, "$artistName");
                k6.f.a((C1395m) obj4, str3, (C0912t) obj, C0879c.B(385));
                break;
            case 18:
                ((Integer) obj2).getClass();
                y3.x xVar2 = (y3.x) obj3;
                AbstractC1209k.f(xVar2, "$navController");
                AbstractC1107a.f((Activity) obj4, xVar2, (C0912t) obj, C0879c.B(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                Library library = (Library) obj4;
                AbstractC1209k.f(library, "$library");
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) obj3;
                AbstractC1209k.f(interfaceC1182c, "$onItemClick");
                AbstractC1109c.c(library, interfaceC1182c, (C0912t) obj, C0879c.B(1));
                break;
            case BuildConfig.API_VERSION /* 20 */:
                ((Integer) obj2).getClass();
                InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) obj3;
                AbstractC1209k.f(interfaceC1180a4, "$onDismiss");
                i6.g.j((C1395m) obj4, interfaceC1180a4, (C0912t) obj, C0879c.B(49));
                break;
            case 21:
                ((Integer) obj2).getClass();
                String str4 = (String) obj4;
                AbstractC1209k.f(str4, "$text");
                AbstractC1113a.h(str4, (InterfaceC1398p) obj3, (C0912t) obj, C0879c.B(49));
                break;
            case 22:
                ((Integer) obj2).getClass();
                n0.d dVar2 = s6.b.f15945a;
                String str5 = (String) obj4;
                AbstractC1209k.f(str5, "$title");
                AbstractC1113a.i(str5, (String) obj3, (C0912t) obj, C0879c.B(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                AbstractC1110d.f((InterfaceC1398p) obj4, (InterfaceC1182c) obj3, (C0912t) obj, C0879c.B(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C1948d) obj4).a((C1947c) obj3, (C0912t) obj, C0879c.B(1));
                break;
        }
        return oVar;
    }

    public /* synthetic */ C0078t(Object obj, int i7, Object obj2) {
        this.f1387o = i7;
        this.f1388p = obj;
        this.f1389q = obj2;
    }

    public /* synthetic */ C0078t(Object obj, Object obj2, int i7, int i8) {
        this.f1387o = i8;
        this.f1388p = obj;
        this.f1389q = obj2;
    }
}
