package v4;

import A2.W;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: renamed from: v4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1641d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f18305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f18306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f18307c = new RectF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f18308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f18310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f18311g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f18312i;

    public C1641d(RectF rectF, RectF rectF2, long j3, AccelerateDecelerateInterpolator accelerateDecelerateInterpolator) {
        float fWidth = rectF.width() / rectF.height();
        double d4 = 3;
        float fRound = Math.round(fWidth * r5) / ((float) Math.pow(10.0d, d4));
        float fWidth2 = rectF2.width() / rectF2.height();
        if (Math.abs(fRound - (Math.round(fWidth2 * r1) / ((float) Math.pow(10.0d, d4)))) > 0.01f) {
            throw new W("Can't perform Ken Burns effect on rects with distinct aspect ratios!");
        }
        this.f18305a = rectF;
        this.f18306b = rectF2;
        this.h = j3;
        this.f18312i = accelerateDecelerateInterpolator;
        this.f18308d = rectF2.width() - rectF.width();
        this.f18309e = rectF2.height() - rectF.height();
        this.f18310f = rectF2.centerX() - rectF.centerX();
        this.f18311g = rectF2.centerY() - rectF.centerY();
    }
}
