package e1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11555d;

    public j(float f7, float f8, float f9, int i7) {
        this.f11552a = i7;
        this.f11553b = f7;
        this.f11554c = f8;
        this.f11555d = f9;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f11555d, this.f11553b, this.f11554c, this.f11552a);
    }
}
