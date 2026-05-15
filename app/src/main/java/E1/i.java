package e1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import h1.AbstractC0996a;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f11548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11551d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f11548a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC1209k.m("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f11551d) {
            AbstractC0996a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f11550c;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        this.f11551d = true;
        paint.getTextSize();
        this.f11548a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            AbstractC0996a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f11549b = (int) Math.ceil(0.0f);
        this.f11550c = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f11551d) {
            AbstractC0996a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f11549b;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f7, int i9, int i10, int i11, Paint paint) {
    }
}
