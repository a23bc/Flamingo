package R0;

import K0.C0236d;
import android.view.accessibility.AccessibilityEvent;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f6267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ F f6268q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(F f7, int i7) {
        super(1);
        this.f6267p = i7;
        this.f6268q = f7;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f6267p) {
            case 0:
                F f7 = this.f6268q;
                return Boolean.valueOf(f7.f6287d.getParent().requestSendAccessibilityEvent(f7.f6287d, (AccessibilityEvent) obj));
            default:
                M0 m02 = (M0) obj;
                F f8 = this.f6268q;
                f8.getClass();
                if (m02.f6326p.contains(m02)) {
                    f8.f6287d.getSnapshotObserver().a(m02, f8.f6286P, new C0236d(m02, 5, f8));
                }
                return Y4.o.f8736a;
        }
    }
}
