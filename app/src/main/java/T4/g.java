package T4;

import Y4.o;
import a.AbstractC0509a;
import android.text.Layout;
import b1.AbstractC0607C;
import b1.C0616a;
import b1.L;
import b1.q;
import c1.C0724j;
import h1.AbstractC0996a;
import j5.AbstractC1110d;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.C1217s;
import m5.C1218t;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6967o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f6968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f6969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6971s;

    public /* synthetic */ g(long j3, float[] fArr, C1218t c1218t, C1217s c1217s) {
        this.f6968p = j3;
        this.f6969q = fArr;
        this.f6970r = c1218t;
        this.f6971s = c1217s;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        C0616a c0616a;
        long j3;
        boolean z6;
        float fA;
        float fA2;
        switch (this.f6967o) {
            case 0:
                A0.f fVar = (A0.f) obj;
                f fVar2 = (f) this.f6969q;
                d dVar = (d) this.f6970r;
                B0.d dVar2 = (B0.d) this.f6971s;
                AbstractC1209k.f(dVar2, "$contentLayer");
                AbstractC1209k.f(fVar, "$this$record");
                long j7 = fVar2.f6965j;
                if (j7 == 16) {
                    throw new IllegalStateException("HazeStyle.backgroundColor not specified. Please provide a color.");
                }
                A0.e.x(0.0f, 126, j7, 0L, fVar);
                long jG = C1892b.g(C1892b.h(this.f6968p, ((C1892b) ((a) dVar.f6952F.f6977a.getValue()).f6943b.getValue()).f19867a), fVar2.f6962f);
                if (!AbstractC1110d.z(jG) || C1892b.b(jG, 0L)) {
                    AbstractC0509a.t(fVar, dVar2);
                } else {
                    float fD = C1892b.d(jG);
                    float fE = C1892b.e(jG);
                    ((A.b) fVar.A().f50p).J(fD, fE);
                    try {
                        AbstractC0509a.t(fVar, dVar2);
                    } finally {
                        ((A.b) fVar.A().f50p).J(-fD, -fE);
                    }
                }
                return o.f8736a;
            default:
                q qVar = (q) obj;
                int i7 = qVar.f9997b;
                long j8 = this.f6968p;
                int iF = i7 > L.f(j8) ? qVar.f9997b : L.f(j8);
                int iE = L.e(j8);
                int iE2 = qVar.f9998c;
                if (iE2 >= iE) {
                    iE2 = L.e(j8);
                }
                long jB = AbstractC0607C.b(qVar.d(iF), qVar.d(iE2));
                C1218t c1218t = (C1218t) this.f6970r;
                int i8 = c1218t.f14437o;
                C0616a c0616a2 = qVar.f9996a;
                int iF2 = L.f(jB);
                int iE3 = L.e(jB);
                C0724j c0724j = c0616a2.f9955d;
                Layout layout = c0724j.f10641f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    AbstractC0996a.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    AbstractC0996a.a("startOffset must be less than text length");
                }
                if (iE3 <= iF2) {
                    AbstractC0996a.a("endOffset must be greater than startOffset");
                }
                if (iE3 > length) {
                    AbstractC0996a.a("endOffset must be smaller or equal to text length");
                }
                int i9 = (iE3 - iF2) * 4;
                float[] fArr = (float[]) this.f6969q;
                if (fArr.length - i8 < i9) {
                    AbstractC0996a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iF2);
                int lineForOffset2 = layout.getLineForOffset(iE3 - 1);
                X0.i iVar = new X0.i(c0724j);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int iF3 = c0724j.f(lineForOffset);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE3, iF3);
                        float fG = c0724j.g(lineForOffset);
                        float fE2 = c0724j.e(lineForOffset);
                        c0616a = c0616a2;
                        j3 = jB;
                        boolean z7 = false;
                        boolean z8 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z8 || zIsRtlCharAt) {
                                if (z8 && zIsRtlCharAt) {
                                    z7 = false;
                                    float fA3 = iVar.a(iMax, false, false, false);
                                    z6 = z8;
                                    fA = iVar.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    z6 = z8;
                                    z7 = false;
                                    if (z6 || !zIsRtlCharAt) {
                                        fA = iVar.a(iMax, false, false, false);
                                        fA2 = iVar.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = iVar.a(iMax, false, false, true);
                                        fA = iVar.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i8] = fA;
                                fArr[i8 + 1] = fG;
                                fArr[i8 + 2] = fA2;
                                fArr[i8 + 3] = fE2;
                                i8 += 4;
                                iMax++;
                                z8 = z6;
                            } else {
                                fA = iVar.a(iMax, z7, z7, true);
                                z6 = z8;
                                fA2 = iVar.a(iMax + 1, true, true, true);
                            }
                            z7 = false;
                            fArr[i8] = fA;
                            fArr[i8 + 1] = fG;
                            fArr[i8 + 2] = fA2;
                            fArr[i8 + 3] = fE2;
                            i8 += 4;
                            iMax++;
                            z8 = z6;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            c0616a2 = c0616a;
                            jB = j3;
                        }
                    }
                } else {
                    c0616a = c0616a2;
                    j3 = jB;
                }
                int iD = (L.d(j3) * 4) + c1218t.f14437o;
                int i10 = c1218t.f14437o;
                while (true) {
                    C1217s c1217s = (C1217s) this.f6971s;
                    if (i10 >= iD) {
                        c1218t.f14437o = iD;
                        c1217s.f14436o = c0616a.b() + c1217s.f14436o;
                        return o.f8736a;
                    }
                    int i11 = i10 + 1;
                    float f7 = fArr[i11];
                    float f8 = c1217s.f14436o;
                    fArr[i11] = f7 + f8;
                    int i12 = i10 + 3;
                    fArr[i12] = fArr[i12] + f8;
                    i10 += 4;
                }
                break;
        }
    }

    public /* synthetic */ g(f fVar, d dVar, long j3, B0.d dVar2) {
        this.f6969q = fVar;
        this.f6970r = dVar;
        this.f6968p = j3;
        this.f6971s = dVar2;
    }
}
