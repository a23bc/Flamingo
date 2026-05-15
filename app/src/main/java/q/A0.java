package q;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ D0 f15125a;

    public A0(D0 d02) {
        this.f15125a = d02;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        D0 d02 = this.f15125a;
        if (d02.f15148M.isShowing()) {
            d02.c();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f15125a.dismiss();
    }
}
