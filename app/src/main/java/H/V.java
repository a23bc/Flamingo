package H;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a */
    public final int f2826a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f2827b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ X f2828c;

    public V(X x6, int i7) {
        this.f2828c = x6;
        this.f2826a = i7;
    }

    public final void a(int i7) {
        X x6 = this.f2828c;
        D2.B b7 = x6.f2831c;
        if (b7 == null) {
            return;
        }
        ArrayList arrayList = this.f2827b;
        boolean z6 = ((k0) b7.f1461r) instanceof ViewOnAttachStateChangeListenerC0160b;
        arrayList.add(new j0(b7, i7, x6.f2830b, null));
    }
}
