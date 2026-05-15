package q;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class U0 implements InterfaceC1327n, p.j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Toolbar f15230o;

    public /* synthetic */ U0(Toolbar toolbar) {
        this.f15230o = toolbar;
    }

    @Override // p.j
    public void r(p.l lVar) {
        Toolbar toolbar = this.f15230o;
        C1321k c1321k = toolbar.f9086o.f9035H;
        if (c1321k == null || !c1321k.e()) {
            toolbar.f9077U.f0();
        }
    }

    @Override // p.j
    public boolean x(p.l lVar, MenuItem menuItem) {
        this.f15230o.getClass();
        return false;
    }
}
