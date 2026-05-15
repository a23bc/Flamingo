package p;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: p.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1272a implements A1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f14754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f14755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f14756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f14757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f14759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14760g;
    public Drawable h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f14761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f14762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f14763k;
    public ColorStateList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f14764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14766o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14767p;

    @Override // A1.a
    public final A1.a a(o oVar) {
        throw new UnsupportedOperationException();
    }

    @Override // A1.a
    public final o b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f14765n || this.f14766o) {
                this.h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.h = drawableMutate;
                if (this.f14765n) {
                    drawableMutate.setTintList(this.l);
                }
                if (this.f14766o) {
                    this.h.setTintMode(this.f14764m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // A1.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f14760g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f14759f;
    }

    @Override // A1.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f14762j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // A1.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.l;
    }

    @Override // A1.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f14764m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f14756c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // A1.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f14758e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f14757d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f14754a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f14755b;
        return charSequence != null ? charSequence : this.f14754a;
    }

    @Override // A1.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f14763k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f14767p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f14767p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f14767p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f14767p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7) {
        this.f14759f = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        this.f14767p = (z6 ? 1 : 0) | (this.f14767p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        this.f14767p = (z6 ? 2 : 0) | (this.f14767p & (-3));
        return this;
    }

    @Override // A1.a, android.view.MenuItem
    public final A1.a setContentDescription(CharSequence charSequence) {
        this.f14762j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        this.f14767p = (z6 ? 16 : 0) | (this.f14767p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // A1.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.f14765n = true;
        c();
        return this;
    }

    @Override // A1.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14764m = mode;
        this.f14766o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f14756c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7) {
        this.f14757d = c7;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8) {
        this.f14757d = c7;
        this.f14759f = Character.toLowerCase(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f14754a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f14755b = charSequence;
        return this;
    }

    @Override // A1.a, android.view.MenuItem
    public final A1.a setTooltipText(CharSequence charSequence) {
        this.f14763k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        this.f14767p = (this.f14767p & 8) | (z6 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // A1.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7, int i7) {
        this.f14759f = Character.toLowerCase(c7);
        this.f14760g = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f14762j = charSequence;
        return this;
    }

    @Override // A1.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7, int i7) {
        this.f14757d = c7;
        this.f14758e = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        this.f14754a = this.f14761i.getResources().getString(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f14763k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.h = this.f14761i.getDrawable(i7);
        c();
        return this;
    }

    @Override // A1.a, android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f14757d = c7;
        this.f14758e = KeyEvent.normalizeMetaState(i7);
        this.f14759f = Character.toLowerCase(c8);
        this.f14760g = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        return this;
    }
}
