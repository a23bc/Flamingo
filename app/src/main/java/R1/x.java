package r1;

import android.content.Context;
import d2.C0821i;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import t.J;
import v.a0;
import v.k0;
import w.AbstractC1671d;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.M;
import y4.C2022a;
import z4.C2091j;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f15733p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f15734q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i7, Object obj) {
        super(0);
        this.f15733p = i7;
        this.f15734q = obj;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f15733p) {
            case 0:
                z zVar = (z) this.f15734q;
                O0.C parentLayoutCoordinates = zVar.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.y()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || zVar.m6getPopupContentSizebOM6tXw() == null) ? false : true);
            case 1:
                return this.f15734q;
            case 2:
                ((a0) this.f15734q).d();
                return Y4.o.f8736a;
            case 3:
                J j3 = ((k0) this.f15734q).f18119w;
                Object[] objArr = j3.f16004b;
                Object[] objArr2 = j3.f16005c;
                long[] jArr = j3.f16003a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j7 = jArr[i7];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            int i9 = 0;
                            while (true) {
                                if (i9 < i8) {
                                    if ((255 & j7) < 128) {
                                        int i10 = (i7 << 3) + i9;
                                        Object obj = objArr[i10];
                                        if (!((a0) objArr2[i10]).e()) {
                                        }
                                    }
                                    j7 >>= 8;
                                    i9++;
                                } else if (i8 == 8) {
                                }
                            }
                        } else if (i7 != length) {
                            i7++;
                        }
                    }
                }
                return Y4.o.f8736a;
            case 4:
                return Float.valueOf(AbstractC1671d.j(((InterfaceC1765B) this.f15734q).g()));
            case 5:
                ((w0.u) this.f15734q).C0();
                return Y4.o.f8736a;
            case 6:
                ((w4.d) this.f15734q).getClass();
                return AbstractC1767D.a(M.f19498b);
            case 7:
                ((w4.f) this.f15734q).getClass();
                return AbstractC1767D.a(M.f19498b);
            case 8:
                y3.x xVar = (y3.x) this.f15734q;
                xVar.getClass();
                AbstractC1209k.f(xVar.f20491a, "context");
                AbstractC1209k.f(xVar.f20511w, "navigatorProvider");
                return new y3.y();
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                return new L3.b(2, (C2022a) this.f15734q);
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return AbstractC1110d.o((Context) this.f15734q);
            default:
                return Boolean.valueOf(((Number) ((C2091j) this.f15734q).f21220o.getValue()).intValue() > 0);
        }
    }
}
