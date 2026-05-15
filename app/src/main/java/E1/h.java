package e1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import h1.AbstractC0996a;

/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11544g = Integer.MIN_VALUE;
    public int h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11545i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11546j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11547k;
    public int l;

    public h(float f7, int i7, boolean z6, boolean z7, float f8, boolean z8) {
        this.f11538a = f7;
        this.f11539b = i7;
        this.f11540c = z6;
        this.f11541d = z7;
        this.f11542e = f8;
        this.f11543f = z8;
        if ((0.0f > f8 || f8 > 1.0f) && f8 != -1.0f) {
            AbstractC0996a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i7, int i8, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        int i11 = fontMetricsInt.descent;
        int i12 = fontMetricsInt.ascent;
        if (i11 - i12 <= 0) {
            return;
        }
        boolean z6 = i7 == 0;
        boolean z7 = i8 == this.f11539b;
        boolean z8 = this.f11541d;
        boolean z9 = this.f11540c;
        if (z6 && z7 && z9 && z8) {
            return;
        }
        if (this.f11544g == Integer.MIN_VALUE) {
            int i13 = i11 - i12;
            int iCeil = (int) Math.ceil(this.f11538a);
            int i14 = iCeil - i13;
            if (!this.f11543f || i14 > 0) {
                float fAbs = this.f11542e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i14 <= 0 ? Math.ceil(i14 * fAbs) : Math.ceil((1.0f - fAbs) * i14));
                int i15 = fontMetricsInt.descent;
                int i16 = iCeil2 + i15;
                this.f11545i = i16;
                int i17 = i16 - iCeil;
                this.h = i17;
                if (z9) {
                    i17 = fontMetricsInt.ascent;
                }
                this.f11544g = i17;
                if (z8) {
                    i16 = i15;
                }
                this.f11546j = i16;
                this.f11547k = fontMetricsInt.ascent - i17;
                this.l = i16 - i15;
            } else {
                int i18 = fontMetricsInt.ascent;
                this.h = i18;
                int i19 = fontMetricsInt.descent;
                this.f11545i = i19;
                this.f11544g = i18;
                this.f11546j = i19;
                this.f11547k = 0;
                this.l = 0;
            }
        }
        fontMetricsInt.ascent = z6 ? this.f11544g : this.h;
        fontMetricsInt.descent = z7 ? this.f11546j : this.f11545i;
    }
}
