package q;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: renamed from: q.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1301a implements G1.O {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15251o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f15253q;

    public C1301a(ActionBarContextView actionBarContextView) {
        this.f15253q = actionBarContextView;
    }

    @Override // G1.O
    public final void a() {
        if (this.f15251o) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f15253q;
        actionBarContextView.f8993t = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f15252p);
    }

    @Override // G1.O
    public final void b() {
        this.f15251o = true;
    }

    @Override // G1.O
    public final void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f15251o = false;
    }
}
