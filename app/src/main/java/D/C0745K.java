package d;

import android.content.res.Resources;
import android.view.View;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import yos.music.player.R;

/* JADX INFO: renamed from: d.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0745K extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0745K f10744q = new C0745K(1, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0745K f10745r = new C0745K(1, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0745K f10746s = new C0745K(1, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10747p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0745K(int i7, int i8) {
        super(i7);
        this.f10747p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f10747p) {
            case 0:
                Resources resources = (Resources) obj;
                AbstractC1209k.f(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                View view = (View) obj;
                AbstractC1209k.f(view, "it");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                AbstractC1209k.f(view2, "it");
                Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof InterfaceC0744J) {
                    return (InterfaceC0744J) tag;
                }
                return null;
        }
    }
}
