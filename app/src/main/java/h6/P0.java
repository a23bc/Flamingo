package h6;

import d0.AbstractC0774A;
import f0.C0903o;
import f0.C0912t;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import r0.C1395m;
import r0.InterfaceC1398p;
import r5.C1420a;
import y0.C1987t;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class P0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12918o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f12919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f12920q;

    public P0(float f7, d0.B0 b0) {
        this.f12919p = f7;
        this.f12920q = b0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12918o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_shuffle, c0912t), null, androidx.compose.foundation.layout.c.g(C1395m.f15634a, this.f12919p), ((C1987t) v.o0.a(((Boolean) ((InterfaceC1180a) this.f12920q).a()).booleanValue() ? C1987t.f20255b : C1987t.f20259f, null, c0912t, 0, 14).getValue()).f20264a, c0912t, 48, 0);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    final long j3 = C1987t.f20259f;
                    final long jB = C1987t.b(j3, 0.5f);
                    InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f);
                    float f7 = this.f12919p;
                    InterfaceC1398p interfaceC1398pC = androidx.compose.foundation.layout.c.c(interfaceC1398pB, f7);
                    c0912t2.X(1359152733);
                    boolean zC = c0912t2.c(f7);
                    final d0.B0 b0 = (d0.B0) this.f12920q;
                    boolean zF = zC | c0912t2.f(b0);
                    Object objK = c0912t2.K();
                    if (zF || objK == C0903o.f11850a) {
                        final float f8 = this.f12919p;
                        InterfaceC1182c interfaceC1182c = new InterfaceC1182c() { // from class: h6.Q0
                            @Override // l5.InterfaceC1182c
                            public final Object b(Object obj3) {
                                A0.f fVar = (A0.f) obj3;
                                d0.B0 b02 = b0;
                                AbstractC1209k.f(fVar, "$this$Canvas");
                                boolean z6 = fVar.getLayoutDirection() == n1.n.f14522p;
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.R() & 4294967295L)))) & 4294967295L);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.f() >> 32));
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.R() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
                                long j7 = jFloatToRawIntBits;
                                long j8 = z6 ? jFloatToRawIntBits2 : j7;
                                if (!z6) {
                                    j7 = jFloatToRawIntBits2;
                                }
                                float fV = fVar.v(f8);
                                fVar.O(jB, j8, j7, fV, 1);
                                int i7 = (int) (j8 >> 32);
                                fVar.O(j3, j8, (((long) Float.floatToRawIntBits((((C1420a) b02.f10817a.getValue()).f15780b * (Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat(i7))) + Float.intBitsToFloat(i7))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.R() & 4294967295L)))) & 4294967295L), fV, 1);
                                return Y4.o.f8736a;
                            }
                        };
                        c0912t2.i0(interfaceC1182c);
                        objK = interfaceC1182c;
                    }
                    c0912t2.p(false);
                    AbstractC1110d.f(interfaceC1398pC, (InterfaceC1182c) objK, c0912t2, 0);
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public P0(InterfaceC1180a interfaceC1180a, float f7) {
        this.f12920q = interfaceC1180a;
        this.f12919p = f7;
    }
}
