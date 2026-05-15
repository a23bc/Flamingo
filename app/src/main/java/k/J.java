package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import o.AbstractC1243a;
import q.C1321k;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC1243a implements p.j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Context f13848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p.l f13849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public V1.a f13850s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public WeakReference f13851t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ K f13852u;

    public J(K k7, Context context, V1.a aVar) {
        this.f13852u = k7;
        this.f13848q = context;
        this.f13850s = aVar;
        p.l lVar = new p.l(context);
        lVar.l = 1;
        this.f13849r = lVar;
        lVar.f14819e = this;
    }

    @Override // o.AbstractC1243a
    public final void a() {
        K k7 = this.f13852u;
        if (k7.f13862j != this) {
            return;
        }
        if (k7.f13868q) {
            k7.f13863k = this;
            k7.l = this.f13850s;
        } else {
            this.f13850s.I(this);
        }
        this.f13850s = null;
        k7.P(false);
        ActionBarContextView actionBarContextView = k7.f13860g;
        if (actionBarContextView.f8998y == null) {
            actionBarContextView.e();
        }
        k7.f13857d.setHideOnContentScrollEnabled(k7.f13873v);
        k7.f13862j = null;
    }

    @Override // o.AbstractC1243a
    public final View b() {
        WeakReference weakReference = this.f13851t;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // o.AbstractC1243a
    public final p.l c() {
        return this.f13849r;
    }

    @Override // o.AbstractC1243a
    public final MenuInflater d() {
        return new o.h(this.f13848q);
    }

    @Override // o.AbstractC1243a
    public final CharSequence e() {
        return this.f13852u.f13860g.getSubtitle();
    }

    @Override // o.AbstractC1243a
    public final CharSequence f() {
        return this.f13852u.f13860g.getTitle();
    }

    @Override // o.AbstractC1243a
    public final void g() {
        if (this.f13852u.f13862j != this) {
            return;
        }
        p.l lVar = this.f13849r;
        lVar.w();
        try {
            this.f13850s.J(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override // o.AbstractC1243a
    public final boolean h() {
        return this.f13852u.f13860g.f8986G;
    }

    @Override // o.AbstractC1243a
    public final void i(View view) {
        this.f13852u.f13860g.setCustomView(view);
        this.f13851t = new WeakReference(view);
    }

    @Override // o.AbstractC1243a
    public final void j(int i7) {
        k(this.f13852u.f13855b.getResources().getString(i7));
    }

    @Override // o.AbstractC1243a
    public final void k(CharSequence charSequence) {
        this.f13852u.f13860g.setSubtitle(charSequence);
    }

    @Override // o.AbstractC1243a
    public final void l(int i7) {
        m(this.f13852u.f13855b.getResources().getString(i7));
    }

    @Override // o.AbstractC1243a
    public final void m(CharSequence charSequence) {
        this.f13852u.f13860g.setTitle(charSequence);
    }

    @Override // o.AbstractC1243a
    public final void n(boolean z6) {
        this.f14560p = z6;
        this.f13852u.f13860g.setTitleOptional(z6);
    }

    @Override // p.j
    public final void r(p.l lVar) {
        if (this.f13850s == null) {
            return;
        }
        g();
        C1321k c1321k = this.f13852u.f13860g.f8991r;
        if (c1321k != null) {
            c1321k.l();
        }
    }

    @Override // p.j
    public final boolean x(p.l lVar, MenuItem menuItem) {
        V1.a aVar = this.f13850s;
        if (aVar != null) {
            return ((U3.h) aVar.f7389o).h0(this, menuItem);
        }
        return false;
    }
}
