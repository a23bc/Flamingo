package Z0;

import B2.e;
import D4.i;
import E0.K;
import N5.d;
import Q0.C0352h0;
import Q0.j0;
import Q0.r0;
import R0.A0;
import android.os.Handler;
import i6.h;
import n1.k;
import r0.AbstractC1384b;
import t.C1444F;
import x0.C1891a;
import y0.C1953C;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    public final i f8739a;

    /* JADX INFO: renamed from: b */
    public final b f8740b;

    /* JADX INFO: renamed from: c */
    public final C1444F f8741c;

    /* JADX INFO: renamed from: d */
    public boolean f8742d;

    /* JADX INFO: renamed from: e */
    public boolean f8743e;

    /* JADX INFO: renamed from: f */
    public boolean f8744f;

    /* JADX INFO: renamed from: g */
    public e f8745g;
    public long h;

    /* JADX INFO: renamed from: i */
    public final K f8746i;

    /* JADX INFO: renamed from: j */
    public final C1891a f8747j;

    public a() {
        i iVar = new i(10, (byte) 0);
        iVar.f1583q = new long[192];
        iVar.f1584r = new long[192];
        this.f8739a = iVar;
        this.f8740b = new b();
        this.f8741c = new C1444F();
        this.h = -1L;
        this.f8746i = new K(14, this);
        this.f8747j = new C1891a();
    }

    public static long g(Q0.K k7) {
        float[] fArrB;
        int iE;
        C0352h0 c0352h0 = k7.f5821T;
        j0 j0Var = c0352h0.f6003d;
        j0 j0Var2 = c0352h0.f6002c;
        long jF = 0;
        while (j0Var2 != null && j0Var2 != j0Var) {
            r0 r0Var = j0Var2.f6046Y;
            jF = h.F(jF, j0Var2.f6037P);
            j0Var2 = j0Var2.f6028G;
            if (r0Var != null && (iE = d.e((fArrB = ((A0) r0Var).b()))) != 3) {
                if ((iE & 2) == 0) {
                    return 9223372034707292159L;
                }
                jF = C1953C.b(jF, fArrB);
            }
        }
        return h.H(jF);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.a.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(Q0.K r20, long r21, boolean r23) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.a.b(Q0.K, long, boolean):void");
    }

    public final void c(Q0.K k7) {
        h0.e eVarA = k7.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            Q0.K k8 = (Q0.K) objArr[i8];
            b(k8, k8.f5821T.f6003d.f6037P, false);
            c(k8);
        }
    }

    public final void d(Q0.K k7) {
        this.f8742d = true;
        int i7 = k7.f5831p & 67108863;
        i iVar = this.f8739a;
        long[] jArr = (long[]) iVar.f1583q;
        int i8 = iVar.f1582p;
        int i9 = 0;
        while (true) {
            if (i9 >= jArr.length - 2 || i9 >= i8) {
                break;
            }
            int i10 = i9 + 2;
            long j3 = jArr[i10];
            if ((((int) j3) & 67108863) == i7) {
                jArr[i10] = 2305843009213693952L | j3;
                break;
            }
            i9 += 3;
        }
        e eVar = this.f8745g;
        boolean z6 = eVar != null;
        long j7 = this.f8740b.f8749b;
        if (j7 >= 0 || !z6) {
            if (this.h == j7 && z6) {
                return;
            }
            if (eVar != null) {
                Handler handler = AbstractC1384b.f15607a;
                AbstractC1384b.f15607a.removeCallbacks(eVar);
            }
            Handler handler2 = AbstractC1384b.f15607a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j7, ((long) 16) + jCurrentTimeMillis);
            this.h = jMax;
            e eVar2 = new e(20, this.f8746i);
            AbstractC1384b.f15607a.postDelayed(eVar2, jMax - jCurrentTimeMillis);
            this.f8745g = eVar2;
        }
    }

    public final void e(Q0.K k7) {
        long jG = g(k7);
        if (k.b(jG, 9223372034707292159L)) {
            c(k7);
            return;
        }
        k7.f5834s = jG;
        k7.f5835t = false;
        h0.e eVarA = k7.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            Q0.K k8 = (Q0.K) objArr[i8];
            f(k8, k8.f5821T.f6003d.f6037P, false);
        }
        d(k7);
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(Q0.K r32, long r33, boolean r35) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.a.f(Q0.K, long, boolean):void");
    }

    public final void h(Q0.K k7) {
        int i7 = k7.f5831p & 67108863;
        i iVar = this.f8739a;
        long[] jArr = (long[]) iVar.f1583q;
        int i8 = iVar.f1582p;
        int i9 = 0;
        while (true) {
            if (i9 >= jArr.length - 2 || i9 >= i8) {
                break;
            }
            int i10 = i9 + 2;
            if ((((int) jArr[i10]) & 67108863) == i7) {
                jArr[i9] = -1;
                jArr[i9 + 1] = -1;
                jArr[i10] = 2305843009213693951L;
                break;
            }
            i9 += 3;
        }
        this.f8742d = true;
        this.f8744f = true;
    }
}
