package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: p.D */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC1271D extends l implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final n f14752A;

    /* JADX INFO: renamed from: z */
    public final l f14753z;

    public SubMenuC1271D(Context context, l lVar, n nVar) {
        super(context);
        this.f14753z = lVar;
        this.f14752A = nVar;
    }

    @Override // p.l
    public final boolean d(n nVar) {
        return this.f14753z.d(nVar);
    }

    @Override // p.l
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.f14753z.e(lVar, menuItem);
    }

    @Override // p.l
    public final boolean f(n nVar) {
        return this.f14753z.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f14752A;
    }

    @Override // p.l
    public final String j() {
        n nVar = this.f14752A;
        int i7 = nVar != null ? nVar.f14843a : 0;
        if (i7 == 0) {
            return null;
        }
        return n1.c.s(i7, "android:menu:actionviewstates:");
    }

    @Override // p.l
    public final l k() {
        return this.f14753z.k();
    }

    @Override // p.l
    public final boolean m() {
        return this.f14753z.m();
    }

    @Override // p.l
    public final boolean n() {
        return this.f14753z.n();
    }

    @Override // p.l
    public final boolean o() {
        return this.f14753z.o();
    }

    @Override // p.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z6) {
        this.f14753z.setGroupDividerEnabled(z6);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f14752A.setIcon(drawable);
        return this;
    }

    @Override // p.l, android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f14753z.setQwertyMode(z6);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i7) {
        u(0, null, i7, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i7) {
        u(i7, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i7) {
        this.f14752A.setIcon(i7);
        return this;
    }
}
