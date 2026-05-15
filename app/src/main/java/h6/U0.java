package h6;

import android.content.Context;
import android.media.AudioManager;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import f0.C0886f0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.Z0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import r0.InterfaceC1398p;
import r5.C1420a;
import w.AbstractC1674g;
import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class U0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0886f0 f12957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f12958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AudioManager f12959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f12961t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z0 f12962u;

    public U0(InterfaceC0878b0 interfaceC0878b0, C0886f0 c0886f0, int i7, AudioManager audioManager, InterfaceC1180a interfaceC1180a, Context context, Z0 z02) {
        this.f12956o = interfaceC0878b0;
        this.f12957p = c0886f0;
        this.f12958q = i7;
        this.f12959r = audioManager;
        this.f12960s = interfaceC1180a;
        this.f12961t = context;
        this.f12962u = z02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        int iIntValue = ((Number) obj2).intValue() & 3;
        Y4.o oVar = Y4.o.f8736a;
        if (iIntValue == 2 && c0912t.z()) {
            c0912t.Q();
            return oVar;
        }
        c0912t.X(1697950491);
        InterfaceC0878b0 interfaceC0878b0 = this.f12956o;
        boolean zBooleanValue = ((Boolean) interfaceC0878b0.getValue()).booleanValue();
        C0886f0 c0886f0 = this.f12957p;
        Z0 z0B = zBooleanValue ? c0886f0 : AbstractC1674g.b(c0886f0.h(), d0.H.f10868b, 1.0E-4f, null, c0912t, 384, 24);
        c0912t.p(false);
        if (1.0f <= 0.0d) {
            E.a.a("invalid weight; must be greater than zero");
        }
        InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(new LayoutWeightElement(1.0f, true), 1.5f, 0.0f, 5, 0.0f, 10);
        c0912t.X(1697966615);
        Object objK = c0912t.K();
        f0.W w7 = C0903o.f11850a;
        if (objK == w7) {
            objK = new y0(interfaceC0878b0, 1);
            c0912t.i0(objK);
        }
        c0912t.p(false);
        InterfaceC1398p interfaceC1398pB = K0.H.b(interfaceC1398pJ, oVar, (PointerInputEventHandler) objK);
        float fFloatValue = ((Number) z0B.getValue()).floatValue();
        int i7 = this.f12958q;
        float f7 = i7;
        float f8 = fFloatValue * f7;
        C1420a c1420a = new C1420a(0.0f, f7);
        d0.p0 p0VarA = d0.r0.a(C1987t.f20259f, AbstractC1959I.c(234881023), c0912t);
        c0912t.X(1697985878);
        boolean zD = c0912t.d(i7);
        AudioManager audioManager = this.f12959r;
        boolean zF = zD | c0912t.f(audioManager);
        InterfaceC1180a interfaceC1180a = this.f12960s;
        boolean zF2 = zF | c0912t.f(interfaceC1180a);
        Object objK2 = c0912t.K();
        if (zF2 || objK2 == w7) {
            objK2 = new D.p0(c0886f0, i7, audioManager, interfaceC1180a);
            c0912t.i0(objK2);
        }
        InterfaceC1182c interfaceC1182c = (InterfaceC1182c) objK2;
        c0912t.p(false);
        c0912t.X(1698014989);
        Context context = this.f12961t;
        boolean zF3 = c0912t.f(context);
        Object objK3 = c0912t.K();
        if (zF3 || objK3 == w7) {
            objK3 = new U5.I(context, 2);
            c0912t.i0(objK3);
        }
        c0912t.p(false);
        d0.A0.a(f8, interfaceC1182c, interfaceC1398pB, false, (InterfaceC1180a) objK3, p0VarA, null, AbstractC1014e.f13024i, n0.e.e(821652347, new S0(z0B, this.f12962u, 0), c0912t), c1420a, c0912t, 905969664);
        return oVar;
    }
}
