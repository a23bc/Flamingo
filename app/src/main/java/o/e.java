package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p.MenuC1268A;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1243a f14574b;

    public e(Context context, AbstractC1243a abstractC1243a) {
        this.f14573a = context;
        this.f14574b = abstractC1243a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f14574b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f14574b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1268A(this.f14573a, this.f14574b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f14574b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f14574b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f14574b.f14559o;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f14574b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f14574b.f14560p;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f14574b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f14574b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f14574b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f14574b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f14574b.f14559o = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f14574b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z6) {
        this.f14574b.n(z6);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i7) {
        this.f14574b.j(i7);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i7) {
        this.f14574b.l(i7);
    }
}
