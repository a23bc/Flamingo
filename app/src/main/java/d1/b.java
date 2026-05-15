package D1;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import m5.AbstractC1209k;
import yos.music.player.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class b extends A.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f1453q;

    public b(MainActivity mainActivity) {
        super(7, mainActivity);
        this.f1453q = new a(this, mainActivity);
    }

    @Override // A.b
    public final void u() {
        MainActivity mainActivity = (MainActivity) this.f3p;
        Resources.Theme theme = mainActivity.getTheme();
        AbstractC1209k.e(theme, "activity.theme");
        G(theme, new TypedValue());
        ((ViewGroup) mainActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f1453q);
    }
}
