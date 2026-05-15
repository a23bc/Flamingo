package o0;

import F.u;
import R0.AbstractC0403q0;
import Y4.o;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import f0.C0879c;
import f0.InterfaceC0906p0;
import f0.a1;
import java.util.Map;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import v4.C1639b;
import v4.C1640c;
import x.AbstractC1878t0;
import x.AbstractC1879u;
import x.C1817E0;
import x.C1876s0;
import x.C1877t;
import y0.C1960J;
import yos.music.player.data.libraries.SettingsLibrary;
import z.AbstractC2031d;
import z.C2027b;
import z.InterfaceC2029c;

/* JADX INFO: renamed from: o0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1247d implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f14636o;

    public /* synthetic */ C1247d(int i7) {
        this.f14636o = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f14636o) {
            case 0:
                return new C1249f((Map) obj);
            case 1:
                return obj;
            case 2:
                AbstractC1209k.f((Map) obj, "<unused var>");
                SettingsLibrary.INSTANCE.setTickerLyricEnabled(!r8.getTickerLyricEnabled());
                return o.f8736a;
            case 3:
                synchronized (p0.l.f14941c) {
                    ?? r32 = p0.l.f14946i;
                    int size = r32.size();
                    while (i < size) {
                        ((InterfaceC1182c) r32.get(i)).b(obj);
                        i++;
                    }
                }
                return o.f8736a;
            case 4:
                C1247d c1247d = p0.l.f14939a;
                return o.f8736a;
            case 5:
                u uVar = (u) obj;
                AbstractC1209k.f(uVar, "$this$Title");
                A0.e.z(uVar, "settings", q6.b.f15597a, 2);
                return o.f8736a;
            case 6:
                String str = (String) obj;
                AbstractC1209k.f(str, "it");
                SettingsLibrary.INSTANCE.setLyricFontWeight(str);
                return o.f8736a;
            case 7:
                u uVar2 = (u) obj;
                AbstractC1209k.f(uVar2, "$this$Title");
                A0.e.z(uVar2, "settings", r6.c.f15801d, 2);
                return o.f8736a;
            case 8:
                u uVar3 = (u) obj;
                AbstractC1209k.f(uVar3, "$this$Title");
                A0.e.z(uVar3, "settings", r6.d.f15804c, 2);
                return o.f8736a;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                String str2 = (String) obj;
                AbstractC1209k.f(str2, "it");
                SettingsLibrary.INSTANCE.setCustomTheme(str2);
                return o.f8736a;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                u uVar4 = (u) obj;
                AbstractC1209k.f(uVar4, "$this$Title");
                A0.e.z(uVar4, "settings", s6.d.f15950d, 2);
                return o.f8736a;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                Context context = (Context) obj;
                AbstractC1209k.f(context, "it");
                C1639b c1639b = new C1639b(context);
                c1639b.setTransitionGenerator(new C1640c(12000L, new AccelerateDecelerateInterpolator()));
                return c1639b;
            case 12:
                C1960J c1960j = (C1960J) obj;
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.e(1);
                return o.f8736a;
            case 13:
                C1960J c1960j2 = (C1960J) obj;
                AbstractC1209k.f(c1960j2, "$this$graphicsLayer");
                c1960j2.a(0.5f);
                return o.f8736a;
            case 14:
                C1960J c1960j3 = (C1960J) obj;
                AbstractC1209k.f(c1960j3, "$this$graphicsLayer");
                c1960j3.e(1);
                return o.f8736a;
            case 15:
                C1960J c1960j4 = (C1960J) obj;
                AbstractC1209k.f(c1960j4, "$this$graphicsLayer");
                if (c1960j4.f20191H != 12) {
                    c1960j4.f20193o |= 524288;
                    c1960j4.f20191H = 12;
                }
                return o.f8736a;
            case 16:
                return o.f8736a;
            case 17:
                ((Long) obj).getClass();
                return o.f8736a;
            case 18:
                int i7 = AbstractC1879u.f19844a;
                a1 a1Var = AndroidCompositionLocals_androidKt.f9324b;
                n0.i iVar = (n0.i) ((InterfaceC0906p0) obj);
                iVar.getClass();
                Context context2 = (Context) C0879c.v(iVar, a1Var);
                n1.d dVar = (n1.d) C0879c.v(iVar, AbstractC0403q0.h);
                C1876s0 c1876s0 = (C1876s0) C0879c.v(iVar, AbstractC1878t0.f19843a);
                if (c1876s0 == null) {
                    return null;
                }
                return new C1877t(context2, dVar, c1876s0.f19837a, c1876s0.f19838b);
            case 19:
                return new C1817E0(((Integer) obj).intValue());
            case BuildConfig.API_VERSION /* 20 */:
                a1 a1Var2 = AndroidCompositionLocals_androidKt.f9324b;
                n0.i iVar2 = (n0.i) ((InterfaceC0906p0) obj);
                iVar2.getClass();
                if (((Context) C0879c.v(iVar2, a1Var2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC2031d.f20792b;
                }
                InterfaceC2029c.f20786a.getClass();
                return C2027b.f20782c;
            case 21:
                return Boolean.TRUE;
            case 22:
                return Boolean.valueOf((((K0.u) obj).f3917i == 2 ? 1 : 0) ^ 1);
            default:
                ((Float) obj).getClass();
                return o.f8736a;
        }
    }
}
