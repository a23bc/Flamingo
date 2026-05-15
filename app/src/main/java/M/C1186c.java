package m;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import j0.k;

/* JADX INFO: renamed from: m.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1186c extends k {

    /* JADX INFO: renamed from: a */
    public final ObjectAnimator f14299a;

    /* JADX INFO: renamed from: b */
    public final boolean f14300b;

    public C1186c(AnimationDrawable animationDrawable, boolean z6, boolean z7) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i7 = z6 ? numberOfFrames - 1 : 0;
        int i8 = z6 ? 0 : numberOfFrames - 1;
        C1187d c1187d = new C1187d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        c1187d.f14302b = numberOfFrames2;
        int[] iArr = c1187d.f14301a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            c1187d.f14301a = new int[numberOfFrames2];
        }
        int[] iArr2 = c1187d.f14301a;
        int i9 = 0;
        for (int i10 = 0; i10 < numberOfFrames2; i10++) {
            int duration = animationDrawable.getDuration(z6 ? (numberOfFrames2 - i10) - 1 : i10);
            iArr2[i10] = duration;
            i9 += duration;
        }
        c1187d.f14303c = i9;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i7, i8);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c1187d.f14303c);
        objectAnimatorOfInt.setInterpolator(c1187d);
        this.f14300b = z7;
        this.f14299a = objectAnimatorOfInt;
    }

    @Override // j0.k
    public final void B() {
        this.f14299a.reverse();
    }

    @Override // j0.k
    public final void D() {
        this.f14299a.start();
    }

    @Override // j0.k
    public final void E() {
        this.f14299a.cancel();
    }

    @Override // j0.k
    public final boolean o() {
        return this.f14300b;
    }
}
