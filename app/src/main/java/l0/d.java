package L0;

import A2.W;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f4096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a[] f4098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f4100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f4101g;
    public final float[] h;

    public /* synthetic */ d() {
        this(false, c.f4092o);
    }

    public final void a(long j3, float f7) {
        int i7 = (this.f4099e + 1) % 20;
        this.f4099e = i7;
        a[] aVarArr = this.f4098d;
        a aVar = aVarArr[i7];
        if (aVar != null) {
            aVar.f4087a = j3;
            aVar.f4088b = f7;
        } else {
            a aVar2 = new a();
            aVar2.f4087a = j3;
            aVar2.f4088b = f7;
            aVarArr[i7] = aVar2;
        }
    }

    public final float b(float f7) {
        c cVar;
        float[] fArr;
        float[] fArr2;
        float f8;
        boolean z6;
        int i7;
        float fSignum;
        float f9 = f7;
        float f10 = 0.0f;
        if (f9 <= 0.0f) {
            N0.a.b("maximumVelocity should be a positive value. You specified=" + f9);
        }
        int i8 = this.f4099e;
        a[] aVarArr = this.f4098d;
        a aVar = aVarArr[i8];
        if (aVar == null) {
            f8 = 0.0f;
        } else {
            int i9 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i8];
                boolean z7 = this.f4095a;
                cVar = this.f4096b;
                fArr = this.f4100f;
                fArr2 = this.f4101g;
                if (aVar3 == null) {
                    f8 = f10;
                    z6 = z7;
                    i7 = 1;
                    break;
                }
                long j3 = aVar.f4087a;
                f8 = f10;
                int i10 = i8;
                long j7 = aVar3.f4087a;
                float f11 = j3 - j7;
                z6 = z7;
                i7 = 1;
                float fAbs = Math.abs(j7 - aVar2.f4087a);
                aVar2 = (cVar == c.f4092o || z6) ? aVar3 : aVar;
                if (f11 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i9] = aVar3.f4088b;
                fArr2[i9] = -f11;
                i8 = (i10 == 0 ? 20 : i10) - 1;
                i9++;
                if (i9 >= 20) {
                    break;
                }
                f10 = f8;
            }
            if (i9 >= this.f4097c) {
                int iOrdinal = cVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        N5.d.P(fArr2, fArr, i9, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f8;
                    }
                } else {
                    if (iOrdinal != i7) {
                        throw new W();
                    }
                    int i11 = i9 - i7;
                    float f12 = fArr2[i11];
                    int i12 = i11;
                    float fAbs2 = f8;
                    while (i12 > 0) {
                        int i13 = i12 - 1;
                        float f13 = fArr2[i13];
                        if (f12 != f13) {
                            float f14 = (z6 ? -fArr[i13] : fArr[i12] - fArr[i13]) / (f12 - f13);
                            fAbs2 += Math.abs(f14) * (f14 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i12 == i11) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i12--;
                        f12 = f13;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f10 = fSignum * 1000;
            } else {
                f10 = f8;
            }
        }
        if (f10 == f8 || Float.isNaN(f10)) {
            return f8;
        }
        if (f10 <= f8) {
            f9 = -f9;
            if (f10 >= f9) {
                return f10;
            }
        } else if (f10 <= f9) {
            f9 = f10;
        }
        return f9;
    }

    public d(boolean z6, c cVar) {
        int i7;
        this.f4095a = z6;
        this.f4096b = cVar;
        if (z6 && cVar.equals(c.f4092o)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            i7 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new W();
            }
            i7 = 2;
        }
        this.f4097c = i7;
        this.f4098d = new a[20];
        this.f4100f = new float[20];
        this.f4101g = new float[20];
        this.h = new float[3];
    }

    public d(int i7) {
        this(true, c.f4093p);
    }
}
