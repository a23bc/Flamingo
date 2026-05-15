package L3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f4296a;

    /* JADX INFO: renamed from: b */
    public n f4297b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f4298c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f4299d;

    /* JADX INFO: renamed from: e */
    public boolean f4300e;

    /* JADX INFO: renamed from: f */
    public Bitmap f4301f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f4302g;
    public PorterDuff.Mode h;

    /* JADX INFO: renamed from: i */
    public int f4303i;

    /* JADX INFO: renamed from: j */
    public boolean f4304j;

    /* JADX INFO: renamed from: k */
    public boolean f4305k;
    public Paint l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4296a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}
