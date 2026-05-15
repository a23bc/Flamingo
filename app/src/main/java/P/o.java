package p;

import android.view.ActionProvider;
import k.I;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public I f14867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionProvider f14868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f14869c;

    public o(s sVar, ActionProvider actionProvider) {
        this.f14869c = sVar;
        this.f14868b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z6) {
        I i7 = this.f14867a;
        if (i7 != null) {
            l lVar = ((n) i7.f13847p).f14854n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
