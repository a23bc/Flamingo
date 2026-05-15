package G1;

import android.view.ViewParent;
import l5.InterfaceC1182c;
import m5.AbstractC1207i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K extends AbstractC1207i implements InterfaceC1182c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final K f2647w = new K(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
