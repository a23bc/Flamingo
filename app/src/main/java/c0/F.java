package c0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class F extends RippleDrawable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f10526o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1987t f10527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f10528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10529r;

    public F(boolean z6) {
        super(ColorStateList.valueOf(-16777216), null, z6 ? new ColorDrawable(-1) : null);
        this.f10526o = z6;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f10526o) {
            this.f10529r = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f10529r = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f10529r;
    }
}
