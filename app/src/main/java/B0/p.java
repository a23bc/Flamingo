package B0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class p extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f708a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f708a) {
            case 0:
                if (!(view instanceof q) || (outline2 = ((q) view).f714s) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            case 1:
                AbstractC1209k.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                A0.e.G(view);
                throw null;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
        }
    }
}
