package I0;

import android.view.KeyEvent;
import l5.InterfaceC1182c;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC1397o implements d {

    /* JADX INFO: renamed from: C */
    public InterfaceC1182c f3442C;

    /* JADX INFO: renamed from: D */
    public InterfaceC1182c f3443D;

    @Override // I0.d
    public final boolean N(KeyEvent keyEvent) {
        InterfaceC1182c interfaceC1182c = this.f3442C;
        if (interfaceC1182c != null) {
            return ((Boolean) interfaceC1182c.b(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // I0.d
    public final boolean l(KeyEvent keyEvent) {
        InterfaceC1182c interfaceC1182c = this.f3443D;
        if (interfaceC1182c != null) {
            return ((Boolean) interfaceC1182c.b(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
