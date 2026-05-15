package l1;

import E3.e;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import f0.C0879c;
import f0.C0894j0;
import f0.G;
import j1.j;
import x0.C1895e;
import y0.AbstractC1961K;

/* JADX INFO: loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a */
    public final AbstractC1961K f14157a;

    /* JADX INFO: renamed from: b */
    public final float f14158b;

    /* JADX INFO: renamed from: c */
    public final C0894j0 f14159c = C0879c.t(new C1895e(9205357640488583168L));

    /* JADX INFO: renamed from: d */
    public final G f14160d = C0879c.o(new e(23, this));

    public b(AbstractC1961K abstractC1961K, float f7) {
        this.f14157a = abstractC1961K;
        this.f14158b = f7;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.b(textPaint, this.f14158b);
        textPaint.setShader((Shader) this.f14160d.getValue());
    }
}
