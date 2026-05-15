package k;

import G1.AbstractC0158z;
import a.AbstractC0509a;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0509a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13844u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ K f13845v;

    public /* synthetic */ H(K k7, int i7) {
        this.f13844u = i7;
        this.f13845v = k7;
    }

    @Override // G1.O
    public final void a() {
        View view;
        K k7 = this.f13845v;
        switch (this.f13844u) {
            case 0:
                if (k7.f13867p && (view = k7.h) != null) {
                    view.setTranslationY(0.0f);
                    k7.f13858e.setTranslationY(0.0f);
                }
                k7.f13858e.setVisibility(8);
                k7.f13858e.setTransitioning(false);
                k7.f13871t = null;
                V1.a aVar = k7.l;
                if (aVar != null) {
                    aVar.I(k7.f13863k);
                    k7.f13863k = null;
                    k7.l = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k7.f13857d;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = G1.I.f2641a;
                    AbstractC0158z.c(actionBarOverlayLayout);
                }
                break;
            default:
                k7.f13871t = null;
                k7.f13858e.requestLayout();
                break;
        }
    }
}
