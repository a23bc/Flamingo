package R0;

import K0.C0233a;
import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f6319a = new K();

    public final void a(View view, K0.r rVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = rVar instanceof C0233a ? PointerIcon.getSystemIcon(context, ((C0233a) rVar).f3860b) : PointerIcon.getSystemIcon(context, 1000);
        if (AbstractC1209k.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
