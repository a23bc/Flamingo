package R0;

import K0.C0236d;
import f0.C0879c;
import f0.C0912t;
import j5.AbstractC1107a;
import k.AbstractC1113a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import o0.C1247d;
import o0.C1249f;
import r0.InterfaceC1398p;
import y3.C2019h;

/* JADX INFO: loaded from: classes.dex */
public final class O extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f6363p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f6364q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Y4.c f6365r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f6366s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(C0415x c0415x, C0373b0 c0373b0, n0.d dVar) {
        super(2);
        this.f6363p = 0;
        this.f6366s = c0415x;
        this.f6364q = c0373b0;
        this.f6365r = dVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6363p) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0403q0.a((C0415x) this.f6366s, (C0373b0) this.f6364q, (n0.d) this.f6365r, c0912t, 0);
                } else {
                    c0912t.Q();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC0403q0.a((Q0.s0) this.f6366s, (C0373b0) this.f6364q, (n0.d) this.f6365r, (C0912t) obj, C0879c.B(1));
                break;
            case 2:
                ((Number) obj2).intValue();
                androidx.compose.ui.viewinterop.a.a((C1247d) this.f6366s, (InterfaceC1398p) this.f6364q, (InterfaceC1182c) this.f6365r, (C0912t) obj, C0879c.B(7));
                break;
            case 3:
                ((Number) obj2).intValue();
                int iB = C0879c.B(385);
                AbstractC1113a.g((C0236d) this.f6366s, (r1.u) this.f6364q, (n0.d) this.f6365r, (C0912t) obj, iB);
                break;
            default:
                ((Number) obj2).intValue();
                int iB2 = C0879c.B(457);
                AbstractC1107a.c((C2019h) this.f6366s, (C1249f) this.f6364q, (n0.d) this.f6365r, (C0912t) obj, iB2);
                break;
        }
        return Y4.o.f8736a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(Object obj, Object obj2, Y4.c cVar, int i7, int i8) {
        super(2);
        this.f6363p = i8;
        this.f6366s = obj;
        this.f6364q = obj2;
        this.f6365r = cVar;
    }
}
