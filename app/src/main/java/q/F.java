package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import j.AbstractC1089a;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class F extends C1299A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E f15162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f15163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f15164g;
    public PorterDuff.Mode h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15166j;

    public F(E e7) {
        super(e7);
        this.f15164g = null;
        this.h = null;
        this.f15165i = false;
        this.f15166j = false;
        this.f15162e = e7;
    }

    @Override // q.C1299A
    public final void b(AttributeSet attributeSet, int i7) {
        super.b(attributeSet, R.attr.seekBarStyle);
        E e7 = this.f15162e;
        Context context = e7.getContext();
        int[] iArr = AbstractC1089a.f13600g;
        S0 s0K = S0.k(context, attributeSet, iArr, R.attr.seekBarStyle);
        G1.I.g(e7, e7.getContext(), iArr, attributeSet, (TypedArray) s0K.f15226q, R.attr.seekBarStyle);
        Drawable drawableH = s0K.h(0);
        if (drawableH != null) {
            e7.setThumb(drawableH);
        }
        Drawable drawableG = s0K.g(1);
        Drawable drawable = this.f15163f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f15163f = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(e7);
            drawableG.setLayoutDirection(e7.getLayoutDirection());
            if (drawableG.isStateful()) {
                drawableG.setState(e7.getDrawableState());
            }
            f();
        }
        e7.invalidate();
        TypedArray typedArray = (TypedArray) s0K.f15226q;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC1322k0.b(typedArray.getInt(3, -1), this.h);
            this.f15166j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f15164g = s0K.f(2);
            this.f15165i = true;
        }
        s0K.l();
        f();
    }

    public final void f() {
        Drawable drawable = this.f15163f;
        if (drawable != null) {
            if (this.f15165i || this.f15166j) {
                Drawable drawableMutate = drawable.mutate();
                this.f15163f = drawableMutate;
                if (this.f15165i) {
                    drawableMutate.setTintList(this.f15164g);
                }
                if (this.f15166j) {
                    this.f15163f.setTintMode(this.h);
                }
                if (this.f15163f.isStateful()) {
                    this.f15163f.setState(this.f15162e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f15163f != null) {
            int max = this.f15162e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f15163f.getIntrinsicWidth();
                int intrinsicHeight = this.f15163f.getIntrinsicHeight();
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i8 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f15163f.setBounds(-i7, -i8, i7, i8);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i9 = 0; i9 <= max; i9++) {
                    this.f15163f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
