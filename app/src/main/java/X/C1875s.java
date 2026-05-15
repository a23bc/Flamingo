package x;

import I.C0216h;
import Q0.AbstractC0358n;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import f0.C0894j0;
import o5.AbstractC1267a;
import x0.C1895e;
import y0.AbstractC1959I;

/* JADX INFO: renamed from: x.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1875s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.d f19829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19830b = 9205357640488583168L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1825L f19831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0894j0 f19832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f19835g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC0358n f19836i;

    public C1875s(Context context, n1.d dVar, long j3, D.k0 k0Var) {
        this.f19829a = dVar;
        C1825L c1825l = new C1825L(context, AbstractC1959I.x(j3));
        this.f19831c = c1825l;
        this.f19832d = new C0894j0(Y4.o.f8736a, f0.W.f11764q);
        this.f19833e = true;
        this.f19835g = 0L;
        this.h = -1L;
        K0.N nA = K0.H.a(new C0216h(4, this));
        this.f19836i = Build.VERSION.SDK_INT >= 31 ? new C1832T(nA, this, c1825l) : new C1832T(nA, this, c1825l, k0Var);
    }

    public final void a() {
        boolean z6;
        C1825L c1825l = this.f19831c;
        EdgeEffect edgeEffect = c1825l.f19660d;
        boolean z7 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z6 = !edgeEffect.isFinished();
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = c1825l.f19661e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z6 = !edgeEffect2.isFinished() || z6;
        }
        EdgeEffect edgeEffect3 = c1825l.f19662f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z6 = !edgeEffect3.isFinished() || z6;
        }
        EdgeEffect edgeEffect4 = c1825l.f19663g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z6) {
                z7 = false;
            }
            z6 = z7;
        }
        if (z6) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0138, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r19, z.N0 r21, e5.AbstractC0865c r22) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1875s.b(long, z.N0, e5.c):java.lang.Object");
    }

    public final long c() {
        long jA = this.f19830b;
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = i6.h.A(this.f19835g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32)) / Float.intBitsToFloat((int) (this.f19835g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jA & 4294967295L)) / Float.intBitsToFloat((int) (this.f19835g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.f19833e) {
            this.f19832d.setValue(Y4.o.f8736a);
        }
    }

    public final float e(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i7 = (int) (j3 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i7) / Float.intBitsToFloat((int) (this.f19835g & 4294967295L));
        EdgeEffect edgeEffectB = this.f19831c.b();
        float fC = -fIntBitsToFloat2;
        float f7 = 1 - fIntBitsToFloat;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31) {
            fC = AbstractC1881v.c(edgeEffectB, fC, f7);
        } else {
            edgeEffectB.onPull(fC, f7);
        }
        return (i8 >= 31 ? AbstractC1881v.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f19835g)) * (-fC) : Float.intBitsToFloat(i7);
    }

    public final float f(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i7 = (int) (j3 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i7) / Float.intBitsToFloat((int) (this.f19835g >> 32));
        EdgeEffect edgeEffectC = this.f19831c.c();
        float f7 = 1 - fIntBitsToFloat;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31) {
            fIntBitsToFloat2 = AbstractC1881v.c(edgeEffectC, fIntBitsToFloat2, f7);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f7);
        }
        return (i8 >= 31 ? AbstractC1881v.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f19835g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i7);
    }

    public final float g(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i7 = (int) (j3 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i7) / Float.intBitsToFloat((int) (this.f19835g >> 32));
        EdgeEffect edgeEffectD = this.f19831c.d();
        float fC = -fIntBitsToFloat2;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31) {
            fC = AbstractC1881v.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i8 >= 31 ? AbstractC1881v.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f19835g >> 32)) * (-fC) : Float.intBitsToFloat(i7);
    }

    public final float h(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i7 = (int) (j3 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i7) / Float.intBitsToFloat((int) (this.f19835g & 4294967295L));
        EdgeEffect edgeEffectE = this.f19831c.e();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31) {
            fIntBitsToFloat2 = AbstractC1881v.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i8 >= 31 ? AbstractC1881v.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f19835g)) * fIntBitsToFloat2 : Float.intBitsToFloat(i7);
    }

    public final void i(long j3) {
        boolean zA = C1895e.a(this.f19835g, 0L);
        boolean zA2 = C1895e.a(j3, this.f19835g);
        this.f19835g = j3;
        if (!zA2) {
            int iH = AbstractC1267a.H(Float.intBitsToFloat((int) (j3 >> 32)));
            long jH = (((long) AbstractC1267a.H(Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L) | (((long) iH) << 32);
            C1825L c1825l = this.f19831c;
            c1825l.f19659c = jH;
            EdgeEffect edgeEffect = c1825l.f19660d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jH >> 32), (int) (jH & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c1825l.f19661e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jH >> 32), (int) (jH & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c1825l.f19662f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jH & 4294967295L), (int) (jH >> 32));
            }
            EdgeEffect edgeEffect4 = c1825l.f19663g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jH & 4294967295L), (int) (jH >> 32));
            }
            EdgeEffect edgeEffect5 = c1825l.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jH >> 32), (int) (jH & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c1825l.f19664i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jH >> 32), (int) (jH & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c1825l.f19665j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jH & 4294967295L), (int) (jH >> 32));
            }
            EdgeEffect edgeEffect8 = c1825l.f19666k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jH), (int) (jH >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
