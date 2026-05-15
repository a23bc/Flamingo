package e1;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: e1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0849b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11533b;

    public /* synthetic */ C0849b(int i7, Object obj) {
        this.f11532a = i7;
        this.f11533b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f11532a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f11533b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f11533b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f11532a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f11533b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f11533b);
                break;
        }
    }
}
