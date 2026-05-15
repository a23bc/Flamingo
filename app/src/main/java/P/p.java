package p;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class p extends FrameLayout implements o.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CollapsibleActionView f14870o;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.f14870o = (CollapsibleActionView) view;
        addView(view);
    }
}
