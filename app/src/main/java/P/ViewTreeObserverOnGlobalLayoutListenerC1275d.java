package p;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import q.I0;
import q.M;
import q.P;

/* JADX INFO: renamed from: p.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1275d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14770o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f14771p;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1275d(int i7, Object obj) {
        this.f14770o = i7;
        this.f14771p = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f14770o) {
            case 0:
                ViewOnKeyListenerC1277f viewOnKeyListenerC1277f = (ViewOnKeyListenerC1277f) this.f14771p;
                if (viewOnKeyListenerC1277f.a()) {
                    ArrayList arrayList = viewOnKeyListenerC1277f.f14795v;
                    if (arrayList.size() > 0 && !((C1276e) arrayList.get(0)).f14772a.f15147L) {
                        View view = viewOnKeyListenerC1277f.f14777C;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C1276e) it.next()).f14772a.c();
                            }
                        } else {
                            viewOnKeyListenerC1277f.dismiss();
                        }
                        break;
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC1270C viewOnKeyListenerC1270C = (ViewOnKeyListenerC1270C) this.f14771p;
                if (viewOnKeyListenerC1270C.a()) {
                    I0 i02 = viewOnKeyListenerC1270C.f14747v;
                    if (!i02.f15147L) {
                        View view2 = viewOnKeyListenerC1270C.f14733A;
                        if (view2 != null && view2.isShown()) {
                            i02.c();
                        } else {
                            viewOnKeyListenerC1270C.dismiss();
                        }
                    }
                }
                break;
            case 2:
                P p7 = (P) this.f14771p;
                if (!p7.getInternalPopup().a()) {
                    p7.f15213t.l(p7.getTextDirection(), p7.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = p7.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                M m7 = (M) this.f14771p;
                P p8 = m7.f15198U;
                m7.getClass();
                if (p8.isAttachedToWindow() && p8.getGlobalVisibleRect(m7.f15196S)) {
                    m7.r();
                    m7.c();
                } else {
                    m7.dismiss();
                }
                break;
        }
    }
}
