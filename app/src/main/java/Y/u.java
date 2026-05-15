package Y;

import M.V;
import b1.M;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.D;
import r0.InterfaceC1398p;
import y0.C1987t;
import y0.InterfaceC1988u;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f8417a = new D(b.f8364x);

    public static final void a(String str, InterfaceC1398p interfaceC1398p, long j3, long j7, long j8, long j9, int i7, boolean z6, int i8, int i9, M m7, C0912t c0912t, int i10) {
        long j10;
        long j11;
        long j12;
        M m8;
        boolean z7;
        int i11;
        int i12;
        M m9;
        long j13;
        boolean z8;
        long j14;
        long j15;
        c0912t.Z(1028090691);
        int i13 = i10 | (c0912t.f(str) ? 4 : 2) | 920347008;
        if ((306783379 & i13) == 306783378 && c0912t.z()) {
            c0912t.Q();
            j14 = j3;
            j13 = j8;
            j15 = j9;
            z8 = z6;
            i12 = i9;
            m9 = m7;
        } else {
            c0912t.S();
            if ((i10 & 1) == 0 || c0912t.x()) {
                j10 = C1987t.f20262j;
                j11 = n1.p.f14526c;
                j12 = j11;
                m8 = (M) c0912t.j(f8417a);
                z7 = true;
                i11 = 1;
            } else {
                c0912t.Q();
                j10 = j3;
                j11 = j8;
                j12 = j9;
                z7 = z6;
                i11 = i9;
                m8 = m7;
            }
            c0912t.q();
            long jB = j10 != 16 ? j10 : m8.b() != 16 ? m8.b() : C1987t.b(((C1987t) c0912t.j(e.f8369a)).f20264a, ((Number) c0912t.j(d.f8368a)).floatValue());
            M mD = M.d(m8, 0L, j7, null, null, j11, Integer.MIN_VALUE, j12, 16609105);
            boolean zE = c0912t.e(jB);
            Object objK = c0912t.K();
            if (zE || objK == C0903o.f11850a) {
                objK = new s(jB);
                c0912t.i0(objK);
            }
            V.b(str, interfaceC1398p, mD, i7, z7, i8, i11, (InterfaceC1988u) objK, c0912t, (i13 & 126) | 14380032, 0);
            i12 = i11;
            m9 = m8;
            j13 = j11;
            z8 = z7;
            j14 = j10;
            j15 = j12;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new t(str, interfaceC1398p, j14, j7, j13, j15, i7, z8, i8, i12, m9, i10);
        }
    }
}
