package q;

import p.InterfaceC1269B;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractViewOnTouchListenerC1339t0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ M f15167x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ P f15168y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(P p7, P p8, M m7) {
        super(p8);
        this.f15168y = p7;
        this.f15167x = m7;
    }

    @Override // q.AbstractViewOnTouchListenerC1339t0
    public final InterfaceC1269B b() {
        return this.f15167x;
    }

    @Override // q.AbstractViewOnTouchListenerC1339t0
    public final boolean c() {
        P p7 = this.f15168y;
        if (p7.getInternalPopup().a()) {
            return true;
        }
        p7.f15213t.l(p7.getTextDirection(), p7.getTextAlignment());
        return true;
    }
}
