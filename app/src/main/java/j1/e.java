package j1;

import A2.W;
import android.graphics.Paint;
import android.text.TextPaint;
import f0.G;
import m5.AbstractC1209k;
import w2.l;
import x0.C1895e;
import y0.AbstractC1959I;
import y0.AbstractC1983p;
import y0.C1962L;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class e extends TextPaint {

    /* JADX INFO: renamed from: a */
    public l f13662a;

    /* JADX INFO: renamed from: b */
    public m1.l f13663b;

    /* JADX INFO: renamed from: c */
    public int f13664c;

    /* JADX INFO: renamed from: d */
    public C1962L f13665d;

    /* JADX INFO: renamed from: e */
    public C1987t f13666e;

    /* JADX INFO: renamed from: f */
    public AbstractC1983p f13667f;

    /* JADX INFO: renamed from: g */
    public G f13668g;
    public C1895e h;

    /* JADX INFO: renamed from: i */
    public A0.d f13669i;

    public final l a() {
        l lVar = this.f13662a;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        this.f13662a = lVar2;
        return lVar2;
    }

    public final void b(int i7) {
        if (i7 == this.f13664c) {
            return;
        }
        a().g(i7);
        this.f13664c = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final y0.AbstractC1983p r6, final long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f13668g = r0
            r5.f13667f = r0
            r5.h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof y0.C1965O
            if (r1 == 0) goto L1d
            y0.O r6 = (y0.C1965O) r6
            long r6 = r6.f20223a
            long r6 = j5.AbstractC1110d.B(r6, r9)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof y0.AbstractC1961K
            if (r1 == 0) goto L71
            y0.p r1 = r5.f13667f
            boolean r1 = m5.AbstractC1209k.a(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            x0.e r1 = r5.h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f19880a
            boolean r1 = x0.C1895e.a(r3, r7)
        L36:
            if (r1 != 0) goto L58
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L58
            r5.f13667f = r6
            x0.e r1 = new x0.e
            r1.<init>(r7)
            r5.h = r1
            j1.d r1 = new j1.d
            r1.<init>()
            f0.G r6 = f0.C0879c.o(r1)
            r5.f13668g = r6
        L58:
            w2.l r6 = r5.a()
            f0.G r7 = r5.f13668g
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L68
        L67:
            r7 = r0
        L68:
            r6.k(r7)
            r5.f13666e = r0
            j1.j.b(r5, r9)
            return
        L71:
            A2.W r6 = new A2.W
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.e.c(y0.p, long, float):void");
    }

    public final void d(long j3) {
        C1987t c1987t = this.f13666e;
        if (c1987t == null ? false : C1987t.c(c1987t.f20264a, j3)) {
            return;
        }
        if (j3 != 16) {
            this.f13666e = new C1987t(j3);
            setColor(AbstractC1959I.x(j3));
            this.f13668g = null;
            this.f13667f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(A0.d dVar) {
        if (dVar == null || AbstractC1209k.a(this.f13669i, dVar)) {
            return;
        }
        this.f13669i = dVar;
        if (dVar.equals(A0.h.f59b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(dVar instanceof A0.i)) {
            throw new W();
        }
        a().o(1);
        A0.i iVar = (A0.i) dVar;
        a().n(iVar.f60b);
        ((Paint) a().f18861b).setStrokeMiter(iVar.f61c);
        a().m(iVar.f63e);
        a().l(iVar.f62d);
        ((Paint) a().f18861b).setPathEffect(null);
    }

    public final void f(C1962L c1962l) {
        if (c1962l == null || AbstractC1209k.a(this.f13665d, c1962l)) {
            return;
        }
        this.f13665d = c1962l;
        if (c1962l.equals(C1962L.f20207d)) {
            clearShadowLayer();
            return;
        }
        C1962L c1962l2 = this.f13665d;
        float f7 = c1962l2.f20210c;
        if (f7 == 0.0f) {
            f7 = Float.MIN_VALUE;
        }
        setShadowLayer(f7, Float.intBitsToFloat((int) (c1962l2.f20209b >> 32)), Float.intBitsToFloat((int) (this.f13665d.f20209b & 4294967295L)), AbstractC1959I.x(this.f13665d.f20208a));
    }

    public final void g(m1.l lVar) {
        if (lVar == null || AbstractC1209k.a(this.f13663b, lVar)) {
            return;
        }
        this.f13663b = lVar;
        int i7 = lVar.f14348a;
        setUnderlineText((i7 | 1) == i7);
        m1.l lVar2 = this.f13663b;
        lVar2.getClass();
        int i8 = lVar2.f14348a;
        setStrikeThruText((i8 | 2) == i8);
    }
}
