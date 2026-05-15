package e1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: e1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0848a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11531b;

    public /* synthetic */ C0848a(int i7, float f7) {
        this.f11530a = i7;
        this.f11531b = f7;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f11530a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f11531b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f11531b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f11530a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f11531b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f11531b);
                break;
        }
    }
}
