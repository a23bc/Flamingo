package k;

import G1.AbstractC0158z;
import a.AbstractC0509a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0509a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13939u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f13940v;

    public /* synthetic */ r(int i7, Object obj) {
        this.f13939u = i7;
        this.f13940v = obj;
    }

    @Override // G1.O
    public final void a() {
        Object obj = this.f13940v;
        switch (this.f13939u) {
            case 0:
                LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = ((p) obj).f13936p;
                layoutInflaterFactory2C1111A.f13788J.setAlpha(1.0f);
                layoutInflaterFactory2C1111A.f13791M.d(null);
                layoutInflaterFactory2C1111A.f13791M = null;
                break;
            case 1:
                LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A2 = (LayoutInflaterFactory2C1111A) obj;
                layoutInflaterFactory2C1111A2.f13788J.setAlpha(1.0f);
                layoutInflaterFactory2C1111A2.f13791M.d(null);
                layoutInflaterFactory2C1111A2.f13791M = null;
                break;
            default:
                V1.a aVar = (V1.a) obj;
                ((LayoutInflaterFactory2C1111A) aVar.f7390p).f13788J.setVisibility(8);
                LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A3 = (LayoutInflaterFactory2C1111A) aVar.f7390p;
                PopupWindow popupWindow = layoutInflaterFactory2C1111A3.f13789K;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C1111A3.f13788J.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1111A3.f13788J.getParent();
                    WeakHashMap weakHashMap = G1.I.f2641a;
                    AbstractC0158z.c(view);
                }
                layoutInflaterFactory2C1111A3.f13788J.e();
                layoutInflaterFactory2C1111A3.f13791M.d(null);
                layoutInflaterFactory2C1111A3.f13791M = null;
                ViewGroup viewGroup = layoutInflaterFactory2C1111A3.f13794P;
                WeakHashMap weakHashMap2 = G1.I.f2641a;
                AbstractC0158z.c(viewGroup);
                break;
        }
    }

    @Override // a.AbstractC0509a, G1.O
    public void c() {
        Object obj = this.f13940v;
        switch (this.f13939u) {
            case 0:
                ((p) obj).f13936p.f13788J.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) obj;
                layoutInflaterFactory2C1111A.f13788J.setVisibility(0);
                if (layoutInflaterFactory2C1111A.f13788J.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1111A.f13788J.getParent();
                    WeakHashMap weakHashMap = G1.I.f2641a;
                    AbstractC0158z.c(view);
                }
                break;
        }
    }
}
