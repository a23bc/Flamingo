package K0;

import Q0.s0;
import R0.C0415x;
import android.view.MotionEvent;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import m5.AbstractC1223y;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f3824p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q1.q f3825q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(q1.q qVar, int i7) {
        super(1);
        this.f3824p = i7;
        this.f3825q = qVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f3824p) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                q1.q qVar = this.f3825q;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = qVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = qVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            default:
                s0 s0Var = (s0) obj;
                C0415x c0415x = s0Var instanceof C0415x ? (C0415x) s0Var : null;
                q1.q qVar2 = this.f3825q;
                if (c0415x != null) {
                    c0415x.getAndroidViewsHandler$ui_release().removeViewInLayout(qVar2);
                    AbstractC1223y.b(c0415x.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(c0415x.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(qVar2));
                    qVar2.setImportantForAccessibility(0);
                }
                qVar2.removeAllViewsInLayout();
                return Y4.o.f8736a;
        }
    }
}
