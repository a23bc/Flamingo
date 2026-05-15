package E0;

import java.util.ArrayList;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import y0.AbstractC1978k;
import y0.AbstractC1983p;
import y0.C1953C;
import y0.C1965O;
import y0.C1976i;
import y0.C1987t;

/* JADX INFO: renamed from: E0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0092c extends D {

    /* JADX INFO: renamed from: b */
    public float[] f1698b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1699c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f1700d = true;

    /* JADX INFO: renamed from: e */
    public long f1701e = C1987t.f20262j;

    /* JADX INFO: renamed from: f */
    public List f1702f;

    /* JADX INFO: renamed from: g */
    public boolean f1703g;
    public C1976i h;

    /* JADX INFO: renamed from: i */
    public AbstractC1210l f1704i;

    /* JADX INFO: renamed from: j */
    public final B0.b f1705j;

    /* JADX INFO: renamed from: k */
    public String f1706k;
    public float l;

    /* JADX INFO: renamed from: m */
    public float f1707m;

    /* JADX INFO: renamed from: n */
    public float f1708n;

    /* JADX INFO: renamed from: o */
    public float f1709o;

    /* JADX INFO: renamed from: p */
    public float f1710p;

    /* JADX INFO: renamed from: q */
    public float f1711q;

    /* JADX INFO: renamed from: r */
    public float f1712r;

    /* JADX INFO: renamed from: s */
    public boolean f1713s;

    public C0092c() {
        int i7 = I.f1667a;
        this.f1702f = Z4.v.f8818o;
        this.f1703g = true;
        this.f1705j = new B0.b(1, this);
        this.f1706k = "";
        this.f1709o = 1.0f;
        this.f1710p = 1.0f;
        this.f1713s = true;
    }

    @Override // E0.D
    public final void a(A0.f fVar) {
        if (this.f1713s) {
            float[] fArrA = this.f1698b;
            if (fArrA == null) {
                fArrA = C1953C.a();
                this.f1698b = fArrA;
            } else {
                C1953C.d(fArrA);
            }
            C1953C.f(fArrA, this.f1711q + this.f1707m, this.f1712r + this.f1708n);
            float f7 = this.l;
            if (fArrA.length >= 16) {
                double d4 = ((double) f7) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d4);
                float fCos = (float) Math.cos(d4);
                float f8 = fArrA[0];
                float f9 = fArrA[4];
                float f10 = (fSin * f9) + (fCos * f8);
                float f11 = -fSin;
                float f12 = (f9 * fCos) + (f8 * f11);
                float f13 = fArrA[1];
                float f14 = fArrA[5];
                float f15 = (fSin * f14) + (fCos * f13);
                float f16 = (f14 * fCos) + (f13 * f11);
                float f17 = fArrA[2];
                float f18 = fArrA[6];
                float f19 = (fSin * f18) + (fCos * f17);
                float f20 = (f18 * fCos) + (f17 * f11);
                float f21 = fArrA[3];
                float f22 = fArrA[7];
                float f23 = (fSin * f22) + (fCos * f21);
                fArrA[0] = f10;
                fArrA[1] = f15;
                fArrA[2] = f19;
                fArrA[3] = f23;
                fArrA[4] = f12;
                fArrA[5] = f16;
                fArrA[6] = f20;
                fArrA[7] = (fCos * f22) + (f11 * f21);
            }
            float f24 = this.f1709o;
            float f25 = this.f1710p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f24;
                fArrA[1] = fArrA[1] * f24;
                fArrA[2] = fArrA[2] * f24;
                fArrA[3] = fArrA[3] * f24;
                fArrA[4] = fArrA[4] * f25;
                fArrA[5] = fArrA[5] * f25;
                fArrA[6] = fArrA[6] * f25;
                fArrA[7] = fArrA[7] * f25;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            C1953C.f(fArrA, -this.f1707m, -this.f1708n);
            this.f1713s = false;
        }
        if (this.f1703g) {
            if (!this.f1702f.isEmpty()) {
                C1976i c1976iA = this.h;
                if (c1976iA == null) {
                    c1976iA = AbstractC1978k.a();
                    this.h = c1976iA;
                }
                AbstractC0091b.d(this.f1702f, c1976iA);
            }
            this.f1703g = false;
        }
        A0.b bVarA = fVar.A();
        long jW = bVarA.W();
        bVarA.S().l();
        try {
            A.b bVar = (A.b) bVarA.f50p;
            float[] fArr = this.f1698b;
            A0.b bVar2 = (A0.b) bVar.f3p;
            if (fArr != null) {
                bVar2.S().r(fArr);
            }
            C1976i c1976i = this.h;
            if (!this.f1702f.isEmpty() && c1976i != null) {
                bVar2.S().b(c1976i);
            }
            ArrayList arrayList = this.f1699c;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((D) arrayList.get(i7)).a(fVar);
            }
        } finally {
            n1.c.A(bVarA, jW);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l5.c, m5.l] */
    @Override // E0.D
    public final InterfaceC1182c b() {
        return this.f1704i;
    }

    @Override // E0.D
    public final void d(B0.b bVar) {
        this.f1704i = bVar;
    }

    public final void e(int i7, D d4) {
        ArrayList arrayList = this.f1699c;
        if (i7 < arrayList.size()) {
            arrayList.set(i7, d4);
        } else {
            arrayList.add(d4);
        }
        g(d4);
        d4.d(this.f1705j);
        c();
    }

    public final void f(long j3) {
        if (this.f1700d && j3 != 16) {
            long j7 = this.f1701e;
            if (j7 == 16) {
                this.f1701e = j3;
                return;
            }
            int i7 = I.f1667a;
            if (C1987t.h(j7) == C1987t.h(j3) && C1987t.g(j7) == C1987t.g(j3) && C1987t.e(j7) == C1987t.e(j3)) {
                return;
            }
            this.f1700d = false;
            this.f1701e = C1987t.f20262j;
        }
    }

    public final void g(D d4) {
        if (!(d4 instanceof C0098i)) {
            if (d4 instanceof C0092c) {
                C0092c c0092c = (C0092c) d4;
                if (c0092c.f1700d && this.f1700d) {
                    f(c0092c.f1701e);
                    return;
                } else {
                    this.f1700d = false;
                    this.f1701e = C1987t.f20262j;
                    return;
                }
            }
            return;
        }
        C0098i c0098i = (C0098i) d4;
        AbstractC1983p abstractC1983p = c0098i.f1747b;
        if (this.f1700d && abstractC1983p != null) {
            if (abstractC1983p instanceof C1965O) {
                f(((C1965O) abstractC1983p).f20223a);
            } else {
                this.f1700d = false;
                this.f1701e = C1987t.f20262j;
            }
        }
        AbstractC1983p abstractC1983p2 = c0098i.f1752g;
        if (this.f1700d && abstractC1983p2 != null) {
            if (abstractC1983p2 instanceof C1965O) {
                f(((C1965O) abstractC1983p2).f20223a);
            } else {
                this.f1700d = false;
                this.f1701e = C1987t.f20262j;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f1706k);
        ArrayList arrayList = this.f1699c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            D d4 = (D) arrayList.get(i7);
            sb.append("\t");
            sb.append(d4.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
