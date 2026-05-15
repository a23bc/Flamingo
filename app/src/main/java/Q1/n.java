package q1;

import Q0.AbstractC0347f;
import R0.C0415x;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import w0.C1693a;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f15513p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ o f15514q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i7) {
        super(1);
        this.f15513p = i7;
        this.f15514q = oVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f15513p) {
            case 0:
                C1693a c1693a = (C1693a) obj;
                o oVar = this.f15514q;
                View viewC = k.c(oVar);
                if (!viewC.isFocused() && !viewC.hasFocus()) {
                    if (!w0.f.y(viewC, w0.f.C(c1693a.f18768a), k.b(((C0415x) AbstractC0347f.y(oVar)).getFocusOwner(), AbstractC0347f.z(oVar), viewC))) {
                        c1693a.f18769b = true;
                    }
                }
                return Y4.o.f8736a;
            default:
                C1693a c1693a2 = (C1693a) obj;
                o oVar2 = this.f15514q;
                View viewC2 = k.c(oVar2);
                if (viewC2.hasFocus()) {
                    w0.i focusOwner = ((C0415x) AbstractC0347f.y(oVar2)).getFocusOwner();
                    View viewZ = AbstractC0347f.z(oVar2);
                    if (viewC2 instanceof ViewGroup) {
                        Rect rectB = k.b(focusOwner, viewZ, viewC2);
                        Integer numC = w0.f.C(c1693a2.f18768a);
                        int iIntValue = numC != null ? numC.intValue() : 130;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = oVar2.f15515C;
                        View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewZ, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewZ, rectB, iIntValue);
                        if (viewFindNextFocus != null && k.a(viewC2, viewFindNextFocus)) {
                            viewFindNextFocus.requestFocus(iIntValue, rectB);
                            c1693a2.f18769b = true;
                        } else if (!viewZ.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    } else if (!viewZ.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                }
                return Y4.o.f8736a;
        }
    }
}
