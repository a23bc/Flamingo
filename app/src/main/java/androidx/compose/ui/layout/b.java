package androidx.compose.ui.layout;

import O0.C0325w;
import O0.F0;
import O0.G0;
import O0.H0;
import O0.RunnableC0326x;
import O0.w0;
import Q0.Q;
import r0.InterfaceC1398p;
import t.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f9319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G0[] f9320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f9321c;

    static {
        y yVar = new y(8);
        G0.f5303a.getClass();
        H0 h02 = F0.f5300g;
        yVar.h(1, h02);
        H0 h03 = F0.f5299f;
        yVar.h(2, h03);
        H0 h04 = F0.f5295b;
        yVar.h(4, h04);
        H0 h05 = F0.f5297d;
        yVar.h(8, h05);
        H0 h06 = F0.h;
        yVar.h(16, h06);
        H0 h07 = F0.f5298e;
        yVar.h(32, h07);
        H0 h08 = F0.f5301i;
        yVar.h(64, h08);
        f9319a = yVar;
        f9320b = new G0[]{h02, h03, h04, h08, h06, h07, h05, F0.f5302j, F0.f5296c};
        y yVar2 = new y(7);
        yVar2.h(1, h02);
        yVar2.h(2, h03);
        yVar2.h(4, h04);
        yVar2.h(16, h06);
        yVar2.h(64, h08);
        yVar2.h(32, h07);
        yVar2.h(8, h05);
        f9321c = yVar2;
    }

    public static final void a(Q q7, C0325w c0325w, long j3, int i7, int i8) {
        if (w0.h(j3, -1L)) {
            return;
        }
        q7.a(c0325w.f5460b, (int) ((j3 >>> 48) & 65535));
        q7.a(c0325w.f5461c, (int) ((j3 >>> 32) & 65535));
        q7.a(c0325w.f5462d, i7 - ((int) ((j3 >>> 16) & 65535)));
        q7.a(c0325w.f5463e, i8 - ((int) (j3 & 65535)));
    }

    public static final InterfaceC1398p b(RunnableC0326x runnableC0326x) {
        return new RulerProviderModifierElement(runnableC0326x);
    }
}
