package e1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11557b;

    public k(boolean z6, boolean z7) {
        this.f11556a = z6;
        this.f11557b = z7;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f11556a);
        textPaint.setStrikeThruText(this.f11557b);
    }
}
