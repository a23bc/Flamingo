package o;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import q.C1321k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1243a implements p.j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f14567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ActionBarContextView f14568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public V1.a f14569s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public WeakReference f14570t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14571u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p.l f14572v;

    @Override // o.AbstractC1243a
    public final void a() {
        if (this.f14571u) {
            return;
        }
        this.f14571u = true;
        this.f14569s.I(this);
    }

    @Override // o.AbstractC1243a
    public final View b() {
        WeakReference weakReference = this.f14570t;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // o.AbstractC1243a
    public final p.l c() {
        return this.f14572v;
    }

    @Override // o.AbstractC1243a
    public final MenuInflater d() {
        return new h(this.f14568r.getContext());
    }

    @Override // o.AbstractC1243a
    public final CharSequence e() {
        return this.f14568r.getSubtitle();
    }

    @Override // o.AbstractC1243a
    public final CharSequence f() {
        return this.f14568r.getTitle();
    }

    @Override // o.AbstractC1243a
    public final void g() {
        this.f14569s.J(this, this.f14572v);
    }

    @Override // o.AbstractC1243a
    public final boolean h() {
        return this.f14568r.f8986G;
    }

    @Override // o.AbstractC1243a
    public final void i(View view) {
        this.f14568r.setCustomView(view);
        this.f14570t = view != null ? new WeakReference(view) : null;
    }

    @Override // o.AbstractC1243a
    public final void j(int i7) {
        k(this.f14567q.getString(i7));
    }

    @Override // o.AbstractC1243a
    public final void k(CharSequence charSequence) {
        this.f14568r.setSubtitle(charSequence);
    }

    @Override // o.AbstractC1243a
    public final void l(int i7) {
        m(this.f14567q.getString(i7));
    }

    @Override // o.AbstractC1243a
    public final void m(CharSequence charSequence) {
        this.f14568r.setTitle(charSequence);
    }

    @Override // o.AbstractC1243a
    public final void n(boolean z6) {
        this.f14560p = z6;
        this.f14568r.setTitleOptional(z6);
    }

    @Override // p.j
    public final void r(p.l lVar) {
        g();
        C1321k c1321k = this.f14568r.f8991r;
        if (c1321k != null) {
            c1321k.l();
        }
    }

    @Override // p.j
    public final boolean x(p.l lVar, MenuItem menuItem) {
        return ((U3.h) this.f14569s.f7389o).h0(this, menuItem);
    }
}
