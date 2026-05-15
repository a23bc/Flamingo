package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import k.I;

/* JADX INFO: loaded from: classes.dex */
public final class n implements A1.a {

    /* JADX INFO: renamed from: A */
    public o f14840A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f14841B;

    /* JADX INFO: renamed from: a */
    public final int f14843a;

    /* JADX INFO: renamed from: b */
    public final int f14844b;

    /* JADX INFO: renamed from: c */
    public final int f14845c;

    /* JADX INFO: renamed from: d */
    public final int f14846d;

    /* JADX INFO: renamed from: e */
    public CharSequence f14847e;

    /* JADX INFO: renamed from: f */
    public CharSequence f14848f;

    /* JADX INFO: renamed from: g */
    public Intent f14849g;
    public char h;

    /* JADX INFO: renamed from: j */
    public char f14851j;
    public Drawable l;

    /* JADX INFO: renamed from: n */
    public final l f14854n;

    /* JADX INFO: renamed from: o */
    public SubMenuC1271D f14855o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f14856p;

    /* JADX INFO: renamed from: q */
    public CharSequence f14857q;

    /* JADX INFO: renamed from: r */
    public CharSequence f14858r;

    /* JADX INFO: renamed from: y */
    public int f14865y;

    /* JADX INFO: renamed from: z */
    public View f14866z;

    /* JADX INFO: renamed from: i */
    public int f14850i = 4096;

    /* JADX INFO: renamed from: k */
    public int f14852k = 4096;

    /* JADX INFO: renamed from: m */
    public int f14853m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f14859s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f14860t = null;

    /* JADX INFO: renamed from: u */
    public boolean f14861u = false;

    /* JADX INFO: renamed from: v */
    public boolean f14862v = false;

    /* JADX INFO: renamed from: w */
    public boolean f14863w = false;

    /* JADX INFO: renamed from: x */
    public int f14864x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f14842C = false;

    public n(l lVar, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        this.f14854n = lVar;
        this.f14843a = i8;
        this.f14844b = i7;
        this.f14845c = i9;
        this.f14846d = i10;
        this.f14847e = charSequence;
        this.f14865y = i11;
    }

    public static void c(StringBuilder sb, int i7, int i8, String str) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    @Override // A1.a
    public final A1.a a(o oVar) {
        this.f14866z = null;
        this.f14840A = oVar;
        this.f14854n.p(true);
        o oVar2 = this.f14840A;
        if (oVar2 != null) {
            oVar2.f14867a = new I(5, this);
            oVar2.f14868b.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // A1.a
    public final o b() {
        return this.f14840A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f14865y & 8) == 0) {
            return false;
        }
        if (this.f14866z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f14841B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f14854n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f14863w && (this.f14861u || this.f14862v)) {
            drawable = drawable.mutate();
            if (this.f14861u) {
                drawable.setTintList(this.f14859s);
            }
            if (this.f14862v) {
                drawable.setTintMode(this.f14860t);
            }
            this.f14863w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f14865y & 8) != 0) {
            if (this.f14866z == null && (oVar = this.f14840A) != null) {
                this.f14866z = oVar.f14868b.onCreateActionView(this);
            }
            if (this.f14866z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f14841B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f14854n.f(this);
        }
        return false;
    }

    public final void f(boolean z6) {
        if (z6) {
            this.f14864x |= 32;
        } else {
            this.f14864x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f14866z;
        if (view != null) {
            return view;
        }
        o oVar = this.f14840A;
        if (oVar == null) {
            return null;
        }
        View viewOnCreateActionView = oVar.f14868b.onCreateActionView(this);
        this.f14866z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // A1.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f14852k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f14851j;
    }

    @Override // A1.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f14857q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f14844b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        int i7 = this.f14853m;
        if (i7 == 0) {
            return null;
        }
        Drawable drawableV = i6.g.v(this.f14854n.f14815a, i7);
        this.f14853m = 0;
        this.l = drawableV;
        return d(drawableV);
    }

