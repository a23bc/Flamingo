package c1;

import F5.t;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: c1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0724j {

    /* JADX INFO: renamed from: a */
    public final TextPaint f10636a;

    /* JADX INFO: renamed from: b */
    public final TextUtils.TruncateAt f10637b;

    /* JADX INFO: renamed from: c */
    public final boolean f10638c;

    /* JADX INFO: renamed from: d */
    public final boolean f10639d;

    /* JADX INFO: renamed from: e */
    public d1.e f10640e;

    /* JADX INFO: renamed from: f */
    public final Layout f10641f;

    /* JADX INFO: renamed from: g */
    public final int f10642g;
    public final int h;

    /* JADX INFO: renamed from: i */
    public final int f10643i;

    /* JADX INFO: renamed from: j */
    public final float f10644j;

    /* JADX INFO: renamed from: k */
    public final float f10645k;
    public final boolean l;

    /* JADX INFO: renamed from: m */
    public final Paint.FontMetricsInt f10646m;

    /* JADX INFO: renamed from: n */
    public final int f10647n;

    /* JADX INFO: renamed from: o */
    public final e1.h[] f10648o;

    /* JADX INFO: renamed from: p */
    public final Rect f10649p = new Rect();

    /* JADX INFO: renamed from: q */
    public t f10650q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:198:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01bd  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0724j(java.lang.CharSequence r30, float r31, android.text.TextPaint r32, int r33, android.text.TextUtils.TruncateAt r34, int r35, boolean r36, int r37, int r38, int r39, int r40, int r41, int r42, c1.C0719e r43) {
        /*
            Method dump skipped, instruction units count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C0724j.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, c1.e):void");
    }

    public final int a() {
        boolean z6 = this.f10639d;
        Layout layout = this.f10641f;
        return (z6 ? layout.getLineBottom(this.f10642g - 1) : layout.getHeight()) + this.h + this.f10643i + this.f10647n;
    }

    public final float b(int i7) {
        if (i7 == this.f10642g - 1) {
            return this.f10644j + this.f10645k;
        }
        return 0.0f;
    }

    public final t c() {
        t tVar = this.f10650q;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this.f10641f);
        this.f10650q = tVar2;
        return tVar2;
    }

    public final float d(int i7) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i7 != this.f10642g + (-1) || (fontMetricsInt = this.f10646m) == null) ? this.f10641f.getLineBaseline(i7) : g(i7) - fontMetricsInt.ascent);
    }

    public final float e(int i7) {
        Paint.FontMetricsInt fontMetricsInt;
        int i8 = this.f10642g;
        int i9 = i8 - 1;
        Layout layout = this.f10641f;
        if (i7 != i9 || (fontMetricsInt = this.f10646m) == null) {
            return this.h + layout.getLineBottom(i7) + (i7 == i8 + (-1) ? this.f10643i : 0);
        }
        return layout.getLineBottom(i7 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i7) {
        C0723i c0723i = AbstractC0725k.f10651a;
        Layout layout = this.f10641f;
        return (layout.getEllipsisCount(i7) <= 0 || this.f10637b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i7) : layout.getText().length();
    }

    public final float g(int i7) {
        return this.f10641f.getLineTop(i7) + (i7 == 0 ? 0 : this.h);
    }

    public final float h(int i7, boolean z6) {
        return b(this.f10641f.getLineForOffset(i7)) + c().l(i7, true, z6);
    }

    public final float i(int i7, boolean z6) {
        return b(this.f10641f.getLineForOffset(i7)) + c().l(i7, false, z6);
    }

    public final d1.e j() {
        d1.e eVar = this.f10640e;
        if (eVar != null) {
            return eVar;
        }
        Layout layout = this.f10641f;
        d1.e eVar2 = new d1.e(layout.getText(), layout.getText().length(), this.f10636a.getTextLocale());
        this.f10640e = eVar2;
        return eVar2;
    }
}
