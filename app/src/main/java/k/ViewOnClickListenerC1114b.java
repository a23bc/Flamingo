package k;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import o.AbstractC1243a;
import q.W0;

/* JADX INFO: renamed from: k.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1114b implements View.OnClickListener {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f13878o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f13879p;

    public /* synthetic */ ViewOnClickListenerC1114b(int i7, Object obj) {
        this.f13878o = i7;
        this.f13879p = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13878o) {
            case 0:
                C1118f c1118f = (C1118f) this.f13879p;
                Button button = c1118f.f13896f;
                c1118f.f13910v.obtainMessage(1, c1118f.f13892b).sendToTarget();
                break;
            case 1:
                ((AbstractC1243a) this.f13879p).a();
                break;
            default:
                W0 w02 = ((Toolbar) this.f13879p).f9080c0;
                p.n nVar = w02 == null ? null : w02.f15243p;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
        }
    }
}
