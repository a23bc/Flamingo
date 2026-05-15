package c1;

import C2.AbstractC0032d;
import Z4.C0508b;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import h1.AbstractC0996a;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: c1.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0721g {
    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i7, int i8, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i9, TextUtils.TruncateAt truncateAt, int i10, int i11, boolean z6, int i12, int i13, int i14, int i15) {
        if (i8 < 0) {
            AbstractC0996a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i8 < 0 || i8 > length) {
            AbstractC0996a.a("invalid end value");
        }
        if (i9 < 0) {
            AbstractC0996a.a("invalid maxLines value");
        }
        if (i7 < 0) {
            AbstractC0996a.a("invalid width value");
        }
        if (i10 < 0) {
            AbstractC0996a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i8, textPaint, i7);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i9);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i10);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z6);
        builderObtain.setBreakStrategy(i12);
        builderObtain.setHyphenationFrequency(i15);
        builderObtain.setIndents(null, null);
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 26) {
            builderObtain.setJustificationMode(i11);
        }
        if (i16 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i16 >= 33) {
            builderObtain.setLineBreakConfig(AbstractC0032d.a().setLineBreakStyle(i13).setLineBreakWordStyle(i14).build());
        }
        if (i16 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static final Rect b(TextPaint textPaint, CharSequence charSequence, int i7, int i8) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i7 - 1, i8, MetricAffectingSpan.class) != i8) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i7 < i8) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i7, i8, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i7, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    C0508b c0508bJ = AbstractC1209k.j(metricAffectingSpanArr);
                    while (c0508bJ.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) c0508bJ.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i7, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i7, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i7 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i7, i8, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i7, i8, rect3);
        return rect3;
    }

    public static final float c(int i7, int i8, float[] fArr) {
        return fArr[((i7 - i8) * 2) + 1];
    }

    public static final int d(Layout layout, int i7, boolean z6) {
        if (i7 <= 0) {
            return 0;
        }
        if (i7 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i7);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i7 || lineEnd == i7) {
            if (lineStart == i7) {
                if (z6) {
                    return lineForOffset - 1;
                }
            } else if (!z6) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX WARN: Removed duplicated region for block: B:403:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int e(c1.C0724j r20, android.text.Layout r21, F5.t r22, int r23, android.graphics.RectF r24, d1.d r25, D.D0 r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.AbstractC0721g.e(c1.j, android.text.Layout, F5.t, int, android.graphics.RectF, d1.d, D.D0, boolean):int");
    }

    public static final boolean f(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
