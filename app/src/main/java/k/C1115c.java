package k;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: k.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1115c implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1118f f13880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1116d f13881p;

    public C1115c(C1116d c1116d, C1118f c1118f) {
        this.f13881p = c1116d;
        this.f13880o = c1118f;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        C1116d c1116d = this.f13881p;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) c1116d.f13890j;
        C1118f c1118f = this.f13880o;
        onClickListener.onClick(c1118f.f13892b, i7);
        if (c1116d.f13883b) {
            return;
        }
        c1118f.f13892b.dismiss();
    }
}