    @Override // A1.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f14859s;
    }

    @Override // A1.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f14860t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f14849g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f14843a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // A1.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f14850i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f14845c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f14855o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f14847e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f14848f;
        return charSequence != null ? charSequence : this.f14847e;
    }

    @Override // A1.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f14858r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f14855o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f14842C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f14864x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f14864x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f14864x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.f14840A;
        return (oVar == null || !oVar.f14868b.overridesItemVisibility()) ? (this.f14864x & 8) == 0 : (this.f14864x & 8) == 0 && this.f14840A.f14868b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i7;
        this.f14866z = view;
        this.f14840A = null;
        if (view != null && view.getId() == -1 && (i7 = this.f14843a) > 0) {
            view.setId(i7);
        }
        l lVar = this.f14854n;
        lVar.f14824k = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7) {
        if (this.f14851j == c7) {
            return this;
        }
        this.f14851j = Character.toLowerCase(c7);
        this.f14854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        int i7 = this.f14864x;
        int i8 = (z6 ? 1 : 0) | (i7 & (-2));
        this.f14864x = i8;
        if (i7 != i8) {
            this.f14854n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        int i7 = this.f14864x;
        if ((i7 & 4) == 0) {
            int i8 = (i7 & (-3)) | (z6 ? 2 : 0);
            this.f14864x = i8;
            if (i7 != i8) {
                this.f14854n.p(false);
            }
            return this;
        }
        l lVar = this.f14854n;
        lVar.getClass();
        ArrayList arrayList = lVar.f14820f;
        int size = arrayList.size();
        lVar.w();
        for (int i9 = 0; i9 < size; i9++) {
            n nVar = (n) arrayList.get(i9);
            if (nVar.f14844b == this.f14844b && (nVar.f14864x & 4) != 0 && nVar.isCheckable()) {
                boolean z7 = nVar == this;
                int i10 = nVar.f14864x;
                int i11 = (z7 ? 2 : 0) | (i10 & (-3));
                nVar.f14864x = i11;
                if (i10 != i11) {
                    nVar.f14854n.p(false);
                }
            }
        }
        lVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        if (z6) {
            this.f14864x |= 16;
        } else {
            this.f14864x &= -17;
        }
        this.f14854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f14853m = 0;
        this.l = drawable;
        this.f14863w = true;
        this.f14854n.p(false);
        return this;
    }

    @Override // A1.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f14859s = colorStateList;
        this.f14861u = true;
        this.f14863w = true;
        this.f14854n.p(false);
        return this;
    }

    @Override // A1.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14860t = mode;
        this.f14862v = true;
        this.f14863w = true;
        this.f14854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f14849g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7) {
        if (this.h == c7) {
            return this;
        }
        this.h = c7;
        this.f14854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14841B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14856p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8) {
        this.h = c7;
        this.f14851j = Character.toLowerCase(c8);
        this.f14854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f14865y = i7;
        l lVar = this.f14854n;
        lVar.f14824k = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f14847e = charSequence;
        this.f14854n.p(false);
        SubMenuC1271D subMenuC1271D = this.f14855o;
        if (subMenuC1271D != null) {
            subMenuC1271D.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f14848f = charSequence;
        this.f14854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        int i7 = this.f14864x;
        int i8 = (z6 ? 0 : 8) | (i7 & (-9));
        this.f14864x = i8;
        if (i7 != i8) {
            l lVar = this.f14854n;
            lVar.h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f14847e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // A1.a, android.view.MenuItem
    public final A1.a setContentDescription(CharSequence charSequence) {
        this.f14857q = charSequence;
        this.f14854n.p(false);
        return this;
    }

    @Override // A1.a, android.view.MenuItem
    public final A1.a setTooltipText(CharSequence charSequence) {
        this.f14858r = charSequence;
        this.f14854n.p(false);
        return this;
    }

    @Override // A1.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7, int i7) {
        if (this.f14851j == c7 && this.f14852k == i7) {
            return this;
        }
        this.f14851j = Character.toLowerCase(c7);
        this.f14852k = KeyEvent.normalizeMetaState(i7);
        this.f14854n.p(false);
        return this;
    }

    @Override // A1.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7, int i7) {
        if (this.h == c7 && this.f14850i == i7) {
            return this;
        }
        this.h = c7;
        this.f14850i = KeyEvent.normalizeMetaState(i7);
        this.f14854n.p(false);
        return this;
    }

    @Override // A1.a, android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.h = c7;
        this.f14850i = KeyEvent.normalizeMetaState(i7);
        this.f14851j = Character.toLowerCase(c8);
        this.f14852k = KeyEvent.normalizeMetaState(i8);
        this.f14854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.l = null;
        this.f14853m = i7;
        this.f14863w = true;
        this.f14854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        setTitle(this.f14854n.f14815a.getString(i7));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        int i8;
        Context context = this.f14854n.f14815a;
        View viewInflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f14866z = viewInflate;
        this.f14840A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i8 = this.f14843a) > 0) {
            viewInflate.setId(i8);
        }
        l lVar = this.f14854n;
        lVar.f14824k = true;
        lVar.p(true);
        return this;
    }
}
