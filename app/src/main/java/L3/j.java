package L3;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class j extends m {

    /* JADX INFO: renamed from: d */
    public D4.i f4260d;

    /* JADX INFO: renamed from: e */
    public float f4261e;

    /* JADX INFO: renamed from: f */
    public D4.i f4262f;

    /* JADX INFO: renamed from: g */
    public float f4263g;
    public float h;

    /* JADX INFO: renamed from: i */
    public float f4264i;

    /* JADX INFO: renamed from: j */
    public float f4265j;

    /* JADX INFO: renamed from: k */
    public float f4266k;
    public Paint.Cap l;

    /* JADX INFO: renamed from: m */
    public Paint.Join f4267m;

    /* JADX INFO: renamed from: n */
    public float f4268n;

    @Override // L3.l
    public final boolean a() {
        return this.f4262f.s() || this.f4260d.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x001e  */
    @Override // L3.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            D4.i r0 = r6.f4262f
            boolean r1 = r0.s()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f1584r
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f1582p
            if (r1 == r4) goto L1e
            r0.f1582p = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            D4.i r1 = r6.f4260d
            boolean r4 = r1.s()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f1584r
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f1582p
            if (r7 == r4) goto L3a
            r1.f1582p = r7
            r2 = r3
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.j.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f4262f.f1582p;
    }

    public float getStrokeAlpha() {
        return this.f4263g;
    }

    public int getStrokeColor() {
        return this.f4260d.f1582p;
    }

    public float getStrokeWidth() {
        return this.f4261e;
    }

    public float getTrimPathEnd() {
        return this.f4265j;
    }

    public float getTrimPathOffset() {
        return this.f4266k;
    }

    public float getTrimPathStart() {
        return this.f4264i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i7) {
        this.f4262f.f1582p = i7;
    }

    public void setStrokeAlpha(float f7) {
        this.f4263g = f7;
    }

    public void setStrokeColor(int i7) {
        this.f4260d.f1582p = i7;
    }

    public void setStrokeWidth(float f7) {
        this.f4261e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f4265j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f4266k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f4264i = f7;
    }
}
