package q;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import k.C1116d;
import k.DialogInterfaceC1119g;

/* JADX INFO: loaded from: classes.dex */
public final class I implements O, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DialogInterfaceC1119g f15173o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public J f15174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f15175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P f15176r;

    public I(P p7) {
        this.f15176r = p7;
    }

    @Override // q.O
    public final boolean a() {
        DialogInterfaceC1119g dialogInterfaceC1119g = this.f15173o;
        if (dialogInterfaceC1119g != null) {
            return dialogInterfaceC1119g.isShowing();
        }
        return false;
    }

    @Override // q.O
    public final int b() {
        return 0;
    }

    @Override // q.O
    public final Drawable d() {
        return null;
    }

    @Override // q.O
    public final void dismiss() {
        DialogInterfaceC1119g dialogInterfaceC1119g = this.f15173o;
        if (dialogInterfaceC1119g != null) {
            dialogInterfaceC1119g.dismiss();
            this.f15173o = null;
        }
    }

    @Override // q.O
    public final void f(CharSequence charSequence) {
        this.f15175q = charSequence;
    }

    @Override // q.O
    public final void l(int i7, int i8) {
        if (this.f15174p == null) {
            return;
        }
        P p7 = this.f15176r;
        C1.k kVar = new C1.k(p7.getPopupContext());
        CharSequence charSequence = this.f15175q;
        C1116d c1116d = (C1116d) kVar.f960p;
        if (charSequence != null) {
            c1116d.f13887f = charSequence;
        }
        J j3 = this.f15174p;
        int selectedItemPosition = p7.getSelectedItemPosition();
        c1116d.f13889i = j3;
        c1116d.f13890j = this;
        c1116d.f13882a = selectedItemPosition;
        c1116d.f13883b = true;
        DialogInterfaceC1119g dialogInterfaceC1119gB = kVar.b();
        this.f15173o = dialogInterfaceC1119gB;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC1119gB.f13914t.f13895e;
        alertController$RecycleListView.setTextDirection(i7);
        alertController$RecycleListView.setTextAlignment(i8);
        this.f15173o.show();
    }

    @Override // q.O
    public final int m() {
        return 0;
    }

    @Override // q.O
    public final CharSequence n() {
        return this.f15175q;
    }

    @Override // q.O
    public final void o(ListAdapter listAdapter) {
        this.f15174p = (J) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        P p7 = this.f15176r;
        p7.setSelection(i7);
        if (p7.getOnItemClickListener() != null) {
            p7.performItemClick(null, i7, this.f15174p.getItemId(i7));
        }
        dismiss();
    }

    @Override // q.O
    public final void h(Drawable drawable) {
    }

    @Override // q.O
    public final void i(int i7) {
    }

    @Override // q.O
    public final void j(int i7) {
    }

    @Override // q.O
    public final void k(int i7) {
    }
}
