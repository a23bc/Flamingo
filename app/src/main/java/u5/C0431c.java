package U5;

import D.AbstractC0074o;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import androidx.compose.foundation.layout.FillElement;
import d0.AbstractC0774A;
import f0.C0879c;
import f0.C0912t;
import f0.InterfaceC0906p0;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import v.C1614k;
import y0.C1987t;
import yos.music.player.R;

/* JADX INFO: renamed from: U5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0431c implements l5.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0431c f7223o = new C0431c();

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C0912t c0912t = (C0912t) obj3;
        ((Number) obj4).intValue();
        AbstractC1209k.f((C1614k) obj, "$this$AnimatedContent");
        C1395m c1395m = C1395m.f15634a;
        if (zBooleanValue) {
            c0912t.X(831375853);
            AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_mp_pause, c0912t), "Pause", androidx.compose.foundation.layout.c.f9203c, t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t), c0912t, 432, 0);
            c0912t.p(false);
        } else {
            c0912t.X(832350958);
            FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
            O0.Z zD = AbstractC0074o.d(C1385c.f15616s, false);
            long j3 = c0912t.f11891T;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, fillElement);
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
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                n1.c.w(i7, c0912t, i7, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_mp_play, c0912t), "Play", androidx.compose.foundation.layout.c.g(c1395m, (float) 21.5d), t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t), c0912t, 432, 0);
            c0912t.p(true);
            c0912t.p(false);
        }
        return Y4.o.f8736a;
    }
}
