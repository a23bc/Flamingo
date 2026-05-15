package V4;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import k.AbstractC1113a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import r1.C1411e;
import y0.C1987t;

/* JADX INFO: renamed from: V4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0457d extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7482q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0457d(InterfaceC0878b0 interfaceC0878b0, int i7) {
        super(2);
        this.f7481p = i7;
        this.f7482q = interfaceC0878b0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7481p) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                ((Number) obj2).intValue();
                c0912t.Y(-164644467);
                long j3 = ((C1987t) ((l5.e) this.f7482q.getValue()).invoke(c0912t, 0)).f20264a;
                c0912t.p(false);
                return new C1987t(j3);
            default:
                C0912t c0912t2 = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0912t2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objK = c0912t2.K();
                    if (objK == C0903o.f11850a) {
                        objK = C1411e.f15673q;
                        c0912t2.i0(objK);
                    }
                    AbstractC1113a.q(new AppendedSemanticsElement((InterfaceC1182c) objK, false), (l5.e) this.f7482q.getValue(), c0912t2, 0);
                } else {
                    c0912t2.Q();
                }
                return Y4.o.f8736a;
        }
    }
}
