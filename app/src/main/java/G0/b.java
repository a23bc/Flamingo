package G0;

import R0.C0415x;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f2633b;

    public /* synthetic */ b(View view, int i7) {
        this.f2632a = i7;
        this.f2633b = view;
    }

    @Override // G0.a
    public final void a(int i7) {
        switch (this.f2632a) {
            case 0:
                C0415x c0415x = (C0415x) this.f2633b;
                if (i7 == 16) {
                    c0415x.performHapticFeedback(16);
                } else if (i7 == 6) {
                    c0415x.performHapticFeedback(6);
                } else if (i7 == 13) {
                    c0415x.performHapticFeedback(13);
                } else if (i7 == 23) {
                    c0415x.performHapticFeedback(23);
                } else if (i7 == 3) {
                    c0415x.performHapticFeedback(3);
                } else if (i7 == 0) {
                    c0415x.performHapticFeedback(0);
                } else if (i7 == 17) {
                    c0415x.performHapticFeedback(17);
                } else if (i7 == 27) {
                    c0415x.performHapticFeedback(27);
                } else if (i7 == 26) {
                    c0415x.performHapticFeedback(26);
                } else if (i7 == 9) {
                    c0415x.performHapticFeedback(9);
                } else if (i7 == 22) {
                    c0415x.performHapticFeedback(22);
                } else if (i7 == 21) {
                    c0415x.performHapticFeedback(21);
                } else if (i7 == 1) {
                    c0415x.performHapticFeedback(1);
                }
                break;
            default:
                View view = this.f2633b;
                if (i7 == 16) {
                    view.performHapticFeedback(16);
                } else if (i7 == 6) {
                    view.performHapticFeedback(6);
                } else if (i7 == 13) {
                    view.performHapticFeedback(13);
                } else if (i7 == 23) {
                    view.performHapticFeedback(23);
                } else if (i7 == 3) {
                    view.performHapticFeedback(3);
                } else if (i7 == 0) {
                    view.performHapticFeedback(0);
                } else if (i7 == 17) {
                    view.performHapticFeedback(17);
                } else if (i7 == 27) {
                    view.performHapticFeedback(27);
                } else if (i7 == 26) {
                    view.performHapticFeedback(26);
                } else if (i7 == 9) {
                    view.performHapticFeedback(9);
                } else if (i7 == 22) {
                    view.performHapticFeedback(22);
                } else if (i7 == 21) {
                    view.performHapticFeedback(21);
                } else if (i7 == 1) {
                    view.performHapticFeedback(1);
                }
                break;
        }
    }
}
