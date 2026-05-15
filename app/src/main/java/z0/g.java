package z0;

import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f21059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f21060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f21061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f21062d;

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f21059a = cVar;
        this.f21060b = cVar2;
        this.f21061c = cVar3;
        this.f21062d = fArr;
    }

    public long a(long j3) {
        float fH = C1987t.h(j3);
        float fG = C1987t.g(j3);
        float fE = C1987t.e(j3);
        float fD = C1987t.d(j3);
        c cVar = this.f21060b;
        long jD = cVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = cVar.e(fH, fG, fE);
        float[] fArr = this.f21062d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f7 = fIntBitsToFloat;
        float f8 = fIntBitsToFloat2;
        return this.f21061c.f(f7, f8, fE2, fD, this.f21059a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(z0.c r11, z0.c r12, int r13) {
        /*
            r10 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            long r4 = r11.f21031b
            long r6 = z0.AbstractC2077b.f21025a
            boolean r4 = z0.AbstractC2077b.a(r4, r6)
            if (r4 == 0) goto L13
            z0.c r4 = z0.j.a(r11)
            goto L14
        L13:
            r4 = r11
        L14:
            long r8 = r12.f21031b
            boolean r5 = z0.AbstractC2077b.a(r8, r6)
            if (r5 == 0) goto L21
            z0.c r5 = z0.j.a(r12)
            goto L22
        L21:
            r5 = r12
        L22:
            if (r13 != r3) goto L69
            long r8 = r11.f21031b
            boolean r13 = z0.AbstractC2077b.a(r8, r6)
            long r8 = r12.f21031b
            boolean r6 = z0.AbstractC2077b.a(r8, r6)
            if (r13 == 0) goto L35
            if (r6 == 0) goto L35
            goto L69
        L35:
            if (r13 != 0) goto L39
            if (r6 == 0) goto L69
        L39:
            if (r13 == 0) goto L3c
            goto L3d
        L3c:
            r11 = r12
        L3d:
            z0.q r11 = (z0.q) r11
            float[] r7 = z0.j.f21068e
            z0.s r11 = r11.f21083d
            if (r13 == 0) goto L4a
            float[] r13 = r11.a()
            goto L4b
        L4a:
            r13 = r7
        L4b:
            if (r6 == 0) goto L51
            float[] r7 = r11.a()
        L51:
            r11 = r13[r2]
            r6 = r7[r2]
            float r11 = r11 / r6
            r6 = r13[r1]
            r8 = r7[r1]
            float r6 = r6 / r8
            r13 = r13[r0]
            r7 = r7[r0]
            float r13 = r13 / r7
            float[] r3 = new float[r3]
            r3[r2] = r11
            r3[r1] = r6
            r3[r0] = r13
            goto L6a
        L69:
            r3 = 0
        L6a:
            r10.<init>(r12, r4, r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.g.<init>(z0.c, z0.c, int):void");
    }
}
