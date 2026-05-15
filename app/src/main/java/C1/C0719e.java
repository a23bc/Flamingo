package c1;

import Z4.C0508b;
import android.os.Build;
import android.text.BoringLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: c1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0719e {

    /* JADX INFO: renamed from: a */
    public final CharSequence f10626a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f10627b;

    /* JADX INFO: renamed from: c */
    public final int f10628c;

    /* JADX INFO: renamed from: d */
    public float f10629d = Float.NaN;

    /* JADX INFO: renamed from: e */
    public float f10630e = Float.NaN;

    /* JADX INFO: renamed from: f */
    public BoringLayout.Metrics f10631f;

    /* JADX INFO: renamed from: g */
    public boolean f10632g;
    public CharSequence h;

    public C0719e(CharSequence charSequence, TextPaint textPaint, int i7) {
        this.f10626a = charSequence;
        this.f10627b = textPaint;
        this.f10628c = i7;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f10632g) {
            TextDirectionHeuristic textDirectionHeuristicA = AbstractC0725k.a(this.f10628c);
            int i7 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f10626a;
            TextPaint textPaint = this.f10627b;
            this.f10631f = i7 >= 33 ? BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicA, true, null) : !textDirectionHeuristicA.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f10632g = true;
        }
        return this.f10631f;
    }

    public final CharSequence b() {
        CharacterStyle[] characterStyleArr;
        CharSequence charSequence = this.h;
        if (charSequence == null) {
            charSequence = this.f10626a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (AbstractC0721g.f(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                    C0508b c0508bJ = AbstractC1209k.j(characterStyleArr);
                    SpannableString spannableString = null;
                    while (c0508bJ.hasNext()) {
                        CharacterStyle characterStyle = (CharacterStyle) c0508bJ.next();
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence = spannableString;
                    }
                }
            }
            this.h = charSequence;
        }
        return charSequence;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float c() {
        /*
            r6 = this;
            float r0 = r6.f10629d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r6.f10629d
            return r0
        Lb:
            android.text.BoringLayout$Metrics r0 = r6.a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r6.f10627b
            if (r2 >= 0) goto L34
            java.lang.CharSequence r0 = r6.b()
            int r0 = r0.length()
            java.lang.CharSequence r2 = r6.b()
            r4 = 0
            float r0 = android.text.Layout.getDesiredWidth(r2, r4, r0, r3)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
        L34:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L5d
        L39:
            java.lang.CharSequence r2 = r6.f10626a
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L51
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<e1.f> r4 = e1.f.class
            boolean r4 = c1.AbstractC0721g.f(r2, r4)
            if (r4 != 0) goto L5a
            java.lang.Class<e1.e> r4 = e1.e.class
            boolean r2 = c1.AbstractC0721g.f(r2, r4)
            if (r2 != 0) goto L5a
        L51:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L5a
            goto L5d
        L5a:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L5d:
            r6.f10629d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C0719e.c():float");
    }
}
