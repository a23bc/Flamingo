package q;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: q.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1308d0 extends C1306c0 {
    @Override // q.C1306c0, q.AbstractC1310e0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // q.AbstractC1310e0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
