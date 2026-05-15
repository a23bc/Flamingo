package v4;

import C2.F;
import C2.O;
import E4.M;
import I4.s;
import I4.y;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import t2.C1469B;
import t2.C1476e;
import t2.C1482k;
import t2.G;
import t2.J;
import t2.T;
import t2.X;
import t2.g0;
import t2.h0;
import w2.AbstractC1697a;
import w2.t;
import w3.A0;
import w3.AbstractC1748s;
import w3.C1750t;
import w3.InterfaceC1746q0;
import w3.K0;
import w3.RunnableC1753u0;
import w3.n1;
import w3.p1;
import w3.r1;
import w3.y1;
import w3.z1;
import x3.C1901C;
import x3.InterfaceC1921f;
import x3.S;
import x3.Z;

/* JADX INFO: renamed from: v4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1640c implements InterfaceC1642e, s, InterfaceC1746q0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f18300o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f18301p = new Random(System.currentTimeMillis());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f18302q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f18303r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f18304s;

    public C1640c(long j3, AccelerateDecelerateInterpolator accelerateDecelerateInterpolator) {
        this.f18300o = j3;
        this.f18302q = accelerateDecelerateInterpolator;
    }

    @Override // w3.InterfaceC1746q0
    public /* synthetic */ void b(int i7, n1 n1Var, T t7, boolean z6, boolean z7, int i8) {
    }

    @Override // w3.InterfaceC1746q0
    public /* synthetic */ void c(int i7, z1 z1Var) {
    }

    @Override // w3.InterfaceC1746q0
    public void d(int i7, List list) {
        K0 k02 = (K0) this.f18304s;
        k02.M(k02.f19002g.f18914s);
    }

    @Override // w3.InterfaceC1746q0
    public void e(int i7, T t7) {
        K0 k02 = (K0) this.f18304s;
        r1 r1Var = k02.f19002g.f18914s;
        K0.E(k02, r1Var);
        k02.M(r1Var);
    }

    @Override // I4.s
    public void f(Throwable th) {
        if (this != ((K0) ((C1640c) this.f18304s).f18304s).f19009p) {
            return;
        }
        AbstractC1697a.w("Failed to load bitmap: " + th.getMessage());
    }

    @Override // I4.s
    public void g(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C1640c c1640c = (C1640c) this.f18304s;
        K0 k02 = (K0) c1640c.f18304s;
        if (this != k02.f19009p) {
            return;
        }
        K0.D(k02.f19005k, AbstractC1748s.l((J) this.f18301p, (String) this.f18302q, (Uri) this.f18303r, this.f18300o, bitmap));
        A0 a0 = ((K0) c1640c.f18304s).f19002g;
        t.G(a0.f18910o, new RunnableC1753u0(a0, 3));
    }

    @Override // w3.InterfaceC1746q0
    public /* synthetic */ void h(int i7) {
    }

    @Override // w3.InterfaceC1746q0
    public /* synthetic */ void i(int i7, C1750t c1750t) {
    }

    @Override // w3.InterfaceC1746q0
    public void j(int i7, y1 y1Var, boolean z6, boolean z7, int i8) {
        K0 k02 = (K0) this.f18304s;
        k02.M(k02.f19002g.f18914s);
    }

    public RectF k(RectF rectF, RectF rectF2) {
        RectF rectF3 = rectF.width() / rectF.height() > rectF2.width() / rectF2.height() ? new RectF(0.0f, 0.0f, rectF2.width() * (rectF.height() / rectF2.height()), rectF.height()) : new RectF(0.0f, 0.0f, rectF.width(), rectF2.height() * (rectF.width() / rectF2.width()));
        Random random = (Random) this.f18301p;
        float fNextFloat = random.nextFloat();
        float fRound = ((Math.round(fNextFloat * r1) / ((float) Math.pow(10.0d, 2))) * 0.25f) + 0.75f;
        float fWidth = rectF3.width() * fRound;
        float fHeight = rectF3.height() * fRound;
        int iWidth = (int) (rectF.width() - fWidth);
        int iHeight = (int) (rectF.height() - fHeight);
        int iNextInt = iWidth > 0 ? random.nextInt(iWidth) : 0;
        int iNextInt2 = iHeight > 0 ? random.nextInt(iHeight) : 0;
        float f7 = iNextInt;
        float f8 = iNextInt2;
        return new RectF(f7, f8, fWidth + f7, fHeight + f8);
    }

    public void l(C1476e c1476e) {
        K0 k02 = (K0) this.f18304s;
        if (k02.f19002g.f18914s.X().f16503a == 0) {
            int iU = AbstractC1748s.u(c1476e);
            S s7 = k02.f19005k.f20025a;
            s7.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(iU);
            s7.f20005a.setPlaybackToLocal(builder.build());
        }
    }

    public void m() {
        int i7;
        p1 p1Var;
        K0 k02 = (K0) this.f18304s;
        r1 r1Var = k02.f19002g.f18914s;
        if (r1Var.X().f16503a == 0) {
            p1Var = null;
        } else {
            T tY = r1Var.y();
            if (tY.f16355a.a(26, 34)) {
                i7 = tY.f16355a.a(25, 33) ? 2 : 1;
            } else {
                i7 = 0;
            }
            Handler handler = new Handler(((X) r1Var.f2813b).M0());
            int iO = r1Var.K0(23) ? r1Var.o() : 0;
            C1482k c1482kX = r1Var.X();
            p1Var = new p1(r1Var, i7, c1482kX.f16505c, iO, c1482kX.f16506d, handler);
        }
        k02.f19007n = p1Var;
        Z z6 = k02.f19005k;
        if (p1Var != null) {
            S s7 = z6.f20025a;
            s7.getClass();
            s7.f20005a.setPlaybackToRemote(p1Var.a());
        } else {
            int iU = AbstractC1748s.u(r1Var.K0(21) ? r1Var.T() : C1476e.f16413g);
            S s8 = z6.f20025a;
            s8.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(iU);
            s8.f20005a.setPlaybackToLocal(builder.build());
        }
    }

    public void n(G g6) {
        t();
        K0 k02 = (K0) this.f18304s;
        if (g6 == null) {
            k02.f19005k.f20025a.f20005a.setRatingType(0);
        } else {
            Z z6 = k02.f19005k;
            z6.f20025a.f20005a.setRatingType(AbstractC1748s.v(g6.f16226d.f16311i));
        }
        k02.M(k02.f19002g.f18914s);
    }

    public void o(int i7, r1 r1Var) {
        s(r1Var.g1());
        p(r1Var.K0(18) ? r1Var.K() : J.f16263J);
        r1Var.h1();
        t();
        r(r1Var.r0());
        q(r1Var.i());
        r1Var.X();
        m();
        K0.E((K0) this.f18304s, r1Var);
        n(r1Var.f1());
    }

    public void p(J j3) {
        K0 k02 = (K0) this.f18304s;
        CharSequence queueTitle = ((C1901C) k02.f19005k.f20026b.f7389o).f19973a.getQueueTitle();
        CharSequence charSequence = j3.f16304a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        r1 r1Var = k02.f19002g.f18914s;
        if (!r1Var.f19343e.a(17) || !r1Var.y().a(17)) {
            charSequence = null;
        }
        k02.f19005k.f20025a.f20005a.setQueueTitle(charSequence);
    }

    public void q(int i7) {
        Z z6 = ((K0) this.f18304s).f19005k;
        int iN = AbstractC1748s.n(i7);
        S s7 = z6.f20025a;
        if (s7.f20013j != iN) {
            s7.f20013j = iN;
            synchronized (s7.f20008d) {
                for (int iBeginBroadcast = s7.f20010f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((InterfaceC1921f) s7.f20010f.getBroadcastItem(iBeginBroadcast)).c(iN);
                    } catch (RemoteException unused) {
                    }
                }
                s7.f20010f.finishBroadcast();
            }
        }
    }

    public void r(boolean z6) {
        Z z7 = ((K0) this.f18304s).f19005k;
        M m7 = AbstractC1748s.f19344a;
        S s7 = z7.f20025a;
        if (s7.f20014k != z6) {
            s7.f20014k = z6 ? 1 : 0;
            synchronized (s7.f20008d) {
                for (int iBeginBroadcast = s7.f20010f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((InterfaceC1921f) s7.f20010f.getBroadcastItem(iBeginBroadcast)).e0(z6 ? 1 : 0);
                    } catch (RemoteException unused) {
                    }
                }
                s7.f20010f.finishBroadcast();
            }
        }
    }

    public void s(h0 h0Var) {
        u(h0Var);
        t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t() {
        C1640c c1640c;
        Bitmap bitmap;
        C1469B c1469b;
        K0 k02 = (K0) this.f18304s;
        r1 r1Var = k02.f19002g.f18914s;
        G gF1 = r1Var.f1();
        J jH1 = r1Var.h1();
        long jL0 = -9223372036854775807L;
        if ((!r1Var.K0(16) || !r1Var.O0()) && r1Var.K0(16)) {
            jL0 = r1Var.l0();
        }
        String str = gF1 != null ? gF1.f16223a : "";
        Uri uri = null;
        if (gF1 == null || (c1469b = gF1.f16224b) == null) {
            c1640c = null;
        } else {
            c1640c = null;
            uri = c1469b.f16185a;
        }
        if (Objects.equals((J) this.f18301p, jH1) && Objects.equals((String) this.f18302q, str) && Objects.equals((Uri) this.f18303r, uri) && this.f18300o == jL0) {
            return;
        }
        this.f18302q = str;
        this.f18303r = uri;
        this.f18301p = jH1;
        this.f18300o = jL0;
        A0 a0 = k02.f19002g;
        y yVarH = a0.f18908m.H(jH1);
        if (yVarH != null) {
            k02.f19009p = c1640c;
            if (yVarH.isDone()) {
                try {
                    bitmap = (Bitmap) M3.a.O(yVarH);
                } catch (CancellationException | ExecutionException e7) {
                    AbstractC1697a.w("Failed to load bitmap: " + e7.getMessage());
                    bitmap = c1640c;
                }
            } else {
                C1640c c1640c2 = new C1640c();
                c1640c2.f18304s = this;
                c1640c2.f18301p = jH1;
                c1640c2.f18302q = str;
                c1640c2.f18303r = uri;
                c1640c2.f18300o = jL0;
                k02.f19009p = c1640c2;
                Handler handler = a0.l;
                Objects.requireNonNull(handler);
                yVarH.b(new I4.t(yVarH, 0, c1640c2), new O(handler, 0));
            }
            bitmap = c1640c;
        } else {
            bitmap = c1640c;
        }
        K0.D(k02.f19005k, AbstractC1748s.l(jH1, str, uri, jL0, bitmap));
    }

    public void u(h0 h0Var) {
        K0 k02 = (K0) this.f18304s;
        r1 r1Var = k02.f19002g.f18914s;
        if (!(r1Var.f19343e.a(17) && r1Var.y().a(17)) || h0Var.p()) {
            K0.F(k02.f19005k, null);
            return;
        }
        M m7 = AbstractC1748s.f19344a;
        ArrayList arrayList = new ArrayList();
        g0 g0Var = new g0();
        for (int i7 = 0; i7 < h0Var.o(); i7++) {
            arrayList.add(h0Var.m(i7, g0Var, 0L).f16456c);
        }
        ArrayList arrayList2 = new ArrayList();
        F f7 = new F(this, new AtomicInteger(0), arrayList, arrayList2, h0Var, 4);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            byte[] bArr = ((G) arrayList.get(i8)).f16226d.f16313k;
            if (bArr == null) {
                arrayList2.add(null);
                f7.run();
            } else {
                A0 a0 = k02.f19002g;
                y yVarW = a0.f18908m.w(bArr);
                arrayList2.add(yVarW);
                Handler handler = a0.l;
                Objects.requireNonNull(handler);
                yVarW.b(f7, new O(handler, 0));
            }
        }
    }

    @Override // w3.InterfaceC1746q0
    public void a() {
    }
}
