package d1;

import a.AbstractC0509a;
import android.text.TextPaint;

/* JADX INFO: renamed from: d1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0812b extends AbstractC0509a {

    /* JADX INFO: renamed from: u */
    public final CharSequence f11180u;

    /* JADX INFO: renamed from: v */
    public final TextPaint f11181v;

    public C0812b(CharSequence charSequence, TextPaint textPaint) {
        this.f11180u = charSequence;
        this.f11181v = textPaint;
    }

    @Override // a.AbstractC0509a
    public final int Q(int i7) {
        CharSequence charSequence = this.f11180u;
        return this.f11181v.getTextRunCursor(charSequence, 0, charSequence.length(), false, i7, 0);
    }

    @Override // a.AbstractC0509a
    public final int V(int i7) {
        CharSequence charSequence = this.f11180u;
        return this.f11181v.getTextRunCursor(charSequence, 0, charSequence.length(), false, i7, 2);
    }
}
