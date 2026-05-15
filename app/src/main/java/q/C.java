package q;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class C extends RatingBar {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1299A f15131o;

    public C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        P0.a(this, getContext());
        C1299A c1299a = new C1299A(this);
        this.f15131o = c1299a;
        c1299a.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        Bitmap bitmap = (Bitmap) this.f15131o.f15124c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i7, 0), getMeasuredHeight());
        }
    }
}
