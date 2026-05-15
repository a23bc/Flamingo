package p;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class q implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f14871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f14872b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14872b = sVar;
        this.f14871a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f14871a.onMenuItemActionCollapse(this.f14872b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f14871a.onMenuItemActionExpand(this.f14872b.g(menuItem));
    }
}
