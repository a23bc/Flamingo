package p;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import q.AbstractViewOnTouchListenerC1339t0;
import q.C1313g;
import q.C1315h;
import q.C1319j;
import q.C1321k;

/* JADX INFO: renamed from: p.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1273b extends AbstractViewOnTouchListenerC1339t0 {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f14768x = 0;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ View f14769y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1273b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f14769y = actionMenuItemView;
    }

    @Override // q.AbstractViewOnTouchListenerC1339t0
    public final InterfaceC1269B b() {
        C1313g c1313g;
        switch (this.f14768x) {
            case 0:
                AbstractC1274c abstractC1274c = ((ActionMenuItemView) this.f14769y).f8941A;
                if (abstractC1274c == null || (c1313g = ((C1315h) abstractC1274c).f15316a.f15330H) == null) {
                    return null;
                }
                return c1313g.a();
            default:
                C1313g c1313g2 = ((C1319j) this.f14769y).f15319r.f15329G;
                if (c1313g2 == null) {
                    return null;
                }
                return c1313g2.a();
        }
    }

    @Override // q.AbstractViewOnTouchListenerC1339t0
    public final boolean c() {
        InterfaceC1269B interfaceC1269BB;
        switch (this.f14768x) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f14769y;
                k kVar = actionMenuItemView.f8950y;
                return kVar != null && kVar.b(actionMenuItemView.f8947v) && (interfaceC1269BB = b()) != null && interfaceC1269BB.a();
            default:
                ((C1319j) this.f14769y).f15319r.l();
                return true;
        }
    }

    @Override // q.AbstractViewOnTouchListenerC1339t0
    public boolean d() {
        switch (this.f14768x) {
            case 1:
                C1321k c1321k = ((C1319j) this.f14769y).f15319r;
                if (c1321k.f15331I != null) {
                    return false;
                }
                c1321k.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1273b(C1319j c1319j, C1319j c1319j2) {
        super(c1319j2);
        this.f14769y = c1319j;
    }
}
