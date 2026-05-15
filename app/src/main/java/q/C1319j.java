package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import j5.AbstractC1109c;
import p.C1273b;
import yos.music.player.R;

/* JADX INFO: renamed from: q.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1319j extends C1346x implements InterfaceC1323l {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1321k f15319r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1319j(C1321k c1321k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f15319r = c1321k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC1109c.y(this, getContentDescription());
        setOnTouchListener(new C1273b(this, this));
    }

    @Override // q.InterfaceC1323l
    public final boolean a() {
        return false;
    }

    @Override // q.InterfaceC1323l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f15319r.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i7, int i8, int i9, int i10) {
        boolean frame = super.setFrame(i7, i8, i9, i10);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
