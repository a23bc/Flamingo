package z0;

import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f21056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f21057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f21058g;

    public f(q qVar, q qVar2) {
        float[] fArrG;
        super(qVar2, qVar, qVar2, null);
        this.f21056e = qVar;
        this.f21057f = qVar2;
        s sVar = qVar2.f21083d;
        s sVar2 = qVar.f21083d;
        boolean zD = j.d(sVar2, sVar);
        float[] fArr = qVar.f21087i;
        float[] fArr2 = qVar2.f21088j;
        if (zD) {
            fArrG = j.g(fArr2, fArr);
        } else {
            float[] fArrA = sVar2.a();
            s sVar3 = qVar2.f21083d;
            float[] fArrA2 = sVar3.a();
            s sVar4 = j.f21065b;
            boolean zD2 = j.d(sVar2, sVar4);
            float[] fArr3 = C2076a.f21023b.f21024a;
            fArrG = j.g(j.d(sVar3, sVar4) ? fArr2 : j.f(j.g(j.c(fArr3, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.f21087i)), zD2 ? fArr : j.g(j.c(fArr3, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr));
        }
        this.f21058g = fArrG;
    }

    @Override // z0.g
    public final long a(long j3) {
        float fH = C1987t.h(j3);
        float fG = C1987t.g(j3);
        float fE = C1987t.e(j3);
        float fD = C1987t.d(j3);
        m mVar = this.f21056e.f21093p;
        float fB = (float) mVar.b(fH);
        float fB2 = (float) mVar.b(fG);
        float fB3 = (float) mVar.b(fE);
        float[] fArr = this.f21058g;
        float f7 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        float f8 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
        float f9 = (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
        q qVar = this.f21057f;
        float fB4 = (float) qVar.f21090m.b(f7);
        double d4 = f8;
        m mVar2 = qVar.f21090m;
        return AbstractC1959I.b(fB4, (float) mVar2.b(d4), (float) mVar2.b(f9), fD, qVar);
    }
}
