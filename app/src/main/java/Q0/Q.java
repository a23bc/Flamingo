package Q0;

import O0.C0324v;
import java.util.Arrays;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements n1.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f5872p = 9223372034707292159L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f5873q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ T f5874r;

    public Q(T t7) {
        this.f5874r = t7;
    }

    @Override // n1.d
    public final /* synthetic */ float E(long j3) {
        return n1.c.h(j3, this);
    }

    @Override // n1.d
    public final /* synthetic */ int L(float f7) {
        return n1.c.f(f7, this);
    }

    @Override // n1.d
    public final /* synthetic */ long V(long j3) {
        return n1.c.k(j3, this);
    }

    @Override // n1.d
    public final /* synthetic */ float Y(long j3) {
        return n1.c.j(j3, this);
    }

    public final void a(C0324v c0324v, float f7) {
        T t7 = this.f5874r;
        J2.r rVar = t7.f5879A;
        if (rVar == null) {
            rVar = new J2.r();
            t7.f5879A = rVar;
        }
        int iL0 = Z4.l.l0((C0324v[]) rVar.f3726b, c0324v);
        if (iL0 >= 0) {
            float[] fArr = (float[]) rVar.f3727c;
            if (fArr[iL0] != f7) {
                fArr[iL0] = f7;
                ((byte[]) rVar.f3728d)[iL0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) rVar.f3728d;
                if (bArr[iL0] == 2) {
                    bArr[iL0] = 0;
                    return;
                }
                return;
            }
        }
        int i7 = rVar.f3725a;
        C0324v[] c0324vArr = (C0324v[]) rVar.f3726b;
        if (i7 == c0324vArr.length) {
            int i8 = i7 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(c0324vArr, i8);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            rVar.f3726b = (C0324v[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf((float[]) rVar.f3727c, i8);
            AbstractC1209k.e(fArrCopyOf, "copyOf(...)");
            rVar.f3727c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf((byte[]) rVar.f3728d, i8);
            AbstractC1209k.e(bArrCopyOf, "copyOf(...)");
            rVar.f3728d = bArrCopyOf;
        }
        ((C0324v[]) rVar.f3726b)[i7] = c0324v;
        ((byte[]) rVar.f3728d)[i7] = 3;
        ((float[]) rVar.f3727c)[i7] = f7;
        rVar.f3725a++;
    }

    @Override // n1.d
    public final float b() {
        return this.f5874r.b();
    }

    @Override // n1.d
    public final long e0(float f7) {
        return n1.c.l(k0(f7), this);
    }

    @Override // n1.d
    public final float i0(int i7) {
        return i7 / b();
    }

    @Override // n1.d
    public final float k0(float f7) {
        return f7 / b();
    }

    @Override // n1.d
    public final float n() {
        return this.f5874r.n();
    }

    @Override // n1.d
    public final /* synthetic */ long t(long j3) {
        return n1.c.i(j3, this);
    }

    @Override // n1.d
    public final float v(float f7) {
        return b() * f7;
    }
}
