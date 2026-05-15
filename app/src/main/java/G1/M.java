package G1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.PendingIntent;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2651b;

    public /* synthetic */ M(int i7, Object obj) {
        this.f2650a = i7;
        this.f2651b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2650a) {
            case 0:
                ((O) this.f2651b).b();
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2651b;
                actionBarOverlayLayout.f9013K = null;
                actionBarOverlayLayout.f9028x = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws PendingIntent.CanceledException {
        switch (this.f2650a) {
            case 0:
                ((O) this.f2651b).a();
                break;
            case 1:
                AbstractC1209k.f(animator, "animation");
                E3.e eVar = (E3.e) this.f2651b;
                if (eVar != null) {
                    eVar.a();
                }
                break;
            case 2:
                AbstractC1209k.f(animator, "animation");
                E3.e eVar2 = (E3.e) this.f2651b;
                if (eVar2 != null) {
                    eVar2.a();
                }
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2651b;
                actionBarOverlayLayout.f9013K = null;
                actionBarOverlayLayout.f9028x = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2650a) {
            case 0:
                ((O) this.f2651b).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public M(O o7, View view) {
        this.f2650a = 0;
        this.f2651b = o7;
    }
}
