package e1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import c1.AbstractC0725k;
import c1.C0723i;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12, int i13, boolean z6, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i12)) != layout.getLineCount() - 1) {
            return;
        }
        C0723i c0723i = AbstractC0725k.f10651a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fQ = M3.a.Q(layout, lineForOffset, paint) + M3.a.P(layout, lineForOffset, paint);
            if (fQ == 0.0f) {
                return;
            }
            AbstractC1209k.c(canvas);
            canvas.translate(fQ, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z6) {
        return 0;
    }
}
