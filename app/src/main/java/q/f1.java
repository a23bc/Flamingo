package q;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f15305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f15306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f15307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f15308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f15309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f15310g;

    public f1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f15307d = layoutParams;
        this.f15308e = new Rect();
        this.f15309f = new int[2];
        this.f15310g = new int[2];
        this.f15304a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f15305b = viewInflate;
        this.f15306c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(f1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
