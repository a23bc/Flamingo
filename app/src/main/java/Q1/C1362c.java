package q1;

import G1.I;
import G1.m0;
import O0.C;
import Q0.K;
import Q0.s0;
import R0.C0400p;
import R0.C0415x;
import android.view.WindowInsets;
import java.util.HashMap;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: q1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1362c extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15454p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q f15455q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ K f15456r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1362c(q qVar, K k7, int i7) {
        super(1);
        this.f15454p = i7;
        this.f15455q = qVar;
        this.f15456r = k7;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        WindowInsets windowInsetsB;
        switch (this.f15454p) {
            case 0:
                s0 s0Var = (s0) obj;
                C0415x c0415x = s0Var instanceof C0415x ? (C0415x) s0Var : null;
                q qVar = this.f15455q;
                if (c0415x != null) {
                    HashMap<AbstractC1368i, K> holderToLayoutNode = c0415x.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    K k7 = this.f15456r;
                    holderToLayoutNode.put(qVar, k7);
                    c0415x.getAndroidViewsHandler$ui_release().addView(qVar);
                    c0415x.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(k7, qVar);
                    qVar.setImportantForAccessibility(1);
                    I.h(qVar, new C0400p(c0415x, k7, c0415x));
                }
                if (qVar.getView().getParent() != qVar) {
                    qVar.addView(qVar.getView());
                }
                break;
            case 1:
                k.d(this.f15455q, this.f15456r);
                break;
            default:
                q qVar2 = this.f15455q;
                k.d(qVar2, this.f15456r);
                ((C0415x) qVar2.f15488q).f6589O = true;
                int[] iArr = qVar2.f15474B;
                int i7 = iArr[0];
                int i8 = iArr[1];
                qVar2.getView().getLocationOnScreen(iArr);
                long j3 = qVar2.f15475C;
                long jG = ((C) obj).G();
                qVar2.f15475C = jG;
                m0 m0Var = qVar2.f15476D;
                if (m0Var != null && ((i7 != iArr[0] || i8 != iArr[1] || !n1.m.b(j3, jG)) && (windowInsetsB = qVar2.n(m0Var).b()) != null)) {
                    qVar2.getView().dispatchApplyWindowInsets(windowInsetsB);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
