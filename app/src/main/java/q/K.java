package q;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class K implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ M f15182o;

    public K(M m7) {
        this.f15182o = m7;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        M m7 = this.f15182o;
        m7.f15198U.setSelection(i7);
        P p7 = m7.f15198U;
        if (p7.getOnItemClickListener() != null) {
            p7.performItemClick(view, i7, m7.f15195R.getItemId(i7));
        }
        m7.dismiss();
    }
}
