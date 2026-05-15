package q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class E extends SeekBar {

    /* JADX INFO: renamed from: o */
    public final F f15161o;

    public E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        P0.a(this, getContext());
        F f7 = new F(this);
        this.f15161o = f7;
        f7.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        F f7 = this.f15161o;
        Drawable drawable = f7.f15163f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        E e7 = f7.f15162e;
        if (drawable.setState(e7.getDrawableState())) {
            e7.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f15161o.f15163f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f15161o.g(canvas);
    }
}
