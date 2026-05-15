package L3;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import j5.AbstractC1110d;
import java.util.ArrayList;
import y1.C1995d;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a */
    public static final int[] f4237a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b */
    public static final int[] f4238b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c */
    public static final int[] f4239c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d */
    public static final int[] f4240d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e */
    public static final int[] f4241e = {R.attr.drawable};

    /* JADX INFO: renamed from: f */
    public static final int[] f4242f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: g */
    public static final int[] f4243g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] h = {R.attr.ordering};

    /* JADX INFO: renamed from: i */
    public static final int[] f4244i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* JADX INFO: renamed from: j */
    public static final int[] f4245j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* JADX INFO: renamed from: k */
    public static final int[] f4246k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:255:0x0017, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x03b0, code lost:
    
        if (r32 == null) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x03b2, code lost:
    
        if (r22 == null) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x03b4, code lost:
    
        r2 = new android.animation.Animator[r22.size()];
        r3 = r22.iterator();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x03c3, code lost:
    
        if (r3.hasNext() == false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x03c5, code lost:
    
        r2[r11] = (android.animation.Animator) r3.next();
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x03d1, code lost:
    
        if (r33 != 0) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x03d3, code lost:
    
        r32.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x03d6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x03d7, code lost:
    
        r32.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x03da, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0392  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i7, int i8, int i9, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i8);
        boolean z6 = typedValuePeekValue != null;
        int i10 = z6 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i9);
        boolean z7 = typedValuePeekValue2 != null;
        int i11 = z7 ? typedValuePeekValue2.type : 0;
        if (i7 == 4) {
            i7 = ((z6 && c(i10)) || (z7 && c(i11))) ? 3 : 0;
        }
        boolean z8 = i7 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i7 == 2) {
            String string = typedArray.getString(i8);
            String string2 = typedArray.getString(i9);
            C1995d[] c1995dArrU = AbstractC1110d.u(string);
            C1995d[] c1995dArrU2 = AbstractC1110d.u(string2);
            if (c1995dArrU != null || c1995dArrU2 != null) {
                if (c1995dArrU != null) {
                    f fVar = new f();
                    if (c1995dArrU2 == null) {
                        return PropertyValuesHolder.ofObject(str, fVar, c1995dArrU);
                    }
                    if (AbstractC1110d.r(c1995dArrU, c1995dArrU2)) {
                        return PropertyValuesHolder.ofObject(str, fVar, c1995dArrU, c1995dArrU2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (c1995dArrU2 != null) {
                    return PropertyValuesHolder.ofObject(str, new f(), c1995dArrU2);
                }
            }
            return null;
        }
        g gVar = i7 == 3 ? g.f4258a : null;
        if (z8) {
            if (z6) {
                float dimension = i10 == 5 ? typedArray.getDimension(i8, 0.0f) : typedArray.getFloat(i8, 0.0f);
                if (z7) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i11 == 5 ? typedArray.getDimension(i9, 0.0f) : typedArray.getFloat(i9, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i11 == 5 ? typedArray.getDimension(i9, 0.0f) : typedArray.getFloat(i9, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z6) {
            int dimension2 = i10 == 5 ? (int) typedArray.getDimension(i8, 0.0f) : c(i10) ? typedArray.getColor(i8, 0) : typedArray.getInt(i8, 0);
            if (z7) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i11 == 5 ? (int) typedArray.getDimension(i9, 0.0f) : c(i11) ? typedArray.getColor(i9, 0) : typedArray.getInt(i9, 0));
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z7) {
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i11 == 5 ? (int) typedArray.getDimension(i9, 0.0f) : c(i11) ? typedArray.getColor(i9, 0) : typedArray.getInt(i9, 0));
        }
        if (propertyValuesHolderOfInt != null && gVar != null) {
            propertyValuesHolderOfInt.setEvaluator(gVar);
        }
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i7) {
        return i7 >= 28 && i7 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        int resourceId = 0;
        TypedArray typedArrayG = x1.b.g(resources, theme, attributeSet, f4243g);
        TypedArray typedArrayG2 = x1.b.g(resources, theme, attributeSet, f4246k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j3 = x1.b.d(xmlResourceParser, "duration") ? typedArrayG.getInt(1, 300) : 300;
        long j7 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) ? 0 : typedArrayG.getInt(2, 0);
        int i7 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) ? 4 : typedArrayG.getInt(7, 4);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i7 == 4) {
                TypedValue typedValuePeekValue = typedArrayG.peekValue(5);
                boolean z6 = typedValuePeekValue != null;
                int i8 = z6 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayG.peekValue(6);
                boolean z7 = typedValuePeekValue2 != null;
                i7 = ((z6 && c(i8)) || (z7 && c(z7 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayG, i7, 5, 6, "");
            if (propertyValuesHolderB != null) {
                valueAnimator3.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator3.setDuration(j3);
        valueAnimator3.setStartDelay(j7);
        valueAnimator3.setRepeatCount(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArrayG.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArrayG.getInt(4, 1) : 1);
        if (typedArrayG2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strC = x1.b.c(typedArrayG2, xmlResourceParser, "pathData", 1);
            if (strC != null) {
                String strC2 = x1.b.c(typedArrayG2, xmlResourceParser, "propertyXName", 2);
                String strC3 = x1.b.c(typedArrayG2, xmlResourceParser, "propertyYName", 3);
                if (i7 != 2) {
                }
                if (strC2 == null && strC3 == null) {
                    throw new InflateException(typedArrayG2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                try {
                    C1995d.b(AbstractC1110d.u(strC), path);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float length = 0.0f;
                    do {
                        length += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(length));
                    } while (pathMeasure.nextContour());
                    PathMeasure pathMeasure2 = new PathMeasure(path, false);
                    int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                    float[] fArr = new float[iMin];
                    float[] fArr2 = new float[iMin];
                    float[] fArr3 = new float[2];
                    float f7 = length / (iMin - 1);
                    valueAnimator = valueAnimator3;
                    int i9 = 0;
                    int i10 = 0;
                    float f8 = 0.0f;
                    while (true) {
                        if (i9 >= iMin) {
                            break;
                        }
                        int i11 = i9;
                        pathMeasure2.getPosTan(f8 - ((Float) arrayList.get(i10)).floatValue(), fArr3, null);
                        fArr[i11] = fArr3[0];
                        fArr2[i11] = fArr3[1];
                        int i12 = i10 + 1;
                        f8 += f7;
                        if (i12 < arrayList.size() && f8 > ((Float) arrayList.get(i12)).floatValue()) {
                            pathMeasure2.nextContour();
                            i10 = i12;
                        }
                        i9 = i11 + 1;
                    }
                    PropertyValuesHolder propertyValuesHolderOfFloat = strC2 != null ? PropertyValuesHolder.ofFloat(strC2, fArr) : null;
                    PropertyValuesHolder propertyValuesHolderOfFloat2 = strC3 != null ? PropertyValuesHolder.ofFloat(strC3, fArr2) : null;
                    if (propertyValuesHolderOfFloat == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                    } else if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                    resourceId = 0;
                } catch (RuntimeException e7) {
                    throw new RuntimeException("Error in parsing ".concat(strC), e7);
                }
            } else {
                valueAnimator = valueAnimator3;
                objectAnimator2.setPropertyName(x1.b.c(typedArrayG2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            resourceId = typedArrayG.getResourceId(resourceId, resourceId);
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArrayG.recycle();
        if (typedArrayG2 != null) {
            typedArrayG2.recycle();
        }
        return valueAnimator2;
    }
}
