package q;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: q.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1345w0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ D0 f15429o;

    public C1345w0(D0 d02) {
        this.f15429o = d02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        C1334q0 c1334q0;
        if (i7 == -1 || (c1334q0 = this.f15429o.f15151q) == null) {
            return;
        }
        c1334q0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
