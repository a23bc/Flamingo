package l1;

import A0.d;
import A0.h;
import A0.i;
import A2.W;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: l1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1160a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f14156a;

    public C1160a(d dVar) {
        this.f14156a = dVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            h hVar = h.f59b;
            d dVar = this.f14156a;
            if (AbstractC1209k.a(dVar, hVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(dVar instanceof i)) {
                throw new W();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            i iVar = (i) dVar;
            textPaint.setStrokeWidth(iVar.f60b);
            textPaint.setStrokeMiter(iVar.f61c);
            int i7 = iVar.f63e;
            textPaint.setStrokeJoin(i7 == 0 ? Paint.Join.MITER : i7 == 1 ? Paint.Join.ROUND : i7 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i8 = iVar.f62d;
            textPaint.setStrokeCap(i8 == 0 ? Paint.Cap.BUTT : i8 == 1 ? Paint.Cap.ROUND : i8 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            iVar.getClass();
            textPaint.setPathEffect(null);
        }
    }
}
