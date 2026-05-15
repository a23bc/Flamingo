package q;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p.C1272a;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements View.OnClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1272a f15261o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b1 f15262p;

    public a1(b1 b1Var) {
        this.f15262p = b1Var;
        Context context = b1Var.f15264a.getContext();
        CharSequence charSequence = b1Var.h;
        C1272a c1272a = new C1272a();
        c1272a.f14758e = 4096;
        c1272a.f14760g = 4096;
        c1272a.l = null;
        c1272a.f14764m = null;
        c1272a.f14765n = false;
        c1272a.f14766o = false;
        c1272a.f14767p = 16;
        c1272a.f14761i = context;
        c1272a.f14754a = charSequence;
        this.f15261o = c1272a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b1 b1Var = this.f15262p;
        Window.Callback callback = b1Var.f15273k;
        if (callback == null || !b1Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f15261o);
    }
}
