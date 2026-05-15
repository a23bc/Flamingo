package M;

import D.AbstractC0074o;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import a2.AbstractC0514d;
import a2.C0512b;
import android.content.Context;
import b2.C0684z;
import c2.C0730e;
import f0.C0879c;
import f0.C0912t;
import f0.InterfaceC0906p0;
import java.util.Arrays;
import l2.C1162b;
import l2.C1167g;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.InterfaceC1398p;
import y0.C1987t;
import yos.music.player.appwidget.PauseAction;
import yos.music.player.appwidget.PlayAction;

/* JADX INFO: renamed from: M.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0252c implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f4532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f4533q;

    public /* synthetic */ C0252c(int i7, long j3, Object obj) {
        this.f4531o = i7;
        this.f4532p = j3;
        this.f4533q = obj;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4531o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long j3 = this.f4532p;
                    if (j3 != 9205357640488583168L) {
                        c0912t.X(-1244013944);
                        InterfaceC1398p interfaceC1398pF = androidx.compose.foundation.layout.c.f((InterfaceC1398p) this.f4533q, n1.i.b(j3), n1.i.a(j3), 0.0f, 0.0f, 12);
                        O0.Z zD = AbstractC0074o.d(C1385c.f15613p, false);
                        long j7 = c0912t.f11891T;
                        int i7 = (int) (j7 ^ (j7 >>> 32));
                        InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                        InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pF);
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
                        AbstractC0260g.b(null, c0912t, 0, 1);
                        c0912t.p(true);
                        c0912t.p(false);
                    } else {
                        c0912t.X(-1243644858);
                        AbstractC0260g.b((InterfaceC1398p) this.f4533q, c0912t, 0, 0);
                        c0912t.p(false);
                    }
                } else {
                    c0912t.Q();
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    AbstractC1267a.g(1, 1, 3072, android.support.v4.media.session.b.A(new Z1.c(new C1167g(C1987t.b(this.f4532p, 0.15f))).c(new g2.n(new C1162b(26))).c(new C0684z(new C1162b(15))), 10.5f, 0).c(new C0512b(((Boolean) a6.d.f8892b.getValue()).booleanValue() ? new C0730e(PauseAction.class, android.support.v4.media.session.b.v((AbstractC0514d[]) Arrays.copyOf(new AbstractC0514d[0], 0))) : new C0730e(PlayAction.class, android.support.v4.media.session.b.v((AbstractC0514d[]) Arrays.copyOf(new AbstractC0514d[0], 0))))), c0912t2, n0.e.e(-1788311510, new V5.i((Context) this.f4533q, 0), c0912t2));
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
