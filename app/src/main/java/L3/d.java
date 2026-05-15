package L3;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f4253a;

    public d(Drawable.ConstantState constantState) {
        this.f4253a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4253a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f4253a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f4253a.newDrawable();
        eVar.f4259o = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f4256r);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f4253a.newDrawable(resources);
        eVar.f4259o = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f4256r);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f4253a.newDrawable(resources, theme);
        eVar.f4259o = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f4256r);
        return eVar;
    }
}
