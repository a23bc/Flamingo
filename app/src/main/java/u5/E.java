package U5;

import f0.C0888g0;
import j5.AbstractC1109c;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import u6.C1570m;
import x0.C1895e;
import y0.C1960J;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7099o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f7100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f7101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7103s;

    public /* synthetic */ E(float f7, p0.s sVar, u6.H h, float f8) {
        this.f7100p = f7;
        this.f7102r = sVar;
        this.f7103s = h;
        this.f7101q = f8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f7099o) {
            case 0:
                C1960J c1960j = (C1960J) obj;
                D4.i iVar = (D4.i) this.f7102r;
                C0888g0 c0888g0 = (C0888g0) this.f7103s;
                AbstractC1209k.f(c0888g0, "$parentHeight");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.e(1);
                c1960j.d(true);
                float fRound = 12 + ((int) Math.round(((double) (iVar.f1582p - 12)) * ((double) iVar.p())));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c1960j.f20187D >> 32));
                float fH = c0888g0.h();
                float f7 = this.f7100p;
                c1960j.m(AbstractC1109c.i(fRound, new C1895e((((long) Float.floatToRawIntBits((iVar.p() * (fH - f7)) + f7)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)), 2));
                c1960j.l(this.f7101q);
                c1960j.o(C1987t.b(C1987t.f20255b, 0.2f));
                return Y4.o.f8736a;
            default:
                int iIntValue = ((Integer) obj).intValue();
                p0.s sVar = (p0.s) this.f7102r;
                AbstractC1209k.f(sVar, "$itemHeights");
                u6.H h = (u6.H) this.f7103s;
                float fIntValue = this.f7100p;
                for (int i7 = 0; i7 < iIntValue; i7++) {
                    fIntValue += ((Integer) sVar.get(Integer.valueOf(i7))) != null ? r4.intValue() : 0.0f;
                    C1570m c1570m = (C1570m) Z4.n.s0(i7, h.f17399a);
                    if (c1570m != null && c1570m.f17748c) {
                        fIntValue += this.f7101q;
                    }
                }
                return Float.valueOf(fIntValue);
        }
    }

    public /* synthetic */ E(D4.i iVar, float f7, C0888g0 c0888g0, float f8) {
        this.f7102r = iVar;
        this.f7100p = f7;
        this.f7103s = c0888g0;
        this.f7101q = f8;
    }
}
