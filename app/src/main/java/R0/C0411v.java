package R0;

import android.os.SystemClock;
import android.view.MotionEvent;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: R0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0411v extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f6539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0415x f6540q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0411v(C0415x c0415x, int i7) {
        super(0);
        this.f6539p = i7;
        this.f6540q = c0415x;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        int actionMasked;
        switch (this.f6539p) {
            case 0:
                C0415x c0415x = this.f6540q;
                MotionEvent motionEvent = c0415x.f6574G0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    c0415x.f6576H0 = SystemClock.uptimeMillis();
                    c0415x.post(c0415x.f6586M0);
                }
                return Y4.o.f8736a;
            default:
                return this.f6540q.get_viewTreeOwners();
        }
    }
}
