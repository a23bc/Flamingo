package q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: q.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1312f0 {
    public static final RectF l = new RectF();

    /* JADX INFO: renamed from: m */
    public static final ConcurrentHashMap f15293m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public int f15294a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f15295b = false;

    /* JADX INFO: renamed from: c */
    public float f15296c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f15297d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f15298e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f15299f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f15300g = false;
    public TextPaint h;

    /* JADX INFO: renamed from: i */
    public final TextView f15301i;

    /* JADX INFO: renamed from: j */
    public final Context f15302j;

    /* JADX INFO: renamed from: k */
    public final C1306c0 f15303k;

    public C1312f0(TextView textView) {
        this.f15301i = textView;
        this.f15302j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f15303k = new C1308d0();
        } else {
            this.f15303k = new C1306c0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i7 : iArr) {
                if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                    arrayList.add(Integer.valueOf(i7));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i8 = 0; i8 < size; i8++) {
                    iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f15293m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f15295b) {
                if (this.f15301i.getMeasuredHeight() <= 0 || this.f15301i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f15303k.b(this.f15301i) ? 1048576 : (this.f15301i.getMeasuredWidth() - this.f15301i.getTotalPaddingLeft()) - this.f15301i.getTotalPaddingRight();
                int height = (this.f15301i.getHeight() - this.f15301i.getCompoundPaddingBottom()) - this.f15301i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f15301i.getTextSize()) {
                            g(0, fC);
                        }
                    } finally {
                    }
                }
            }
            this.f15295b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f15299f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i7 = length - 1;
        int i8 = 0;
        int i9 = 1;
        while (i9 <= i7) {
            int i10 = (i9 + i7) / 2;
            int i11 = this.f15299f[i10];
            TextView textView = this.f15301i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.h;
            if (textPaint == null) {
                this.h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.h.set(textView.getPaint());
            this.h.setTextSize(i11);
            StaticLayout staticLayoutA = AbstractC1304b0.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f15301i, this.h, this.f15303k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i12 = i10 + 1;
                i8 = i9;
                i9 = i12;
            } else {
                i8 = i10 - 1;
                i7 = i8;
            }
        }
        return this.f15299f[i8];
    }

    public final boolean f() {
        return j() && this.f15294a != 0;
    }

    public final void g(int i7, float f7) {
        Context context = this.f15302j;
        float fApplyDimension = TypedValue.applyDimension(i7, f7, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f15301i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f15295b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f15294a == 1) {
            if (!this.f15300g || this.f15299f.length == 0) {
                int iFloor = ((int) Math.floor((this.f15298e - this.f15297d) / this.f15296c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i7 = 0; i7 < iFloor; i7++) {
                    iArr[i7] = Math.round((i7 * this.f15296c) + this.f15297d);
                }
                this.f15299f = b(iArr);
            }
            this.f15295b = true;
        } else {
            this.f15295b = false;
        }
        return this.f15295b;
    }

    public final boolean i() {
        boolean z6 = this.f15299f.length > 0;
        this.f15300g = z6;
        if (z6) {
            this.f15294a = 1;
            this.f15297d = r0[0];
            this.f15298e = r0[r1 - 1];
            this.f15296c = -1.0f;
        }
        return z6;
    }

    public final boolean j() {
        return !(this.f15301i instanceof C1340u);
    }

    public final void k(float f7, float f8, float f9) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f7 + "px) is less or equal to (0px)");
        }
        if (f8 <= f7) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f8 + "px) is less or equal to minimum auto-size text size (" + f7 + "px)");
        }
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f9 + "px) is less or equal to (0px)");
        }
        this.f15294a = 1;
        this.f15297d = f7;
        this.f15298e = f8;
        this.f15296c = f9;
        this.f15300g = false;
    }
}
