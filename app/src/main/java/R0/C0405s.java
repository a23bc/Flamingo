package R0;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import w0.C1696d;
import w5.InterfaceC1765B;
import x0.C1893c;
import y0.AbstractC1959I;

/* JADX INFO: renamed from: R0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0405s extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f6526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0415x f6527q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0405s(C0415x c0415x, int i7) {
        super(1);
        this.f6526p = i7;
        this.f6527q = c0415x;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        C1696d c1696d;
        switch (this.f6526p) {
            case 0:
                KeyEvent keyEvent = ((I0.b) obj).f3439a;
                long jA = I0.c.A(keyEvent);
                if (I0.a.a(jA, I0.a.f3426b)) {
                    c1696d = new C1696d(2);
                } else if (I0.a.a(jA, I0.a.f3427c)) {
                    c1696d = new C1696d(1);
                } else if (I0.a.a(jA, I0.a.f3432i)) {
                    c1696d = new C1696d(keyEvent.isShiftPressed() ? 2 : 1);
                } else {
                    c1696d = I0.a.a(jA, I0.a.f3431g) ? new C1696d(4) : I0.a.a(jA, I0.a.f3430f) ? new C1696d(3) : (I0.a.a(jA, I0.a.f3428d) || I0.a.a(jA, I0.a.f3435m)) ? new C1696d(5) : (I0.a.a(jA, I0.a.f3429e) || I0.a.a(jA, I0.a.f3436n)) ? new C1696d(6) : (I0.a.a(jA, I0.a.h) || I0.a.a(jA, I0.a.f3434k) || I0.a.a(jA, I0.a.f3437o)) ? new C1696d(7) : (I0.a.a(jA, I0.a.f3425a) || I0.a.a(jA, I0.a.l)) ? new C1696d(8) : null;
                }
                if (c1696d == null || I0.c.B(keyEvent) != 2) {
                    return Boolean.FALSE;
                }
                int i7 = c1696d.f18776a;
                Integer numC = w0.f.C(i7);
                C0415x c0415x = this.f6527q;
                C1893c embeddedViewFocusRect = c0415x.getEmbeddedViewFocusRect();
                Boolean boolE = ((w0.k) c0415x.getFocusOwner()).e(i7, embeddedViewFocusRect, new r(c1696d, 1));
                if (boolE != null ? boolE.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!(i7 == 1 || i7 == 2)) {
                    return Boolean.FALSE;
                }
                if (numC != null) {
                    int iIntValue = numC.intValue();
                    Object obj2 = C0414w0.f6549f.get();
                    AbstractC1209k.c(obj2);
                    C0414w0 c0414w0 = (C0414w0) obj2;
                    View viewB = c0415x;
                    while (true) {
                        if (viewB != null) {
                            View rootView = c0415x.getRootView();
                            AbstractC1209k.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                            viewB = c0414w0.b(iIntValue, viewB, (ViewGroup) rootView);
                            if (viewB != null) {
                                if (!viewB.equals(c0415x)) {
                                    for (ViewParent parent = viewB.getParent(); parent != null; parent = parent.getParent()) {
                                        if (parent == c0415x) {
                                        }
                                        break;
                                    }
                                }
                            }
                        } else {
                            viewB = null;
                        }
                    }
                    if (AbstractC1209k.a(viewB, c0415x)) {
                        viewB = null;
                    }
                    if (viewB != null) {
                        Rect rectU = embeddedViewFocusRect != null ? AbstractC1959I.u(embeddedViewFocusRect) : null;
                        if (rectU == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        View rootView2 = c0415x.getRootView();
                        AbstractC1209k.d(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) rootView2;
                        viewGroup.offsetDescendantRectToMyCoords(c0415x, rectU);
                        viewGroup.offsetRectIntoDescendantCoords(viewB, rectU);
                        if (w0.f.y(viewB, numC, rectU)) {
                            return Boolean.TRUE;
                        }
                    }
                }
                if (!((w0.k) c0415x.getFocusOwner()).b(i7, false, false)) {
                    return Boolean.TRUE;
                }
                Boolean boolE2 = ((w0.k) c0415x.getFocusOwner()).e(i7, null, new r(c1696d, 0));
                return Boolean.valueOf(boolE2 != null ? boolE2.booleanValue() : true);
            case 1:
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) obj;
                C0415x c0415x2 = this.f6527q;
                Handler handler = c0415x2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1180a.a();
                } else {
                    Handler handler2 = c0415x2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new R.c(interfaceC1180a, 1));
                    }
                }
                return Y4.o.f8736a;
            default:
                C0415x c0415x3 = this.f6527q;
                return new U(c0415x3, c0415x3.getTextInputService(), (InterfaceC1765B) obj);
        }
    }
}
